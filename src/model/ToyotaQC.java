package model;

public class ToyotaQC extends ToyotaMotors {
	private double retailPrice = 0;
	private double discountedPrice = 0;
	private String customerName;
	private String salesAgent;
	private String itemName;
	
	
	public ToyotaQC(){
		System.out.println("\nWelcome Toyota Motors Quezon City!");
	}
	
	@Override
	public boolean isDiscountValid() {
		if(computeDiscount() < 12) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public double computeDiscount() {
		return ((retailPrice - discountedPrice) / retailPrice) * 100;
	}

	@Override
	public double computeNetSales() {
		return retailPrice * (computeDiscount() / 100);
	}
	
	
	//Setters and Getters
	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public double getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(double discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSalesAgent() {
		return salesAgent;
	}

	public void setSalesAgent(String salesAgent) {
		this.salesAgent = salesAgent;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	


}
