<%--
  Created by IntelliJ IDEA.
  User: u_kino07
  Date: 2018. 5. 21.
  Time: PM 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!doctype html>
<html lang="ko" class="svgless">
<head>
    <title>${mobiclix}</title>
    <link rel="stylesheet" type="text/css" href="/css/default.css"/>
    <script type="text/javascript" src="/js/default.js"></script>
</head>
<body>
<header>
    <tiles:insertAttribute name="header" />
</header>
<section>
    <tiles:insertAttribute name="body" />
</section>
<footer>
    <tiles:insertAttribute name="footer" />
</footer>
</body>
</html>