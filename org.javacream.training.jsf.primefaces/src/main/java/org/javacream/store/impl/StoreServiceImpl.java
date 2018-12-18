package org.javacream.store.impl;

import org.javacream.store.api.StoreService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
@Component
@ApplicationScope
public class StoreServiceImpl implements StoreService{

	public int getStock(String category, String id) {
		return 42;
	}

}
