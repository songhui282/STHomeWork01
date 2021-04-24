package net.sh.studentmanagement.bean;

//StudentManager类

import net.sh.studentmanagement.bean.Student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
 

public class StudentManager {
	//实现各种功能
	//查询功能
	public void Search(ArrayList<Student> students){
		//从键盘接收数据
		Scanner scanner1=new Scanner(System.in);
		System.out.println("请输入姓名：");
		//接收当前行输入的字符串数据——姓名
		String name=scanner1.nextLine();
		//设置一个标志位flag1，初始值设为-1
		int flag1=-1;
		//进行查找
		for(int i=0;i<students.size();i++){
			//学生集合中的某个学生
			Student student=students.get(i);
			//进行比较，如果输入的名字和集合中某个学生的名字相同，则输出该学生的相关信息，并将标志位设为0
			if(name.equals(student.getname())){
				 System.out.println("学号\t姓名\t出生日期\t性别\t系别\t联系电话\n");
				 //调用Student类中的get()方法，以取得该学生的各个属性值
				 System.out.println(student.getID()+"\t"
						 			+student.getname()+"\t"
						 			+student.getbirDate()+"\t"
						 			+student.getgender()+"\t"
						 			+student.getdepartment()+"\t"
						 			+student.gettelephone());
				 flag1=0;
				 break;
			}
		}
		//如果在进行循环查找后，标志位仍是初始值，则说明集合中没有要查找的学生，显示"未找到"
		if(flag1==-1){
			System.out.println("未找到");
		}
		//关闭"扫描器"，保障程序的安全性
		//scanner1.close();
	}
	
	//输出功能
	public void Show(ArrayList<Student> students){
		//如果学生集合中还没有学生数据，就显示"还未有学生"
		if(students.size()==0){
			System.out.println("还未有学生");
		}
		//学生集合中有学生，则输出各位学生的信息
		else{
			System.out.println("学号\t姓名\t出生日期\t性别\t系别\t联系电话\n");
			//学生集合中有几个学生，就输出多少个学生的信息
			for(int i=0;i<students.size();i++){
				//学生集合中的某个学生
				Student student=students.get(i);
				//调用Student类中的get()方法，以取得该学生的各个属性值
				System.out.println(student.getID()+"\t"
			 			+student.getname()+"\t"
			 			+student.getbirDate()+"\t"
			 			+student.getgender()+"\t"
			 			+student.getdepartment()+"\t"
			 			+student.gettelephone());
			}
		}
	}
	
	//删除功能
	public void Delete(ArrayList<Student> students){
		//从键盘接收数据
		Scanner scanner2=new Scanner(System.in);
		System.out.println("请输入你要删除的学生的姓名：");
		//接收当前行输入的字符串数据——姓名
		String name1=scanner2.nextLine();
		//设置一个标志位flag2，初始值设为-1
		int flag2=-1;
		//进行查找
		for(int i=0;i<students.size();i++){
			//学生集合中的某个学生
			Student student=students.get(i);
			//进行比较，如果输入的名字和集合中某个学生的名字相同，就意味着已经找到了要删除的学生，将标志位设为该学生在集合中的位置序号
			if(name1.equals(student.getname())){
				flag2=i;
			}
		}
		//如果查找之后，标志位仍是初始值，就意味着集合中没有要删除的这个学生，显示"没有该学生"
		if(flag2==-1){
			System.out.println("没有该学生");
		}
		//如果成功找到，就使用remove()方法删除该学生的信息，并显示"删除成功"
		else{
			students.remove(flag2);
			System.out.println("删除成功！");
		}
		//关闭"扫描器"，保障程序的安全性
		//scanner2.close();
	}
	
