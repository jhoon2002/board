<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="encode" uri="urlEncoding" %>


<div id="hd_login_msg">최고관리자 최고관리자님 로그인 중 <a href="${contextPath}/bbs/logout">로그아웃</a></div>

<div id="to_content"><a href="#container">본문 바로가기</a></div>

<header id="hd">
    <div id="hd_wrap">
        <h1>그누보드5</h1>

        <div id="logo"><a href="${contextPath}/adm"><img src="${contextPath}/img/admin/logo.jpg" alt="그누보드5 관리자"></a></div>

        <ul id="tnb">
            <li><a href="${contextPath}/admin/member_form?w=u&amp;mb_id=admin">관리자정보</a></li>
            <li><a href="${contextPath}/admin/config_form">기본환경</a></li>
            <li><a href="${contextPath}/admin/service">부가서비스</a></li>
            <li><a href="${contextPath}/">커뮤니티</a></li>
                        <li id="tnb_logout"><a href="${contextPath}/bbs/logout">로그아웃</a></li>
        </ul>

        <nav id="gnb">
            <h2>관리자 주메뉴</h2>
            <ul id="gnb_1dul"><li class="gnb_1dli gnb_1dli_air">
<a href="${contextPath}/admin/config_form" class="gnb_1da">환경설정</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="${contextPath}/admin/config_form" class="gnb_2da  ">기본환경설정</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/auth_list" class="gnb_2da  ">관리권한설정</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/theme" class="gnb_2da gnb_grp_style gnb_grp_div">테마설정</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/menu_list" class="gnb_2da gnb_grp_style ">메뉴설정</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sendmail_test" class="gnb_2da  gnb_grp_div">메일 테스트</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/newwinlist" class="gnb_2da  ">팝업레이어관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/session_file_delete" class="gnb_2da gnb_grp_style gnb_grp_div">세션파일 일괄삭제</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/cache_file_delete" class="gnb_2da gnb_grp_style ">캐시파일 일괄삭제</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/captcha_file_delete" class="gnb_2da gnb_grp_style ">캡챠파일 일괄삭제</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/thumbnail_file_delete" class="gnb_2da gnb_grp_style ">썸네일파일 일괄삭제</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/phpinfo" class="gnb_2da  gnb_grp_div">phpinfo()</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/service" class="gnb_2da  ">부가서비스</a></li></ul></li><li class="gnb_1dli">
<a href="${contextPath}/admin/member_list" class="gnb_1da">회원관리</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="${contextPath}/admin/member_list" class="gnb_2da  ">회원관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/mail_list" class="gnb_2da  ">회원메일발송</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/visit_list" class="gnb_2da gnb_grp_style gnb_grp_div">접속자집계</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/visit_search" class="gnb_2da gnb_grp_style ">접속자검색</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/visit_delete" class="gnb_2da gnb_grp_style ">접속자로그삭제</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/point_list" class="gnb_2da  gnb_grp_div">포인트관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/poll_list" class="gnb_2da  ">투표관리</a></li></ul></li><li class="gnb_1dli">
<a href="${contextPath}/admin/board_list" class="gnb_1da">게시판관리</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="${contextPath}/admin/board_list" class="gnb_2da  ">게시판관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/boardgroup_list" class="gnb_2da  ">게시판그룹관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/popular_list" class="gnb_2da gnb_grp_style gnb_grp_div">인기검색어관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/popular_rank" class="gnb_2da gnb_grp_style ">인기검색어순위</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/qa_config" class="gnb_2da  gnb_grp_div">1:1문의설정</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/contentlist" class="gnb_2da gnb_grp_style gnb_grp_div">내용관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/faqmasterlist" class="gnb_2da gnb_grp_style ">FAQ관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/write_count" class="gnb_2da  gnb_grp_div">글,댓글 현황</a></li></ul></li><li class="gnb_1dli">
<a href="${contextPath}/admin/sms_admin/config" class="gnb_1da">SMS 관리</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/config" class="gnb_2da  ">SMS 기본설정</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/member_update" class="gnb_2da  ">회원정보업데이트</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/sms_write" class="gnb_2da  ">문자 보내기</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/history_list" class="gnb_2da gnb_grp_style gnb_grp_div">전송내역-건별</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/history_num" class="gnb_2da gnb_grp_style ">전송내역-번호별</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/form_group" class="gnb_2da  gnb_grp_div">이모티콘 그룹</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/form_list" class="gnb_2da  ">이모티콘 관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/num_group" class="gnb_2da gnb_grp_style gnb_grp_div">휴대폰번호 그룹</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/num_book" class="gnb_2da gnb_grp_style ">휴대폰번호 관리</a></li><li class="gnb_2dli"><a href="${contextPath}/admin/sms_admin/num_book_file" class="gnb_2da gnb_grp_style ">휴대폰번호 파일</a></li></ul></li></ul>        </nav>

    </div>
</header>

