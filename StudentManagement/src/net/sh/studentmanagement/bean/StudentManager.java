package net.sh.studentmanagement.bean;

// StudentManager��

import net.sh.studentmanagement.bean.Student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
 

public class StudentManager {
  // ʵ�ָ��ֹ���
  // ��ѯ����
  // public void Search(ArrayList<Student> students){ ������ţ�1
  // ������ţ�5
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
  // ������ţ�14
  public void search(ArrayList<Student> students) {
  	// �Ӽ��̽�������
    // ������ţ�26
    @SuppressWarnings("resource")
    Scanner scanner1 = new Scanner(System.in);
  	System.out.println("������������");
  	// ���յ�ǰ��������ַ������ݡ�������
  	String name = scanner1.nextLine();
  	// ����һ����־λflag1����ʼֵ��Ϊ-1
  	int flag1 = -1;
  	
  	// ������ţ�13
  	// ������ţ�14
  	// ���в���
  	for (int i = 0; i < students.size(); i++) {
  		// ѧ�������е�ĳ��ѧ��
  		Student student = students.get(i);
  		
  		// ���бȽϣ������������ֺͼ�����ĳ��ѧ����������ͬ���������ѧ���������Ϣ��������־λ��Ϊ0
  		/* if(name.equals(student.getname())){
  		 * System.out.println("ѧ��\t����\t��������\t�Ա�\tϵ��\t��ϵ�绰\n");
  		 * //����Student���е�get()��������ȡ�ø�ѧ���ĸ�������ֵ
  		 * System.out.println(student.getID()+"\t"
  		 * +student.getname()+"\t"
  		 * +student.getbirDate()+"\t"
  		 * +student.getgender()+"\t"
  		 * +student.getdepartment()+"\t"
  		 * +student.gettelephone()); ������ţ�1 */
  		// ������ţ�13
  		// ������ţ�14
  		if (name.equals(student.getName())) {
  			 System.out.println("ѧ��\t����\t��������\t�Ա�\tϵ��\t��ϵ�绰\n");
  			 // ����Student���е�get()��������ȡ�ø�ѧ���ĸ�������ֵ
  			 System.out.println(student.getId() + "\t"
  					 			+ student.getName() + "\t"
  					 			+ student.getBirDate() + "\t"
  					 			+ student.isGender() + "\t"
  					 			+ student.getDepartment() + "\t"
  					 			+ student.getTelephone());
  			 flag1 = 0;
  			 break;
  		}
  		
  		// ������ţ�19
  		else {
  		  
  		}
  		
  	}
  	
  	// ������ţ�13
  	// ������ţ�14
  	// ����ڽ���ѭ�����Һ󣬱�־λ���ǳ�ʼֵ����˵��������û��Ҫ���ҵ�ѧ������ʾ"δ�ҵ�"
  	if (flag1 == -1) {
  		System.out.println("δ�ҵ�");
  	}
  	
  	// ������ţ�19
  	else {
  	  
  	}
  	
  	// �ر�"ɨ����"�����ϳ���İ�ȫ��
  	// scanner1.close();
  }
  
  // �������
  // public void Show(ArrayList<Student> students){ ������ţ�1
  // ������ţ�5
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
  // ������ţ�14
  public void show(ArrayList<Student> students) {
    
    // ������ţ�13
    // ������ţ�14
  	// ���ѧ�������л�û��ѧ�����ݣ�����ʾ"��δ��ѧ��"
  	if (students.size() == 0) {
  		System.out.println("��δ��ѧ��");
  	}
  	
  	// ������ţ�13
  	// ������ţ�14
  	// ѧ����������ѧ�����������λѧ������Ϣ
  	else {
  		System.out.println("ѧ��\t����\t��������\t�Ա�\tϵ��\t��ϵ�绰\n");
  		
  		// ������ţ�13
  		// ������ţ�14
  		// ѧ���������м���ѧ������������ٸ�ѧ������Ϣ
  		for (int i = 0; i < students.size(); i++) {
  			// ѧ�������е�ĳ��ѧ��
  			Student student = students.get(i);
  			// ����Student���е�get()��������ȡ�ø�ѧ���ĸ�������ֵ
  			/* System.out.println(student.getID()+"\t"
  			 * +student.getname()+"\t"
  			 * +student.getbirDate()+"\t"
  			 * +student.getgender()+"\t
  			 * +student.getdepartment()+"\t"
  			 * +student.gettelephone()); ������ţ�1 */
  			System.out.println(student.getId() + "\t"
  		 			+ student.getName() + "\t"
  		 			+ student.getBirDate() + "\t"
  		 			+ student.isGender() + "\t"
  		 			+ student.getDepartment() + "\t"
  		 			+ student.getTelephone());
  		}
  		
  	}
  	
  }
  
