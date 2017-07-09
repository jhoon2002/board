<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="pageNavi" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="encode" uri="urlEncoding" %>


<div id="hd_login_msg">최고관리자 최고관리자님 로그인 중 <a href="http://127.0.0.1/bbs/logout">로그아웃</a></div>

<div id="to_content"><a href="#container">본문 바로가기</a></div>

<header id="hd">
    <div id="hd_wrap">
        <h1>그누보드5</h1>

        <div id="logo"><a href="http://127.0.0.1/adm"><img src="http://127.0.0.1/adm/img/logo.jpg" alt="그누보드5 관리자"></a></div>

        <ul id="tnb">
            <li><a href="http://127.0.0.1/adm/member_form?w=u&amp;mb_id=admin">관리자정보</a></li>
            <li><a href="http://127.0.0.1/adm/config_form">기본환경</a></li>
            <li><a href="http://127.0.0.1/adm/service">부가서비스</a></li>
            <li><a href="http://127.0.0.1/">커뮤니티</a></li>
                        <li id="tnb_logout"><a href="http://127.0.0.1/bbs/logout">로그아웃</a></li>
        </ul>

        <nav id="gnb">
            <h2>관리자 주메뉴</h2>
            <ul id="gnb_1dul"><li class="gnb_1dli">
<a href="http://127.0.0.1/adm/config_form" class="gnb_1da">환경설정</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="http://127.0.0.1/adm/config_form" class="gnb_2da  ">기본환경설정</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/auth_list" class="gnb_2da  ">관리권한설정</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/theme" class="gnb_2da gnb_grp_style gnb_grp_div">테마설정</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/menu_list" class="gnb_2da gnb_grp_style ">메뉴설정</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sendmail_test" class="gnb_2da  gnb_grp_div">메일 테스트</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/newwinlist" class="gnb_2da  ">팝업레이어관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/session_file_delete" class="gnb_2da gnb_grp_style gnb_grp_div">세션파일 일괄삭제</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/cache_file_delete" class="gnb_2da gnb_grp_style ">캐시파일 일괄삭제</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/captcha_file_delete" class="gnb_2da gnb_grp_style ">캡챠파일 일괄삭제</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/thumbnail_file_delete" class="gnb_2da gnb_grp_style ">썸네일파일 일괄삭제</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/phpinfo" class="gnb_2da  gnb_grp_div">phpinfo()</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/service" class="gnb_2da  ">부가서비스</a></li></ul></li><li class="gnb_1dli gnb_1dli_air">
<a href="http://127.0.0.1/adm/member_list" class="gnb_1da">회원관리</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="http://127.0.0.1/adm/member_list" class="gnb_2da  ">회원관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/mail_list" class="gnb_2da  ">회원메일발송</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/visit_list" class="gnb_2da gnb_grp_style gnb_grp_div">접속자집계</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/visit_search" class="gnb_2da gnb_grp_style ">접속자검색</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/visit_delete" class="gnb_2da gnb_grp_style ">접속자로그삭제</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/point_list" class="gnb_2da  gnb_grp_div">포인트관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/poll_list" class="gnb_2da  ">투표관리</a></li></ul></li><li class="gnb_1dli">
<a href="http://127.0.0.1/adm/board_list" class="gnb_1da">게시판관리</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="http://127.0.0.1/adm/board_list" class="gnb_2da  ">게시판관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/boardgroup_list" class="gnb_2da  ">게시판그룹관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/popular_list" class="gnb_2da gnb_grp_style gnb_grp_div">인기검색어관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/popular_rank" class="gnb_2da gnb_grp_style ">인기검색어순위</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/qa_config" class="gnb_2da  gnb_grp_div">1:1문의설정</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/contentlist" class="gnb_2da gnb_grp_style gnb_grp_div">내용관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/faqmasterlist" class="gnb_2da gnb_grp_style ">FAQ관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/write_count" class="gnb_2da  gnb_grp_div">글,댓글 현황</a></li></ul></li><li class="gnb_1dli">
<a href="http://127.0.0.1/adm/sms_admin/config" class="gnb_1da">SMS 관리</a><ul class="gnb_2dul"><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/config" class="gnb_2da  ">SMS 기본설정</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/member_update" class="gnb_2da  ">회원정보업데이트</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/sms_write" class="gnb_2da  ">문자 보내기</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/history_list" class="gnb_2da gnb_grp_style gnb_grp_div">전송내역-건별</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/history_num" class="gnb_2da gnb_grp_style ">전송내역-번호별</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/form_group" class="gnb_2da  gnb_grp_div">이모티콘 그룹</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/form_list" class="gnb_2da  ">이모티콘 관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/num_group" class="gnb_2da gnb_grp_style gnb_grp_div">휴대폰번호 그룹</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/num_book" class="gnb_2da gnb_grp_style ">휴대폰번호 관리</a></li><li class="gnb_2dli"><a href="http://127.0.0.1/adm/sms_admin/num_book_file" class="gnb_2da gnb_grp_style ">휴대폰번호 파일</a></li></ul></li></ul>        </nav>

    </div>
