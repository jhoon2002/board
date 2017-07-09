package com.jhoon.springboard.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the g5_group database table.
 * 
 */
@Entity
@Table(name="GROUP")
public class Group implements Serializable {
	private static final long serialVersionUID = 1L;

	public Group() {}
	
	@Id
	@Column(name="gr_id")
	private String id;

	@OneToMany(mappedBy="group")
	private List<Board> boards;

	private String grSubject;
	
	private String grDevice = "both";

	private String grAdmin;
	
	private byte grUseAccess;

	private int grOrder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public String getGrSubject() {
        return grSubject;
    }

    public void setGrSubject(String grSubject) {
        this.grSubject = grSubject;
    }

    public String getGrDevice() {
        return grDevice;
    }

    public void setGrDevice(String grDevice) {
        this.grDevice = grDevice;
    }

    public String getGrAdmin() {
        return grAdmin;
    }

    public void setGrAdmin(String grAdmin) {
        this.grAdmin = grAdmin;
    }

    public byte getGrUseAccess() {
        return grUseAccess;
    }

    public void setGrUseAccess(byte grUseAccess) {
        this.grUseAccess = grUseAccess;
    }

    public int getGrOrder() {
        return grOrder;
    }

    public void setGrOrder(int grOrder) {
        this.grOrder = grOrder;
    }
	
}