package com.docalert.broadcast.ctrl;

import com.docalert.broadcast.model.Session;
import com.docalert.broadcast.serv.SessionServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping(path = "api/v1/SessionInfo")
public class SessionInfoCtrl {

    @Autowired
    private SessionServImpl sessionServ;

    @PostMapping(path = "/update")
    public void updateSessionInfo(
            @RequestBody Session session) {
        System.out.println("session.getSsnId :: "+session.getSsnId()+"session.getCurrToken :: "+session.getCurrToken());
        sessionServ.sendSessionUpdate(session);
    }

}
