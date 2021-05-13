package net.sh.studentmanagement.bean;

// StudentManager类

import net.sh.studentmanagement.bean.Student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
 

public class StudentManager {
  // 实现各种功能
  // 查询功能
  // public void Search(ArrayList<Student> students){ 问题序号：1
  // 问题序号：5
  /**
   * Search the student who is wondered by the operator from 
   * the student collection given by {@code Student}.
   * <p>Input the student's name and compare it with the existing 
   * student's name in the student collection given by {@code Student},
   * if it is the same,it means that the student to be searched has 
   * been found,and at the same time,output the student's information,
   * otherwise,it will be displayed that it is not found.
   * @param students
   * @return
   */
  // 问题序号：14
  public void search(ArrayList<Student> students) {
  	// 从键盘接收数据
    // 问题序号：26
    @SuppressWarnings("resource")
    Scanner scanner1 = new Scanner(System.in);
  	System.out.println("请输入姓名：");
  	// 接收当前行输入的字符串数据——姓名
  	String name = scanner1.nextLine();
  	// 设置一个标志位flag1，初始值设为-1
  	int flag1 = -1;
  	
  	// 问题序号：13
  	// 问题序号：14
  	// 进行查找
  	for (int i = 0; i < students.size(); i++) {
  		// 学生集合中的某个学生
  		Student student = students.get(i);
  		
  		// 进行比较，如果输入的名字和集合中某个学生的名字相同，则输出该学生的相关信息，并将标志位设为0
  		/* if(name.equals(student.getname())){
  		 * System.out.println("学号\t姓名\t出生日期\t性别\t系别\t联系电话\n");
  		 * //调用Student类中的get()方法，以取得该学生的各个属性值
  		 * System.out.println(student.getID()+"\t"
  		 * +student.getname()+"\t"
  		 * +student.getbirDate()+"\t"
  		 * +student.getgender()+"\t"
  		 * +student.getdepartment()+"\t"
  		 * +student.gettelephone()); 问题序号：1 */
  		// 问题序号：13
  		// 问题序号：14
  		if (name.equals(student.getName())) {
  			 System.out.println("学号\t姓名\t出生日期\t性别\t系别\t联系电话\n");
  			 // 调用Student类中的get()方法，以取得该学生的各个属性值
  			 System.out.println(student.getId() + "\t"
  					 			+ student.getName() + "\t"
  					 			+ student.getBirDate() + "\t"
  					 			+ student.isGender() + "\t"
  					 			+ student.getDepartment() + "\t"
  					 			+ student.getTelephone());
  			 flag1 = 0;
  			 break;
  		}
  		
  		// 问题序号：19
  		else {
  		  
  		}
  		
  	}
  	
  	// 问题序号：13
  	// 问题序号：14
  	// 如果在进行循环查找后，标志位仍是初始值，则说明集合中没有要查找的学生，显示"未找到"
  	if (flag1 == -1) {
  		System.out.println("未找到");
  	}
  	
  	// 问题序号：19
  	else {
  	  
  	}
  	
  	// 关闭"扫描器"，保障程序的安全性
  	// scanner1.close();
  }
  
  // 输出功能
  // public void Show(ArrayList<Student> students){ 问题序号：1
  // 问题序号：5
  /**
   * Show all the students in the student collection given by
   * {@code Student} and their information.
   * <p>If there are no students in the student collection given by
   * {@code Student},no students will be displayed,and consequently,
   * if there are students in the student collection given by 
   * {@code Student},all the students in the student collection given 
   * by {@code Student} and their information will be entered.
   * @param students
   * @return
   */
  // 问题序号：14
  public void show(ArrayList<Student> students) {
    
    // 问题序号：13
    // 问题序号：14
  	// 如果学生集合中还没有学生数据，就显示"还未有学生"
  	if (students.size() == 0) {
  		System.out.println("还未有学生");
  	}
  	
  	// 问题序号：13
  	// 问题序号：14
  	// 学生集合中有学生，则输出各位学生的信息
  	else {
  		System.out.println("学号\t姓名\t出生日期\t性别\t系别\t联系电话\n");
  		
  		// 问题序号：13
  		// 问题序号：14
  		// 学生集合中有几个学生，就输出多少个学生的信息
  		for (int i = 0; i < students.size(); i++) {
  			// 学生集合中的某个学生
  			Student student = students.get(i);
  			// 调用Student类中的get()方法，以取得该学生的各个属性值
  			/* System.out.println(student.getID()+"\t"
  			 * +student.getname()+"\t"
  			 * +student.getbirDate()+"\t"
  			 * +student.getgender()+"\t
  			 * +student.getdepartment()+"\t"
  			 * +student.gettelephone()); 问题序号：1 */
  			System.out.println(student.getId() + "\t"
  		 			+ student.getName() + "\t"
  		 			+ student.getBirDate() + "\t"
  		 			+ student.isGender() + "\t"
  		 			+ student.getDepartment() + "\t"
  		 			+ student.getTelephone());
  		}
  		
  	}
  	
  }
  
