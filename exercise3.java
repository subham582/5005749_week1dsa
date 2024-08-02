package Week1Task;

public class exercise3 {

	
		    private String orderId;
		    private String customerName;
		    private double totalPrice;

		    public exercise3(String orderId, String customerName, double totalPrice) {
		        this.orderId = orderId;
		        this.customerName = customerName;
		        this.totalPrice = totalPrice;
		    }
		    public String getOrderId() {
		        return orderId;
		    }

		    public void setOrderId(String orderId) {
		        this.orderId = orderId;
		    }

		    public String getCustomerName() {
		        return customerName;
		    }

		    public void setCustomerName(String customerName) {
		        this.customerName = customerName;
		    }
		    public double getTotalPrice() {
		        return totalPrice;
		    }
		    public void setTotalPrice(double totalPrice) {
		        this.totalPrice = totalPrice;
		    }
		}

		