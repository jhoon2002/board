package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.jhoon.springboard.entity.MemberSample;
import com.jhoon.springboard.util.HibernateUtil;

public class MemberTest {

    SessionFactory factory = HibernateUtil.getSessionFactory();
    
    @Test
    public void test() {
        System.out.println("삽입작업");
        
        //Insert
        MemberSample member = new MemberSample("jhoon", "hello");
        insert(member);
        
        //Select One
        MemberSample selectedMember = selectById(1);
        assertEquals("hello", selectedMember.getMessage());
        
        //Update
        selectedMember.setMessage("hello Hibernate");
        update(selectedMember);
        MemberSample updatedMember = selectById(1);
        assertEquals("hello Hibernate", updatedMember.getMessage());
        
        //delete
        delete(updatedMember);
        MemberSample deleteMember = selectById(1);
        assertNull(deleteMember);
        
    }

    private void delete(MemberSample updatedMember) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.delete(updatedMember);
        session.getTransaction().commit();
    }

    private void update(MemberSample selectedMember) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.update(selectedMember);
        session.getTransaction().commit();
    }

    private MemberSample selectById(int i) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        MemberSample selectedMember = (MemberSample) session.get(MemberSample.class, 1);
        session.getTransaction().commit();
        return selectedMember;
    }

    private void insert(MemberSample member) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(member);
        session.getTransaction().commit();
    }
}