	//插入功能
	public void Add(ArrayList<Student> students){
		//从键盘接收数据
		System.out.println("请输入学生的姓名：");
		Scanner scanner3=new Scanner(System.in);
		//接收当前行输入的字符串数据——学生的姓名
		String namenew=scanner3.nextLine();
		//设置一个标志位flag3，初始值为false
		boolean flag3=false;
		//进行查询
		//如果学生集合中还没有学生数据，就显示"还未有学生"
		if(students.size()==0){
			System.out.println("还未有学生");
			System.out.println("请输入学生的学号：");
			//接收当前行输入的整型数据——学号
			Scanner scanner4=new Scanner(System.in);
			int IDnew=scanner4.nextInt();
			System.out.println("请输入学生的出生日期：");
			//接收当前行输入的字符串数据——出生日期
			Scanner scanner5=new Scanner(System.in);
			String birDatenew=scanner5.nextLine();
			System.out.println("请输入学生的性别（是否为“男”）：");
			//接收当前行输入的字符串数据——性别
			Scanner scanner6=new Scanner(System.in);
			boolean gendernew=scanner6.nextBoolean();
			System.out.println("请输入学生的系别：");
			//接收当前行输入的字符串数据——系别
			Scanner scanner7=new Scanner(System.in);
			String departmentnew=scanner7.nextLine();
			System.out.println("请输入学生的联系电话：");
			//接收当前行输入的字符串数据——联系电话
			Scanner scanner8=new Scanner(System.in);
			String telephonenew=scanner8.nextLine();
			//调用Student类中的各种set()方法，给属性赋值
			Student student1=new Student();
			//将新添加的学生的ID放入学生集合
			student1.setID(IDnew);
			//将新添加的学生的姓名放入学生集合
			student1.setname(namenew);
			//将新添加的学生的出生日期放入学生集合
			student1.setbirDate(birDatenew);
			//将新添加的学生的性别放入学生集合
			student1.setgender(gendernew);
			//将新添加的学生的系别放入学生集合
			student1.setdepartment(departmentnew);
			//将新添加的学生的联系电话放入学生集合
			student1.settelephone(telephonenew);
			students.add(student1);
			System.out.println("已成功插入");
		}
		else{
			for(int i=0;i<students.size();i++){
				//学生集合中的某个学生
				Student student=students.get(i);
				//进行比较，如果输入的学生数据中的学号信息与学生集合中某个学生的学号相同，就说明集合中已经有了该学生，不能再进行添加
				if(namenew.equals(student.getname())){
					flag3=true;
				}
				if(flag3){
					System.out.println("已经有该学生");
				}
				//如果集合中没有要插入的学生，就可以进行插入
				else{
					System.out.println("请输入学生学号：");
					//接收当前行输入的整型数据——学号
					Scanner scanner4=new Scanner(System.in);
					int IDnew=scanner4.nextInt();
					System.out.println("请输入学生的出生日期：");
					//接收当前行输入的字符串数据——出生日期
					Scanner scanner5=new Scanner(System.in);
					String birDatenew=scanner5.nextLine();
					System.out.println("请输入学生的性别（是否为“男”）：");
					//接收当前行输入的字符串数据——性别
					Scanner scanner6=new Scanner(System.in);
					boolean gendernew=scanner6.nextBoolean();
					System.out.println("请输入学生的系别：");
					//接收当前行输入的字符串数据——系别
					Scanner scanner7=new Scanner(System.in);
					String departmentnew=scanner7.nextLine();
					System.out.println("请输入学生的联系电话：");
					//接收当前行输入的字符串数据——联系电话
					Scanner scanner8=new Scanner(System.in);
					String telephonenew=scanner8.nextLine();
					//调用Student类中的各种set()方法，给属性赋值
					Student student1=new Student();
					//将新添加的学生的ID放入学生集合
					student1.setID(IDnew);
					//将新添加的学生的姓名放入学生集合
					student1.setname(namenew);
					//将新添加的学生的出生日期放入学生集合
					student1.setbirDate(birDatenew);
					//将新添加的学生的性别放入学生集合
					student1.setgender(gendernew);
					//将新添加的学生的系别放入学生集合
					student1.setdepartment(departmentnew);
					//将新添加的学生的联系电话放入学生集合
					student1.settelephone(telephonenew);
					students.add(student1);
					System.out.println("已成功插入");
					break;
					}
			}
			//升序方法1，这里使用ArrayList提供的Collections.sort()方法
			Collections.sort(students,new Comparator<Student>() {
				@Override
				//根据ID的大小，升序排序
				public int compare(Student o1,Student o2) {
					// TODO Auto-generated method stub
					Integer i1=o1.getID();
					Integer i2=o2.getID();
					return i1.compareTo(i2);
				}
			});	
			/* 升序方法2
			 * Collections.sort(students,new Comparator<Student>() {
				@Override
				public int compare(Student o1,Student o2) {
					return o1.getID()-o2.getID();
				}
			});	*/
			/* 升序方法3
			 * Collections.sort(students,new Comparator<Student>() {
				@Override
				public int compare(Student o1,Student o2) {
					// TODO Auto-generated method stub
					int i1=o1.getID();
					int i2=o2.getID();
					return i1-i2;
				}
			}); */
		}	
		//关闭"扫描器"，以保障程序的安全性
		//scanner3.close();
	}
	
