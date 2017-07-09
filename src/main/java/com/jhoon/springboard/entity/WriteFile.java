package com.jhoon.springboard.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the g5_board_file database table.
 * 
 */
@Entity
@Table(name="WRITE_FILE")
public class WriteFile implements Serializable {
	private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="wf_id")
	private int id;

    @ManyToOne
    @JoinColumn(name="wr_id")
    private Write write;

    @Column(name="wf_no")   
    private int wfno;
    
    @Column(name="wf_source")
    private String wfSource;
    
    @Column(name="wf_file")
    private String wfFile;
    
    @Column(name="wf_download")
    private int wfDownload;
    
    @Lob
    @Column(name="wf_content")
    private String wfContent;
    
    @Column(name="wf_filesize")
    private int wfFilesize;

	@Column(name="wf_width")
	private int wfWidth;

	@Column(name="wf_height")
	private short wfHeight;
	
	@Column(name="wf_type")
	private byte wfType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="wf_datetime")
	private Date wfDatetime;
}