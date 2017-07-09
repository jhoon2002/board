package com.jhoon.springboard.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

@Entity
@Table(name="GROUP_MEMBER")
public class GroupMember implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="gm_id")
    private long id;
    
    @ManyToOne
    @JoinColumn(name="gr_id")
    private Group group;
    
    @ManyToOne
    @JoinColumn(name="mb_id")
    private Member member;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Generated(GenerationTime.ALWAYS) 
    @Column(name="gm_datetime", nullable=false, 
            insertable=false, updatable=false, 
            columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date gmDatetime;
    
}
