<%@ page import="javax.enterprise.inject.spi.CDI" %>
<%@ page import="com.gorg.model.StatelessEJB" %>
<%@ page import="javax.enterprise.inject.Instance" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<%
    Instance<StatelessEJB> obj = CDI.current().select(StatelessEJB.class);
    out.print(obj);

%>

ear example
</body>
</html>