<ul id="lnb">
<li><a href="${contextPath}/admin/config_form">기본환경설정</a></li>
<li><a href="${contextPath}/admin/auth_list">관리권한설정</a></li>
<li><a href="${contextPath}/admin/theme">테마설정</a></li>
<li><a href="${contextPath}/admin/menu_list">메뉴설정</a></li>
<li><a href="${contextPath}/admin/sendmail_test">메일 테스트</a></li>
<li><a href="${contextPath}/admin/newwinlist">팝업레이어관리</a></li>
<li><a href="${contextPath}/admin/session_file_delete">세션파일 일괄삭제</a></li>
<li><a href="${contextPath}/admin/cache_file_delete">캐시파일 일괄삭제</a></li>
<li><a href="${contextPath}/admin/captcha_file_delete">캡챠파일 일괄삭제</a></li>
<li><a href="${contextPath}/admin/thumbnail_file_delete">썸네일파일 일괄삭제</a></li>
<li><a href="${contextPath}/admin/phpinfo">phpinfo()</a></li>
<li><a href="${contextPath}/admin/service" class="lnb_svc">부가서비스</a></li></ul>

<div id="wrapper">

    <div id="container">

        <h1>환경설정</h1>

<form:form commandName="config" method="POST">
<input type="hidden" name="token" value="" id="token">

