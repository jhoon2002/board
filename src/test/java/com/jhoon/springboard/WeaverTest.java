package com.jhoon.springboard;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jhoon.springboard.entity.Write;
import com.jhoon.springboard.repository.WriteRepositoryCustom;
import com.jhoon.springboard.repository.WriteRepositoryCustom;
import com.jhoon.springboard.service.BoardService;

public class WeaverTest {
    
    GenericApplicationContext context;
    
    @Before
    public void setup() {
        context = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/(test)web-app-ctx.xml");
    }
    
    @Test
    public void test() {
        
        BoardService boardService = (BoardService)context.getBean("boardService");
        Write write = new Write();
        assertEquals(boardService, write.getBoardService());
        assertEquals(1,1);
        
    }
}
