package com.lq.consumer;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.lq.model.Person;

@Component(value = "demoCallback")
public class NotifyImpl implements Notify {

	public Map<Integer, Person> ret = new HashMap<>();
	public Map<Integer, Throwable> errors = new HashMap<>();

	@Override
	public void onreturn(Person person, Integer id) {
		System.out.println("onreturn : " + person);
		ret.put(id, person);
	}

	@Override
	public void onthrow(Throwable ex, Integer id) {
		errors.put(id, ex);
	}

}
