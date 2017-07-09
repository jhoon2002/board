package com.jhoon.springboard.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the g5_member database table.
 * 
 */
@Entity
@Table(name="MEMBER")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mb_id")
	private String id;
	
	@OneToMany
	@JoinColumn(name="mb_id")
	private List<Write> writes;
	
	@Column(name="mb_password")
	private String mbPassword;
	
	@Column(name="mb_name")
	private String mbName;
	
	@Column(name="mb_nick")
	private String mbNick;
	
	@Temporal(TemporalType.DATE)
	@Column(name="mb_nick_date")
	private Date mbNickDate;
	
	@Column(name="mb_email")
	private String mbEmail;
	
	@Column(name="mb_homepage")
	private String mbHomepage;
	
	@Column(name="mb_level")
	private byte mbLevel;
	
	@Column(name="mb_sex")
	private String mbSex;
	
	@Column(name="mb_birth")
	private String mbBirth;
	
	@Column(name="mb_tel")
	private String mbTel;
	
	@Column(name="mb_hp")
	private String mbHp;
	
	@Column(name="mb_certify")
	private String mbCertify;
	
	@Column(name="mb_adult")
	private byte mbAdult;
	
	@Column(name="mb_dupinfo")
	private String mbDupinfo;
	
	@Column(name="mb_zip1")
	private String mbZip1;
	
	@Column(name="mb_zip2")
	private String mbZip2;
	
	@Column(name="mb_addr1")
	private String mbAddr1;
	
	@Column(name="mb_addr2")
	private String mbAddr2;
	
	@Column(name="mb_addr3")
	private String mbAddr3;
	
	@Column(name="mb_addr_jibeon")
	private String mbAddrJibeon;
	
	@Lob
	@Column(name="mb_signature")
	private String mbSignature;
	
	@Column(name="mb_recommend")
	private String mbRecommend;
	
	@Column(name="mb_point")
	private int mbPoint;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mb_today_login")
	private Date mbTodayLogin;
	
	@Column(name="mb_login_ip")
	private String mbLoginIp;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mb_datetime")
	private Date mbDatetime;
	
	@Column(name="mb_ip")
	private String mbIp;
	
	@Column(name="mb_leave_date")
	private String mbLeaveDate;
	
	@Column(name="mb_intercept_date")
	private String mbInterceptDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="mb_email_certify")
	private Date mbEmailCertify;
	
	@Lob
	@Column(name="mb_memo")
	private String mbMemo;
	
	@Column(name="mb_lost_certify")
	private String mbLostCertify;
	
	@Column(name="mb_mailling")
	private byte mbMailling;
	
	@Column(name="mb_sms")
	private byte mbSms;
	
	@Column(name="mb_open")
	private byte mbOpen;
	
	@Temporal(TemporalType.DATE)
	@Column(name="mb_open_date")
	private Date mbOpenDate;
	
	@Lob
	@Column(name="mb_profile")
	private String mbProfile;
	
	@Column(name="mb_memo_call")
	private String mbMemoCall;
	
	public Member() {
	}
	
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Write> getWrites() {
        return writes;
    }

    public void setWrites(List<Write> writes) {
        this.writes = writes;
    }

    public String getMbPassword() {
        return mbPassword;
    }

    public void setMbPassword(String mbPassword) {
        this.mbPassword = mbPassword;
    }

    public String getMbName() {
        return mbName;
    }

    public void setMbName(String mbName) {
        this.mbName = mbName;
    }

    public String getMbNick() {
        return mbNick;
    }

    public void setMbNick(String mbNick) {
        this.mbNick = mbNick;
    }

    public Date getMbNickDate() {
        return mbNickDate;
    }

    public void setMbNickDate(Date mbNickDate) {
        this.mbNickDate = mbNickDate;
    }

    public String getMbEmail() {
        return mbEmail;
    }

    public void setMbEmail(String mbEmail) {
        this.mbEmail = mbEmail;
    }

    public String getMbHomepage() {
        return mbHomepage;
    }

    public void setMbHomepage(String mbHomepage) {
        this.mbHomepage = mbHomepage;
    }

    public byte getMbLevel() {
        return mbLevel;
    }

    public void setMbLevel(byte mbLevel) {
        this.mbLevel = mbLevel;
    }

    public String getMbSex() {
        return mbSex;
    }

    public void setMbSex(String mbSex) {
        this.mbSex = mbSex;
    }

    public String getMbBirth() {
        return mbBirth;
    }

    public void setMbBirth(String mbBirth) {
        this.mbBirth = mbBirth;
    }

    public String getMbTel() {
        return mbTel;
    }

    public void setMbTel(String mbTel) {
        this.mbTel = mbTel;
    }

    public String getMbHp() {
        return mbHp;
    }

    public void setMbHp(String mbHp) {
        this.mbHp = mbHp;
    }

    public String getMbCertify() {
        return mbCertify;
    }

    public void setMbCertify(String mbCertify) {
        this.mbCertify = mbCertify;
    }

    public byte getMbAdult() {
        return mbAdult;
    }

    public void setMbAdult(byte mbAdult) {
        this.mbAdult = mbAdult;
    }

    public String getMbDupinfo() {
        return mbDupinfo;
    }

    public void setMbDupinfo(String mbDupinfo) {
        this.mbDupinfo = mbDupinfo;
    }

    public String getMbZip1() {
        return mbZip1;
    }

    public void setMbZip1(String mbZip1) {
        this.mbZip1 = mbZip1;
    }

    public String getMbZip2() {
        return mbZip2;
    }

    public void setMbZip2(String mbZip2) {
        this.mbZip2 = mbZip2;
    }

    public String getMbAddr1() {
        return mbAddr1;
    }

    public void setMbAddr1(String mbAddr1) {
        this.mbAddr1 = mbAddr1;
    }

    public String getMbAddr2() {
        return mbAddr2;
    }

    public void setMbAddr2(String mbAddr2) {
        this.mbAddr2 = mbAddr2;
    }

    public String getMbAddr3() {
        return mbAddr3;
    }

    public void setMbAddr3(String mbAddr3) {
        this.mbAddr3 = mbAddr3;
    }

    public String getMbAddrJibeon() {
        return mbAddrJibeon;
    }

    public void setMbAddrJibeon(String mbAddrJibeon) {
        this.mbAddrJibeon = mbAddrJibeon;
    }

    public String getMbSignature() {
        return mbSignature;
    }

    public void setMbSignature(String mbSignature) {
        this.mbSignature = mbSignature;
    }

    public String getMbRecommend() {
        return mbRecommend;
    }

    public void setMbRecommend(String mbRecommend) {
        this.mbRecommend = mbRecommend;
    }

    public int getMbPoint() {
        return mbPoint;
    }

    public void setMbPoint(int mbPoint) {
        this.mbPoint = mbPoint;
    }

    public Date getMbTodayLogin() {
        return mbTodayLogin;
    }

    public void setMbTodayLogin(Date mbTodayLogin) {
        this.mbTodayLogin = mbTodayLogin;
    }

    public String getMbLoginIp() {
        return mbLoginIp;
    }

    public void setMbLoginIp(String mbLoginIp) {
        this.mbLoginIp = mbLoginIp;
    }

    public Date getMbDatetime() {
        return mbDatetime;
    }

    public void setMbDatetime(Date mbDatetime) {
        this.mbDatetime = mbDatetime;
    }

    public String getMbIp() {
        return mbIp;
    }

    public void setMbIp(String mbIp) {
        this.mbIp = mbIp;
    }

    public String getMbLeaveDate() {
        return mbLeaveDate;
    }

    public void setMbLeaveDate(String mbLeaveDate) {
        this.mbLeaveDate = mbLeaveDate;
    }

    public String getMbInterceptDate() {
        return mbInterceptDate;
    }

    public void setMbInterceptDate(String mbInterceptDate) {
        this.mbInterceptDate = mbInterceptDate;
    }

    public Date getMbEmailCertify() {
        return mbEmailCertify;
    }

    public void setMbEmailCertify(Date mbEmailCertify) {
        this.mbEmailCertify = mbEmailCertify;
    }

    public String getMbMemo() {
        return mbMemo;
    }

    public void setMbMemo(String mbMemo) {
        this.mbMemo = mbMemo;
    }

    public String getMbLostCertify() {
        return mbLostCertify;
    }

    public void setMbLostCertify(String mbLostCertify) {
        this.mbLostCertify = mbLostCertify;
    }

    public byte getMbMailling() {
        return mbMailling;
    }

    public void setMbMailling(byte mbMailling) {
        this.mbMailling = mbMailling;
    }

    public byte getMbSms() {
        return mbSms;
    }

    public void setMbSms(byte mbSms) {
        this.mbSms = mbSms;
    }

    public byte getMbOpen() {
        return mbOpen;
    }

    public void setMbOpen(byte mbOpen) {
        this.mbOpen = mbOpen;
    }

    public Date getMbOpenDate() {
        return mbOpenDate;
    }

    public void setMbOpenDate(Date mbOpenDate) {
        this.mbOpenDate = mbOpenDate;
    }

    public String getMbProfile() {
        return mbProfile;
    }

    public void setMbProfile(String mbProfile) {
        this.mbProfile = mbProfile;
    }

    public String getMbMemoCall() {
        return mbMemoCall;
    }

    public void setMbMemoCall(String mbMemoCall) {
        this.mbMemoCall = mbMemoCall;
    }

    @Override
    public String toString() {
        return "Member [id=" + id + ", mbPassword=" + mbPassword + ", mbName=" + mbName
                + ", mbNick=" + mbNick + ", mbNickDate=" + mbNickDate + ", mbEmail=" + mbEmail + ", mbHomepage="
                + mbHomepage + ", mbLevel=" + mbLevel + ", mbSex=" + mbSex + ", mbBirth=" + mbBirth + ", mbTel=" + mbTel
                + ", mbHp=" + mbHp + ", mbCertify=" + mbCertify + ", mbAdult=" + mbAdult + ", mbDupinfo=" + mbDupinfo
                + ", mbZip1=" + mbZip1 + ", mbZip2=" + mbZip2 + ", mbAddr1=" + mbAddr1 + ", mbAddr2=" + mbAddr2
                + ", mbAddr3=" + mbAddr3 + ", mbAddrJibeon=" + mbAddrJibeon + ", mbSignature=" + mbSignature
                + ", mbRecommend=" + mbRecommend + ", mbPoint=" + mbPoint + ", mbTodayLogin=" + mbTodayLogin
                + ", mbLoginIp=" + mbLoginIp + ", mbDatetime=" + mbDatetime + ", mbIp=" + mbIp + ", mbLeaveDate="
                + mbLeaveDate + ", mbInterceptDate=" + mbInterceptDate + ", mbEmailCertify=" + mbEmailCertify
                + ", mbMemo=" + mbMemo + ", mbLostCertify=" + mbLostCertify + ", mbMailling=" + mbMailling + ", mbSms="
                + mbSms + ", mbOpen=" + mbOpen + ", mbOpenDate=" + mbOpenDate + ", mbProfile=" + mbProfile
                + ", mbMemoCall=" + mbMemoCall + "]";
    }
	
}