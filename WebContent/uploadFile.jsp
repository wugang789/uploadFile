<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <script language="javascript">

function adduploadfile()
{
        var uploadHTML = document.createElement( "<input type='file'  name='upload'/>");
        document.getElementById("files").appendChild(uploadHTML);
        uploadHTML = document.createElement( "<p/>");
        document.getElementById("files").appendChild(uploadHTML);
}
</script>
    </head>
    <body>
        <input type="button" onclick="adduploadfile();" value="添加文件" />
        <br />
        <form onsubmit="return true;" action="upload.action"
            method="post" enctype="multipart/form-data">
            <span id="files"> <input type='file' name='upload' />
                <p />
            </span>
            <input type="submit" value="上传" />
        </form>
    </body>

</html>
