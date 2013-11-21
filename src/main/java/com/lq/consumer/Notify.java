package com.lq.consumer;

import com.lq.model.Person;

public interface Notify {
	public void onreturn(Person person, Integer id);

	public void onthrow(Throwable ex, Integer id);
}
