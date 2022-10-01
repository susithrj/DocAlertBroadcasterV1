package com.docalert.broadcast.serv;

import com.docalert.broadcast.model.Session;


public interface SessionServ {

    void sendSessionUpdate(Session session);
}
