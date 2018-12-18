package org.javacream.store.web.frontend;

import javax.faces.bean.RequestScoped;

import org.javacream.store.api.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequestScoped
@Component
public class StoreServiceWebBean {

	@Autowired
	private StoreService storeService;

	private int stock = -1;
	private String category;
	private String item;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getStock() {
		return stock;
	}

	public String retrieveStock() {
		stock = storeService.getStock(category, item);
		return null;
	}
}
