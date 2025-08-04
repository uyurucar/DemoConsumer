package com.ucaru.consumer.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitConsumer {


    @RabbitListener(queues = {"${rabbitmq.queue-name}"})
    public void consumer(String message)
    {
        System.out.println("message received: " + message);
    }

}