<section id="anc_cf_basic">
    <h2 class="h2_frm">홈페이지 기본환경 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>
    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>홈페이지 기본환경 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_title">홈페이지 제목<strong class="sound_only">필수</strong></label></th>
            <td colspan="3">
                <form:input path="cfTitle" cssClass="required frm_input" cssStyle="width:300px;" cssErrorClass="form_error" />
                <form:errors path="cfTitle" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_admin">최고관리자<strong class="sound_only">필수</strong></label></th>
            <td colspan="3">
                <form:select path="cfAdmin" multiple="false">
                    <form:option value="">선택안함</form:option>
                    <form:option value="admin">admin</form:option>
                </form:select>
                <form:errors path="cfAdmin" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_admin_email">관리자 메일 주소<strong class="sound_only">필수</strong></label></th>
            <td colspan="3">
                <span class="frm_info">관리자가 보내고 받는 용도로 사용하는 메일 주소를 입력합니다. (회원가입, 인증메일, 테스트, 회원메일발송 등에서 사용)</span>
                <form:input path="cfAdminEmail" cssClass="required email frm_input" cssStyle="width:300px;" cssErrorClass="form_error" />
                <form:errors path="cfAdminEmail" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_admin_email_name">관리자 메일 발송이름<strong class="sound_only">필수</strong></label></th>
            <td colspan="3">
                <span class="frm_info">관리자가 보내고 받는 용도로 사용하는 메일의 발송이름을 입력합니다. (회원가입, 인증메일, 테스트, 회원메일발송 등에서 사용)</span>
                <form:input path="cfAdminEmailName" cssClass="required frm_input" cssStyle="width:300px;" cssErrorClass="form_error" />
                <form:errors path="cfAdminEmailName" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_use_point">포인트 사용</label></th>
            <td colspan="3"><form:checkbox path="cfUsePoint"/> 사용</td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_login_point">로그인시 포인트<strong class="sound_only">필수</strong></label></th>
            <td>
                <span class="frm_info">회원이 로그인시 하루에 한번만 적립</span>
                <form:input path="cfLoginPoint" cssClass="required frm_input" cssStyle="width:40px;" cssErrorClass="form_error" /> 점
                <form:errors path="cfLoginPoint" cssClass="form_error_message" />
            </td>
            <th scope="row"><label for="cf_memo_send_point">쪽지보낼시 차감 포인트<strong class="sound_only">필수</strong></label></th>
            <td>
                <span class="frm_info">양수로 입력하십시오. 0점은 쪽지 보낼시 포인트를 차감하지 않습니다.</span>
                <form:input path="cfMemoSendPoint" cssClass="required frm_input" cssStyle="width:40px;" cssErrorClass="form_error" /> 점
                <form:errors path="cfMemoSendPoint" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_cut_name">이름(닉네임) 표시</label></th>
            <td colspan="3">
                <form:input path="cfCutName" cssClass="frm_input" cssStyle="width:40px;" /> 자리만 표시
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_nick_modify">닉네임 수정</label></th>
            <td>수정하면 <form:input path="cfNickModify" cssClass="frm_input" cssStyle="width:40px;" /> 일 동안 바꿀 수 없음</td>
            <th scope="row"><label for="cf_open_modify">정보공개 수정</label></th>
            <td>수정하면 <form:input path="cfOpenModify" cssClass="frm_input" cssStyle="width:40px;" /> 일 동안 바꿀 수 없음</td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_new_del">최근게시물 삭제</label></th>
            <td>
                <span class="frm_info">설정일이 지난 최근게시물 자동 삭제</span>
                <form:input path="cfNewDel" cssClass="frm_input" cssStyle="width:40px;" /> 일
            </td>
            <th scope="row"><label for="cf_memo_del">쪽지 삭제</label></th>
            <td>
                <span class="frm_info">설정일이 지난 쪽지 자동 삭제</span>
                <form:input path="cfMemoDel" cssClass="frm_input" cssStyle="width:40px;" /> 일
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_visit_del">접속자로그 삭제</label></th>
            <td>
                <span class="frm_info">설정일이 지난 접속자 로그 자동 삭제</span>
                <form:input path="cfVisitDel" cssClass="frm_input" cssStyle="width:40px;" /> 일
            </td>
            <th scope="row"><label for="cf_popular_del">인기검색어 삭제</label></th>
            <td>
                <span class="frm_info">설정일이 지난 인기검색어 자동 삭제</span>
                <form:input path="cfPopularDel" cssClass="frm_input" cssStyle="width:40px;" /> 일
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_login_minutes">현재 접속자</label></th>
            <td>
                <span class="frm_info">설정값 이내의 접속자를 현재 접속자로 인정</span>
                <form:input path="cfLoginMinutes" cssClass="frm_input" cssStyle="width:30px;" /> 분
            </td>
            <th scope="row"><label for="cf_new_rows">최근게시물 라인수</label></th>
            <td>
                <span class="frm_info">목록 한페이지당 라인수</span>
                <form:input path="cfNewRows" cssClass="frm_input" cssStyle="width:30px;" /> 라인
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_page_rows">한페이지당 라인수</label></th>
            <td>
                <span class="frm_info">목록(리스트) 한페이지당 라인수</span>
                <form:input path="cfPageRows" cssClass="frm_input" cssStyle="width:30px;" /> 라인
            </td>
            <th scope="row"><label for="cf_mobile_page_rows">모바일 한페이지당 라인수</label></th>
            <td>
                <span class="frm_info">모바일 목록 한페이지당 라인수</span>
                <form:input path="cfMobilePageRows" cssClass="frm_input" cssStyle="width:30px;" /> 라인
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_write_pages">페이지 표시 수<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:input path="cfWritePages" cssClass="required numeric frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 페이지씩 표시
                <form:errors path="cfWritePages" cssClass="form_error_message" />
            </td>
            <th scope="row"><label for="cf_mobile_pages">모바일 페이지 표시 수<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:input path="cfMobilePages" cssClass="required numeric frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 페이지씩 표시
                <form:errors path="cfMobilePages" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_new_skin">최근게시물 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfNewSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
            <th scope="row"><label for="cf_mobile_new_skin">모바일<br>최근게시물 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfMobileNewSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_search_skin">검색 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfSearchSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
            <th scope="row"><label for="cf_mobile_search_skin">모바일 검색 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfMobileSearchSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_connect_skin">접속자 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfConnectSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
            <th scope="row"><label for="cf_mobile_connect_skin">모바일 접속자 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfMobileConnectSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_faq_skin">FAQ 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfFaqSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
            <th scope="row"><label for="cf_mobile_faq_skin">모바일 FAQ 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfMobileFaqSkin" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_editor">에디터 선택</label></th>
            <td colspan="3">
                <span class="frm_info">${contextPath}/plugin/editor 밑의 DHTML 에디터 폴더를 선택합니다.</span>
                <form:select path="cfEditor" multiple="false">
                    <form:option value="">사용안함</form:option>
                    <form:option value="smarteditor2">smarteditor2</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_captcha_mp3">음성캡챠 선택<strong class="sound_only">필수</strong></label></th>
            <td colspan="3">
                <span class="frm_info">${contextPath}/plugin/kcaptcha/mp3 밑의 음성 폴더를 선택합니다.</span>
                <form:select path="cfCaptchaMp3" multiple="false">
                    <form:option value="">선택</form:option>
                    <form:option value="basic">basic</form:option>
                    <form:option value="jmoon">jmoon</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_use_copy_log">복사, 이동시 로그</label></th>
            <td colspan="3">
                <span class="frm_info">게시물 아래에 누구로 부터 복사, 이동됨 표시</span>
                <form:checkbox path="cfUseCopyLog"/> 남김
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_point_term">포인트 유효기간</label></th>
            <td colspan="3">
                <span class="frm_info">기간을 0으로 설정시 포인트 유효기간이 적용되지 않습니다.</span>
                <form:input path="cfPointTerm" cssClass="required frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 일
                <form:errors path="cfPointTerm" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_possible_ip">접근가능 IP</label></th>
            <td>
                <span class="frm_info">입력된 IP의 컴퓨터만 접근할 수 있습니다.<br>123.123.+ 도 입력 가능. (엔터로 구분)</span>
                <form:textarea path="cfPossibleIp" />
            </td>
            <th scope="row"><label for="cf_intercept_ip">접근차단 IP</label></th>
            <td>
                <span class="frm_info">입력된 IP의 컴퓨터는 접근할 수 없음.<br>123.123.+ 도 입력 가능. (엔터로 구분)</span>
                <form:textarea path="cfInterceptIp" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_analytics">방문자분석 스크립트</label></th>
            <td colspan="3">
                <span class="frm_info">방문자분석 스크립트 코드를 입력합니다. 예) 구글 애널리틱스</span>
                <form:textarea path="cfAnalytics" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_add_meta">추가 메타태그</label></th>
            <td colspan="3">
                <span class="frm_info">추가로 사용하실 meta 태그를 입력합니다.</span>
                <form:textarea path="cfAddMeta" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_syndi_token">네이버 신디케이션 연동키</label></th>
            <td colspan="3">
                <span class="frm_info"><b>경고) curl이 지원되지 않아 네이버 신디케이션을 사용할수 없습니다.</b></span>
                <span class="frm_info">네이버 신디케이션 연동키(token)을 입력하면 네이버 신디케이션을 사용할 수 있습니다.<br>연동키는 <a href="http://webmastertool.naver.com/" target="_blank"><u>네이버 웹마스터도구</u></a> -> 네이버 신디케이션에서 발급할 수 있습니다.</span>
                <form:input path="cfSyndiToken" cssClass="frm_input" cssStyle="width:500px;" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_syndi_except">네이버 신디케이션 제외게시판</label></th>
            <td colspan="3">
                <span class="frm_info">네이버 신디케이션 수집에서 제외할 게시판 아이디를 | 로 구분하여 입력하십시오. 예) notice|adult<br>참고로 그룹접근사용 게시판, 글읽기 권한 2 이상 게시판, 비밀글은 신디케이션 수집에서 제외됩니다.</span>
                <form:input path="cfSyndiExcept" cssClass="frm_input" cssStyle="width:500px;" />
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
<button type="button" class="get_theme_confc" data-type="conf_skin">테마 스킨설정 가져오기</button></div>
<section id="anc_cf_board">
    <h2 class="h2_frm">게시판 기본 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>    <div class="local_desc02 local_desc">
        <p>각 게시판 관리에서 개별적으로 설정 가능합니다.</p>
    </div>

    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>게시판 기본 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_delay_sec">글쓰기 간격<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:input path="cfDelaySec" cssClass="required numeric frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 초 지난후 가능
                <form:errors path="cfDelaySec" cssClass="form_error_message" />
            </td>
            <th scope="row"><label for="cf_link_target">새창 링크</label></th>
            <td>
                <span class="frm_info">글내용중 자동 링크되는 타켓을 지정합니다.</span>
                <form:select path="cfLinkTarget">
                    <form:option value="_blank">_blank</form:option>
                    <form:option value="_self">_self</form:option>
                    <form:option value="_top">_top</form:option>
                    <form:option value="_new">_new</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_read_point">글읽기 포인트<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:input path="cfReadPoint" cssClass="required frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 점
                <form:errors path="cfReadPoint" cssClass="form_error_message" />
            </td>
            <th scope="row"><label for="cf_write_point">글쓰기 포인트</label></th>
            <td>
                <form:input path="cfWritePoint" cssClass="required frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 점
                <form:errors path="cfWritePoint" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_comment_point">댓글쓰기 포인트</label></th>
            <td>
                <form:input path="cfCommentPoint" cssClass="required frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 점
                <form:errors path="cfCommentPoint" cssClass="form_error_message" />
            </td>
            <th scope="row"><label for="cf_download_point">다운로드 포인트</label></th>
            <td>
                <form:input path="cfDownloadPoint" cssClass="required frm_input" cssStyle="width:30px;" cssErrorClass="form_error" /> 점
                <form:errors path="cfDownloadPoint" cssClass="form_error_message" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_search_part">검색 단위</label></th>
            <td colspan="3"><form:input path="cfSearchPart" cssClass="frm_input" cssStyle="width:30px;" /> 건 단위로 검색</td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_image_extension">이미지 업로드 확장자</label></th>
            <td colspan="3">
                <span class="frm_info">게시판 글작성시 이미지 파일 업로드 가능 확장자. | 로 구분</span>
                <form:input path="cfImageExtension" cssClass="frm_input" cssStyle="width:500px;" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_flash_extension">플래쉬 업로드 확장자</label></th>
            <td colspan="3">
                <span class="frm_info">게시판 글작성시 플래쉬 파일 업로드 가능 확장자. | 로 구분</span>
                <form:input path="cfFlashExtension" cssClass="frm_input" cssStyle="width:500px;" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_movie_extension">동영상 업로드 확장자</label></th>
            <td colspan="3">
                <span class="frm_info">게시판 글작성시 동영상 파일 업로드 가능 확장자. | 로 구분</span>
                <form:input path="cfMovieExtension" cssClass="frm_input" cssStyle="width:500px;" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_filter">단어 필터링</label></th>
            <td colspan="3">
                <span class="frm_info">입력된 단어가 포함된 내용은 게시할 수 없습니다. 단어와 단어 사이는 ,로 구분합니다.</span>
                <form:textarea path="cfFilter" cssClass="frm_input" rows="7" />
                
             </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_join">
    <h2 class="h2_frm">회원가입 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>    <div class="local_desc02 local_desc">
        <p>회원가입 시 사용할 스킨과 입력 받을 정보 등을 설정할 수 있습니다.</p>
    </div>

    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>회원가입 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_member_skin">회원 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfMemberSkin">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
            <th scope="row"><label for="cf_mobile_member_skin">모바일<br>회원 스킨<strong class="sound_only">필수</strong></label></th>
            <td>
                <form:select path="cfMobileMemberSkin">
                    <form:option value="">선택</form:option>
                    <form:option value="theme/basic">(테마) basic</form:option>
                    <form:option value="basic">basic</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row">홈페이지 입력</th>
            <td>
                <form:checkbox path="cfUseHomepage" /> <label for="cf_use_homepage">보이기</label>
                <form:checkbox path="cfReqHomepage" /> <label for="cf_req_homepage">필수입력</label>
            </td>
            <th scope="row">주소 입력</th>
            <td>
                <form:checkbox path="cfUseAddr" /> <label for="cf_use_addr">보이기</label>
                <form:checkbox path="cfReqAddr" /> <label for="cf_req_addr">필수입력</label>
            </td>
        </tr>
        <tr>
            <th scope="row">전화번호 입력</th>
            <td>
                <form:checkbox path="cfUseTel" /> <label for="cf_use_tel">보이기</label>
                <form:checkbox path="cfReqTel" /> <label for="cf_req_tel">필수입력</label>
            </td>
            <th scope="row">휴대폰번호 입력</th>
            <td>
                <form:checkbox path="cfUseHp" /> <label for="cf_use_hp">보이기</label>
                <form:checkbox path="cfReqHp" /> <label for="cf_req_hp">필수입력</label>
            </td>
        </tr>
        <tr>
            <th scope="row">서명 입력</th>
            <td>
                <form:checkbox path="cfUseSignature" /> <label for="cf_use_signature">보이기</label>
                <form:checkbox path="cfReqSignature" /> <label for="cf_req_signature">필수입력</label>
            </td>
            <th scope="row">자기소개 입력</th>
            <td>
                <form:checkbox path="cfUseProfile" /> <label for="cf_use_profile">보이기</label>
                <form:checkbox path="cfReqProfile" /> <label for="cf_req_profile">필수입력</label>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_register_level">회원가입시 권한</label></th>
            <td>
                <form:select path="cfRegisterLevel">
                    <form:option value="1">1</form:option>
                    <form:option value="2">2</form:option>
                    <form:option value="3">3</form:option>
                    <form:option value="4">4</form:option>
                    <form:option value="5">5</form:option>
                    <form:option value="6">6</form:option>
                    <form:option value="7">7</form:option>
                    <form:option value="8">8</form:option>
                    <form:option value="9">9</form:option>
                </form:select>
            </td>
            <th scope="row"><label for="cf_register_point">회원가입시 포인트</label></th>
            <td><form:input path="cfRegisterPoint" cssClass="frm_input" cssStyle="width:50px;" /> 점</td>
        </tr>
        <tr>
            <th scope="row" id="th310"><label for="cf_leave_day">회원탈퇴후 삭제일</label></th>
            <td colspan="3"><form:input path="cfLeaveDay" cssClass="frm_input" cssStyle="width:30px;" /> 일 후 자동 삭제</td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_use_member_icon">회원아이콘 사용</label></th>
            <td>
                <span class="frm_info">게시물에 게시자 닉네임 대신 아이콘 사용</span>
                <form:select path="cfUseMemberIcon">
                    <form:option value="0">미사용</form:option>
                    <form:option value="1">아이콘만 표시</form:option>
                    <form:option value="2">아이콘+이름 표시</form:option>
                </form:select>
            </td>
            <th scope="row"><label for="cf_icon_level">아이콘 업로드 권한</label></th>
            <td>
                <form:select path="cfIconLevel">
                    <form:option value="1">1</form:option>
                    <form:option value="2">2</form:option>
                    <form:option value="3">3</form:option>
                    <form:option value="4">4</form:option>
                    <form:option value="5">5</form:option>
                    <form:option value="6">6</form:option>
                    <form:option value="7">7</form:option>
                    <form:option value="8">8</form:option>
                    <form:option value="9">9</form:option>
                </form:select> 이상
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_member_icon_size">회원아이콘 용량</label></th>
            <td><form:input path="cfMemberIconSize" cssClass="frm_input" cssStyle="width:90px;" /> 바이트 이하</td>
            <th scope="row">회원아이콘 사이즈</th>
            <td>
                <label for="cf_member_icon_width">가로</label>
                <form:input path="cfMemberIconWidth" cssClass="frm_input" cssStyle="width:30px;" />
                <label for="cf_member_icon_height">세로</label>
                <form:input path="cfMemberIconHeight" cssClass="frm_input" cssStyle="width:30px;" /> 픽셀 이하
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_use_recommend">추천인제도 사용</label></th>
            <td><form:checkbox path="cfUseRecommend" /> 사용</td>
            <th scope="row"><label for="cf_recommend_point">추천인 포인트</label></th>
            <td><form:checkbox path="cfRecommendPoint" /> 점</td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_prohibit_id">아이디,닉네임 금지단어</label></th>
            <td>
                <span class="frm_info">회원아이디, 닉네임으로 사용할 수 없는 단어를 정합니다. 쉼표 (,) 로 구분</span>
                <form:textarea path="cfProhibitId" rows="5" />
            </td>
            <th scope="row"><label for="cf_prohibit_email">입력 금지 메일</label></th>
            <td>
                <span class="frm_info">입력 받지 않을 도메인을 지정합니다. 엔터로 구분 ex) hotmail.com</span>
                <form:textarea path="cfProhibitEmail" rows="5" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_stipulation">회원가입약관</label></th>
            <td colspan="3"><form:textarea path="cfStipulation" rows="10" /></td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_privacy">개인정보처리방침</label></th>
            <td colspan="3"><form:textarea path="cfPrivacy" rows="10" /></td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