  // 删除功能
  // public void Delete(ArrayList<Student> students){ 问题序号：1
  // 问题序号：5
  /**
   * Delete the information of the designated student from
   * the student collection given by {@code Student}.
   * <p>Input the name of the student to be deleted and compare 
   * it with the name of the existing student in the student
   * collection given by {@code Student},if it is the same,it
   * means that the student to be deleted has been found,and hence,
   * delete the student's information,and on the contrary,if it is
   * not the same,it will show that there is no such student.
   * @param students the {@code Student} to delete
   * @return
   */
  // 问题序号：14
  public void delete(ArrayList<Student> students) {
  	// 从键盘接收数据
    // 问题序号：26
  	@SuppressWarnings("resource")
    Scanner scanner2 = new Scanner(System.in);
  	System.out.println("请输入你要删除的学生的姓名：");
  	// 接收当前行输入的字符串数据——姓名
  	String name1 = scanner2.nextLine();
  	// 设置一个标志位flag2，初始值设为-1
  	int flag2 = -1;
  	// 进行查找
  	
  	// 问题序号：13
  	// 问题序号：14
  	for (int i = 0; i < students.size(); i++) {
  		// 学生集合中的某个学生
  		Student student = students.get(i);
  		
  		// 进行比较，如果输入的名字和集合中某个学生的名字相同，就意味着已经找到了要删除的学生，将标志位设为该学生在集合中的位置序号
  		/* if(name1.equals(student.getname())){
  		 * flag2=i;
  		 * } 问题序号：1 */
  		// 问题序号：13
  		// 问题序号：14
  		if (name1.equals(student.getName())) {
  			flag2 = i;
  		}
  		
  		// 问题序号：19
  		else{
  		  
  		}
  		
  		// 问题序号：13
  		// 问题序号：14
  		// 如果查找之后，标志位仍是初始值，就意味着集合中没有要删除的这个学生，显示"没有该学生"
  		if (flag2 == -1) {
  			System.out.println("没有该学生");
  		}
  		
  		// 问题序号：13
  		// 问题序号：14
  		// 如果成功找到，就使用remove()方法删除该学生的信息，并显示"删除成功"
  		else {
  			students.remove(flag2);
  			System.out.println("删除成功！");
  		}
  		
  	}
  	
  	// 关闭"扫描器"，保障程序的安全性
  	// scanner2.close();
  }
  
