package com.hansoleee.basicspringkafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "spring-test",
            groupId = "group-spring"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
