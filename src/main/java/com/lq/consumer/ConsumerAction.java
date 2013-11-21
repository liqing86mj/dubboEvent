package com.lq.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lq.model.Person;
import com.lq.service.IDemoService;

@Component
public class ConsumerAction {
	@Autowired
	private IDemoService demoService;
	
	public Person get(String id){
		return demoService.get(id);
	}
}
