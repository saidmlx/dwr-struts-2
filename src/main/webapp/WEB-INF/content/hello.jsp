<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="hello.message" /></title>
<script type='text/javascript' src='/dwrStruts2/dwr/engine.js'></script>
<script type='text/javascript' src='/dwrStruts2/dwr/util.js'></script>
<script type='text/javascript' src='/dwrStruts2/dwr/interface/Message.js'></script>

</head>
<body>
	<h1>Example dwr</h1>
	<input value="click me!!!" type="button" onclick="update();" />
	<div style="background-color: #ffeaa7; font-weight: bold; width: 300px;" id="divResponse">Message From Server</div>
		
	<script type="text/javascript">
		function update() {
			Message.getMessage(function(data) {
				console.info(data);
				dwr.util.setValue("divResponse", data);
			});
		}
	</script>
	
</body>
</html>