  // ɾ������
  // public void Delete(ArrayList<Student> students){ ������ţ�1
  // ������ţ�5
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
  // ������ţ�14
  public void delete(ArrayList<Student> students) {
  	// �Ӽ��̽�������
    // ������ţ�26
  	@SuppressWarnings("resource")
    Scanner scanner2 = new Scanner(System.in);
  	System.out.println("��������Ҫɾ����ѧ����������");
  	// ���յ�ǰ��������ַ������ݡ�������
  	String name1 = scanner2.nextLine();
  	// ����һ����־λflag2����ʼֵ��Ϊ-1
  	int flag2 = -1;
  	// ���в���
  	
  	// ������ţ�13
  	// ������ţ�14
  	for (int i = 0; i < students.size(); i++) {
  		// ѧ�������е�ĳ��ѧ��
  		Student student = students.get(i);
  		
  		// ���бȽϣ������������ֺͼ�����ĳ��ѧ����������ͬ������ζ���Ѿ��ҵ���Ҫɾ����ѧ��������־λ��Ϊ��ѧ���ڼ����е�λ�����
  		/* if(name1.equals(student.getname())){
  		 * flag2=i;
  		 * } ������ţ�1 */
  		// ������ţ�13
  		// ������ţ�14
  		if (name1.equals(student.getName())) {
  			flag2 = i;
  		}
  		
  		// ������ţ�19
  		else{
  		  
  		}
  		
  		// ������ţ�13
  		// ������ţ�14
  		// �������֮�󣬱�־λ���ǳ�ʼֵ������ζ�ż�����û��Ҫɾ�������ѧ������ʾ"û�и�ѧ��"
  		if (flag2 == -1) {
  			System.out.println("û�и�ѧ��");
  		}
  		
  		// ������ţ�13
  		// ������ţ�14
  		// ����ɹ��ҵ�����ʹ��remove()����ɾ����ѧ������Ϣ������ʾ"ɾ���ɹ�"
  		else {
  			students.remove(flag2);
  			System.out.println("ɾ���ɹ���");
  		}
  		
  	}
  	
  	// �ر�"ɨ����"�����ϳ���İ�ȫ��
  	// scanner2.close();
  }
  
