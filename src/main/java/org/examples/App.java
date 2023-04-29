package org.examples;

import org.apache.qpid.jms.JmsConnectionFactory;
import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication()
@RegisterReflectionForBinding({JmsTemplate.class, JmsConnectionFactory.class})
@EnableJms
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