<button type="button" class="get_theme_confc" data-type="conf_member">테마 회원스킨설정 가져오기</button></div>
<section id="anc_cf_cert">
    <h2 class="h2_frm">본인확인 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>    <div class="local_desc02 local_desc">
        <p>
            회원가입 시 본인확인 수단을 설정합니다.<br>
            실명과 휴대폰 번호 그리고 본인확인 당시에 성인인지의 여부를 저장합니다.<br>
            게시판의 경우 본인확인 또는 성인여부를 따져 게시물 조회 및 쓰기 권한을 줄 수 있습니다.
        </p>
    </div>

    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>본인확인 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_cert_use">본인확인</label></th>
            <td>
                <form:select path="cfCertUse">
                    <form:option value="0">사용안함</form:option>
                    <form:option value="1">테스트</form:option>
                    <form:option value="2">실서비스</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_cert_ipin">아이핀 본인확인</label></th>
            <td class="cf_cert_service">
                <form:select path="cfCertIpin">
                    <form:option value="">사용안함</form:option>
                    <form:option value="kcb">코리아크레딧뷰로(KCB) 아이핀</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_cert_hp">휴대폰 본인확인</label></th>
            <td class="cf_cert_service">
                <form:select path="cfCertHp">
                    <form:option value="">사용안함</form:option>
                    <form:option value="kcb">코리아크레딧뷰로(KCB) 휴대폰 본인확인</form:option>
                    <form:option value="kcp">한국사이버결제(KCP) 휴대폰 본인확인</form:option>
                    <form:option value="lg">LG유플러스 휴대폰 본인확인</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_cert_kcb_cd">코리아크레딧뷰로<br>KCB 회원사ID</label></th>
            <td class="cf_cert_service">
                <span class="frm_info">KCB 회원사ID를 입력해 주십시오.<br>서비스에 가입되어 있지 않다면, KCB와 계약체결 후 회원사ID를 발급 받으실 수 있습니다.<br>이용하시려는 서비스에 대한 계약을 아이핀, 휴대폰 본인확인 각각 체결해주셔야 합니다.<br>아이핀 본인확인 테스트의 경우에는 KCB 회원사ID가 필요 없으나,<br>휴대폰 본인확인 테스트의 경우 KCB 에서 따로 발급 받으셔야 합니다.</span>
                <form:input path="cfCertKcbCd" cssClass="frm_input" cssStyle="width:200px;" />
                <a href="http://sir.kr/main/service/b_ipin" target="_blank" class="btn_frmline">KCB 아이핀 서비스 신청페이지</a>
                <a href="http://sir.kr/main/service/b_cert" target="_blank" class="btn_frmline">KCB 휴대폰 본인확인 서비스 신청페이지</a>
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_cert_kcp_cd">한국사이버결제<br>KCP 사이트코드</label></th>
            <td class="cf_cert_service">
                <span class="frm_info">SM으로 시작하는 5자리 사이트 코드중 뒤의 3자리만 입력해 주십시오.<br>서비스에 가입되어 있지 않다면, 본인확인 서비스 신청페이지에서 서비스 신청 후 사이트코드를 발급 받으실 수 있습니다.</span>
                <span class="sitecode">SM</span>
                <form:input path="cfCertKcpCd" cssClass="frm_input" cssStyle="width:30px;" />
                <a href="http://sir.kr/main/service/p_cert" target="_blank" class="btn_frmline">KCP 휴대폰 본인확인 서비스 신청페이지</a>
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_lg_mid">LG유플러스 상점아이디</label></th>
            <td class="cf_cert_service">
                <span class="frm_info">LG유플러스 상점아이디 중 si_를 제외한 나머지 아이디만 입력해 주십시오.<br>서비스에 가입되어 있지 않다면, 본인확인 서비스 신청페이지에서 서비스 신청 후 상점아이디를 발급 받으실 수 있습니다.<br><strong>LG유플러스 휴대폰본인확인은 ActiveX 설치가 필요하므로 Internet Explorer 에서만 사용할 수 있습니다.</strong></span>
                <span class="sitecode">si_</span>
                <form:input path="cfLgMid" cssClass="frm_input" cssStyle="width:200px;" />
                <a href="http://sir.kr/main/service/lg_cert" target="_blank" class="btn_frmline">LG유플러스 본인확인 서비스 신청페이지</a>
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_lg_mert_key">LG유플러스 MERT KEY</label></th>
            <td class="cf_cert_service">
                <span class="frm_info">LG유플러스 상점MertKey는 상점관리자 -> 계약정보 -> 상점정보관리에서 확인하실 수 있습니다.</span>
                <form:input path="cfLgMertKey" cssClass="frm_input" cssStyle="width:400px;" />
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_cert_limit">본인확인 이용제한</label></th>
            <td class="cf_cert_service">
                <span class="frm_info">하루동안 아이핀과 휴대폰 본인확인 인증 이용회수를 제한할 수 있습니다.<br>회수제한은 실서비스에서 아이핀과 휴대폰 본인확인 인증에 개별 적용됩니다.<br>0 으로 설정하시면 회수제한이 적용되지 않습니다.</span>
                <form:input path="cfCertLimit" cssClass="frm_input" cssStyle="width:30px;" /> 회
            </td>
        </tr>
        <tr>
            <th scope="row" class="cf_cert_service"><label for="cf_cert_req">본인확인 필수</label></th>
            <td class="cf_cert_service">
                <span class="frm_info">회원가입 때 본인확인을 필수로 할지 설정합니다. 필수로 설정하시면 본인확인을 하지 않은 경우 회원가입이 안됩니다.</span>
                <form:checkbox path="cfCertReq" /> 예
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_mail">
    <h2 class="h2_frm">기본 메일 환경 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>
    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>기본 메일 환경 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_email_use">메일발송 사용</label></th>
            <td>
                <span class="frm_info">체크하지 않으면 메일발송을 아예 사용하지 않습니다. 메일 테스트도 불가합니다.</span>
                <form:checkbox path="cfEmailUse"/> 사용
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_use_email_certify">메일인증 사용</label></th>
            <td>
                <span class="frm_info">메일에 배달된 인증 주소를 클릭하여야 회원으로 인정합니다.</span>
                <form:checkbox path="cfUseEmailCertify"/> 사용
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_formmail_is_member">폼메일 사용 여부</label></th>
            <td>
                <span class="frm_info">체크하지 않으면 비회원도 사용 할 수 있습니다.</span>
                <form:checkbox path="cfFormmailIsMember"/> 회원만 사용
            </td>
        </tr>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_article_mail">
    <h2 class="h2_frm">게시판 글 작성 시 메일 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>
    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>게시판 글 작성 시 메일 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_email_wr_super_admin">최고관리자</label></th>
            <td>
                <span class="frm_info">최고관리자에게 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailWrSuperAdmin" /> 사용
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_email_wr_group_admin">그룹관리자</label></th>
            <td>
                <span class="frm_info">그룹관리자에게 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailWrGroupAdmin" /> 사용
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_email_wr_board_admin">게시판관리자</label></th>
            <td>
                <span class="frm_info">게시판관리자에게 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailWrBoardAdmin" /> 사용
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_email_wr_write">원글작성자</label></th>
            <td>
                <span class="frm_info">게시자님께 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailWrWrite" /> 사용
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_email_wr_comment_all">댓글작성자</label></th>
            <td>
                <span class="frm_info">원글에 댓글이 올라오는 경우 댓글 쓴 모든 분들께 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailWrCommentAll" /> 사용
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_join_mail">
    <h2 class="h2_frm">회원가입 시 메일 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>
    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>회원가입 시 메일 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_email_mb_super_admin">최고관리자 메일발송</label></th>
            <td>
                <span class="frm_info">최고관리자에게 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailMbSuperAdmin" /> 사용
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_email_mb_member">회원님께 메일발송</label></th>
            <td>
                <span class="frm_info">회원가입한 회원님께 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailMbMember" /> 사용
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_vote_mail">
    <h2 class="h2_frm">투표 기타의견 작성 시 메일 설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>
    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>투표 기타의견 작성 시 메일 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_email_po_super_admin">최고관리자 메일발송</label></th>
            <td>
                <span class="frm_info">최고관리자에게 메일을 발송합니다.</span>
                <form:checkbox path="cfEmailPoSuperAdmin" /> 사용
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_sns">
    <h2 class="h2_frm">소셜네트워크서비스(SNS : Social Network Service)</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>
    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>소셜네트워크서비스 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_facebook_appid">페이스북 앱 ID</label></th>
            <td>
                <form:input path="cfFacebookAppid" cssClass="frm_input" />
                <a href="https://developers.facebook.com/apps" target="_blank" class="btn_frmline">앱 등록하기</a>
            </td>
            <th scope="row"><label for="cf_facebook_secret">페이스북 앱 Secret</label></th>
            <td>
                <form:input path="cfFacebookSecret" cssClass="frm_input" cssStyle="width:250px" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_twitter_key">트위터 컨슈머 Key</label></th>
            <td>
                <form:input path="cfTwitterKey" cssClass="frm_input" />
                <a href="https://dev.twitter.com/apps" target="_blank" class="btn_frmline">앱 등록하기</a>
            </td>
            <th scope="row"><label for="cf_twitter_secret">트위터 컨슈머 Secret</label></th>
            <td>
                <form:input path="cfTwitterSecret" cssClass="frm_input" cssStyle="width:250px" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_googl_shorturl_apikey">구글 짧은주소 API Key</label></th>
            <td>
                <form:input path="cfGooglShorturlApikey" cssClass="frm_input" />
                <a href="http://code.google.com/apis/console/" target="_blank" class="btn_frmline">API Key 등록하기</a>
            </td>
            <th scope="row"><label for="cf_kakao_js_apikey">카카오 Javascript API Key</label></th>
            <td>
                <form:input path="cfKakaoJsApikey" cssClass="frm_input" />
                <a href="http://developers.kakao.com/" target="_blank" class="btn_frmline">앱 등록하기</a>
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_lay">
    <h2 class="h2_frm">레이아웃 추가설정</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>    <div class="local_desc02 local_desc">
        <p>기본 설정된 파일 경로 및 script, css 를 추가하거나 변경할 수 있습니다.</p>
    </div>

    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>레이아웃 추가설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_add_script">추가 script, css</label></th>
            <td>
                <span class="frm_info">HTML의 &lt;/HEAD&gt; 태그위로 추가될 JavaScript와 css 코드를 설정합니다.<br>관리자 페이지에서는 이 코드를 사용하지 않습니다.</span>
                <form:textarea path="cfAddScript" />
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
<section id="anc_cf_sms">
    <h2 class="h2_frm">SMS</h2>
    <ul class="anchor">
    <li><a href="#anc_cf_basic">기본환경</a></li>
    <li><a href="#anc_cf_board">게시판기본</a></li>
    <li><a href="#anc_cf_join">회원가입</a></li>
    <li><a href="#anc_cf_cert">본인확인</a></li>
    <li><a href="#anc_cf_mail">기본메일환경</a></li>
    <li><a href="#anc_cf_article_mail">글작성메일</a></li>
    <li><a href="#anc_cf_join_mail">가입메일</a></li>
    <li><a href="#anc_cf_vote_mail">투표메일</a></li>
    <li><a href="#anc_cf_sns">SNS</a></li>
    <li><a href="#anc_cf_lay">레이아웃 추가설정</a></li>
    <li><a href="#anc_cf_sms">SMS</a></li>
    <li><a href="#anc_cf_extra">여분필드</a></li>
