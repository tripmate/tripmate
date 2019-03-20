package kr.co.tripmate.user.vo;

public class UserVO {

	private String id;
	private String name;
	private int age;
	private String sex;
	private String addr;
	private String addrDetl;
	private String phone;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddrDetl() {
		return addrDetl;
	}
	
	public void setAddrDetl(String addrDetl) {
		this.addrDetl = addrDetl;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "UserVO [name = " + name + ", age: " + age + "]";
	}
	
}
