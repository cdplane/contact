package cd.java.contact;

import java.io.*;

// 联系人信息类
public class ContactPerson implements Serializable{

	private static final long serialVersionUID = 5052829795698977634L;
	
	// 联系人名字、地址、手机号码、生日
	private String name, address, phonenum, birthday, name_piny;
	// 联系人Id
	private int numId;
	
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
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	public String getName_piny() {
		return name_piny;
	}
	public void setName_piny(String name_uk) {
		this.name_piny = name_uk;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactPerson other = (ContactPerson) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ContactPerson [name=" + name + ", address=" + address
				+ ", phonenum=" + phonenum + ", birthday=" + birthday
				+ ", name_piny=" + name_piny + ", numId=" + numId
				+ "]";
	}
}
