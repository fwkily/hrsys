<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>

<%
    String path = request.getContextPath();

    String ptname = "人事管理平台";

    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><%=ptname %>-综合管理</title>
    <jsp:include page="import.jsp" />
    <style type="text/css">
        .btn_main1
        {
            position:relative;
            left:433px;
            width:142px;
            top:32px;
            height:32px;
            border:0px;
            margin:0px;
            cursor:pointer;
            background: url("<%=path%>/images/regimages/reg_finish_btn.gif") no-repeat;
            color: #4d2f00;
            line-height: 32px;
            font-size: 14px;
            font-weight: bold;
            font-family: 宋体;
        }
        .btn_main2
        {
            position:relative;
            left:270px;
            bottom:14px;
            width:142px;
            height:32px;
            border:0px;
            margin:0px;
            cursor:pointer;
            background: url("<%=path%>/images/regimages/reg_finish_btn.gif") no-repeat;
            color: #4d2f00;
            line-height: 32px;
            font-size: 14px;
            font-weight: bold;
            font-family: 宋体;
        }
        .btn_main3
        {
            position:relative;
            left:250px;
            bottom:4px;
            width:142px;
            height:32px;
            border:0px;
            margin:0px;
            cursor:pointer;
            background: url("<%=path%>/images/regimages/reg_finish_btn.gif") no-repeat;
            color: #4d2f00;
            line-height: 32px;
            font-size: 14px;
            font-weight: bold;
            font-family: 宋体;
        }
        .btn_main4
        {
            position:relative;
            left:96px;
            top:-50px;
            width:142px;
            height:32px;
            border:0px;
            margin:0px;
            cursor:pointer;
            background: url("<%=path%>/images/regimages/reg_finish_btn.gif") no-repeat;
            color: #4d2f00;
            line-height: 32px;
            font-size: 14px;
            font-weight: bold;
            font-family: 宋体;
        }
        .btn_main5
        {
            position:relative;
            left:250px;
            width:142px;
            bottom:-7px;
            height:32px;
            border:0px;
            margin:0px;
            cursor:pointer;
            background: url("<%=path%>/images/regimages/reg_finish_btn.gif") no-repeat;
            color: #4d2f00;
            line-height: 32px;
            font-size: 14px;
            font-weight: bold;
            font-family: 宋体;
        }
    </style>
</head>
<body>
<jsp:include page="head.jsp" />
<form method="post" name="" action="">
    <input type="hidden" name="methods" id="methods">
    <table border="0" cellpadding="0" cellspacing="0" width="966" align="center">
        <tr height="57">
            <td width="9" background="<%=path %>/images/regimages/reg_title1.jpg"></td>
            <td width="944" background="<%=path %>/images/regimages/reg_title2.jpg"  style="line-height: 57px;text-indent: 45px;">
                <div style="font-size: 16px;font-family: Microsoft YaHei, 宋体, Segoe UI, verdana, arial;color: #fefefe">欢迎进入人事管理平台</div>
            </td>
            <td width="13" background="<%=path %>/images/regimages/reg_title3.jpg"></td>
        </tr>
        <tr>
            <td width="9" background="<%=path %>/images/regimages/reg_left.jpg"></td>
            <td width="944">
                <div class="div_a">
                    <div class="gap_box_left">
                        <jsp:include page="info_box.jsp" />
                    </div>
                    <div class="gap_box_right gap_icons">
                        <div class="gap2" onclick="location.href='employee/entry.jsp'"></div>
                        <div class="gap5" onclick="location.href='JobServlet?flag=all'"></div>
                        <div class="gap6" onclick="location.href='employee/add.jsp'"></div>
                        <div class="gap9"  onclick="location='servlet/departmentsServlet.action?flag=allDepartments'"></div>
                        <div class="gap7" onclick="location='LeaveServlet.action?flag=sketchy'"></div>
                        <div class="gap8" onclick="location='statement/entry.jsp'"></div>
                    </div>
                </div>
            </td>
            <td width="13" background="<%=path %>/images/regimages/reg_right.jpg"></td>
        </tr>
        <tr height="16">
            <td width="9" background="<%=path %>/images/regimages/reg_bottom1.jpg"></td>
            <td width="944" background="<%=path %>/images/regimages/reg_bottom2.jpg"></td>
            <td width="13" background="<%=path %>/images/regimages/reg_bottom3.jpg"></td>
        </tr>
    </table>
</form>

<jsp:include page="foot.jsp" />

</body>
</html>



