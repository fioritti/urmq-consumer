package com.course.rabbitmqconsumer.consumer;

import java.io.IOException;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.course.rabbitmqconsumer.consumer.entity.Employee;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class AccountingConsumer {

	private ObjectMapper objectMapper = new ObjectMapper();

	@RabbitListener(queues = "q.hr.accounting")
	public void listen(String message) throws JsonParseException, JsonMappingException, IOException {
		Employee e = objectMapper.readValue(message, Employee.class);
		System.out.println("On accounting : " + e);
	}

}