	//修改功能
	public void Revise(ArrayList<Student> students){
		//从键盘接收数据
		Scanner scanner4=new Scanner(System.in);
		System.out.println("请输入你要修改的学生的姓名：");
		//接收当前行输入的字符串数据——姓名
		String name2=scanner4.nextLine();
		//设置一个标志位flag4，初始值设为-1
		int flag4=-1;
		//进行查找
		//如果学生集合中还没有学生数据，就显示"还未有学生"
		if(students.size()==0){
			System.out.println("还未有学生");
		}
		else{
			for(int i=0;i<students.size();i++){
				//学生集合中的某个学生
				Student student=students.get(i);
	
				//进行比较，如果输入的学生姓名与学生集合中某个学生的姓名相同，就意味着集合中有要修改的学生，将标志位设为该学生在学生集合中的位置序号
				if(name2.equals(student.getname())){
					flag4=i;
				}
				//找到要修改的学生，更新其信息
				if(flag4!=-1){
					System.out.println("请输入修改后的学生的学号：");
					//接收当前行输入的整型数据——学号
					Scanner scanner5=new Scanner(System.in);
					int IDrevise=scanner5.nextInt();
					System.out.println("请输入修改后的学生的姓名：");
					//接收当前行输入的字符串数据——姓名
					Scanner scanner6=new Scanner(System.in);
					String namerevise=scanner6.nextLine();
					System.out.println("请输入修改后的学生的出生日期：");
					//接收当前行输入的字符串数据——出生日期
					Scanner scanner7=new Scanner(System.in);
					String birDaterevise=scanner7.nextLine();
					System.out.println("请输入修改后的学生的性别（是否为“男”）：");
					//接收当前行输入的字符串数据——性别
					boolean genderrevise=scanner4.nextBoolean();
					System.out.println("请输入修改后的学生的系别：");
					//接收当前行输入的字符串数据——系别
					Scanner scanner8=new Scanner(System.in);
					String departmentrevise=scanner8.nextLine();
					System.out.println("请输入修改后的学生的联系电话：");
					//接收当前行输入的字符串数据——联系电话
					Scanner scanner9=new Scanner(System.in);
					String telephonerevise=scanner9.nextLine();
					//调用Student类中的各种set()方法，给属性赋值
					Student student2=new Student();
					//将新修改的学生的ID放入学生集合
					student2.setID(IDrevise);
					//将新修改的学生的姓名放入学生集合
					student2.setname(namerevise);
					//将新修改的学生的出生日期放入学生集合
					student2.setbirDate(birDaterevise);
					//将新修改的学生的性别放入学生集合
					student2.setgender(genderrevise);
					//将新修改的学生的系别放入学生集合
					student2.setdepartment(departmentrevise);
					//将新修改的学生的联系电话放入学生集合
					student2.settelephone(telephonerevise);
					System.out.println("已修改");
					students.set(flag4,student2);
					}
				//如果姓名没有匹配，就显示"没有该学生"
				else{
					System.out.println("没有该学生");
					break;
				}
			}
		}
		//关闭"扫描器"，以保障程序的安全性
		//scanner4.close();
	}
	
	public void actionApp(ArrayList<Student> students){
		//从键盘接收数据
		Scanner scanner=new Scanner(System.in);
		//设置一个标志位flag，初始值为真
		boolean flag=true;
		//显示一个菜单
		while(flag){
			System.out.println("请选择操作");
			System.out.println("*****************************");
			System.out.println("*           1  插入                            *");
			System.out.println("*           2  查找                            *");
			System.out.println("*           3  删除                            *");
			System.out.println("*           4  修改                            *");
			System.out.println("*           5  输出                            *");
			System.out.println("*           6  退出                            *");
			System.out.println("*****************************");
			//接收当前行输入的整型数据——数字选项
			int operate=scanner.nextInt();
			//根据不同的数字选项，选择不同的功能方法
			switch(operate)
			{
				//输入"1"，选择插入功能
				case 1:Add(students);;break;
				//输入"2"，选择查找功能
				case 2:Search(students);;break;
				//输入"3"，选择删除功能
				case 3:Delete(students);;break;
				//输入"4"，选择修改功能
				case 4:Revise(students);break;
				//输入"5"，选择输出功能
				case 5:Show(students);break;
				//输入"6"，退出
				case 6:System.out.println("感谢您的使用");System.exit(0);break;
				//如果输入的不是可用的选项，就会报错，提示"输入有误，重新输入"
				default:System.out.println("您的输入有误，请重新输入");System.exit(0);break;
			}
		}
		//关闭"扫描器"，以保障程序的安全性
		//scanner.close();
	}
}
