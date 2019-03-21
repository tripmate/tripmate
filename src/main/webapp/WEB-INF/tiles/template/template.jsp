<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>제목</title>
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.2.3/css/responsive.dataTables.min.css">

    <style>
        /* #header{            
            width:100%;
            height:50px;
            text-align: center;
            background-color: aqua;
        }
        #left{
            float:left;
             width:15%;
            background-color: gray;
        }
        #main{
            float:left;
             width:85%;
            background-color: lime;
        }
        #footer{
            width: 100%;
            height: 50px;            
            text-align: center;
            background-color: orange;
            clear:both;
        }
         #left, #main{ 
               min-height: 600px;
         }  */
    </style>
    
    <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
</head>
<body>
    <div style="width:100%; height:100%;">
<%-- 	    <div id="header"><tiles:insertAttribute name="header" /></div> --%>
<%-- 	    <div id="left"><tiles:insertAttribute name="left" /></div> --%>
	    <div id="main"><tiles:insertAttribute name="body" /></div>    
<%-- 	    <div id="footer"><tiles:insertAttribute name="footer" /></div> --%>
    </div>
    
    <script type="text/javascript">
        $(function() {
 
        });    
    </script>    
</body>
</html>