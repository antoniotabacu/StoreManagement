
public class Order {
	private int order_id, order_client_id,order_store_id;
	private String order_date, order_code, order_location;
	
	public Order(int order_id, int order_client_id, int order_store_id,String order_location, String order_date, String order_code) {
		this.order_id = order_id;
		this.order_client_id = order_client_id;
		this.order_store_id = order_store_id;
		
		this.order_location=order_location;
		this.order_date = order_date;
		this.order_code = order_code;
	}

	public String getOrder_location() {
		return order_location;
	}

	public void setOrder_location(String order_location) {
		this.order_location = order_location;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getOrder_client_id() {
		return order_client_id;
	}

	public void setOrder_client_id(int order_client_id) {
		this.order_client_id = order_client_id;
	}

	public int getOrder_store_id() {
		return order_store_id;
	}

	public void setOrder_store_id(int order_store_id) {
		this.order_store_id = order_store_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getOrder_code() {
		return order_code;
	}

	public void setOrder_code(String order_code) {
		this.order_code = order_code;
	}
	
}
