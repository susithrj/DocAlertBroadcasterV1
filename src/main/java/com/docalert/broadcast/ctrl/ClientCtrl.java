package com.docalert.broadcast.ctrl;

import com.docalert.broadcast.model.Request;
import com.docalert.broadcast.model.Response;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class ClientCtrl {

    /* this method works request basis*/
    @MessageMapping("/hello")
    @SendTo("/topic/sessions")
    public Response greet(Request message) throws InterruptedException {
        Thread.sleep(2000);
        return new Response("Connection is successful, " +
                HtmlUtils.htmlEscape(message.getName()));
    }

}