</ul>
    <div class="tbl_frm01 tbl_wrap">
        <table>
        <caption>SMS 설정</caption>
        <colgroup>
            <col class="grid_4">
            <col>
        </colgroup>
        <tbody>
        <tr>
            <th scope="row"><label for="cf_sms_use">SMS 사용</label></th>
            <td>
                <form:select path="cfSmsUse">
                    <form:option value="">사용안함</form:option>
                    <form:option value="icode" >아이코드</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_sms_type">SMS 전송유형</label></th>
            <td>
                <span class="frm_info">전송유형을 SMS로 선택하시면 최대 80바이트까지 전송하실 수 있으며<br>LMS로 선택하시면 90바이트 이하는 SMS로, 그 이상은 1500바이트까지 LMS로 전송됩니다.<br>요금은 건당 SMS는 16원, LMS는 48원입니다.</span>
                <form:select path="cfSmsType">
                    <form:option value="">SMS</form:option>
                    <form:option value="icode" >LMS</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_icode_id">아이코드 회원아이디</label></th>
            <td>
                <span class="frm_info">아이코드에서 사용하시는 회원아이디를 입력합니다.</span>
                <form:input path="cfIcodeId" cssClass="frm_input" cssStyle="width:150px;" />
            </td>
        </tr>
        <tr>
            <th scope="row"><label for="cf_icode_pw">아이코드 비밀번호</label></th>
            <td>
                <span class="frm_info">아이코드에서 사용하시는 비밀번호를 입력합니다.</span>
                <form:input path="cfIcodePw" cssClass="frm_input" cssStyle="width:150px;" />
            </td>
        </tr>
        <tr>
            <th scope="row">요금제</th>
            <td>
                <form:hidden path="cfIcodeServerIp" /> 가입해주세요.
                <form:hidden path="cfIcodeServerPort" />
            </td>
        </tr>
        <tr>
            <th scope="row">아이코드 SMS 신청<br>회원가입</th>
            <td>
                <a href="http://icodekorea.com/res/join_company_fix_a?sellid=sir2" target="_blank" class="btn_frmline">아이코드 회원가입</a>
            </td>
        </tr>
        </tbody>
        </table>
    </div>
</section>

<div class="btn_confirm01 btn_confirm">
    <input type="submit" value="확인" class="btn_submit" accesskey="s">
    <a href="${contextPath}/">메인으로</a>
</div>
</form:form>
