package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.jhoon.springboard.dao.DaoCommon;
import com.jhoon.springboard.entity.Board;
import com.jhoon.springboard.entity.Group;
import com.jhoon.springboard.entity.Write;
import com.jhoon.springboard.util.FileReaderSql;

public class DaoWriteTest {
    
    DaoCommon<Group> daoGroup = new DaoCommon<Group>(Group.class);
    DaoCommon<Board> daoBoard = new DaoCommon<Board>(Board.class);
    DaoCommon<Write> daoWrite = new DaoCommon<Write>(Write.class);
    
    @Before
    public void before() {
        //        Group group  = new Group();
        //        group.setGrId("basic");
        //        group.setGrSubject("This is default group");
        //        daoGroup.insert(group);
        //        
        //        Board board = new Board();
        //        board.setBoId("free");
        //        board.setGrId("basic");
        //        board.setBoSubject("free board");
        //        daoBoard.insert(board);
        
        FileReaderSql fileReader = new FileReaderSql();
        try {
//            String q1 = fileReader.getQuery("src/main/resources/member_data.sql");
//            String q2 = fileReader.getQuery("src/main/resources/group_data.sql");
//            String q3 = fileReader.getQuery("src/main/resources/board_data.sql");
//            String q4 = fileReader.getQuery("src/main/resources/write_data.sql");
//            int rows1 = daoWrite.excuteSql(q1);
//            int rows2 = daoWrite.excuteSql(q2);
//            int rows3 = daoWrite.excuteSql(q3);
//            int rows4 = daoWrite.excuteSql(q4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void list() {
        int requestPage = 1;
        List<Write> list = (List<Write>) daoWrite.getPagingList(requestPage);
        //BoardArticle ba = daoCommon.selectById(3);
        //System.out.println(ba);
        for (Write write : list) {
            System.out.println(write);
        }
        assertEquals(5, list.size());
    }
    
}
