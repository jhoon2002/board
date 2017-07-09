package com.jhoon.springboard.repository;

import static com.jhoon.springboard.entity.QWrite.write;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.jhoon.springboard.entity.QWrite;
import com.jhoon.springboard.entity.Write;
import com.mysema.query.SearchResults;
import com.mysema.query.jpa.impl.JPAQuery;
import com.mysema.query.types.Order;
import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;
import com.mysema.query.types.Projections;
import com.mysema.query.types.path.PathBuilder;

public class WriteRepositoryImpl implements WriteRepositoryCustom {

    @PersistenceContext
    EntityManager em;

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public Page<Write> findAllWithoutWrContent(Predicate predicate, Pageable pageable) {
        JPAQuery query = new JPAQuery(em);
        QWrite qWrite = QWrite.write;
        
        PathBuilder<Write> orderByExpression = new PathBuilder<Write>(Write.class, "write");
        for (Sort.Order orderInSort : pageable.getSort()) {
            Order scend = orderInSort.isAscending() ? Order.ASC : Order.DESC;
            query.orderBy( new OrderSpecifier(scend, orderByExpression.get(orderInSort.getProperty())) );
        }
        
        SearchResults<Write> result = query.from(qWrite)
                .where(predicate)
                .where(qWrite.board.id.eq("free"))
                .offset(pageable.getOffset())
                .limit(pageable.getPageSize())
                .listResults(
                    Projections.bean(
                        Write.class, 
                        write.id, write.board.id.as("bo_id"), write.member.id.as("mb_id"),   /* board와  member은 as로 매핑하지 안을 경우 풀 join하는 문제점 */
                        /* write.writeFiles, */ write.wrNum, write.wrReply, write.wrParent, write.wrComment,
                        write.wrCommentReply, write.caName, write.wrOption, write.wrSubject,
                        /* write.wrContent, */
                        write.wrLink1, write.wrLink2, write.wrLink1Hit, write.wrLink2Hit, write.wrHit,
                        write.wrGood, write.wrNogood, write.wrPassword, write.wrName, write.wrEmail,
                        write.wrHomepage, write.wrDatetime, write.wrFile, write.wrIp, write.wrFacebookUser,
                        write.wrTwitterUser
                        )
                    );
        
        /*
        long total = result.getTotal();
        long limit = result.getLimit();
        long offset = result.getOffset();
        List<Write> writes = result.getResults();
        */
        
        Page<Write> newPage = new PageImpl<Write>(result.getResults(), pageable, result.getTotal());
        
        return newPage;
    }

    @Override
    public long findMinWrNum(String id) {
        JPAQuery query = new JPAQuery(em);
        QWrite qWrite = QWrite.write;
        
        long minWrNum = query.from(qWrite).where(qWrite.board.id.eq(id)).uniqueResult(qWrite.wrNum.min());
        return minWrNum;
    }

    @Override
    public int updateWrNum(Write write, long newWrNum) {
        String qlString = " update Write w set "
                + " w.wrNum = :newWrNum "
                + " where w.id = :id ";
        int resultCount = em.createQuery(qlString)
                            .setParameter("newWrNum", write.getId() * -1)
                            .setParameter("id", write.getId())
                            .executeUpdate();
        return resultCount;
    }

    @Override
    public int update(Write write) {
        String qlString = " update Write w set "
                + " w.wrSubject = :newWrSubject, "
                + " w.wrContent = :newWrContent "
                + " where w.id = :id ";
        int resultCount = em.createQuery(qlString)
                            .setParameter("newWrSubject", write.getWrSubject())
                            .setParameter("newWrContent", write.getWrContent())
                            .setParameter("id", write.getId())
                            .executeUpdate();
        return resultCount;
    }

    @Override
    public String findMaxWrReply(long id) {
        JPAQuery query = new JPAQuery(em);
        QWrite qWrite = QWrite.write;
        
        String maxWrReply = query.from(qWrite).where(qWrite.wrParent.eq(id)).uniqueResult(qWrite.wrReply.max());

        return maxWrReply;
    }

}
