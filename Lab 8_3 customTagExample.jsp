<%@ taglib uri="http://customtags" prefix="ct" %>

<html>
<head>
    <title>Custom JSP Tags Example</title>
</head>
<body>
    <h2>Custom JSP Tags Demo</h2>

    <!-- Custom tag without attribute -->
    <ct:greeting />

    <br><br>

    <!-- Custom tag with 'name' attribute -->
    <ct:greeting name="John" />
</body>
</html>