  // 插入功能
  // public void Add(ArrayList<Student> students){ 问题序号：1
  // 问题序号：5
  /**
   * Add the information of the new student into the student
   * collection given by {@code Student}. 
   * <p>Input the name of the new student,if there is no student
   * in the student collection given by {@code Student},the 
   * information of the new student will be added directly,
   * and consequently,if there is a student in the student
   * collection given by {@code Student} and the name of
   * the new student is the same as that of the existing 
   * student in the student collection given by {@code Student},
   * the information of the existing student will be displayed,
   * and on the contrary,if not,it means that there is no 
   * student in the student collection given by {@code Student},
   * the information of the new student will be added.
   * @param students the {@code Student} to add
   * @return
   */
  // 问题序号：14
  public void add(ArrayList<Student> students) {
  	// 从键盘接收数据
  	System.out.println("请输入学生的姓名：");
  	// 问题序号：26
  	@SuppressWarnings("resource")
    Scanner scanner3 = new Scanner(System.in);
  	// 接收当前行输入的字符串数据——学生的姓名
  	// String namenew=scanner3.nextLine(); 问题序号：1
  	String newName = scanner3.nextLine();
  	// 设置一个标志位flag3，初始值为false
  	boolean flag3 = false;
  	
  	// 问题序号：13
  	// 问题序号：14
  	// 进行查询
  	// 如果学生集合中还没有学生数据，就显示"还未有学生"
  	if (students.size() == 0) {
  		System.out.println("还未有学生");
  		System.out.println("请输入学生的学号：");
  		// 接收当前行输入的整型数据——学号
  		// 问题序号：26
  		@SuppressWarnings("resource")
      Scanner scanner4 = new Scanner(System.in);
  		// int IDnew=scanner4.nextInt(); 问题序号：1
  		int newId = scanner4.nextInt();
  		System.out.println("请输入学生的出生日期：");
  		// 接收当前行输入的字符串数据——出生日期
  		// 问题序号：26
  		@SuppressWarnings("resource")
      Scanner scanner5 = new Scanner(System.in);
  		// String birDatenew=scanner5.nextLine(); 问题序号：1
  		String newBirDate = scanner5.nextLine();
  		System.out.println("请输入学生的性别（是否为“男”）：");
  		// 接收当前行输入的字符串数据——性别
  		// 问题序号：26
  		@SuppressWarnings("resource")
      Scanner scanner6 = new Scanner(System.in);
  		// boolean gendernew=scanner6.nextBoolean(); 问题序号：1
  		boolean newGender = scanner6.nextBoolean();
  		System.out.println("请输入学生的系别：");
  		// 接收当前行输入的字符串数据——系别
  		// 问题序号：26
  		@SuppressWarnings("resource")
      Scanner scanner7 = new Scanner(System.in);
  		// String departmentnew=scanner7.nextLine(); 问题序号：1
  		String newDepartment = scanner7.nextLine();
  		System.out.println("请输入学生的联系电话：");
  		// 接收当前行输入的字符串数据——联系电话
  		// 问题序号：26
  		@SuppressWarnings("resource")
      Scanner scanner8 = new Scanner(System.in);
  		// String telephonenew=scanner8.nextLine(); 问题序号：1
  		String newTelephone = scanner8.nextLine();
  		// 调用Student类中的各种set()方法，给属性赋值
  		Student student1 = new Student();
  		// 将新添加的学生的ID放入学生集合
  		/* student1.setID(IDnew);
  		 * //将新添加的学生的姓名放入学生集合
  		 * student1.setname(namenew);
  		 * //将新添加的学生的出生日期放入学生集合
  		 * student1.setbirDate(birDatenew);
  		 * //将新添加的学生的性别放入学生集合
  		 * student1.setgender(gendernew);
  		 * //将新添加的学生的系别放入学生集合
  		 * student1.setdepartment(departmentnew);
  		 * //将新添加的学生的联系电话放入学生集合
  		 * student1.settelephone(telephonenew); 问题序号：1 */
  		student1.setId(newId);
  		// 将新添加的学生的姓名放入学生集合
  		student1.setName(newName);
  		// 将新添加的学生的出生日期放入学生集合
  		student1.setBirDate(newBirDate);
  		// 将新添加的学生的性别放入学生集合
  		student1.setGender(newGender);
  		// 将新添加的学生的系别放入学生集合
  		student1.setDepartment(newDepartment);
  		// 将新添加的学生的联系电话放入学生集合
  		student1.setTelephone(newTelephone);
  		students.add(student1);
  		System.out.println("已成功插入");
  	}
  	
  	// 问题序号：13
  	// 问题序号：14
  	else {
  	  
  	  // 问题序号：13
  	  // 问题序号：14
  		for (int i = 0; i < students.size(); i++) {
  			// 学生集合中的某个学生
  			Student student = students.get(i);
  			
  			// 进行比较，如果输入的学生数据中的学号信息与学生集合中某个学生的学号相同，就说明集合中已经有了该学生，不能再进行添加
  			// if(namenew.equals(student.getname())){ 问题序号：1
  			// 问题序号：13
  			// 问题序号：14
  			if (newName.equals(student.getName())) {
  				flag3 = true;
  			}
  			
  			// 问题序号：19
  			else {
  			  
  			}
  			
  			// 问题序号：13
  			// 问题序号：14
  			if (flag3) {
  				System.out.println("已经有该学生");
  			}
  			
  			// 问题序号：13
  			// 问题序号：14
  			// 如果集合中没有要插入的学生，就可以进行插入
  			else {
  				System.out.println("请输入学生学号：");
  				// 接收当前行输入的整型数据——学号
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner4 = new Scanner(System.in);
  				// int IDnew=scanner4.nextInt(); 问题序号：1
  				int newId = scanner4.nextInt();
  				System.out.println("请输入学生的出生日期：");
  				// 接收当前行输入的字符串数据——出生日期
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner5 = new Scanner(System.in);
  				// String birDatenew=scanner5.nextLine(); 问题序号：1
  				String newBirDate = scanner5.nextLine();
  				System.out.println("请输入学生的性别（是否为“男”）：");
  				// 接收当前行输入的字符串数据——性别
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner6 = new Scanner(System.in);
  				// boolean gendernew=scanner6.nextBoolean(); 问题序号：1
  				boolean newGender = scanner6.nextBoolean();
  				System.out.println("请输入学生的系别：");
  				// 接收当前行输入的字符串数据——系别
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner7 = new Scanner(System.in);
  				// String departmentnew=scanner7.nextLine(); 问题序号：1
  				String newDepartment = scanner7.nextLine();
  				System.out.println("请输入学生的联系电话：");
  				// 接收当前行输入的字符串数据——联系电话
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner8 = new Scanner(System.in);
  				// String telephonenew=scanner8.nextLine(); 问题序号：1
  				String newTelephone = scanner8.nextLine();
  				// 调用Student类中的各种set()方法，给属性赋值
  				Student student1 = new Student();
  				// 将新添加的学生的ID放入学生集合
  				/* student1.setID(IDnew);
  				 * //将新添加的学生的姓名放入学生集合
  				 * student1.setname(namenew);
  				 * //将新添加的学生的出生日期放入学生集合
  				 * student1.setbirDate(birDatenew);
  				 * //将新添加的学生的性别放入学生集合
  				 * student1.setgender(gendernew);
  				 * //将新添加的学生的系别放入学生集合
  				 * student1.setdepartment(departmentnew);
  				 * //将新添加的学生的联系电话放入学生集合
  				 * student1.settelephone(telephonenew); 问题序号：1 */
  				student1.setId(newId);
  				// 将新添加的学生的姓名放入学生集合
  				student1.setName(newName);
  				// 将新添加的学生的出生日期放入学生集合
  				student1.setBirDate(newBirDate);
  				//将新添加的学生的性别放入学生集合
  				student1.setGender(newGender);
  				// 将新添加的学生的系别放入学生集合
  				student1.setDepartment(newDepartment);
  				// 将新添加的学生的联系电话放入学生集合
  				student1.setTelephone(newTelephone);
  				students.add(student1);
  				System.out.println("已成功插入");
  				break;
  				}
  			
  		}
  		
  		// 问题序号：13
  		// 问题序号：14
  		// 升序方法1，这里使用ArrayList提供的Collections.sort()方法
  		Collections.sort(students, new Comparator<Student>() {
  			
  		  @Override
  			// 根据ID的大小，升序排序
  			public int compare(Student o1, Student o2) {
  				// TODO Auto-generated method stub
  				/* Integer i1=o1.getID();
  				 * Integer i2=o2.getID(); 问题序号：1 */
  				Integer i1 = o1.getId();
  				Integer i2 = o2.getId();
  				return i1.compareTo(i2);
  			}
  			
  		});
  		
  		/* 升序方法2
  		 * Collections.sort(students,new Comparator<Student>() {
  		 * @Override
  		 * public int compare(Student o1,Student o2) {
  		 * return o1.getId()-o2.getId();
  		 * }
  		 * }); */
  		
  		/* 升序方法3
  		 * Collections.sort(students,new Comparator<Student>() {
  		 * @Override
  		 * public int compare(Student o1,Student o2) {
  		 * // TODO Auto-generated method stub
  		 * int i1=o1.getId();
  		 * int i2=o2.getId();
  		 * return i1-i2;
  		 * }
  		 * }); */
  		
  	}	
  
  	// 关闭"扫描器"，以保障程序的安全性
  	// scanner3.close();
  }
  
