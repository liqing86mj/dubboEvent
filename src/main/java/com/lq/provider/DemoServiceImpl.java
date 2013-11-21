package com.lq.provider;

import com.lq.model.Person;
import com.lq.service.IDemoService;

public class DemoServiceImpl implements IDemoService {

	@Override
	public Person get(String id) {
		return new Person(id, "cyan", 20);
	}

}
