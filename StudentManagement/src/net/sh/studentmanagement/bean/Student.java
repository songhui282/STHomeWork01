package net.sh.studentmanagement.bean;

//Studentʵ����

public class Student {
	//ѧ��
	private int ID;
	//����
	private String name;
	//��������
	private String birDate;
	//�Ա�
	private boolean gender;
	//ϵ��
	private String department;
	//��ϵ�绰
	private String telephone;
	
	//get()��ȡ������ֵ��set()�Ǹ����Ը�ֵ
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
		return "Student{"+"ѧ��"+ID+'\''
				+"����"+name+'\''
				+"��������"+birDate+'\''
				+"�Ա�"+gender+'\''
				+"ϵ��"+department+'\''
				+"��ϵ�绰"+telephone+'\''+'}';
	}
	
}