  // ���빦��
  // public void Add(ArrayList<Student> students){ ������ţ�1
  // ������ţ�5
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
  // ������ţ�14
  public void add(ArrayList<Student> students) {
  	// �Ӽ��̽�������
  	System.out.println("������ѧ����������");
  	// ������ţ�26
  	@SuppressWarnings("resource")
    Scanner scanner3 = new Scanner(System.in);
  	// ���յ�ǰ��������ַ������ݡ���ѧ��������
  	// String namenew=scanner3.nextLine(); ������ţ�1
  	String newName = scanner3.nextLine();
  	// ����һ����־λflag3����ʼֵΪfalse
  	boolean flag3 = false;
  	
  	// ������ţ�13
  	// ������ţ�14
  	// ���в�ѯ
  	// ���ѧ�������л�û��ѧ�����ݣ�����ʾ"��δ��ѧ��"
  	if (students.size() == 0) {
  		System.out.println("��δ��ѧ��");
  		System.out.println("������ѧ����ѧ�ţ�");
  		// ���յ�ǰ��������������ݡ���ѧ��
  		// ������ţ�26
  		@SuppressWarnings("resource")
      Scanner scanner4 = new Scanner(System.in);
  		// int IDnew=scanner4.nextInt(); ������ţ�1
  		int newId = scanner4.nextInt();
  		System.out.println("������ѧ���ĳ������ڣ�");
  		// ���յ�ǰ��������ַ������ݡ�����������
  		// ������ţ�26
  		@SuppressWarnings("resource")
      Scanner scanner5 = new Scanner(System.in);
  		// String birDatenew=scanner5.nextLine(); ������ţ�1
  		String newBirDate = scanner5.nextLine();
  		System.out.println("������ѧ�����Ա��Ƿ�Ϊ���С�����");
  		// ���յ�ǰ��������ַ������ݡ����Ա�
  		// ������ţ�26
  		@SuppressWarnings("resource")
      Scanner scanner6 = new Scanner(System.in);
  		// boolean gendernew=scanner6.nextBoolean(); ������ţ�1
  		boolean newGender = scanner6.nextBoolean();
  		System.out.println("������ѧ����ϵ��");
  		// ���յ�ǰ��������ַ������ݡ���ϵ��
  		// ������ţ�26
  		@SuppressWarnings("resource")
      Scanner scanner7 = new Scanner(System.in);
  		// String departmentnew=scanner7.nextLine(); ������ţ�1
  		String newDepartment = scanner7.nextLine();
  		System.out.println("������ѧ������ϵ�绰��");
  		// ���յ�ǰ��������ַ������ݡ�����ϵ�绰
  		// ������ţ�26
  		@SuppressWarnings("resource")
      Scanner scanner8 = new Scanner(System.in);
  		// String telephonenew=scanner8.nextLine(); ������ţ�1
  		String newTelephone = scanner8.nextLine();
  		// ����Student���еĸ���set()�����������Ը�ֵ
  		Student student1 = new Student();
  		// ������ӵ�ѧ����ID����ѧ������
  		/* student1.setID(IDnew);
  		 * //������ӵ�ѧ������������ѧ������
  		 * student1.setname(namenew);
  		 * //������ӵ�ѧ���ĳ������ڷ���ѧ������
  		 * student1.setbirDate(birDatenew);
  		 * //������ӵ�ѧ�����Ա����ѧ������
  		 * student1.setgender(gendernew);
  		 * //������ӵ�ѧ����ϵ�����ѧ������
  		 * student1.setdepartment(departmentnew);
  		 * //������ӵ�ѧ������ϵ�绰����ѧ������
  		 * student1.settelephone(telephonenew); ������ţ�1 */
  		student1.setId(newId);
  		// ������ӵ�ѧ������������ѧ������
  		student1.setName(newName);
  		// ������ӵ�ѧ���ĳ������ڷ���ѧ������
  		student1.setBirDate(newBirDate);
  		// ������ӵ�ѧ�����Ա����ѧ������
  		student1.setGender(newGender);
  		// ������ӵ�ѧ����ϵ�����ѧ������
  		student1.setDepartment(newDepartment);
  		// ������ӵ�ѧ������ϵ�绰����ѧ������
  		student1.setTelephone(newTelephone);
  		students.add(student1);
  		System.out.println("�ѳɹ�����");
  	}
  	
  	// ������ţ�13
  	// ������ţ�14
  	else {
  	  
  	  // ������ţ�13
  	  // ������ţ�14
  		for (int i = 0; i < students.size(); i++) {
  			// ѧ�������е�ĳ��ѧ��
  			Student student = students.get(i);
  			
  			// ���бȽϣ���������ѧ�������е�ѧ����Ϣ��ѧ��������ĳ��ѧ����ѧ����ͬ����˵���������Ѿ����˸�ѧ���������ٽ������
  			// if(namenew.equals(student.getname())){ ������ţ�1
  			// ������ţ�13
  			// ������ţ�14
  			if (newName.equals(student.getName())) {
  				flag3 = true;
  			}
  			
  			// ������ţ�19
  			else {
  			  
  			}
  			
  			// ������ţ�13
  			// ������ţ�14
  			if (flag3) {
  				System.out.println("�Ѿ��и�ѧ��");
  			}
  			
  			// ������ţ�13
  			// ������ţ�14
  			// ���������û��Ҫ�����ѧ�����Ϳ��Խ��в���
  			else {
  				System.out.println("������ѧ��ѧ�ţ�");
  				// ���յ�ǰ��������������ݡ���ѧ��
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner4 = new Scanner(System.in);
  				// int IDnew=scanner4.nextInt(); ������ţ�1
  				int newId = scanner4.nextInt();
  				System.out.println("������ѧ���ĳ������ڣ�");
  				// ���յ�ǰ��������ַ������ݡ�����������
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner5 = new Scanner(System.in);
  				// String birDatenew=scanner5.nextLine(); ������ţ�1
  				String newBirDate = scanner5.nextLine();
  				System.out.println("������ѧ�����Ա��Ƿ�Ϊ���С�����");
  				// ���յ�ǰ��������ַ������ݡ����Ա�
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner6 = new Scanner(System.in);
  				// boolean gendernew=scanner6.nextBoolean(); ������ţ�1
  				boolean newGender = scanner6.nextBoolean();
  				System.out.println("������ѧ����ϵ��");
  				// ���յ�ǰ��������ַ������ݡ���ϵ��
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner7 = new Scanner(System.in);
  				// String departmentnew=scanner7.nextLine(); ������ţ�1
  				String newDepartment = scanner7.nextLine();
  				System.out.println("������ѧ������ϵ�绰��");
  				// ���յ�ǰ��������ַ������ݡ�����ϵ�绰
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner8 = new Scanner(System.in);
  				// String telephonenew=scanner8.nextLine(); ������ţ�1
  				String newTelephone = scanner8.nextLine();
  				// ����Student���еĸ���set()�����������Ը�ֵ
  				Student student1 = new Student();
  				// ������ӵ�ѧ����ID����ѧ������
  				/* student1.setID(IDnew);
  				 * //������ӵ�ѧ������������ѧ������
  				 * student1.setname(namenew);
  				 * //������ӵ�ѧ���ĳ������ڷ���ѧ������
  				 * student1.setbirDate(birDatenew);
  				 * //������ӵ�ѧ�����Ա����ѧ������
  				 * student1.setgender(gendernew);
  				 * //������ӵ�ѧ����ϵ�����ѧ������
  				 * student1.setdepartment(departmentnew);
  				 * //������ӵ�ѧ������ϵ�绰����ѧ������
  				 * student1.settelephone(telephonenew); ������ţ�1 */
  				student1.setId(newId);
  				// ������ӵ�ѧ������������ѧ������
  				student1.setName(newName);
  				// ������ӵ�ѧ���ĳ������ڷ���ѧ������
  				student1.setBirDate(newBirDate);
  				//������ӵ�ѧ�����Ա����ѧ������
  				student1.setGender(newGender);
  				// ������ӵ�ѧ����ϵ�����ѧ������
  				student1.setDepartment(newDepartment);
  				// ������ӵ�ѧ������ϵ�绰����ѧ������
  				student1.setTelephone(newTelephone);
  				students.add(student1);
  				System.out.println("�ѳɹ�����");
  				break;
  				}
  			
  		}
  		
  		// ������ţ�13
  		// ������ţ�14
  		// ���򷽷�1������ʹ��ArrayList�ṩ��Collections.sort()����
  		Collections.sort(students, new Comparator<Student>() {
  			
  		  @Override
  			// ����ID�Ĵ�С����������
  			public int compare(Student o1, Student o2) {
  				// TODO Auto-generated method stub
  				/* Integer i1=o1.getID();
  				 * Integer i2=o2.getID(); ������ţ�1 */
  				Integer i1 = o1.getId();
  				Integer i2 = o2.getId();
  				return i1.compareTo(i2);
  			}
  			
  		});
  		
  		/* ���򷽷�2
  		 * Collections.sort(students,new Comparator<Student>() {
  		 * @Override
  		 * public int compare(Student o1,Student o2) {
  		 * return o1.getId()-o2.getId();
  		 * }
  		 * }); */
  		
  		/* ���򷽷�3
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
  
  	// �ر�"ɨ����"���Ա��ϳ���İ�ȫ��
  	// scanner3.close();
  }
  
  // �޸Ĺ���
  // public void Revise(ArrayList<Student> students){ ������ţ�1
  // ������ţ�5
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
  // ������ţ�14
  public void revise(ArrayList<Student> students) {
  	// �Ӽ��̽�������
    // ������ţ�26
  	@SuppressWarnings("resource")
    Scanner scanner4 = new Scanner(System.in);
  	System.out.println("��������Ҫ�޸ĵ�ѧ����������");
  	// ���յ�ǰ��������ַ������ݡ�������
  	String name2 = scanner4.nextLine();
  	// ����һ����־λflag4����ʼֵ��Ϊ-1
  	int flag4 = -1;
  	
  	// ������ţ�13
  	// ������ţ�14
  	// ���в���
  	// ���ѧ�������л�û��ѧ�����ݣ�����ʾ"��δ��ѧ��"
  	if (students.size() == 0) {
  		System.out.println("��δ��ѧ��");
  	}
  	
  	// ������ţ�13
  	// ������ţ�14
  	else {
  	  
  	  // ������ţ�13
  	  // ������ţ�14
  		for (int i = 0; i < students.size(); i++) {
  			// ѧ�������е�ĳ��ѧ��
  			Student student = students.get(i);
  
  			// ���бȽϣ���������ѧ��������ѧ��������ĳ��ѧ����������ͬ������ζ�ż�������Ҫ�޸ĵ�ѧ��������־λ��Ϊ��ѧ����ѧ�������е�λ�����
  			// if(name2.equals(student.getname())){ ������ţ�1
  			// ������ţ�13
  			// ������ţ�14
  			if (name2.equals(student.getName())) {
  				flag4 = i;
  			}
  			
  			// ������ţ�19
  			else {
  			  
  			}
  			
  			// ������ţ�13
  			// ������ţ�14
  			// �ҵ�Ҫ�޸ĵ�ѧ������������Ϣ
  			if (flag4 != -1) {
  				System.out.println("�������޸ĺ��ѧ����ѧ�ţ�");
  				// ���յ�ǰ��������������ݡ���ѧ��
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner5 = new Scanner(System.in);
  				// int IDrevise=scanner5.nextInt(); ������ţ�1
  				int reviseId = scanner5.nextInt();
  				System.out.println("�������޸ĺ��ѧ����������");
  				// ���յ�ǰ��������ַ������ݡ�������
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner6 = new Scanner(System.in);
  				// String namerevise=scanner6.nextLine(); ������ţ�1
  				String reviseName = scanner6.nextLine();
  				System.out.println("�������޸ĺ��ѧ���ĳ������ڣ�");
  				// ���յ�ǰ��������ַ������ݡ�����������
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner7 = new Scanner(System.in);
  				// String birDaterevise=scanner7.nextLine(); ������ţ�1
  				String reviseBirDate = scanner7.nextLine();
  				System.out.println("�������޸ĺ��ѧ�����Ա��Ƿ�Ϊ���С�����");
  				// ���յ�ǰ��������ַ������ݡ����Ա�
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner8 = new Scanner(System.in);
  				// boolean genderrevise=scanner8.nextBoolean(); ������ţ�1
  				boolean reviseGender = scanner8.nextBoolean();
  				System.out.println("�������޸ĺ��ѧ����ϵ��");
  				// ���յ�ǰ��������ַ������ݡ���ϵ��
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner9 = new Scanner(System.in);
  				// String departmentrevise=scanner9.nextLine(); ������ţ�1
  				String reviseDepartment = scanner9.nextLine();
  				System.out.println("�������޸ĺ��ѧ������ϵ�绰��");
  				// ���յ�ǰ��������ַ������ݡ�����ϵ�绰
  				// ������ţ�26
  				@SuppressWarnings("resource")
          Scanner scanner10 = new Scanner(System.in);
  				// String telephonerevise=scanner10.nextLine(); ������ţ�1
  				String reviseTelephone = scanner10.nextLine();
  				// ����Student���еĸ���set()�����������Ը�ֵ
  				Student student2 = new Student();
  				// �����޸ĵ�ѧ����ID����ѧ������
  				/* student2.setID(IDrevise);
  				 * //�����޸ĵ�ѧ������������ѧ������
  				 * student2.setname(namerevise);
  				 * //�����޸ĵ�ѧ���ĳ������ڷ���ѧ������
  				 * student2.setbirDate(birDaterevise);
  				 * //�����޸ĵ�ѧ�����Ա����ѧ������
  				 * student2.setgender(genderrevise);
  				 * //�����޸ĵ�ѧ����ϵ�����ѧ������
  				 * student2.setdepartment(departmentrevise);
  				 * //�����޸ĵ�ѧ������ϵ�绰����ѧ������
  				 * student2.settelephone(telephonerevise); ������ţ�1 */
  				student2.setId(reviseId);
  				// �����޸ĵ�ѧ������������ѧ������
  				student2.setName(reviseName);
  				// �����޸ĵ�ѧ���ĳ������ڷ���ѧ������
  				student2.setBirDate(reviseBirDate);
  				// �����޸ĵ�ѧ�����Ա����ѧ������
  				student2.setGender(reviseGender);
  				// �����޸ĵ�ѧ����ϵ�����ѧ������
  				student2.setDepartment(reviseDepartment);
  				// �����޸ĵ�ѧ������ϵ�绰����ѧ������
  				student2.setTelephone(reviseTelephone);
  				System.out.println("���޸�");
  				students.set(flag4,student2);
  				}
  			
  			// ������ţ�13
  			// ������ţ�14
  			// �������û��ƥ�䣬����ʾ"û�и�ѧ��"
  			else {
  				System.out.println("û�и�ѧ��");
  				break;
  			}
  			
  		}
  		
  	}
  	
  	// �ر�"ɨ����"���Ա��ϳ���İ�ȫ��
  	// scanner4.close();
  }
  
  // ʵ��һ���˵���ѡ����ֲ���
  // ������ţ�5
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
  // ������ţ�14
  public void actionApp(ArrayList<Student> students) {
  	// �Ӽ��̽�������
    // ������ţ�26
  	@SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
  	// ����һ����־λflag����ʼֵΪ��
  	boolean flag = true;
  	
  	// ������ţ�13
  	// ������ţ�14
  	// ��ʾһ���˵�
  	while (flag) {
  		System.out.println("��ѡ�����");
  		System.out.println("*****************************");
  		System.out.println("*           1  ����                            *");
  		System.out.println("*           2  ����                            *");
  		System.out.println("*           3  ɾ��                            *");
  		System.out.println("*           4  �޸�                            *");
  		System.out.println("*           5  ���                            *");
  		System.out.println("*           6  �˳�                            *");
  		System.out.println("*****************************");
  		// ���յ�ǰ��������������ݡ�������ѡ��
  		int operate = scanner.nextInt();
  		
  		// ������ţ�13
  		// ������ţ�14
  		// ���ݲ�ͬ������ѡ�ѡ��ͬ�Ĺ��ܷ���
  		switch (operate) {
  			/* //����"1"��ѡ����빦��
  			 * case 1:Add(students);break;
  			 * //����"2"��ѡ����ҹ���
  			 * case 2:Search(students);break;
  			 * //����"3"��ѡ��ɾ������
  			 * case 3:Delete(students);break;
  			 * //����"4"��ѡ���޸Ĺ���
  			 * case 4:Revise(students);break;
  			 * //����"5"��ѡ���������
  			 * case 5:Show(students);break; ������ţ�1 */
  			// ����"1"��ѡ����빦��
  			case 1: add(students); break;
  			// ����"2"��ѡ����ҹ���
  			case 2: search(students); break;
  			// ����"3"��ѡ��ɾ������
  			case 3: delete(students); break;
  			// ����"4"��ѡ���޸Ĺ���
  			case 4: revise(students); break;
  			// ����"5"��ѡ���������
  			case 5: show(students); break;
  			// ����"6"���˳�
  			case 6: System.out.println("��л����ʹ��"); System.exit(0); break;
  			// �������Ĳ��ǿ��õ�ѡ��ͻᱨ����ʾ"����������������"
  			default: System.out.println("����������������������"); System.exit(0); break;
  		}
  		
  	}
  	
  	// �ر�"ɨ����"���Ա��ϳ���İ�ȫ��
  	// scanner.close();
  }
}
