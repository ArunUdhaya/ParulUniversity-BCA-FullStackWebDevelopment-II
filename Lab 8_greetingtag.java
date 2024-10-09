package com.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GreetingTag extends SimpleTagSupport {
    private String name;

    // Set the name property via attribute in JSP
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        // Write greeting message to JSP output
        if (name != null && !name.trim().isEmpty()) {
            out.println("Hello, " + name + "! Welcome to our website.");
        } else {
            out.println("Hello, Guest! Welcome to our website.");
        }

        // Display current date and time
        out.println("<br>Current Date and Time: " + now.format(formatter));
    }
}
