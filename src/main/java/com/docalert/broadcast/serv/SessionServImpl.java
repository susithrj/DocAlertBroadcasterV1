package com.docalert.broadcast.serv;

import com.docalert.broadcast.config.ControlledConfig;
import com.docalert.broadcast.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionServImpl implements SessionServ  {
   /*@Autowired
    SchedulerConfig schedulerConfig;*/
   @Autowired
   ControlledConfig controlledConfig;

    @Override
    public void sendSessionUpdate(Session session) {
        controlledConfig.sendSessionUpdate(session);
    }
}
