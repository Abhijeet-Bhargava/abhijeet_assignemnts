package com.yash.Serializable;

import java.io.Serializable;

public class ItemsDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int itemId;
	private String itemDescription;
	private int itemQuantityAvailable;
	private double itemUnitPrice;
	private int itemDiscountPercentage;
	
	public ItemsDetails() {}
	
	public ItemsDetails(int itemId, String itemDesc, int itemQty, double itemPrice, int itemDiscount) {
		super();
		this.itemId=itemId;
		this.itemDescription=itemDesc;
		this.itemQuantityAvailable=itemQty;
		this.itemUnitPrice=itemPrice;
		this.itemDiscountPercentage=itemDiscount;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getItemQuantityAvailable() {
		return itemQuantityAvailable;
	}

	public void setItemQuantityAvailable(int itemQuantityAvailable) {
		this.itemQuantityAvailable = itemQuantityAvailable;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public int getItemDiscountPercentage() {
		return itemDiscountPercentage;
	}

	public void setItemDiscountPercentage(int itemDiscountPercentage) {
		this.itemDiscountPercentage = itemDiscountPercentage;
	}

	@Override
	public String toString() {
		return "ItemsDetails [itemId=" + itemId + ", itemDescription=" + itemDescription + ", itemQuantityAvailable="
				+ itemQuantityAvailable + ", itemUnitPrice=" + itemUnitPrice + ", itemDiscountPercentage="
				+ itemDiscountPercentage + "]";
	}
}