</header>

<ul id="lnb">
<li><a href="http://127.0.0.1/adm/member_list">회원관리</a></li>
<li><a href="http://127.0.0.1/adm/mail_list">회원메일발송</a></li>
<li><a href="http://127.0.0.1/adm/visit_list">접속자집계</a></li>
<li><a href="http://127.0.0.1/adm/visit_search">접속자검색</a></li>
<li><a href="http://127.0.0.1/adm/visit_delete">접속자로그삭제</a></li>
<li><a href="http://127.0.0.1/adm/point_list">포인트관리</a></li>
<li><a href="http://127.0.0.1/adm/poll_list">투표관리</a></li></ul>

<div id="wrapper">

    <div id="container">
        <h1>회원관리</h1>

<div class="local_ov01 local_ov">
    <a href="/adm/member_list" class="ov_listall">전체목록</a>    총회원수 1명 중,
    <a href="?sst=mb_intercept_date&amp;sod=desc&amp;sfl=&amp;stx=">차단 0</a>명,
    <a href="?sst=mb_leave_date&amp;sod=desc&amp;sfl=&amp;stx=">탈퇴 0</a>명
</div>

<form id="fsearch" name="fsearch" class="local_sch01 local_sch" method="get">

<label for="sfl" class="sound_only">검색대상</label>
<select name="sfl" id="sfl">
    <option value="id">회원아이디</option>
    <option value="mb_nick">닉네임</option>
    <option value="mb_name">이름</option>
    <option value="mb_level">권한</option>
    <option value="mb_email">E-MAIL</option>
    <option value="mb_tel">전화번호</option>
    <option value="mb_hp">휴대폰번호</option>
    <option value="mb_point">포인트</option>
    <option value="mb_datetime">가입일시</option>
    <option value="mb_ip">IP</option>
    <option value="mb_recommend">추천인</option>
</select>
<label for="stx" class="sound_only">검색어<strong class="sound_only"> 필수</strong></label>
<input type="text" name="stx" value="" id="stx" required class="required frm_input">
<input type="submit" class="btn_submit" value="검색">

</form>

<div class="local_desc01 local_desc">
    <p>
        회원자료 삭제 시 다른 회원이 기존 회원아이디를 사용하지 못하도록 회원아이디, 이름, 닉네임은 삭제하지 않고 영구 보관합니다.
    </p>
</div>

<div class="btn_add01 btn_add">
    <a href="./member_form" id="member_add">회원추가</a>
</div>

<form:form commandName="member" method="POST">
<input type="hidden" name="sst" value="mb_datetime">
<input type="hidden" name="sod" value="desc">
<input type="hidden" name="sfl" value="">
<input type="hidden" name="stx" value="">
<input type="hidden" name="page" value="1">
<input type="hidden" name="token" value="">

