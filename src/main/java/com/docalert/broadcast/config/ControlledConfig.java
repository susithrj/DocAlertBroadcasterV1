package com.docalert.broadcast.config;


import com.docalert.broadcast.model.Response;
import com.docalert.broadcast.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@EnableScheduling
@Configuration
@Service
public class ControlledConfig {

    @Autowired
    SimpMessagingTemplate template;

    public void sendSessionUpdate(Session session) {
        template.convertAndSend("/topic/sessions", new Response("Response received SSNID : "+session.getSsnId()+" SSNTKN : "+session.getCurrToken()));
    }
}
