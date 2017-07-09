package com.jhoon.springboard.util;
 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
 
public class FileReaderSql {
     
    public String getQuery(String fileName) throws NumberFormatException, IOException, ParseException{
                                                                
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuffer sb = new StringBuffer();
        
        while((s=reader.readLine())!=null){
            sb.append(s);
        }
        reader.close();
        
        return sb.toString();
    }   
}
