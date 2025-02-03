package com.brunner.e_commerce.email.consumer;

import com.brunner.e_commerce.email.dto.EmailMessageDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    @RabbitListener(queues = "${broker.queue.email.name}")
    public void listenEmailQueue(@Payload EmailMessageDTO email){
        System.out.println(email.to());
    }
}