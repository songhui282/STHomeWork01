package net.sh.studentmanagement.bean;

//Student实体类

public class Student {
	//学号
	private int ID;
	//姓名
	private String name;
	//出生日期
	private String birDate;
	//性别
	private boolean gender;
	//系别
	private String department;
	//联系电话
	private String telephone;
	
	//get()是取得属性值，set()是给属性赋值
	public int getID(){
		return ID;
	}
	
	public void setID(int ID){
		this.ID=ID;
	}
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public String getbirDate(){
		return birDate;
	}
	
	public void setbirDate(String birDate){
		this.birDate=birDate;
	}
	
	public boolean getgender(){
		return gender;
	}
	
	public void setgender(boolean gender){
		this.gender=gender;
	}
	
	public String getdepartment(){
		return department;
	}
	
	public void setdepartment(String department){
		this.department=department;
	}
	
	public String gettelephone(){
		return telephone;
	}
	
	public void settelephone(String telephone){
		this.telephone=telephone;
	}
	
	@Override
	public String toString(){
		return "Student{"+"学号"+ID+'\''
				+"姓名"+name+'\''
				+"出生日期"+birDate+'\''
				+"性别"+gender+'\''
				+"系别"+department+'\''
				+"联系电话"+telephone+'\''+'}';
	}
	
}