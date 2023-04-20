package org.examples;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/example")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ExampleController {

    @Autowired
    private JmsTemplate jmsTemplate;
    @RequestMapping(value = { "", "/**" }, method = { RequestMethod.POST, RequestMethod.PATCH, RequestMethod.HEAD,
            RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.GET })
    public void processUpload(final HttpServletRequest servletRequest, final HttpServletResponse servletResponse)
    {
        jmsTemplate.convertAndSend("tusserver", "Probando");
    }
}
