package com.jhoon.springboard.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the g5_board database table.
 * 
 */
@Entity
@Table(name="BOARD")
public class Board implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="bo_id")
	private String id;

	@ManyToOne
	@JoinColumn(name="gr_id")
	private Group group;
	
    @OneToMany(mappedBy="board")
    private List<Write> writes;
    
    @Column(name="bo_subject")
    private String boSubject;
    
    @Column(name="bo_mobile_subject")
    private String boMobileSubject;
    
    @Column(name="bo_device")
    private String boDevice = "both";
	
	@Column(name="bo_admin")
	private String boAdmin;
	
	@Column(name="bo_list_level")
	private byte boListLevel = 1;
	
	@Column(name="bo_read_level")
	private byte boReadLevel = 1;
	
	@Column(name="bo_write_level")
	private byte boWriteLevel = 1;
	
	@Column(name="bo_reply_level")
	private byte boReplyLevel = 1;
	
	@Column(name="bo_comment_level")
	private byte boCommentLevel = 1;
	
	@Column(name="bo_upload_level")
	private byte boUploadLevel = 1;
	
	@Column(name="bo_download_level")
	private byte boDownloadLevel = 1;
	
	@Column(name="bo_html_level")
	private byte boHtmlLevel = 1;
	
	@Column(name="bo_link_level")
	private byte boLinkLevel = 1;
	
	@Column(name="bo_count_delete")
	private byte boCountDelete = 1;
	
	@Column(name="bo_count_modify")
	private byte boCountModify = 1;
	
	@Column(name="bo_read_point")
	private int boReadPoint;
	
	@Column(name="bo_write_point")
	private int boWritePoint;
	
	@Column(name="bo_comment_point")
	private int boCommentPoint;
	
	@Column(name="bo_download_point")
	private int boDownloadPoint;
	
	@Column(name="bo_use_category")
	private byte boUseCategory;
	
	@Lob
	@Column(name="bo_category_list")
	private String boCategoryList;
	
	@Column(name="bo_use_sideview")
	private byte boUseSideview;
	
	@Column(name="bo_use_file_content")
	private byte boUseFileContent;
	
	@Column(name="bo_use_secret")
	private byte boUseSecret = 0;
	
	@Column(name="bo_use_dhtml_editor")
	private byte boUseDhtmlEditor;
	
	@Column(name="bo_use_rss_view")
	private byte boUseRssView;
	
	@Column(name="bo_use_good")
	private byte boUseGood;
	
	@Column(name="bo_use_nogood")
	private byte boUseNogood;
	
	@Column(name="bo_use_name")
	private byte boUseName;
	
	@Column(name="bo_use_signature")
	private byte boUseSignature;
	
	@Column(name="bo_use_ip_view")
	private byte boUseIpView;
	
	@Column(name="bo_use_list_view")
	private byte boUseListView;
	
	@Column(name="bo_use_list_file")
	private byte boUseListFile;
	
	@Column(name="bo_use_list_content")
	private byte boUseListContent;
	
	@Column(name="bo_table_width")
	private int boTableWidth = 100; //100이하는 %
	
	@Column(name="bo_subject_len")
	private int boSubjectLen = 60;
	
	@Column(name="bo_mobile_subject_len")
	private int boMobileSubjectLen = 30;
	
	@Column(name="bo_page_rows")
	private int boPageRows = 15;
	
	@Column(name="bo_mobile_page_rows")
	private int boMobilePageRows = 15;
	
	@Column(name="bo_new")
	private int boNew = 24;
	
	@Column(name="bo_hot")
	private int boHot = 100; //0이면 아이콘 출력 안함
	
	@Column(name="bo_image_width")
	private int boImageWidth = 600;
	
	@Column(name="bo_skin")
	private String boSkin = "basic";
	
	@Column(name="bo_mobile_skin")
	private String boMobileSkin = "basic";
	
	@Column(name="bo_include_head")
	private String boIncludeHead = "_head";
	
	@Column(name="bo_include_tail")
	private String boIncludeTail = "_tail";
	
	@Lob
	@Column(name="bo_content_head")
	private String boContentHead;
	
	@Lob
	@Column(name="bo_mobile_content_head")
	private String boMobileContentHead;
	
	@Lob
	@Column(name="bo_content_tail")
	private String boContentTail;
	
	@Lob
	@Column(name="bo_mobile_content_tail")
	private String boMobileContentTail;
	
	@Lob
	@Column(name="bo_insert_content")
	private String boInsertContent;
	
	@Column(name="bo_gallery_cols")
	private int boGalleryCols = 4;
	
	@Column(name="bo_gallery_width")
	private int boGalleryWidth = 174;
	
	@Column(name="bo_gallery_height")
	private int boGalleryHeight = 124;
	
	@Column(name="bo_mobile_gallery_width")
	private int boMobileGalleryWidth = 125;
	
	@Column(name="bo_mobile_gallery_height")
	private int boMobileGalleryHeight = 100;
	
	@Column(name="bo_upload_size")
	private int boUploadSize = 1048576;
	
	@Column(name="bo_reply_order")
	private byte boReplyOrder = 1;
	
	@Column(name="bo_use_search")
	private byte boUseSearch = 1;
	
	@Column(name="bo_order")
	private int boOrder;
	
	@Column(name="bo_count_write")
	private int boCountWrite;
	
	@Column(name="bo_count_comment")
	private int boCountComment;
	
	@Column(name="bo_write_min")
	private int boWriteMin;
	
	@Column(name="bo_write_max")
	private int boWriteMax;
	
	@Column(name="bo_comment_min")
	private int boCommentMin;
	
	@Column(name="bo_comment_max")
	private int boCommentMax;
	
	@Lob
	@Column(name="bo_notice")
	private String boNotice;
	
	@Column(name="bo_upload_count")
	private byte boUploadCount = 2;
	
	@Column(name="bo_use_email")
	private byte boUseEmail;
	
	@Column(name="bo_use_cert")
	private String boUseCert;
	
	@Column(name="bo_use_sns")
	private byte boUseSns;
	
	@Column(name="bo_sort_field")
	private String boSortField = "";  // "": wr_num, wr_reply : 기본
	
    public Board() {
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<Write> getWrites() {
        return writes;
    }

    public void setWrites(List<Write> writes) {
        this.writes = writes;
    }

    public String getBoSubject() {
        return boSubject;
    }

    public void setBoSubject(String boSubject) {
        this.boSubject = boSubject;
    }

    public String getBoMobileSubject() {
        return boMobileSubject;
    }

    public void setBoMobileSubject(String boMobileSubject) {
        this.boMobileSubject = boMobileSubject;
    }

    public String getBoDevice() {
        return boDevice;
    }

    public void setBoDevice(String boDevice) {
        this.boDevice = boDevice;
    }

    public String getBoAdmin() {
        return boAdmin;
    }

    public void setBoAdmin(String boAdmin) {
        this.boAdmin = boAdmin;
    }

    public byte getBoListLevel() {
        return boListLevel;
    }

    public void setBoListLevel(byte boListLevel) {
        this.boListLevel = boListLevel;
    }

    public byte getBoReadLevel() {
        return boReadLevel;
    }

    public void setBoReadLevel(byte boReadLevel) {
        this.boReadLevel = boReadLevel;
    }

    public byte getBoWriteLevel() {
        return boWriteLevel;
    }

    public void setBoWriteLevel(byte boWriteLevel) {
        this.boWriteLevel = boWriteLevel;
    }

    public byte getBoReplyLevel() {
        return boReplyLevel;
    }

    public void setBoReplyLevel(byte boReplyLevel) {
        this.boReplyLevel = boReplyLevel;
    }

    public byte getBoCommentLevel() {
        return boCommentLevel;
    }

    public void setBoCommentLevel(byte boCommentLevel) {
        this.boCommentLevel = boCommentLevel;
    }

    public byte getBoUploadLevel() {
        return boUploadLevel;
    }

    public void setBoUploadLevel(byte boUploadLevel) {
        this.boUploadLevel = boUploadLevel;
    }

    public byte getBoDownloadLevel() {
        return boDownloadLevel;
    }

    public void setBoDownloadLevel(byte boDownloadLevel) {
        this.boDownloadLevel = boDownloadLevel;
    }

    public byte getBoHtmlLevel() {
        return boHtmlLevel;
    }

    public void setBoHtmlLevel(byte boHtmlLevel) {
        this.boHtmlLevel = boHtmlLevel;
    }

    public byte getBoLinkLevel() {
        return boLinkLevel;
    }

    public void setBoLinkLevel(byte boLinkLevel) {
        this.boLinkLevel = boLinkLevel;
    }

    public byte getBoCountDelete() {
        return boCountDelete;
    }

    public void setBoCountDelete(byte boCountDelete) {
        this.boCountDelete = boCountDelete;
    }

    public byte getBoCountModify() {
        return boCountModify;
    }

    public void setBoCountModify(byte boCountModify) {
        this.boCountModify = boCountModify;
    }

    public int getBoReadPoint() {
        return boReadPoint;
    }

    public void setBoReadPoint(int boReadPoint) {
        this.boReadPoint = boReadPoint;
    }

    public int getBoWritePoint() {
        return boWritePoint;
    }

    public void setBoWritePoint(int boWritePoint) {
        this.boWritePoint = boWritePoint;
    }

    public int getBoCommentPoint() {
        return boCommentPoint;
    }

    public void setBoCommentPoint(int boCommentPoint) {
        this.boCommentPoint = boCommentPoint;
    }

    public int getBoDownloadPoint() {
        return boDownloadPoint;
    }

    public void setBoDownloadPoint(int boDownloadPoint) {
        this.boDownloadPoint = boDownloadPoint;
    }

    public byte getBoUseCategory() {
        return boUseCategory;
    }

    public void setBoUseCategory(byte boUseCategory) {
        this.boUseCategory = boUseCategory;
    }

    public String getBoCategoryList() {
        return boCategoryList;
    }

    public void setBoCategoryList(String boCategoryList) {
        this.boCategoryList = boCategoryList;
    }

    public byte getBoUseSideview() {
        return boUseSideview;
    }

    public void setBoUseSideview(byte boUseSideview) {
        this.boUseSideview = boUseSideview;
    }

    public byte getBoUseFileContent() {
        return boUseFileContent;
    }

    public void setBoUseFileContent(byte boUseFileContent) {
        this.boUseFileContent = boUseFileContent;
    }

    public byte getBoUseSecret() {
        return boUseSecret;
    }

    public void setBoUseSecret(byte boUseSecret) {
        this.boUseSecret = boUseSecret;
    }

    public byte getBoUseDhtmlEditor() {
        return boUseDhtmlEditor;
    }

    public void setBoUseDhtmlEditor(byte boUseDhtmlEditor) {
        this.boUseDhtmlEditor = boUseDhtmlEditor;
    }

    public byte getBoUseRssView() {
        return boUseRssView;
    }

    public void setBoUseRssView(byte boUseRssView) {
        this.boUseRssView = boUseRssView;
    }

    public byte getBoUseGood() {
        return boUseGood;
    }

    public void setBoUseGood(byte boUseGood) {
        this.boUseGood = boUseGood;
    }

    public byte getBoUseNogood() {
        return boUseNogood;
    }

    public void setBoUseNogood(byte boUseNogood) {
        this.boUseNogood = boUseNogood;
    }

    public byte getBoUseName() {
        return boUseName;
    }

    public void setBoUseName(byte boUseName) {
        this.boUseName = boUseName;
    }

    public byte getBoUseSignature() {
        return boUseSignature;
    }

    public void setBoUseSignature(byte boUseSignature) {
        this.boUseSignature = boUseSignature;
    }

    public byte getBoUseIpView() {
        return boUseIpView;
    }

    public void setBoUseIpView(byte boUseIpView) {
        this.boUseIpView = boUseIpView;
    }

    public byte getBoUseListView() {
        return boUseListView;
    }

    public void setBoUseListView(byte boUseListView) {
        this.boUseListView = boUseListView;
    }

    public byte getBoUseListFile() {
        return boUseListFile;
    }

    public void setBoUseListFile(byte boUseListFile) {
        this.boUseListFile = boUseListFile;
    }

    public byte getBoUseListContent() {
        return boUseListContent;
    }

    public void setBoUseListContent(byte boUseListContent) {
        this.boUseListContent = boUseListContent;
    }

    public int getBoTableWidth() {
        return boTableWidth;
    }

    public void setBoTableWidth(int boTableWidth) {
        this.boTableWidth = boTableWidth;
    }

    public int getBoSubjectLen() {
        return boSubjectLen;
    }

    public void setBoSubjectLen(int boSubjectLen) {
        this.boSubjectLen = boSubjectLen;
    }

    public int getBoMobileSubjectLen() {
        return boMobileSubjectLen;
    }

    public void setBoMobileSubjectLen(int boMobileSubjectLen) {
        this.boMobileSubjectLen = boMobileSubjectLen;
    }

    public int getBoPageRows() {
        return boPageRows;
    }

    public void setBoPageRows(int boPageRows) {
        this.boPageRows = boPageRows;
    }

    public int getBoMobilePageRows() {
        return boMobilePageRows;
    }

    public void setBoMobilePageRows(int boMobilePageRows) {
        this.boMobilePageRows = boMobilePageRows;
    }

    public int getBoNew() {
        return boNew;
    }

    public void setBoNew(int boNew) {
        this.boNew = boNew;
    }

    public int getBoHot() {
        return boHot;
    }

    public void setBoHot(int boHot) {
        this.boHot = boHot;
    }

    public int getBoImageWidth() {
        return boImageWidth;
    }

    public void setBoImageWidth(int boImageWidth) {
        this.boImageWidth = boImageWidth;
    }

    public String getBoSkin() {
        return boSkin;
    }

    public void setBoSkin(String boSkin) {
        this.boSkin = boSkin;
    }

    public String getBoMobileSkin() {
        return boMobileSkin;
    }

    public void setBoMobileSkin(String boMobileSkin) {
        this.boMobileSkin = boMobileSkin;
    }

    public String getBoIncludeHead() {
        return boIncludeHead;
    }

    public void setBoIncludeHead(String boIncludeHead) {
        this.boIncludeHead = boIncludeHead;
    }

    public String getBoIncludeTail() {
        return boIncludeTail;
    }

    public void setBoIncludeTail(String boIncludeTail) {
        this.boIncludeTail = boIncludeTail;
    }

    public String getBoContentHead() {
        return boContentHead;
    }

    public void setBoContentHead(String boContentHead) {
        this.boContentHead = boContentHead;
    }

    public String getBoMobileContentHead() {
        return boMobileContentHead;
    }

    public void setBoMobileContentHead(String boMobileContentHead) {
        this.boMobileContentHead = boMobileContentHead;
    }

    public String getBoContentTail() {
        return boContentTail;
    }

    public void setBoContentTail(String boContentTail) {
        this.boContentTail = boContentTail;
    }

    public String getBoMobileContentTail() {
        return boMobileContentTail;
    }

    public void setBoMobileContentTail(String boMobileContentTail) {
        this.boMobileContentTail = boMobileContentTail;
    }

    public String getBoInsertContent() {
        return boInsertContent;
    }

    public void setBoInsertContent(String boInsertContent) {
        this.boInsertContent = boInsertContent;
    }

    public int getBoGalleryCols() {
        return boGalleryCols;
    }

    public void setBoGalleryCols(int boGalleryCols) {
        this.boGalleryCols = boGalleryCols;
    }

    public int getBoGalleryWidth() {
        return boGalleryWidth;
    }

    public void setBoGalleryWidth(int boGalleryWidth) {
        this.boGalleryWidth = boGalleryWidth;
    }

    public int getBoGalleryHeight() {
        return boGalleryHeight;
    }

    public void setBoGalleryHeight(int boGalleryHeight) {
        this.boGalleryHeight = boGalleryHeight;
    }

    public int getBoMobileGalleryWidth() {
        return boMobileGalleryWidth;
    }

    public void setBoMobileGalleryWidth(int boMobileGalleryWidth) {
        this.boMobileGalleryWidth = boMobileGalleryWidth;
    }

    public int getBoMobileGalleryHeight() {
        return boMobileGalleryHeight;
    }

    public void setBoMobileGalleryHeight(int boMobileGalleryHeight) {
        this.boMobileGalleryHeight = boMobileGalleryHeight;
    }

    public int getBoUploadSize() {
        return boUploadSize;
    }

    public void setBoUploadSize(int boUploadSize) {
        this.boUploadSize = boUploadSize;
    }

    public byte getBoReplyOrder() {
        return boReplyOrder;
    }

    public void setBoReplyOrder(byte boReplyOrder) {
        this.boReplyOrder = boReplyOrder;
    }

    public byte getBoUseSearch() {
        return boUseSearch;
    }

    public void setBoUseSearch(byte boUseSearch) {
        this.boUseSearch = boUseSearch;
    }

    public int getBoOrder() {
        return boOrder;
    }

    public void setBoOrder(int boOrder) {
        this.boOrder = boOrder;
    }

    public int getBoCountWrite() {
        return boCountWrite;
    }

    public void setBoCountWrite(int boCountWrite) {
        this.boCountWrite = boCountWrite;
    }

    public int getBoCountComment() {
        return boCountComment;
    }

    public void setBoCountComment(int boCountComment) {
        this.boCountComment = boCountComment;
    }

    public int getBoWriteMin() {
        return boWriteMin;
    }

    public void setBoWriteMin(int boWriteMin) {
        this.boWriteMin = boWriteMin;
    }

    public int getBoWriteMax() {
        return boWriteMax;
    }

    public void setBoWriteMax(int boWriteMax) {
        this.boWriteMax = boWriteMax;
    }

    public int getBoCommentMin() {
        return boCommentMin;
    }

    public void setBoCommentMin(int boCommentMin) {
        this.boCommentMin = boCommentMin;
    }

    public int getBoCommentMax() {
        return boCommentMax;
    }

    public void setBoCommentMax(int boCommentMax) {
        this.boCommentMax = boCommentMax;
    }

    public String getBoNotice() {
        return boNotice;
    }

    public void setBoNotice(String boNotice) {
        this.boNotice = boNotice;
    }

    public byte getBoUploadCount() {
        return boUploadCount;
    }

    public void setBoUploadCount(byte boUploadCount) {
        this.boUploadCount = boUploadCount;
    }

    public byte getBoUseEmail() {
        return boUseEmail;
    }

    public void setBoUseEmail(byte boUseEmail) {
        this.boUseEmail = boUseEmail;
    }

    public String getBoUseCert() {
        return boUseCert;
    }

    public void setBoUseCert(String boUseCert) {
        this.boUseCert = boUseCert;
    }

    public byte getBoUseSns() {
        return boUseSns;
    }

    public void setBoUseSns(byte boUseSns) {
        this.boUseSns = boUseSns;
    }

    public String getBoSortField() {
        return boSortField;
    }

    public void setBoSortField(String boSortField) {
        this.boSortField = boSortField;
    }

    @Override
    public String toString() {
        return "Board [boid=" + id + ", group=" + group + ", boSubject=" + boSubject + ", boMobileSubject="
                + boMobileSubject + ", boDevice=" + boDevice + ", boAdmin=" + boAdmin + ", boListLevel=" + boListLevel
                + ", boReadLevel=" + boReadLevel + ", boWriteLevel=" + boWriteLevel + ", boReplyLevel=" + boReplyLevel
                + ", boCommentLevel=" + boCommentLevel + ", boUploadLevel=" + boUploadLevel + ", boDownloadLevel="
                + boDownloadLevel + ", boHtmlLevel=" + boHtmlLevel + ", boLinkLevel=" + boLinkLevel + ", boCountDelete="
                + boCountDelete + ", boCountModify=" + boCountModify + ", boReadPoint=" + boReadPoint
                + ", boWritePoint=" + boWritePoint + ", boCommentPoint=" + boCommentPoint + ", boDownloadPoint="
                + boDownloadPoint + ", boUseCategory=" + boUseCategory + ", boCategoryList=" + boCategoryList
                + ", boUseSideview=" + boUseSideview + ", boUseFileContent=" + boUseFileContent + ", boUseSecret="
                + boUseSecret + ", boUseDhtmlEditor=" + boUseDhtmlEditor + ", boUseRssView=" + boUseRssView
                + ", boUseGood=" + boUseGood + ", boUseNogood=" + boUseNogood + ", boUseName=" + boUseName
                + ", boUseSignature=" + boUseSignature + ", boUseIpView=" + boUseIpView + ", boUseListView="
                + boUseListView + ", boUseListFile=" + boUseListFile + ", boUseListContent=" + boUseListContent
                + ", boTableWidth=" + boTableWidth + ", boSubjectLen=" + boSubjectLen + ", boMobileSubjectLen="
                + boMobileSubjectLen + ", boPageRows=" + boPageRows + ", boMobilePageRows=" + boMobilePageRows
                + ", boNew=" + boNew + ", boHot=" + boHot + ", boImageWidth=" + boImageWidth + ", boSkin=" + boSkin
                + ", boMobileSkin=" + boMobileSkin + ", boIncludeHead=" + boIncludeHead + ", boIncludeTail="
                + boIncludeTail + ", boContentHead=" + boContentHead + ", boMobileContentHead=" + boMobileContentHead
                + ", boContentTail=" + boContentTail + ", boMobileContentTail=" + boMobileContentTail
                + ", boInsertContent=" + boInsertContent + ", boGalleryCols=" + boGalleryCols + ", boGalleryWidth="
                + boGalleryWidth + ", boGalleryHeight=" + boGalleryHeight + ", boMobileGalleryWidth="
                + boMobileGalleryWidth + ", boMobileGalleryHeight=" + boMobileGalleryHeight + ", boUploadSize="
                + boUploadSize + ", boReplyOrder=" + boReplyOrder + ", boUseSearch=" + boUseSearch + ", boOrder="
                + boOrder + ", boCountWrite=" + boCountWrite + ", boCountComment=" + boCountComment + ", boWriteMin="
                + boWriteMin + ", boWriteMax=" + boWriteMax + ", boCommentMin=" + boCommentMin + ", boCommentMax="
                + boCommentMax + ", boNotice=" + boNotice + ", boUploadCount=" + boUploadCount + ", boUseEmail="
                + boUseEmail + ", boUseCert=" + boUseCert + ", boUseSns=" + boUseSns + ", boSortField=" + boSortField
                + "]";
    }

    
}