package com.jhoon.springboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jhoon.springboard.entity.Write;
import com.jhoon.springboard.repository.WriteRepository;

public class WriteService {
    
    @Autowired
    WriteRepository writeRepository;
    
    @Transactional
    public void saveWrite(Write write) {
        
        //long minWrNum = writeRepository.findMinWrNum(listParam.getBoid());
        //write.setWrNum(--minWrNum);
        
        Write savedWrite = writeRepository.save(write);
        writeRepository.updateWrNum(savedWrite, savedWrite.getId() * -1);
        
    }
    @Transactional
    public void updateWrite(Write write) {
        writeRepository.update(write);
    }
    @Transactional
    public void replyWrite(Write replyWrite) throws Exception {
        
        int limitDepth = 10;
        
        Write parentWrite = writeRepository.findOne(replyWrite.getId());
        if (parentWrite.getWrReply().length() >= (limitDepth)) throw new Exception("답글 단계(" + limitDepth + ") 초과, 더 이상 답글 불가");
        
        replyWrite.setWrParent(replyWrite.getId()); //replyWrite에 저장된 id는 실상 parentWrite의 id
        replyWrite.setId(0L); //replyWrite에 저장된 id는 초기화(값이 OL이면 update하지 않고 save) 
        replyWrite.setWrReply( getNextWrReplyString(parentWrite) ); //wrReply 문자열 저장
        replyWrite.setWrNum(parentWrite.getWrNum());
        
        writeRepository.save(replyWrite);
    }
    private String getNextWrReplyString(Write parentWrite) throws Exception {
        
        char begin = 'A';
        char end = 'Z';
        
        String maxWrReply = writeRepository.findMaxWrReply(parentWrite.getId());
        if (maxWrReply == null || maxWrReply.length() == 0) return parentWrite.getWrReply() + begin;
        
        char endChar = maxWrReply.charAt(maxWrReply.length()-1);
        if (endChar >= end) throw new Exception("답글 갯수(" + (end - begin + 1) + ") 초과, 더 이상 답글 불가");
        
        endChar++;
        
        return maxWrReply.substring(0, maxWrReply.length()-1) + endChar;
    }
}
