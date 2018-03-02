package chiwoo;

public class User {
	private String userId;
	private String name;
	private String address;
	
	public User() {
		
	}
	
	public User(String usdrId, String name, String address) {
		this.setUserId(usdrId);
		this.setName(name);
		this.setAddress(address);
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
