package PojoClassesDesirialization;

import java.util.List;

public class CartsPojo {
	private String id ;
	private List<ProductsPojo> Products ;
	private String total ;
	private int discountedTotal ;
	private String userId ;
	private String totalProducts ;
	private String totalQuantity ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<ProductsPojo> getProducts() {
		return Products;
	}
	public void setProducts(List<ProductsPojo> products) {
		Products = products;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public int  getDiscountedTotal() {
		return discountedTotal;
	}
	public void setDiscountedTotal(int  discountedTotal) {
		this.discountedTotal = discountedTotal;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTotalProducts() {
		return totalProducts;
	}
	public void setTotalProducts(String totalProducts) {
		this.totalProducts = totalProducts;
	}
	public String getTotalQuantity() {
		return totalQuantity;
	}
	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}
	
	
	@Override
	public String toString() {
		return "CartsPojo [id=" + id + ", Products=" + Products + ", total=" + total + ", discountedTotal="
				+ discountedTotal + ", userId=" + userId + ", totalProducts=" + totalProducts + ", totalQuantity="
				+ totalQuantity + "]";
	}
	
	
	
}
