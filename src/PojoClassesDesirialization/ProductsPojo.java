package PojoClassesDesirialization;

import java.util.List;

public class ProductsPojo {

	private String id ;
	private String title ;
	private String price ;
	private String quantity ;
	private String total ;
	private String discountPercentage;
	private int discountedPrice ;
	private String thumbnail ;
	
	@Override
	public String toString() {
		return "ProductsPojo [id=" + id + ", title=" + title + ", price=" + price + ", quantity=" + quantity
				+ ", total=" + total + ", discountPercentage=" + discountPercentage + ", discountedPrice="
				+ discountedPrice + ", thumbnail=" + thumbnail + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getDiscountPercentage() {
		return discountPercentage;
	}
	public void setDiscountPercentage(String discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	public int getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	
	
	
	
}