  // 修改功能
  // public void Revise(ArrayList<Student> students){ 问题序号：1
  // 问题序号：5
  /**
   * Revise the information of the existing student in the 
   * student collection given by {@code Student}.
   * <p>Input the name of the student to be modified,
   * if there are no students in the student collection
   * given by {@code Student},it will directly display that
   * there are no students,and consequently,if there are students
   * in the student collection given by {@code Student} and the
   * name of the student to be modified is the same as the name
   * of the existing student in the student collection given by
   * {@code Student},it means that the student to be modified
   * is found,and hence,update the student's information,and on
   * the contrary,if it is not the same,it means that there is
   * no student to be modified in the student collection given
   * by {@code Student}.
   * @param students the {@code Student} to revise
   * @return
   */
  // 问题序号：14
  public void revise(ArrayList<Student> students) {
  	// 从键盘接收数据
    // 问题序号：26
  	@SuppressWarnings("resource")
    Scanner scanner4 = new Scanner(System.in);
  	System.out.println("请输入你要修改的学生的姓名：");
  	// 接收当前行输入的字符串数据——姓名
  	String name2 = scanner4.nextLine();
  	// 设置一个标志位flag4，初始值设为-1
  	int flag4 = -1;
  	
  	// 问题序号：13
  	// 问题序号：14
  	// 进行查找
  	// 如果学生集合中还没有学生数据，就显示"还未有学生"
  	if (students.size() == 0) {
  		System.out.println("还未有学生");
  	}
  	
  	// 问题序号：13
  	// 问题序号：14
  	else {
  	  
  	  // 问题序号：13
  	  // 问题序号：14
  		for (int i = 0; i < students.size(); i++) {
  			// 学生集合中的某个学生
  			Student student = students.get(i);
  
  			// 进行比较，如果输入的学生姓名与学生集合中某个学生的姓名相同，就意味着集合中有要修改的学生，将标志位设为该学生在学生集合中的位置序号
  			// if(name2.equals(student.getname())){ 问题序号：1
  			// 问题序号：13
  			// 问题序号：14
  			if (name2.equals(student.getName())) {
  				flag4 = i;
  			}
  			
  			// 问题序号：19
  			else {
  			  
  			}
  			
  			// 问题序号：13
  			// 问题序号：14
  			// 找到要修改的学生，更新其信息
  			if (flag4 != -1) {
  				System.out.println("请输入修改后的学生的学号：");
  				// 接收当前行输入的整型数据——学号
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner5 = new Scanner(System.in);
  				// int IDrevise=scanner5.nextInt(); 问题序号：1
  				int reviseId = scanner5.nextInt();
  				System.out.println("请输入修改后的学生的姓名：");
  				// 接收当前行输入的字符串数据——姓名
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner6 = new Scanner(System.in);
  				// String namerevise=scanner6.nextLine(); 问题序号：1
  				String reviseName = scanner6.nextLine();
  				System.out.println("请输入修改后的学生的出生日期：");
  				// 接收当前行输入的字符串数据——出生日期
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner7 = new Scanner(System.in);
  				// String birDaterevise=scanner7.nextLine(); 问题序号：1
  				String reviseBirDate = scanner7.nextLine();
  				System.out.println("请输入修改后的学生的性别（是否为“男”）：");
  				// 接收当前行输入的字符串数据——性别
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner8 = new Scanner(System.in);
  				// boolean genderrevise=scanner8.nextBoolean(); 问题序号：1
  				boolean reviseGender = scanner8.nextBoolean();
  				System.out.println("请输入修改后的学生的系别：");
  				// 接收当前行输入的字符串数据——系别
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner9 = new Scanner(System.in);
  				// String departmentrevise=scanner9.nextLine(); 问题序号：1
  				String reviseDepartment = scanner9.nextLine();
  				System.out.println("请输入修改后的学生的联系电话：");
  				// 接收当前行输入的字符串数据——联系电话
  				// 问题序号：26
  				@SuppressWarnings("resource")
          Scanner scanner10 = new Scanner(System.in);
  				// String telephonerevise=scanner10.nextLine(); 问题序号：1
  				String reviseTelephone = scanner10.nextLine();
  				// 调用Student类中的各种set()方法，给属性赋值
  				Student student2 = new Student();
  				// 将新修改的学生的ID放入学生集合
  				/* student2.setID(IDrevise);
  				 * //将新修改的学生的姓名放入学生集合
  				 * student2.setname(namerevise);
  				 * //将新修改的学生的出生日期放入学生集合
  				 * student2.setbirDate(birDaterevise);
  				 * //将新修改的学生的性别放入学生集合
  				 * student2.setgender(genderrevise);
  				 * //将新修改的学生的系别放入学生集合
  				 * student2.setdepartment(departmentrevise);
  				 * //将新修改的学生的联系电话放入学生集合
  				 * student2.settelephone(telephonerevise); 问题序号：1 */
  				student2.setId(reviseId);
  				// 将新修改的学生的姓名放入学生集合
  				student2.setName(reviseName);
  				// 将新修改的学生的出生日期放入学生集合
  				student2.setBirDate(reviseBirDate);
  				// 将新修改的学生的性别放入学生集合
  				student2.setGender(reviseGender);
  				// 将新修改的学生的系别放入学生集合
  				student2.setDepartment(reviseDepartment);
  				// 将新修改的学生的联系电话放入学生集合
  				student2.setTelephone(reviseTelephone);
  				System.out.println("已修改");
  				students.set(flag4,student2);
  				}
  			
  			// 问题序号：13
  			// 问题序号：14
  			// 如果姓名没有匹配，就显示"没有该学生"
  			else {
  				System.out.println("没有该学生");
  				break;
  			}
  			
  		}
  		
  	}
  	
  	// 关闭"扫描器"，以保障程序的安全性
  	// scanner4.close();
  }
  
