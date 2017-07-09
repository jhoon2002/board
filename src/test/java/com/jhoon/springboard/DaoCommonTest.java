package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.jhoon.springboard.dao.DaoCommon;
import com.jhoon.springboard.entity.MemberSample;

public class DaoCommonTest {

    DaoCommon<MemberSample> daoCommon = new DaoCommon<MemberSample>(MemberSample.class);
    
    @Before
    public void before() {
        int row = daoCommon.deleteAll();
        daoCommon.insert(new MemberSample("홍길동", "멋쟁이"));
        daoCommon.insert(new MemberSample("강감찬", "진짜군인"));
        daoCommon.insert(new MemberSample("원균", "욕심쟁이"));
        daoCommon.insert(new MemberSample("유비", "덕장"));
    }
    
    @Test
    public void list() {
        
        List<MemberSample> list = (List<MemberSample>) daoCommon.selectList();
        
        System.out.println("회원 목록:");
        for (MemberSample member : list) {
            System.out.println(member);
        }
        
        assertEquals(4, daoCommon.count());
        
    }
    
    
    public void delete() {
        
        daoCommon.delete(daoCommon.selectById(3));
        
        List<MemberSample> list = (List<MemberSample>) daoCommon.selectList();
        
        System.out.println("삭제 후 회원 목록:");
        for (MemberSample member : list) {
            System.out.println(member);
        }
        
        assertEquals(3, daoCommon.count());
    }
}