<div class="tbl_head02 tbl_wrap">
    <table>
    <caption>회원관리 목록</caption>
    <thead>
    <tr>
        <th scope="col" rowspan="2" id="mb_list_chk">
            <label for="chkall" class="sound_only">회원 전체</label>
            <input type="checkbox" name="chkall" value="1" id="chkall" onclick="check_all(this.form)">
        </th>
        <th scope="col" rowspan="2" id="mb_list_id"><a href="/adm/member_list?&amp;sst=mb_id&amp;sod=asc&amp;sfl=&amp;stx=&amp;page=1">아이디</a></th>
        <th scope="col" id="mb_list_name"><a href="/adm/member_list?&amp;sst=mb_name&amp;sod=asc&amp;sfl=&amp;stx=&amp;page=1">이름</a></th>
        <th scope="col" colspan="6" id="mb_list_cert"><a href="/adm/member_list?&amp;sst=mb_certify&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">본인확인</a></th>
        <th scope="col" id="mb_list_mobile">휴대폰</th>
        <th scope="col" id="mb_list_auth">상태/<a href="/adm/member_list?&amp;sst=mb_level&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">권한</a></th>
        <th scope="col" id="mb_list_lastcall"><a href="/adm/member_list?&amp;sst=mb_today_login&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">최종접속</a></th>
        <th scope="col" rowspan="2" id="mb_list_grp">접근<br>그룹</th>
        <th scope="col" rowspan="2" id="mb_list_mng">관리</th>
    </tr>
    <tr>
        <th scope="col" id="mb_list_nick"><a href="/adm/member_list?&amp;sst=mb_nick&amp;sod=asc&amp;sfl=&amp;stx=&amp;page=1">닉네임</a></th>
        <th scope="col" id="mb_list_mailc"><a href="/adm/member_list?&amp;sst=mb_email_certify&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">메일<br>인증</a></th>
        <th scope="col" id="mb_list_open"><a href="/adm/member_list?&amp;sst=mb_open&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">정보<br>공개</a></th>
        <th scope="col" id="mb_list_mailr"><a href="/adm/member_list?&amp;sst=mb_mailling&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">메일<br>수신</a></th>
        <th scope="col" id="mb_list_sms"><a href="/adm/member_list?&amp;sst=mb_sms&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">SMS<br>수신</a></th>
        <th scope="col" id="mb_list_adultc"><a href="/adm/member_list?&amp;sst=mb_adult&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">성인<br>인증</a></th>
        <th scope="col" id="mb_list_deny"><a href="/adm/member_list?&amp;sst=mb_intercept_date&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1">접근<br>차단</a></th>
        <th scope="col" id="mb_list_tel">전화번호</th>
        <th scope="col" id="mb_list_point"><a href="/adm/member_list?&amp;sst=mb_point&amp;sod=desc&amp;sfl=&amp;stx=&amp;page=1"> 포인트</a></th>
        <th scope="col" id="mb_list_join"><a href="/adm/member_list?&amp;sst=mb_datetime&amp;sod=asc&amp;sfl=&amp;stx=&amp;page=1">가입일</a></th>
    </tr>
    </thead>
    <tbody>
    
    <c:forEach var="member" items="${members}">
    <tr class="bg0">
        <td headers="mb_list_chk" class="td_chk" rowspan="2">
            <input type="hidden" name="mb_id[0]" value="admin" id="mb_id_0">
            <label for="chk_0" class="sound_only">최고관리자 최고관리자님</label>
            <input type="checkbox" name="chk[]" value="0" id="chk_0">
        </td>
        <td headers="mb_list_id" rowspan="2" class="td_name sv_use">${member.id}</td>
        <td headers="mb_list_name" class="td_mbname">${member.mbName}</td>
        <td headers="mb_list_cert" colspan="6" class="td_mbcert">
            <input type="radio" name="mb_certify[0]" value="ipin" id="mb_certify_ipin_0" >
            <label for="mb_certify_ipin_0">아이핀</label>
            <input type="radio" name="mb_certify[0]" value="hp" id="mb_certify_hp_0" >
            <label for="mb_certify_hp_0">휴대폰</label>
        </td>
        <td headers="mb_list_mobile" class="td_tel"></td>
        <td headers="mb_list_auth" class="td_mbstat">
                                정상
            <select id="mb_level[0]" name="mb_level[0]">
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10" selected="selected">10</option>
            </select>
        </td>
        <td headers="mb_list_lastcall" class="td_date">16-04-30</td>
        <td headers="mb_list_grp" rowspan="2" class="td_numsmall"></td>
        <td headers="mb_list_mng" rowspan="2" class="td_mngsmall">
            <a href="./member_form?sst=&amp;sod=&amp;sfl=&amp;stx=&amp;page=&amp;w=u&amp;mb_id=admin">수정</a>
            <a href="./boardgroupmember_form?mb_id=admin">그룹</a>
        </td>
    </tr>
    <tr class="bg0">
        <td headers="mb_list_nick" class="td_name sv_use">
            <div>
                <span class="sv_wrap">
                    <a href="http://127.0.0.1/bbs/profile?mb_id=admin" class="sv_member" title="최고관리자 자기소개" target="_blank" onclick="return false;">${member.mbNick}</a>
                    <span class="sv">
                        <a href="http://127.0.0.1/bbs/memo_form?me_recv_mb_id=admin" onclick="win_memo(this.href); return false;">쪽지보내기</a>
                        <a href="http://127.0.0.1/bbs/formmail?mb_id=admin&amp;name=%EC%B5%9C%EA%B3%A0%EA%B4%80%EB%A6%AC%EC%9E%90&amp;email=YWRtaW5AZG9tYWluLmNvbQ==" onclick="win_email(this.href); return false;">메일보내기</a>
                        <a href="http://127.0.0.1/bbs/profile?mb_id=admin" onclick="win_profile(this.href); return false;">자기소개</a>
                        <a href="http://127.0.0.1/bbs/new?mb_id=admin">전체게시물</a>
                        <a href="http://127.0.0.1/adm/member_form?w=u&amp;mb_id=admin" target="_blank">회원정보변경</a>
                        <a href="http://127.0.0.1/adm/point_list?sfl=mb_id&amp;stx=admin" target="_blank">포인트내역</a>
                    </span>
                
                    <noscript class="sv_nojs">
                        <span class="sv">
                            <a href="http://127.0.0.1/bbs/memo_form?me_recv_mb_id=admin" onclick="win_memo(this.href); return false;">쪽지보내기</a>
                            <a href="http://127.0.0.1/bbs/formmail?mb_id=admin&amp;name=%EC%B5%9C%EA%B3%A0%EA%B4%80%EB%A6%AC%EC%9E%90&amp;email=YWRtaW5AZG9tYWluLmNvbQ==" onclick="win_email(this.href); return false;">메일보내기</a>
                            <a href="http://127.0.0.1/bbs/profile?mb_id=admin" onclick="win_profile(this.href); return false;">자기소개</a>
                            <a href="http://127.0.0.1/bbs/new?mb_id=admin">전체게시물</a>
                            <a href="http://127.0.0.1/adm/member_form?w=u&amp;mb_id=admin" target="_blank">회원정보변경</a>
                            <a href="http://127.0.0.1/adm/point_list?sfl=mb_id&amp;stx=admin" target="_blank">포인트내역</a>
                        </span>
                    </noscript>
                </span>
            </div>
        </td>
        <td headers="mb_list_mailc" class="td_chk">
            <span class="txt_true">Yes</span>
        </td>
        <td headers="mb_list_open" class="td_chk">
            <label for="mb_open_0" class="sound_only">정보공개</label>
            <input type="checkbox" name="mb_open[0]" checked value="1" id="mb_open_0">
        </td>
        <td headers="mb_list_mailr" class="td_chk">
            <label for="mb_mailling_0" class="sound_only">메일수신</label>
            <input type="checkbox" name="mb_mailling[0]" checked value="1" id="mb_mailling_0">
        </td>
        <td headers="mb_list_sms" class="td_chk">
            <label for="mb_sms_0" class="sound_only">SMS수신</label>
            <input type="checkbox" name="mb_sms[0]"  value="1" id="mb_sms_0">
        </td>
        <td headers="mb_list_adultc" class="td_chk">
            <label for="mb_adult_0" class="sound_only">성인인증</label>
            <input type="checkbox" name="mb_adult[0]"  value="1" id="mb_adult_0">
        </td>
        <td headers="mb_list_deny" class="td_chk">
            <input type="checkbox" name="mb_intercept_date[0]"  value="20160430" id="mb_intercept_date_0" title="차단하기">
            <label for="mb_intercept_date_0" class="sound_only">접근차단</label>
        </td>
        <td headers="mb_list_tel" class="td_tel"></td>
        <td headers="mb_list_point" class="td_num">
            <a href="point_list?sfl=mb_id&amp;stx=admin">300</a>
        </td>
        <td headers="mb_list_join" class="td_date">16-04-15</td>
    </tr>
    </c:forEach>
    
    </tbody>
    </table>
</div>

<div style="text-align: center; margin: 10px 0px 40px 0px">
    <pageNavi:pageNavi skin="basic" pageList="${pageList}" />
</div>


<div class="btn_list01 btn_list">
    <input type="submit" name="act_button" value="선택수정" onclick="document.pressed=this.value">
    <input type="submit" name="act_button" value="선택삭제" onclick="document.pressed=this.value">
</div>

</form:form>



    </div>
</div>

<footer id="ft">
    <p><a href="#">상단으로</a></p>
</footer>


