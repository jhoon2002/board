package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jhoon.springboard.dto.Keywords;
import com.jhoon.springboard.dto.Keywords.Andor;
import com.jhoon.springboard.dto.PageDto;
import com.jhoon.springboard.dto.PageNum;
import com.jhoon.springboard.dto.PageOrder;
import com.jhoon.springboard.dto.PageOrder.Ordering;
import com.jhoon.springboard.entity.Write;
import com.jhoon.springboard.repository.WriteRepositoryCustom;
import com.jhoon.springboard.util.FileReaderSql;

public class WriteRepositoryTest {
    
    GenericApplicationContext context;
    WriteRepositoryCustom writeRepository;
    
    @SuppressWarnings("unused")
    @Before
    public void before() {
        context = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/(test)web-app-ctx.xml");
        FileReaderSql fileReader = new FileReaderSql();
        writeRepository = (WriteRepositoryCustom)context.getBean("writeRepository");
//        try {
//            String q1 = fileReader.getQuery("src/main/resources/member_data.sql");
//            String q2 = fileReader.getQuery("src/main/resources/group_data.sql");
//            String q3 = fileReader.getQuery("src/main/resources/board_data.sql");
//            String q4 = fileReader.getQuery("src/main/resources/write_data.sql");
//            int rows1 = writeRepository.excuteSql(q1);
//            int rows2 = writeRepository.excuteSql(q2);
//            int rows3 = writeRepository.excuteSql(q3);
//            int rows4 = writeRepository.excuteSql(q4);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    
    @Test
    public void findByPageDto() {
        
        PageNum pageNum = new PageNum(1, 10);
        
        PageOrder pageOrder = new PageOrder("wrNum", Ordering.ASC);
        
        List<String> words = new ArrayList<String>();
        words.add("홍");
        //words.add("박");
        List<String> fields = new ArrayList<String>();
        fields.add("wrSubject");
        fields.add("wrContent");
        Keywords keywords = new Keywords(words, fields, Andor.OR);

        PageDto pageDto = new PageDto(pageOrder, pageNum, keywords);
        
        List<Write> list = writeRepository.findByPageDto(Write.class, pageDto);
        
        for (Write write : list) {
            System.out.println(write);
        }
        assertEquals(1, list.size());
    }
    
}
