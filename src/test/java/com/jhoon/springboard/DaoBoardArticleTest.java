package com.jhoon.springboard;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import org.junit.Test;

import com.jhoon.springboard.dao.DaoCommon;
import com.jhoon.springboard.entity.BoardArticle;
import com.jhoon.springboard.util.FileReaderCvs;

public class DaoBoardArticleTest {
    
    DaoCommon<BoardArticle> daoCommon = new DaoCommon<BoardArticle>(BoardArticle.class);
    
    //@Before
    public void before() {
        //int row = daoCommon.deleteAll();
        FileReaderCvs fileReader = new FileReaderCvs();
        try {
            List<BoardArticle> list = fileReader.getArticles();
            System.out.println(list.size());
            for (BoardArticle boardArticle : list) {
                daoCommon.insert(boardArticle);
            }
        } catch (NumberFormatException e) {
            // TODO 자동 생성된 catch 블록
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 자동 생성된 catch 블록
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO 자동 생성된 catch 블록
            e.printStackTrace();
        }
    }
    
    @Test
    public void list() {
        int requestPage = 48;
        List<BoardArticle> list = (List<BoardArticle>) daoCommon.getPagingList(requestPage);
        //BoardArticle ba = daoCommon.selectById(3);
        //System.out.println(ba);
        for (BoardArticle boardArticle : list) {
            System.out.println(boardArticle);
        }
        assertEquals(10, list.size());
    }
    
}
