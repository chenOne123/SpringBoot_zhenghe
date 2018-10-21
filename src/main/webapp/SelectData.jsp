<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2018/10/21
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>展示页面</title>
    <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" type="text/css" href="themes/icon.css">
    <link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
    <script type="text/javascript">
        $(function () {
            $("#selectDate").datagrid(
                {
                    url:"/user/student/selectAllDate",
                    pagination:true,
                    title:"展示信息",
                    striped:true,
                    rownumbers:true,
                    pageList:[2,5,10],
                    columns:[[
                        {checkbox:true},
                        {field:"id",title:"编号",hidden:true},
                        {field:"name",title:"姓名"},
                        {field:"age",title:"年龄"},
                        {field:"sex",title:"性别",
                            formatter:function (value,rowData,rowIndex) {
                                if(value == 0){
                                    return "女";
                                }else{
                                    return "男";
                                }
                            }
                        },
                    ]]

                }
            )
        });
    </script>
</head>
<body>
    <table id="selectDate"></table>
</body>
</html>
