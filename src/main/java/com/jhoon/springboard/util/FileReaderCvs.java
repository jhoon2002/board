package com.jhoon.springboard.util;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import com.jhoon.springboard.entity.BoardArticle;
 
public class FileReaderCvs {
 
     
    public static List<BoardArticle> getArticles() throws NumberFormatException, IOException, ParseException{
        BoardArticle boardArticle=null;
        StringTokenizer tokenizer;
        SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
        int id;
        String userId;
        String userName;
        String ip;
        String message;
        Date dateWrite;
                                                                
        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/data.csv"));
        ArrayList<BoardArticle> list = new ArrayList<BoardArticle>();
        String s;
 
        while((s=br.readLine())!=null){
            tokenizer = new StringTokenizer(s, ",");
            while(tokenizer.hasMoreElements()){
                id=Integer.parseInt(tokenizer.nextToken());
                userId = tokenizer.nextToken();
                userName = tokenizer.nextToken();
                message=tokenizer.nextToken();
                ip=tokenizer.nextToken();
                dateWrite = transFormat.parse(tokenizer.nextToken());
                
                boardArticle = new BoardArticle(userId, userName, message, ip, dateWrite);
                list.add(boardArticle);
            }
        }
        br.close();
        return list;
    }   
}
