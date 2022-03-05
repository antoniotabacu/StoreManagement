
public class Client {
	
	private int client_ID;
	private String surname,forename,address,client_code;
	
	public Client(int client_id,String surname, String forename, String address, String client_code) {
		this.client_ID=client_id;
		this.surname=surname;
		this.forename=forename;
		this.address=address;
		this.client_code=client_code;
	}

	public String getClient_code() {
		return client_code;
	}

	public void setClient_code(String client_code) {
		this.client_code = client_code;
	}

	public int getClient_ID() {
		return client_ID;
	}

	public void setClient_ID(int client_ID) {
		this.client_ID = client_ID;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
