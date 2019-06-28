package serialize;

import java.io.Serializable;

public class StudentInfo implements Serializable{
	
	String name;
	transient int rid;
    static String contact;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	
	
	
	public static String getContact() {
		return contact;
	}
	public static void setContact(String contact) {
		StudentInfo.contact = contact;
	}
	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentInfo(String name, int rid,String contact) {
		super();
		this.name = name;
		this.rid = rid;
		this.contact=contact;
	}
	
	
	@Override
	public String toString() {
		return "StudentInfo [name=" + name + ", rid=" + rid + "]";
	}
	
	
    
    

}



