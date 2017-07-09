package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.jhoon.springboard.entity.Write;
import com.jhoon.springboard.repository.WriteRepositoryCustom;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/testContext.xml")
public class JpaSettingTest {
    
    @Autowired
    WriteRepositoryCustom writeRepository;
    
    @Test
    public void test() {
        assertEquals(1, 1);
    }
    @Test
    public void testRp() {
        
        List<Write> writes = writeRepository.findAll();
        
        for (Write write : writes) {
            System.out.println(write);
        }
        
        Pageable pageable = new PageRequest(1, 3);
        
        Page<Write> page = writeRepository.findAll(pageable);
        
        List<Write> searchWrites = page.getContent();
        
        for (Write write : searchWrites) {
            System.out.println(write);
        }
        
        System.out.println("page.getNumber:" + page.getNumber());
        System.out.println("page.getNumberOfElements:" + page.getNumberOfElements());
        System.out.println("page.getSize:" + page.getSize());
        System.out.println("page.getTotalElements:" + page.getTotalElements());
        System.out.println("page.getTotalPages:" + page.getTotalPages());
        System.out.println("page.getSort:" + page.getSort());
        System.out.println("page.hasContent:" + page.hasContent());
        System.out.println("page.hasNext:" + page.hasNext());
        System.out.println("page.hasPrevious:" + page.hasPrevious());
        System.out.println("page.isFirst:" + page.isFirst());
        System.out.println("page.isLast:" + page.isLast());
        System.out.println("page.nextPageable:" + page.nextPageable());
        System.out.println("page.previousPageable:" + page.previousPageable());
        
        //Pages pages = new Pages(listParam.getPage(), board.getBoPageRows(), pagesPerDistrict, totalRows);

        assertEquals(1, 1);
    }
}