  // 实现一个菜单，选择各种操作
  // 问题序号：5
  /**
   * Select the action that you want to perform given by
   * {@code StudentManager} from the menu and execute it.
   * <p>Display a menu,each action in the menu given by
   * {@code StudentManager} corresponds to a number,and at
   * same time,input different numbers in order to execute
   * different actions,and consequently,if the input is not
   * the specified number,the input error will be displayed
   * and need to re-enter.
   * @param students the {@code Student} to select and execute
   * @return
   */
  // 问题序号：14
  public void actionApp(ArrayList<Student> students) {
  	// 从键盘接收数据
    // 问题序号：26
  	@SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
  	// 设置一个标志位flag，初始值为真
  	boolean flag = true;
  	
  	// 问题序号：13
  	// 问题序号：14
  	// 显示一个菜单
  	while (flag) {
  		System.out.println("请选择操作");
  		System.out.println("*****************************");
  		System.out.println("*           1  插入                            *");
  		System.out.println("*           2  查找                            *");
  		System.out.println("*           3  删除                            *");
  		System.out.println("*           4  修改                            *");
  		System.out.println("*           5  输出                            *");
  		System.out.println("*           6  退出                            *");
  		System.out.println("*****************************");
  		// 接收当前行输入的整型数据——数字选项
  		int operate = scanner.nextInt();
  		
  		// 问题序号：13
  		// 问题序号：14
  		// 根据不同的数字选项，选择不同的功能方法
  		switch (operate) {
  			/* //输入"1"，选择插入功能
  			 * case 1:Add(students);break;
  			 * //输入"2"，选择查找功能
  			 * case 2:Search(students);break;
  			 * //输入"3"，选择删除功能
  			 * case 3:Delete(students);break;
  			 * //输入"4"，选择修改功能
  			 * case 4:Revise(students);break;
  			 * //输入"5"，选择输出功能
  			 * case 5:Show(students);break; 问题序号：1 */
  			// 输入"1"，选择插入功能
  			case 1: add(students); break;
  			// 输入"2"，选择查找功能
  			case 2: search(students); break;
  			// 输入"3"，选择删除功能
  			case 3: delete(students); break;
  			// 输入"4"，选择修改功能
  			case 4: revise(students); break;
  			// 输入"5"，选择输出功能
  			case 5: show(students); break;
  			// 输入"6"，退出
  			case 6: System.out.println("感谢您的使用"); System.exit(0); break;
  			// 如果输入的不是可用的选项，就会报错，提示"输入有误，重新输入"
  			default: System.out.println("您的输入有误，请重新输入"); System.exit(0); break;
  		}
  		
  	}
  	
  	// 关闭"扫描器"，以保障程序的安全性
  	// scanner.close();
  }
}
