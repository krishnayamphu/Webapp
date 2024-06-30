<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>File Upload</title>
</head>
<body>

<form method="POST" enctype="multipart/form-data" action="upload">
    File to upload: <input type="file" name="upfile">
    <input type="submit" value="Upload">
</form>
</body>
</html>
