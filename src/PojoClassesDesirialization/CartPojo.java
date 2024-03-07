package PojoClassesDesirialization;

import java.util.List;

public class CartPojo {
	
	private List<CartsPojo> carts ;
	private String total ;
	private String skip ;
	private String limit ;

	public List<CartsPojo> getCarts() {
		return carts;
	}
	public void setCarts(List<CartsPojo> carts) {
		this.carts = carts;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getSkip() {
		return skip;
	}
	public void setSkip(String skip) {
		this.skip = skip;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "CartPojo [carts=" + carts + ", total=" + total + ", skip=" + skip + ", limit=" + limit + "]";
	}
	
	
	
	}

	
	
	
	


