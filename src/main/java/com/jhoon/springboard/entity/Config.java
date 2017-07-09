package com.jhoon.springboard.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="CONFIG")
public class Config implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="cf_id")
    private long id;
    
    @Column(name="cf_title", nullable=false)
    @NotNull
    @Size(min=1)
    private String cfTitle = "";

    @Column(name="cf_theme", nullable=false)
    private String cfTheme = "";

    @Column(name="cf_admin", nullable=false)
    @NotNull
    @Size(min=1)
    private String cfAdmin = "";

    @Column(name="cf_admin_email", nullable=false)
    @NotNull
    @Size(min=1)
    private String cfAdminEmail = "";

    @Column(name="cf_admin_email_name", nullable=false)
    @NotNull
    @Size(min=1)
    private String cfAdminEmailName = "";

    @Column(name="cf_add_script", nullable=false)
    private String cfAddScript = "";

    @Column(name="cf_use_point", nullable=false)
    private boolean cfUsePoint = false;

    @Column(name="cf_point_term", nullable=false)
    @NotNull
    @Min(0)
    private int cfPointTerm = 0;

    @Column(name="cf_use_copy_log", nullable=false)
    private boolean cfUseCopyLog = false;

    @Column(name="cf_use_email_certify", nullable=false)
    private boolean cfUseEmailCertify = false;

    @Column(name="cf_login_point", nullable=false)
    @NotNull
    @Min(0)
    private int cfLoginPoint = 0;

    @Column(name="cf_cut_name", nullable=false)
    private int cfCutName = 0;

    @Column(name="cf_nick_modify", nullable=false)
    private int cfNickModify = 0;

    @Column(name="cf_new_skin", nullable=false)
    private String cfNewSkin = "";

    @Column(name="cf_new_rows", nullable=false)
    private int cfNewRows = 0;

    @Column(name="cf_search_skin", nullable=false)
    private String cfSearchSkin = "";

    @Column(name="cf_connect_skin", nullable=false)
    private String cfConnectSkin = "";

    @Column(name="cf_faq_skin", nullable=false)
    private String cfFaqSkin = "";

    @Column(name="cf_read_point", nullable=false)
    @NotNull
    @Min(0)
    private int cfReadPoint = 0;

    @Column(name="cf_write_point", nullable=false)
    @NotNull
    @Min(0)
    private int cfWritePoint = 0;

    @Column(name="cf_comment_point", nullable=false)
    @NotNull
    @Min(0)    
    private int cfCommentPoint = 0;

    @Column(name="cf_download_point", nullable=false)
    @NotNull
    @Min(0)
    private int cfDownloadPoint = 0;

    @Column(name="cf_write_pages", nullable=false)
    @NotNull
    @Min(0)
    private int cfWritePages = 0;

    @Column(name="cf_mobile_pages", nullable=false)
    @NotNull
    @Min(0)
    private int cfMobilePages = 0;

    @Column(name="cf_link_target", nullable=false)
    private String cfLinkTarget = "";

    @Column(name="cf_delay_sec", nullable=false)
    @NotNull
    @Min(0)
    private int cfDelaySec = 0;

    @Column(name="cf_filter", nullable=false)
    private String cfFilter = "";

    @Column(name="cf_possible_ip", nullable=false)
    private String cfPossibleIp = "";

    @Column(name="cf_intercept_ip", nullable=false)
    private String cfInterceptIp = "";

    @Column(name="cf_analytics", nullable=false)
    private String cfAnalytics = "";

    @Column(name="cf_add_meta", nullable=false)
    private String cfAddMeta = "";

    @Column(name="cf_syndi_token", nullable=false)
    private String cfSyndiToken = "";

    @Column(name="cf_syndi_except", nullable=false)
    private String cfSyndiExcept = "";

    @Column(name="cf_member_skin", nullable=false)
    private String cfMemberSkin = "";

    @Column(name="cf_use_homepage", nullable=false)
    private boolean cfUseHomepage = false;

    @Column(name="cf_req_homepage", nullable=false)
    private boolean cfReqHomepage = false;

    @Column(name="cf_use_tel", nullable=false)
    private boolean cfUseTel = false;

    @Column(name="cf_req_tel", nullable=false)
    private boolean cfReqTel = false;

    @Column(name="cf_use_hp", nullable=false)
    private boolean cfUseHp = false;

    @Column(name="cf_req_hp", nullable=false)
    private boolean cfReqHp = false;

    @Column(name="cf_use_addr", nullable=false)
    private boolean cfUseAddr = false;

    @Column(name="cf_req_addr", nullable=false)
    private boolean cfReqAddr = false;

    @Column(name="cf_use_signature", nullable=false)
    private boolean cfUseSignature = false;

    @Column(name="cf_req_signature", nullable=false)
    private boolean cfReqSignature = false;

    @Column(name="cf_use_profile", nullable=false)
    private boolean cfUseProfile = false;

    @Column(name="cf_req_profile", nullable=false)
    private boolean cfReqProfile = false;

    @Column(name="cf_register_level", nullable=false)
    private int cfRegisterLevel = 0;

    @Column(name="cf_register_point", nullable=false)
    private int cfRegisterPoint = 0;

    @Column(name="cf_icon_level", nullable=false)
    private int cfIconLevel = 0;

    @Column(name="cf_use_recommend", nullable=false)
    private boolean cfUseRecommend = false;

    @Column(name="cf_recommend_point", nullable=false)
    private boolean cfRecommendPoint = false;

    @Column(name="cf_leave_day", nullable=false)
    private int cfLeaveDay = 0;

    @Column(name="cf_search_part", nullable=false)
    private int cfSearchPart = 0;

    @Column(name="cf_email_use", nullable=false)
    private boolean cfEmailUse = false;
    
    @Column(name="cf_email_wr_super_admin", nullable=false)
    private boolean cfEmailWrSuperAdmin = false;

    @Column(name="cf_email_wr_group_admin", nullable=false)
    private boolean cfEmailWrGroupAdmin = false;

    @Column(name="cf_email_wr_board_admin", nullable=false)
    private boolean cfEmailWrBoardAdmin = false;

    @Column(name="cf_email_wr_write", nullable=false)
    private boolean cfEmailWrWrite = false;

    @Column(name="cf_email_wr_comment_all", nullable=false)
    private boolean cfEmailWrCommentAll = false;

    @Column(name="cf_email_mb_super_admin", nullable=false)
    private boolean cfEmailMbSuperAdmin = false;

    @Column(name="cf_email_mb_member", nullable=false)
    private boolean cfEmailMbMember = false;

    @Column(name="cf_email_po_super_admin", nullable=false)
    private boolean cfEmailPoSuperAdmin = false;

    @Column(name="cf_prohibit_id", nullable=false)
    private String cfProhibitId = "";

    @Column(name="cf_prohibit_email", nullable=false)
    private String cfProhibitEmail = "";

    @Column(name="cf_new_del", nullable=false)
    private int cfNewDel = 0;

    @Column(name="cf_memo_del", nullable=false)
    private int cfMemoDel = 0;

    @Column(name="cf_visit_del", nullable=false)
    private int cfVisitDel = 0;

    @Column(name="cf_popular_del", nullable=false)
    private int cfPopularDel = 0;

    @Column(name="cf_optimize_date", nullable=false)
    private Date cfOptimizeDate;

    @Column(name="cf_use_member_icon", nullable=false)
    private int cfUseMemberIcon = 0;

    @Column(name="cf_member_icon_size", nullable=false)
    private int cfMemberIconSize = 0;

    @Column(name="cf_member_icon_width", nullable=false)
    private int cfMemberIconWidth = 0;

    @Column(name="cf_member_icon_height", nullable=false)
    private int cfMemberIconHeight = 0;

    @Column(name="cf_login_minutes", nullable=false)
    private int cfLoginMinutes = 0;

    @Column(name="cf_image_extension", nullable=false)
    private String cfImageExtension = "";

    @Column(name="cf_flash_extension", nullable=false)
    private String cfFlashExtension = "";

    @Column(name="cf_movie_extension", nullable=false)
    private String cfMovieExtension = "";

    @Column(name="cf_formmail_is_member", nullable=false)
    private boolean cfFormmailIsMember = false;

    @Column(name="cf_page_rows", nullable=false)
    private int cfPageRows = 0;

    @Column(name="cf_mobile_page_rows", nullable=false)
    private int cfMobilePageRows = 0;

    @Column(name="cf_visit", nullable=false)
    private String cfVisit = "";

    @Column(name="cf_max_po_id", nullable=false)
    private int cfMaxPoId = 0;

    @Column(name="cf_stipulation", nullable=false)
    private String cfStipulation = "";

    @Column(name="cf_privacy", nullable=false)
    private String cfPrivacy = "";

    @Column(name="cf_open_modify", nullable=false)
    private int cfOpenModify = 0;

    @Column(name="cf_memo_send_point", nullable=false)
    @NotNull
    @Min(0)
    private int cfMemoSendPoint = 0;

    @Column(name="cf_mobile_new_skin", nullable=false)
    private String cfMobileNewSkin = "";

    @Column(name="cf_mobile_search_skin", nullable=false)
    private String cfMobileSearchSkin = "";

    @Column(name="cf_mobile_connect_skin", nullable=false)
    private String cfMobileConnectSkin = "";

    @Column(name="cf_mobile_faq_skin", nullable=false)
    private String cfMobileFaqSkin = "";

    @Column(name="cf_mobile_member_skin", nullable=false)
    private String cfMobileMemberSkin = "";

    @Column(name="cf_captcha_mp3", nullable=false)
    private String cfCaptchaMp3 = "";

    @Column(name="cf_editor", nullable=false)
    private String cfEditor = "";

    @Column(name="cf_cert_use", nullable=false)
    private int cfCertUse = 0;

    @Column(name="cf_cert_ipin", nullable=false)
    private String cfCertIpin = "";

    @Column(name="cf_cert_hp", nullable=false)
    private String cfCertHp = "";

    @Column(name="cf_cert_kcb_cd", nullable=false)
    private String cfCertKcbCd = "";

    @Column(name="cf_cert_kcp_cd", nullable=false)
    private String cfCertKcpCd = "";

    @Column(name="cf_lg_mid", nullable=false)
    private String cfLgMid = "";

    @Column(name="cf_lg_mert_key", nullable=false)
    private String cfLgMertKey = "";

    @Column(name="cf_cert_limit", nullable=false)
    private int cfCertLimit = 0;

    @Column(name="cf_cert_req", nullable=false)
    private boolean cfCertReq = false;

    @Column(name="cf_sms_use", nullable=false)
    private String cfSmsUse = "";

    @Column(name="cf_sms_type", nullable=false)
    private String cfSmsType = "";

    @Column(name="cf_icode_id", nullable=false)
    private String cfIcodeId = "";

    @Column(name="cf_icode_pw", nullable=false)
    private String cfIcodePw = "";

    @Column(name="cf_icode_server_ip", nullable=false)
    private String cfIcodeServerIp = "";

    @Column(name="cf_icode_server_port", nullable=false)
    private String cfIcodeServerPort = "";

    @Column(name="cf_googl_shorturl_apikey", nullable=false)
    private String cfGooglShorturlApikey = "";

    @Column(name="cf_facebook_appid", nullable=false)
    private String cfFacebookAppid = "";

    @Column(name="cf_facebook_secret", nullable=false)
    private String cfFacebookSecret = "";

    @Column(name="cf_twitter_key", nullable=false)
    private String cfTwitterKey = "";

    @Column(name="cf_twitter_secret", nullable=false)
    private String cfTwitterSecret = "";

    @Column(name="cf_kakao_js_apikey", nullable=false)
    private String cfKakaoJsApikey = "";


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getCfTitle() {
        return cfTitle;
    }

    public void setCfTitle(String cfTitle) {
        this.cfTitle = cfTitle;
    }

    public String getCfTheme() {
        return cfTheme;
    }

    public void setCfTheme(String cfTheme) {
        this.cfTheme = cfTheme;
    }

    public String getCfAdmin() {
        return cfAdmin;
    }

    public void setCfAdmin(String cfAdmin) {
        this.cfAdmin = cfAdmin;
    }

    public String getCfAdminEmail() {
        return cfAdminEmail;
    }

    public void setCfAdminEmail(String cfAdminEmail) {
        this.cfAdminEmail = cfAdminEmail;
    }

    public String getCfAdminEmailName() {
        return cfAdminEmailName;
    }

    public void setCfAdminEmailName(String cfAdminEmailName) {
        this.cfAdminEmailName = cfAdminEmailName;
    }
    
    public String getCfAddScript() {
        return cfAddScript;
    }

    public void setCfAddScript(String cfAddScript) {
        this.cfAddScript = cfAddScript;
    }

    public boolean isCfUsePoint() {
        return cfUsePoint;
    }

    public void setCfUsePoint(boolean cfUsePoint) {
        this.cfUsePoint = cfUsePoint;
    }

    public int getCfPointTerm() {
        return cfPointTerm;
    }

    public void setCfPointTerm(int cfPointTerm) {
        this.cfPointTerm = cfPointTerm;
    }

    public boolean isCfUseCopyLog() {
        return cfUseCopyLog;
    }

    public void setCfUseCopyLog(boolean cfUseCopyLog) {
        this.cfUseCopyLog = cfUseCopyLog;
    }
    
    public boolean isCfUseEmailCertify() {
        return cfUseEmailCertify;
    }

    public void setCfUseEmailCertify(boolean cfUseEmailCertify) {
        this.cfUseEmailCertify = cfUseEmailCertify;
    }

    public int getCfLoginPoint() {
        return cfLoginPoint;
    }

    public void setCfLoginPoint(int cfLoginPoint) {
        this.cfLoginPoint = cfLoginPoint;
    }

    public int getCfCutName() {
        return cfCutName;
    }

    public void setCfCutName(int cfCutName) {
        this.cfCutName = cfCutName;
    }

    public int getCfNickModify() {
        return cfNickModify;
    }

    public void setCfNickModify(int cfNickModify) {
        this.cfNickModify = cfNickModify;
    }

    public String getCfNewSkin() {
        return cfNewSkin;
    }

    public void setCfNewSkin(String cfNewSkin) {
        this.cfNewSkin = cfNewSkin;
    }

    public int getCfNewRows() {
        return cfNewRows;
    }

    public void setCfNewRows(int cfNewRows) {
        this.cfNewRows = cfNewRows;
    }

    public String getCfSearchSkin() {
        return cfSearchSkin;
    }

    public void setCfSearchSkin(String cfSearchSkin) {
        this.cfSearchSkin = cfSearchSkin;
    }

    public String getCfConnectSkin() {
        return cfConnectSkin;
    }

    public void setCfConnectSkin(String cfConnectSkin) {
        this.cfConnectSkin = cfConnectSkin;
    }

    public String getCfFaqSkin() {
        return cfFaqSkin;
    }

    public void setCfFaqSkin(String cfFaqSkin) {
        this.cfFaqSkin = cfFaqSkin;
    }

    public int getCfReadPoint() {
        return cfReadPoint;
    }

    public void setCfReadPoint(int cfReadPoint) {
        this.cfReadPoint = cfReadPoint;
    }

    public int getCfWritePoint() {
        return cfWritePoint;
    }

    public void setCfWritePoint(int cfWritePoint) {
        this.cfWritePoint = cfWritePoint;
    }

    public int getCfCommentPoint() {
        return cfCommentPoint;
    }

    public void setCfCommentPoint(int cfCommentPoint) {
        this.cfCommentPoint = cfCommentPoint;
    }

    public int getCfDownloadPoint() {
        return cfDownloadPoint;
    }

    public void setCfDownloadPoint(int cfDownloadPoint) {
        this.cfDownloadPoint = cfDownloadPoint;
    }

    public int getCfWritePages() {
        return cfWritePages;
    }

    public void setCfWritePages(int cfWritePages) {
        this.cfWritePages = cfWritePages;
    }

    public int getCfMobilePages() {
        return cfMobilePages;
    }

    public void setCfMobilePages(int cfMobilePages) {
        this.cfMobilePages = cfMobilePages;
    }

    public String getCfLinkTarget() {
        return cfLinkTarget;
    }

    public void setCfLinkTarget(String cfLinkTarget) {
        this.cfLinkTarget = cfLinkTarget;
    }

    public int getCfDelaySec() {
        return cfDelaySec;
    }

    public void setCfDelaySec(int cfDelaySec) {
        this.cfDelaySec = cfDelaySec;
    }

    public String getCfFilter() {
        return cfFilter;
    }

    public void setCfFilter(String cfFilter) {
        this.cfFilter = cfFilter;
    }

    public String getCfPossibleIp() {
        return cfPossibleIp;
    }

    public void setCfPossibleIp(String cfPossibleIp) {
        this.cfPossibleIp = cfPossibleIp;
    }

    public String getCfInterceptIp() {
        return cfInterceptIp;
    }

    public void setCfInterceptIp(String cfInterceptIp) {
        this.cfInterceptIp = cfInterceptIp;
    }

    public String getCfAnalytics() {
        return cfAnalytics;
    }

    public void setCfAnalytics(String cfAnalytics) {
        this.cfAnalytics = cfAnalytics;
    }

    public String getCfAddMeta() {
        return cfAddMeta;
    }

    public void setCfAddMeta(String cfAddMeta) {
        this.cfAddMeta = cfAddMeta;
    }

    public String getCfSyndiToken() {
        return cfSyndiToken;
    }

    public void setCfSyndiToken(String cfSyndiToken) {
        this.cfSyndiToken = cfSyndiToken;
    }

    public String getCfSyndiExcept() {
        return cfSyndiExcept;
    }

    public void setCfSyndiExcept(String cfSyndiExcept) {
        this.cfSyndiExcept = cfSyndiExcept;
    }

    public String getCfMemberSkin() {
        return cfMemberSkin;
    }

    public void setCfMemberSkin(String cfMemberSkin) {
        this.cfMemberSkin = cfMemberSkin;
    }
    
    public boolean isCfUseHomepage() {
        return cfUseHomepage;
    }

    public void setCfUseHomepage(boolean cfUseHomepage) {
        this.cfUseHomepage = cfUseHomepage;
    }

    public boolean isCfReqHomepage() {
        return cfReqHomepage;
    }

    public void setCfReqHomepage(boolean cfReqHomepage) {
        this.cfReqHomepage = cfReqHomepage;
    }

    public boolean isCfUseTel() {
        return cfUseTel;
    }

    public void setCfUseTel(boolean cfUseTel) {
        this.cfUseTel = cfUseTel;
    }

    public boolean isCfReqTel() {
        return cfReqTel;
    }

    public void setCfReqTel(boolean cfReqTel) {
        this.cfReqTel = cfReqTel;
    }

    public boolean isCfUseHp() {
        return cfUseHp;
    }

    public void setCfUseHp(boolean cfUseHp) {
        this.cfUseHp = cfUseHp;
    }

    public boolean isCfReqHp() {
        return cfReqHp;
    }

    public void setCfReqHp(boolean cfReqHp) {
        this.cfReqHp = cfReqHp;
    }

    public boolean isCfUseAddr() {
        return cfUseAddr;
    }

    public void setCfUseAddr(boolean cfUseAddr) {
        this.cfUseAddr = cfUseAddr;
    }

    public boolean isCfReqAddr() {
        return cfReqAddr;
    }

    public void setCfReqAddr(boolean cfReqAddr) {
        this.cfReqAddr = cfReqAddr;
    }

    public boolean isCfUseSignature() {
        return cfUseSignature;
    }

    public void setCfUseSignature(boolean cfUseSignature) {
        this.cfUseSignature = cfUseSignature;
    }

    public boolean isCfReqSignature() {
        return cfReqSignature;
    }

    public void setCfReqSignature(boolean cfReqSignature) {
        this.cfReqSignature = cfReqSignature;
    }

    public boolean isCfUseProfile() {
        return cfUseProfile;
    }

    public void setCfUseProfile(boolean cfUseProfile) {
        this.cfUseProfile = cfUseProfile;
    }

    public boolean isCfReqProfile() {
        return cfReqProfile;
    }

    public void setCfReqProfile(boolean cfReqProfile) {
        this.cfReqProfile = cfReqProfile;
    }

    public int getCfRegisterLevel() {
        return cfRegisterLevel;
    }

    public void setCfRegisterLevel(int cfRegisterLevel) {
        this.cfRegisterLevel = cfRegisterLevel;
    }

    public int getCfRegisterPoint() {
        return cfRegisterPoint;
    }

    public void setCfRegisterPoint(int cfRegisterPoint) {
        this.cfRegisterPoint = cfRegisterPoint;
    }

    public int getCfIconLevel() {
        return cfIconLevel;
    }

    public void setCfIconLevel(int cfIconLevel) {
        this.cfIconLevel = cfIconLevel;
    }
    
    public boolean isCfUseRecommend() {
        return cfUseRecommend;
    }

    public void setCfUseRecommend(boolean cfUseRecommend) {
        this.cfUseRecommend = cfUseRecommend;
    }

    public boolean isCfRecommendPoint() {
        return cfRecommendPoint;
    }

    public void setCfRecommendPoint(boolean cfRecommendPoint) {
        this.cfRecommendPoint = cfRecommendPoint;
    }

    public int getCfLeaveDay() {
        return cfLeaveDay;
    }

    public void setCfLeaveDay(int cfLeaveDay) {
        this.cfLeaveDay = cfLeaveDay;
    }

    public int getCfSearchPart() {
        return cfSearchPart;
    }

    public void setCfSearchPart(int cfSearchPart) {
        this.cfSearchPart = cfSearchPart;
    }
    
    public boolean isCfEmailUse() {
        return cfEmailUse;
    }

    public void setCfEmailUse(boolean cfEmailUse) {
        this.cfEmailUse = cfEmailUse;
    }
    
    public boolean isCfEmailWrSuperAdmin() {
        return cfEmailWrSuperAdmin;
    }

    public void setCfEmailWrSuperAdmin(boolean cfEmailWrSuperAdmin) {
        this.cfEmailWrSuperAdmin = cfEmailWrSuperAdmin;
    }

    public boolean isCfEmailWrGroupAdmin() {
        return cfEmailWrGroupAdmin;
    }

    public void setCfEmailWrGroupAdmin(boolean cfEmailWrGroupAdmin) {
        this.cfEmailWrGroupAdmin = cfEmailWrGroupAdmin;
    }

    public boolean isCfEmailWrBoardAdmin() {
        return cfEmailWrBoardAdmin;
    }

    public void setCfEmailWrBoardAdmin(boolean cfEmailWrBoardAdmin) {
        this.cfEmailWrBoardAdmin = cfEmailWrBoardAdmin;
    }

    public boolean isCfEmailWrWrite() {
        return cfEmailWrWrite;
    }

    public void setCfEmailWrWrite(boolean cfEmailWrWrite) {
        this.cfEmailWrWrite = cfEmailWrWrite;
    }

    public boolean isCfEmailWrCommentAll() {
        return cfEmailWrCommentAll;
    }

    public void setCfEmailWrCommentAll(boolean cfEmailWrCommentAll) {
        this.cfEmailWrCommentAll = cfEmailWrCommentAll;
    }
    
    public boolean isCfEmailMbSuperAdmin() {
        return cfEmailMbSuperAdmin;
    }

    public void setCfEmailMbSuperAdmin(boolean cfEmailMbSuperAdmin) {
        this.cfEmailMbSuperAdmin = cfEmailMbSuperAdmin;
    }

    public boolean isCfEmailMbMember() {
        return cfEmailMbMember;
    }

    public void setCfEmailMbMember(boolean cfEmailMbMember) {
        this.cfEmailMbMember = cfEmailMbMember;
    }

    public boolean isCfEmailPoSuperAdmin() {
        return cfEmailPoSuperAdmin;
    }

    public void setCfEmailPoSuperAdmin(boolean cfEmailPoSuperAdmin) {
        this.cfEmailPoSuperAdmin = cfEmailPoSuperAdmin;
    }

    public String getCfProhibitId() {
        return cfProhibitId;
    }

    public void setCfProhibitId(String cfProhibitId) {
        this.cfProhibitId = cfProhibitId;
    }

    public String getCfProhibitEmail() {
        return cfProhibitEmail;
    }

    public void setCfProhibitEmail(String cfProhibitEmail) {
        this.cfProhibitEmail = cfProhibitEmail;
    }

    public int getCfNewDel() {
        return cfNewDel;
    }

    public void setCfNewDel(int cfNewDel) {
        this.cfNewDel = cfNewDel;
    }

    public int getCfMemoDel() {
        return cfMemoDel;
    }

    public void setCfMemoDel(int cfMemoDel) {
        this.cfMemoDel = cfMemoDel;
    }

    public int getCfVisitDel() {
        return cfVisitDel;
    }

    public void setCfVisitDel(int cfVisitDel) {
        this.cfVisitDel = cfVisitDel;
    }

    public int getCfPopularDel() {
        return cfPopularDel;
    }

    public void setCfPopularDel(int cfPopularDel) {
        this.cfPopularDel = cfPopularDel;
    }

    public Date getCfOptimizeDate() {
        return cfOptimizeDate;
    }

    public void setCfOptimizeDate(Date cfOptimizeDate) {
        this.cfOptimizeDate = cfOptimizeDate;
    }

    public int getCfUseMemberIcon() {
        return cfUseMemberIcon;
    }

    public void setCfUseMemberIcon(int cfUseMemberIcon) {
        this.cfUseMemberIcon = cfUseMemberIcon;
    }

    public int getCfMemberIconSize() {
        return cfMemberIconSize;
    }

    public void setCfMemberIconSize(int cfMemberIconSize) {
        this.cfMemberIconSize = cfMemberIconSize;
    }

    public int getCfMemberIconWidth() {
        return cfMemberIconWidth;
    }

    public void setCfMemberIconWidth(int cfMemberIconWidth) {
        this.cfMemberIconWidth = cfMemberIconWidth;
    }

    public int getCfMemberIconHeight() {
        return cfMemberIconHeight;
    }

    public void setCfMemberIconHeight(int cfMemberIconHeight) {
        this.cfMemberIconHeight = cfMemberIconHeight;
    }

    public int getCfLoginMinutes() {
        return cfLoginMinutes;
    }

    public void setCfLoginMinutes(int cfLoginMinutes) {
        this.cfLoginMinutes = cfLoginMinutes;
    }

    public String getCfImageExtension() {
        return cfImageExtension;
    }

    public void setCfImageExtension(String cfImageExtension) {
        this.cfImageExtension = cfImageExtension;
    }

    public String getCfFlashExtension() {
        return cfFlashExtension;
    }

    public void setCfFlashExtension(String cfFlashExtension) {
        this.cfFlashExtension = cfFlashExtension;
    }

    public String getCfMovieExtension() {
        return cfMovieExtension;
    }

    public void setCfMovieExtension(String cfMovieExtension) {
        this.cfMovieExtension = cfMovieExtension;
    }
    
    public boolean isCfFormmailIsMember() {
        return cfFormmailIsMember;
    }

    public void setCfFormmailIsMember(boolean cfFormmailIsMember) {
        this.cfFormmailIsMember = cfFormmailIsMember;
    }

    public int getCfPageRows() {
        return cfPageRows;
    }

    public void setCfPageRows(int cfPageRows) {
        this.cfPageRows = cfPageRows;
    }

    public int getCfMobilePageRows() {
        return cfMobilePageRows;
    }

    public void setCfMobilePageRows(int cfMobilePageRows) {
        this.cfMobilePageRows = cfMobilePageRows;
    }

    public String getCfVisit() {
        return cfVisit;
    }

    public void setCfVisit(String cfVisit) {
        this.cfVisit = cfVisit;
    }

    public int getCfMaxPoId() {
        return cfMaxPoId;
    }

    public void setCfMaxPoId(int cfMaxPoId) {
        this.cfMaxPoId = cfMaxPoId;
    }

    public String getCfStipulation() {
        return cfStipulation;
    }

    public void setCfStipulation(String cfStipulation) {
        this.cfStipulation = cfStipulation;
    }

    public String getCfPrivacy() {
        return cfPrivacy;
    }

    public void setCfPrivacy(String cfPrivacy) {
        this.cfPrivacy = cfPrivacy;
    }

    public int getCfOpenModify() {
        return cfOpenModify;
    }

    public void setCfOpenModify(int cfOpenModify) {
        this.cfOpenModify = cfOpenModify;
    }

    public int getCfMemoSendPoint() {
        return cfMemoSendPoint;
    }

    public void setCfMemoSendPoint(int cfMemoSendPoint) {
        this.cfMemoSendPoint = cfMemoSendPoint;
    }

    public String getCfMobileNewSkin() {
        return cfMobileNewSkin;
    }

    public void setCfMobileNewSkin(String cfMobileNewSkin) {
        this.cfMobileNewSkin = cfMobileNewSkin;
    }

    public String getCfMobileSearchSkin() {
        return cfMobileSearchSkin;
    }

    public void setCfMobileSearchSkin(String cfMobileSearchSkin) {
        this.cfMobileSearchSkin = cfMobileSearchSkin;
    }

    public String getCfMobileConnectSkin() {
        return cfMobileConnectSkin;
    }

    public void setCfMobileConnectSkin(String cfMobileConnectSkin) {
        this.cfMobileConnectSkin = cfMobileConnectSkin;
    }

    public String getCfMobileFaqSkin() {
        return cfMobileFaqSkin;
    }

    public void setCfMobileFaqSkin(String cfMobileFaqSkin) {
        this.cfMobileFaqSkin = cfMobileFaqSkin;
    }

    public String getCfMobileMemberSkin() {
        return cfMobileMemberSkin;
    }

    public void setCfMobileMemberSkin(String cfMobileMemberSkin) {
        this.cfMobileMemberSkin = cfMobileMemberSkin;
    }

    public String getCfCaptchaMp3() {
        return cfCaptchaMp3;
    }

    public void setCfCaptchaMp3(String cfCaptchaMp3) {
        this.cfCaptchaMp3 = cfCaptchaMp3;
    }

    public String getCfEditor() {
        return cfEditor;
    }

    public void setCfEditor(String cfEditor) {
        this.cfEditor = cfEditor;
    }

    public int getCfCertUse() {
        return cfCertUse;
    }

    public void setCfCertUse(int cfCertUse) {
        this.cfCertUse = cfCertUse;
    }

    public String getCfCertIpin() {
        return cfCertIpin;
    }

    public void setCfCertIpin(String cfCertIpin) {
        this.cfCertIpin = cfCertIpin;
    }

    public String getCfCertHp() {
        return cfCertHp;
    }

    public void setCfCertHp(String cfCertHp) {
        this.cfCertHp = cfCertHp;
    }

    public String getCfCertKcbCd() {
        return cfCertKcbCd;
    }

    public void setCfCertKcbCd(String cfCertKcbCd) {
        this.cfCertKcbCd = cfCertKcbCd;
    }

    public String getCfCertKcpCd() {
        return cfCertKcpCd;
    }

    public void setCfCertKcpCd(String cfCertKcpCd) {
        this.cfCertKcpCd = cfCertKcpCd;
    }

    public String getCfLgMid() {
        return cfLgMid;
    }

    public void setCfLgMid(String cfLgMid) {
        this.cfLgMid = cfLgMid;
    }

    public String getCfLgMertKey() {
        return cfLgMertKey;
    }

    public void setCfLgMertKey(String cfLgMertKey) {
        this.cfLgMertKey = cfLgMertKey;
    }

    public int getCfCertLimit() {
        return cfCertLimit;
    }

    public void setCfCertLimit(int cfCertLimit) {
        this.cfCertLimit = cfCertLimit;
    }
    
    public boolean isCfCertReq() {
        return cfCertReq;
    }

    public void setCfCertReq(boolean cfCertReq) {
        this.cfCertReq = cfCertReq;
    }

    public String getCfSmsUse() {
        return cfSmsUse;
    }

    public void setCfSmsUse(String cfSmsUse) {
        this.cfSmsUse = cfSmsUse;
    }

    public String getCfSmsType() {
        return cfSmsType;
    }

    public void setCfSmsType(String cfSmsType) {
        this.cfSmsType = cfSmsType;
    }

    public String getCfIcodeId() {
        return cfIcodeId;
    }

    public void setCfIcodeId(String cfIcodeId) {
        this.cfIcodeId = cfIcodeId;
    }

    public String getCfIcodePw() {
        return cfIcodePw;
    }

    public void setCfIcodePw(String cfIcodePw) {
        this.cfIcodePw = cfIcodePw;
    }

    public String getCfIcodeServerIp() {
        return cfIcodeServerIp;
    }

    public void setCfIcodeServerIp(String cfIcodeServerIp) {
        this.cfIcodeServerIp = cfIcodeServerIp;
    }

    public String getCfIcodeServerPort() {
        return cfIcodeServerPort;
    }

    public void setCfIcodeServerPort(String cfIcodeServerPort) {
        this.cfIcodeServerPort = cfIcodeServerPort;
    }

    public String getCfGooglShorturlApikey() {
        return cfGooglShorturlApikey;
    }

    public void setCfGooglShorturlApikey(String cfGooglShorturlApikey) {
        this.cfGooglShorturlApikey = cfGooglShorturlApikey;
    }

    public String getCfFacebookAppid() {
        return cfFacebookAppid;
    }

    public void setCfFacebookAppid(String cfFacebookAppid) {
        this.cfFacebookAppid = cfFacebookAppid;
    }

    public String getCfFacebookSecret() {
        return cfFacebookSecret;
    }

    public void setCfFacebookSecret(String cfFacebookSecret) {
        this.cfFacebookSecret = cfFacebookSecret;
    }

    public String getCfTwitterKey() {
        return cfTwitterKey;
    }

    public void setCfTwitterKey(String cfTwitterKey) {
        this.cfTwitterKey = cfTwitterKey;
    }

    public String getCfTwitterSecret() {
        return cfTwitterSecret;
    }

    public void setCfTwitterSecret(String cfTwitterSecret) {
        this.cfTwitterSecret = cfTwitterSecret;
    }
    
    public String getCfKakaoJsApikey() {
        return cfKakaoJsApikey;
    }

    public void setCfKakaoJsApikey(String cfKakaoJsApikey) {
        this.cfKakaoJsApikey = cfKakaoJsApikey;
    }

    @Override
    public String toString() {
        return "Config [id=" + id + ", cfTitle=" + cfTitle + ", cfTheme=" + cfTheme + ", cfAdmin="
                + cfAdmin + ", cfAdminEmail=" + cfAdminEmail + ", cfAdminEmailName="
                + cfAdminEmailName + ", cfAddScripttext=" + cfAddScript + ", cfUsePoint="
                + cfUsePoint + ", cfPointTerm=" + cfPointTerm + ", cfUseCopyLog=" + cfUseCopyLog
                + ", cfUseEmailCertify=" + cfUseEmailCertify + ", cfLoginPoint=" + cfLoginPoint
                + ", cfCutName=" + cfCutName + ", cfNickModify=" + cfNickModify + ", cfNewSkin="
                + cfNewSkin + ", cfNewRows=" + cfNewRows + ", cfSearchSkin=" + cfSearchSkin
                + ", cfConnectSkin=" + cfConnectSkin + ", cfFaqSkin=" + cfFaqSkin + ", cfReadPoint="
                + cfReadPoint + ", cfWritePoint=" + cfWritePoint + ", cfCommentPoint="
                + cfCommentPoint + ", cfDownloadPoint=" + cfDownloadPoint + ", cfWritePages="
                + cfWritePages + ", cfMobilePages=" + cfMobilePages + ", cfLinkTarget="
                + cfLinkTarget + ", cfDelaySec=" + cfDelaySec + ", cfFilter=" + cfFilter
                + ", cfPossibleIp=" + cfPossibleIp + ", cfInterceptIp=" + cfInterceptIp
                + ", cfAnalytics=" + cfAnalytics + ", cfAddMeta=" + cfAddMeta + ", cfSyndiToken="
                + cfSyndiToken + ", cfSyndiExcept=" + cfSyndiExcept + ", cfMemberSkin="
                + cfMemberSkin + ", cfUseHomepage=" + cfUseHomepage + ", cfReqHomepage="
                + cfReqHomepage + ", cfUseTel=" + cfUseTel + ", cfReqTel=" + cfReqTel + ", cfUseHp="
                + cfUseHp + ", cfReqHp=" + cfReqHp + ", cfUseAddr=" + cfUseAddr + ", cfReqAddr="
                + cfReqAddr + ", cfUseSignature=" + cfUseSignature + ", cfReqSignature="
                + cfReqSignature + ", cfUseProfile=" + cfUseProfile + ", cfReqProfile="
                + cfReqProfile + ", cfRegisterLevel=" + cfRegisterLevel + ", cfRegisterPoint="
                + cfRegisterPoint + ", cfIconLevel=" + cfIconLevel + ", cfUseRecommend="
                + cfUseRecommend + ", cfRecommendPoint=" + cfRecommendPoint + ", cfLeaveDay="
                + cfLeaveDay + ", cfSearchPart=" + cfSearchPart + ", cfEmailUse=" + cfEmailUse
                + ", cfEmailWrSuperAdmin=" + cfEmailWrSuperAdmin + ", cfEmailWrGroupAdmin="
                + cfEmailWrGroupAdmin + ", cfEmailWrBoardAdmin=" + cfEmailWrBoardAdmin
                + ", cfEmailWrWrite=" + cfEmailWrWrite + ", cfEmailWrCommentAll="
                + cfEmailWrCommentAll + ", cfEmailMbSuperAdmin=" + cfEmailMbSuperAdmin
                + ", cfEmailMbMember=" + cfEmailMbMember + ", cfEmailPoSuperAdmin="
                + cfEmailPoSuperAdmin + ", cfProhibitId=" + cfProhibitId + ", cfProhibitEmail="
                + cfProhibitEmail + ", cfNewDel=" + cfNewDel + ", cfMemoDel=" + cfMemoDel
                + ", cfVisitDel=" + cfVisitDel + ", cfPopularDel=" + cfPopularDel
                + ", cfOptimizeDate=" + cfOptimizeDate + ", cfUseMemberIcon=" + cfUseMemberIcon
                + ", cfMemberIconSize=" + cfMemberIconSize + ", cfMemberIconWidth="
                + cfMemberIconWidth + ", cfMemberIconHeight=" + cfMemberIconHeight
                + ", cfLoginMinutes=" + cfLoginMinutes + ", cfImageExtension=" + cfImageExtension
                + ", cfFlashExtension=" + cfFlashExtension + ", cfMovieExtension="
                + cfMovieExtension + ", cfFormmailIsMember=" + cfFormmailIsMember + ", cfPageRows="
                + cfPageRows + ", cfMobilePageRows=" + cfMobilePageRows + ", cfVisit=" + cfVisit
                + ", cfMaxPoId=" + cfMaxPoId + ", cfStipulation=" + cfStipulation + ", cfPrivacy="
                + cfPrivacy + ", cfOpenModify=" + cfOpenModify + ", cfMemoSendPoint="
                + cfMemoSendPoint + ", cfMobileNewSkin=" + cfMobileNewSkin + ", cfMobileSearchSkin="
                + cfMobileSearchSkin + ", cfMobileConnectSkin=" + cfMobileConnectSkin
                + ", cfMobileFaqSkin=" + cfMobileFaqSkin + ", cfMobileMemberSkin="
                + cfMobileMemberSkin + ", cfCaptchaMp3=" + cfCaptchaMp3 + ", cfEditor=" + cfEditor
                + ", cfCertUse=" + cfCertUse + ", cfCertIpin=" + cfCertIpin + ", cfCertHp="
                + cfCertHp + ", cfCertKcbCd=" + cfCertKcbCd + ", cfCertKcpCd=" + cfCertKcpCd
                + ", cfLgMid=" + cfLgMid + ", cfLgMertKey=" + cfLgMertKey + ", cfCertLimit="
                + cfCertLimit + ", cfCertReq=" + cfCertReq + ", cfSmsUse=" + cfSmsUse
                + ", cfSmsType=" + cfSmsType + ", cfIcodeId=" + cfIcodeId + ", cfIcodePw="
                + cfIcodePw + ", cfIcodeServerIp=" + cfIcodeServerIp + ", cfIcodeServerPort="
                + cfIcodeServerPort + ", cfGooglShorturlApikey=" + cfGooglShorturlApikey
                + ", cfFacebookAppid=" + cfFacebookAppid + ", cfFacebookSecret=" + cfFacebookSecret
                + ", cfTwitterKey=" + cfTwitterKey + ", cfTwitterSecret=" + cfTwitterSecret
                + ", cfKakaoJsApike=" + cfKakaoJsApikey + "]";
    }
}
