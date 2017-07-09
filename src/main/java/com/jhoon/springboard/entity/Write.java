package com.jhoon.springboard.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.jpa.domain.Specification;


/**
 * The persistent class for the g5_write_free database table.
 * 
 */
@Entity
@Table(name="WRITE")
public class Write implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="wr_id")
	private long id;
	
    @ManyToOne
    @JoinColumn(name="bo_id")
    private Board board;
    
    @ManyToOne
    @JoinColumn(name="mb_id")
    private Member member;
    
    @OneToMany(mappedBy="write")
	private List<WriteFile> writeFiles;
	
	@Column(name="wr_num", nullable=false)
	private long wrNum = 0L;
	
	@Column(name="wr_reply", nullable=false)
	private String wrReply = "";
	
	@Column(name="wr_parent", nullable=false)
	private long wrParent = 0L;
	
	@Column(name="wr_comment", nullable=false)
	private int wrComment = 0;
	
	@Column(name="wr_comment_reply", nullable=false)
	private String wrCommentReply = "";
	
	@Column(name="ca_name", nullable=false)
	private String caName = "";
	
	//String 타입 변경 검토
	@Column(name="wr_option", nullable=false)
	private String wrOption = "";
	
	@Column(name="wr_subject", nullable=false)
	private String wrSubject = "";
	
	@Lob
	@Column(name="wr_content", nullable=false)
	private String wrContent = "";
	
	@Lob
	@Column(name="wr_link1", nullable=false)
	private String wrLink1 = "";
	
	@Lob
	@Column(name="wr_link2", nullable=false)
	private String wrLink2 = "";
	
	@Column(name="wr_link1_hit", nullable=false)
	private int wrLink1Hit = 0;
	
	@Column(name="wr_link2_hit", nullable=false)
	private int wrLink2Hit = 0;
	
	@Column(name="wr_hit", nullable=false)
	private int wrHit = 0;
	
	@Column(name="wr_good", nullable=false)
	private int wrGood = 0;
	
	@Column(name="wr_nogood", nullable=false)
	private int wrNogood = 0;
	
	@Column(name="wr_password", nullable=false)
	private String wrPassword = "";
	
	@Column(name="wr_name", nullable=false)
	private String wrName = "";
	
	@Column(name="wr_email", nullable=false)
	private String wrEmail = "";
	
	@Column(name="wr_homepage", nullable=false)
	private String wrHomepage = "";
	

    @Temporal(TemporalType.TIMESTAMP)
    @Generated(GenerationTime.ALWAYS) 
    @Column(name="wr_datetime", nullable=false, 
            insertable=false, updatable=false, 
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date wrDatetime;
	
	@Column(name="wr_file", nullable=false)
	private byte wrFile = 0;
	
	@Column(name="wr_last", nullable=false)
	private String wrLast = "";
	
	@Column(name="wr_ip", nullable=false)
	private String wrIp = "";
	
	@Column(name="wr_facebook_user", nullable=false)
	private String wrFacebookUser = "";

//	@Column(name="wr_is_comment")
//	private byte wrIsComment;
	
	@Column(name="wr_twitter_user", nullable=false)
	private String wrTwitterUser = "";

	public Write() {
	}
	
    @Override
    public String toString() {
        return "Write [wrId=" + id + ", wrNum=" + wrNum + ", wrReply="
                + wrReply + ", wrParent=" + wrParent + ", wrComment="
                + wrComment + ", wrCommentReply=" + wrCommentReply
                + ", caName=" + caName + ", wrOption=" + wrOption
                + ", wrSubject=" + wrSubject + ", wrContent= 생략"
                + ", wrLink1=" + wrLink1 + ", wrLink2=" + wrLink2
                + ", wrLink1Hit=" + wrLink1Hit + ", wrLink2Hit=" + wrLink2Hit
                + ", wrHit=" + wrHit + ", wrGood=" + wrGood + ", wrNogood="
                + wrNogood + ", wrPassword=" + wrPassword + ", wrName="
                + wrName + ", wrEmail=" + wrEmail + ", wrHomepage="
                + wrHomepage + ", wrDatetime=" + wrDatetime + ", wrFile="
                + wrFile + ", wrLast=" + wrLast + ", wrIp=" + wrIp
                + ", wrFacebookUser=" + wrFacebookUser + ", wrTwitterUser="
                + wrTwitterUser + "]";
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public List<WriteFile> getWriteFiles() {
        return writeFiles;
    }

    public void setWriteFiles(List<WriteFile> writeFiles) {
        this.writeFiles = writeFiles;
    }

    public Board getBoard() {
        return board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }
    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<WriteFile> getBoardFiles() {
        return writeFiles;
    }

    public void setBoardFiles(List<WriteFile> boardFiles) {
        this.writeFiles = boardFiles;
    }
    public long getWrNum() {
        return wrNum;
    }

    public void setWrNum(long wrNum) {
        this.wrNum = wrNum;
    }

    public String getWrReply() {
        return wrReply;
    }

    public void setWrReply(String wrReply) {
        this.wrReply = wrReply;
    }
    
    public long getWrParent() {
        return wrParent;
    }

    public void setWrParent(long wrParent) {
        this.wrParent = wrParent;
    }

    public int getWrComment() {
        return wrComment;
    }

    public void setWrComment(int wrComment) {
        this.wrComment = wrComment;
    }

    public String getWrCommentReply() {
        return wrCommentReply;
    }

    public void setWrCommentReply(String wrCommentReply) {
        this.wrCommentReply = wrCommentReply;
    }

    public String getCaName() {
        return caName;
    }

    public void setCaName(String caName) {
        this.caName = caName;
    }

    public String getWrOption() {
        return wrOption;
    }

    public void setWrOption(String wrOption) {
        this.wrOption = wrOption;
    }

    public String getWrSubject() {
        return wrSubject;
    }

    public void setWrSubject(String wrSubject) {
        this.wrSubject = wrSubject;
    }

    public String getWrContent() {
        return wrContent;
    }

    public void setWrContent(String wrContent) {
        this.wrContent = wrContent;
    }

    public String getWrLink1() {
        return wrLink1;
    }

    public void setWrLink1(String wrLink1) {
        this.wrLink1 = wrLink1;
    }

    public String getWrLink2() {
        return wrLink2;
    }

    public void setWrLink2(String wrLink2) {
        this.wrLink2 = wrLink2;
    }

    public int getWrLink1Hit() {
        return wrLink1Hit;
    }

    public void setWrLink1Hit(int wrLink1Hit) {
        this.wrLink1Hit = wrLink1Hit;
    }

    public int getWrLink2Hit() {
        return wrLink2Hit;
    }

    public void setWrLink2Hit(int wrLink2Hit) {
        this.wrLink2Hit = wrLink2Hit;
    }

    public int getWrHit() {
        return wrHit;
    }

    public void setWrHit(int wrHit) {
        this.wrHit = wrHit;
    }

    public int getWrGood() {
        return wrGood;
    }

    public void setWrGood(int wrGood) {
        this.wrGood = wrGood;
    }

    public int getWrNogood() {
        return wrNogood;
    }

    public void setWrNogood(int wrNogood) {
        this.wrNogood = wrNogood;
    }

    public String getWrPassword() {
        return wrPassword;
    }

    public void setWrPassword(String wrPassword) {
        this.wrPassword = wrPassword;
    }

    public String getWrName() {
        return wrName;
    }

    public void setWrName(String wrName) {
        this.wrName = wrName;
    }

    public String getWrEmail() {
        return wrEmail;
    }

    public void setWrEmail(String wrEmail) {
        this.wrEmail = wrEmail;
    }

    public String getWrHomepage() {
        return wrHomepage;
    }

    public void setWrHomepage(String wrHomepage) {
        this.wrHomepage = wrHomepage;
    }

    public Date getWrDatetime() {
        return wrDatetime;
    }

    public void setWrDatetime(Date wrDatetime) {
        this.wrDatetime = wrDatetime;
    }

    public byte getWrFile() {
        return wrFile;
    }

    public void setWrFile(byte wrFile) {
        this.wrFile = wrFile;
    }

    public String getWrLast() {
        return wrLast;
    }

    public void setWrLast(String wrLast) {
        this.wrLast = wrLast;
    }

    public String getWrIp() {
        return wrIp;
    }

    public void setWrIp(String wrIp) {
        this.wrIp = wrIp;
    }

    public String getWrFacebookUser() {
        return wrFacebookUser;
    }

    public void setWrFacebookUser(String wrFacebookUser) {
        this.wrFacebookUser = wrFacebookUser;
    }

    public String getWrTwitterUser() {
        return wrTwitterUser;
    }

    public void setWrTwitterUser(String wrTwitterUser) {
        this.wrTwitterUser = wrTwitterUser;
    }
    public static Specification<Write> wrSubjectLike(final String keyword) {
        return new Specification<Write>() {
            @Override
            public Predicate toPredicate(Root<Write> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like( root.<String>get("wrSubject"), "%" + keyword + "%");
            }
        };
    }
    public static Specification<Write> wrContentLike(final String keyword) {
        return new Specification<Write>() {
            @Override
            public Predicate toPredicate(Root<Write> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like( root.<String>get("wrContent"), "%" + keyword + "%");
            }
        };
    }
    public static Specification<Write> wrNameLike(final String keyword) {
        return new Specification<Write>() {
            @Override
            public Predicate toPredicate(Root<Write> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like( root.<String>get("wrName"), "%" + keyword + "%");
            }
        };
    }
    public static Specification<Write> memberLike(final String keyword) {
        return new Specification<Write>() {
            @Override
            public Predicate toPredicate(Root<Write> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                return cb.like( root.<String>get("member"), "%" + keyword + "%");
            }
        };
    }
}
