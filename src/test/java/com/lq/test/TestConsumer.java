package com.lq.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lq.consumer.ConsumerAction;
import com.lq.consumer.Notify;
import com.lq.model.Person;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:consumer.xml"})
public class TestConsumer {
	
	@Autowired
	private ConsumerAction consumerAction;
	
	@Autowired
	private Notify demoCallback;

	@Test
	public void test() {
		Person person = consumerAction.get("hello");
		System.out.println(person);
	}
	
}
