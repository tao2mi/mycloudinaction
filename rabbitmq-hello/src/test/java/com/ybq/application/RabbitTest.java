package com.ybq.application;

import com.ybq.aplication.RabbitmqApplication;
import com.ybq.aplication.component.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(RabbitmqApplication.class)
public class RabbitTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }
}
