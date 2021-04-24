package net.sh.studentmanagement.bean;

//StudentManager��

import net.sh.studentmanagement.bean.Student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;
 

public class StudentManager {
	//ʵ�ָ��ֹ���
	//��ѯ����
	public void Search(ArrayList<Student> students){
		//�Ӽ��̽�������
		Scanner scanner1=new Scanner(System.in);
		System.out.println("������������");
		//���յ�ǰ��������ַ������ݡ�������
		String name=scanner1.nextLine();
		//����һ����־λflag1����ʼֵ��Ϊ-1
		int flag1=-1;
		//���в���
		for(int i=0;i<students.size();i++){
			//ѧ�������е�ĳ��ѧ��
			Student student=students.get(i);
			//���бȽϣ������������ֺͼ�����ĳ��ѧ����������ͬ���������ѧ���������Ϣ��������־λ��Ϊ0
			if(name.equals(student.getname())){
				 System.out.println("ѧ��\t����\t��������\t�Ա�\tϵ��\t��ϵ�绰\n");
				 //����Student���е�get()��������ȡ�ø�ѧ���ĸ�������ֵ
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
		//����ڽ���ѭ�����Һ󣬱�־λ���ǳ�ʼֵ����˵��������û��Ҫ���ҵ�ѧ������ʾ"δ�ҵ�"
		if(flag1==-1){
			System.out.println("δ�ҵ�");
		}
		//�ر�"ɨ����"�����ϳ���İ�ȫ��
		//scanner1.close();
	}
	
	//�������
	public void Show(ArrayList<Student> students){
		//���ѧ�������л�û��ѧ�����ݣ�����ʾ"��δ��ѧ��"
		if(students.size()==0){
			System.out.println("��δ��ѧ��");
		}
		//ѧ����������ѧ�����������λѧ������Ϣ
		else{
			System.out.println("ѧ��\t����\t��������\t�Ա�\tϵ��\t��ϵ�绰\n");
			//ѧ���������м���ѧ������������ٸ�ѧ������Ϣ
			for(int i=0;i<students.size();i++){
				//ѧ�������е�ĳ��ѧ��
				Student student=students.get(i);
				//����Student���е�get()��������ȡ�ø�ѧ���ĸ�������ֵ
				System.out.println(student.getID()+"\t"
			 			+student.getname()+"\t"
			 			+student.getbirDate()+"\t"
			 			+student.getgender()+"\t"
			 			+student.getdepartment()+"\t"
			 			+student.gettelephone());
			}
		}
	}
	
	//ɾ������
	public void Delete(ArrayList<Student> students){
		//�Ӽ��̽�������
		Scanner scanner2=new Scanner(System.in);
		System.out.println("��������Ҫɾ����ѧ����������");
		//���յ�ǰ��������ַ������ݡ�������
		String name1=scanner2.nextLine();
		//����һ����־λflag2����ʼֵ��Ϊ-1
		int flag2=-1;
		//���в���
		for(int i=0;i<students.size();i++){
			//ѧ�������е�ĳ��ѧ��
			Student student=students.get(i);
			//���бȽϣ������������ֺͼ�����ĳ��ѧ����������ͬ������ζ���Ѿ��ҵ���Ҫɾ����ѧ��������־λ��Ϊ��ѧ���ڼ����е�λ�����
			if(name1.equals(student.getname())){
				flag2=i;
			}
		}
		//�������֮�󣬱�־λ���ǳ�ʼֵ������ζ�ż�����û��Ҫɾ�������ѧ������ʾ"û�и�ѧ��"
		if(flag2==-1){
			System.out.println("û�и�ѧ��");
		}
		//����ɹ��ҵ�����ʹ��remove()����ɾ����ѧ������Ϣ������ʾ"ɾ���ɹ�"
		else{
			students.remove(flag2);
			System.out.println("ɾ���ɹ���");
		}
		//�ر�"ɨ����"�����ϳ���İ�ȫ��
		//scanner2.close();
	}
	
	//���빦��
	public void Add(ArrayList<Student> students){
		//�Ӽ��̽�������
		System.out.println("������ѧ����������");
		Scanner scanner3=new Scanner(System.in);
		//���յ�ǰ��������ַ������ݡ���ѧ��������
		String namenew=scanner3.nextLine();
		//����һ����־λflag3����ʼֵΪfalse
		boolean flag3=false;
		//���в�ѯ
		//���ѧ�������л�û��ѧ�����ݣ�����ʾ"��δ��ѧ��"
		if(students.size()==0){
			System.out.println("��δ��ѧ��");
			System.out.println("������ѧ����ѧ�ţ�");
			//���յ�ǰ��������������ݡ���ѧ��
			Scanner scanner4=new Scanner(System.in);
			int IDnew=scanner4.nextInt();
			System.out.println("������ѧ���ĳ������ڣ�");
			//���յ�ǰ��������ַ������ݡ�����������
			Scanner scanner5=new Scanner(System.in);
			String birDatenew=scanner5.nextLine();
			System.out.println("������ѧ�����Ա��Ƿ�Ϊ���С�����");
			//���յ�ǰ��������ַ������ݡ����Ա�
			Scanner scanner6=new Scanner(System.in);
			boolean gendernew=scanner6.nextBoolean();
			System.out.println("������ѧ����ϵ��");
			//���յ�ǰ��������ַ������ݡ���ϵ��
			Scanner scanner7=new Scanner(System.in);
			String departmentnew=scanner7.nextLine();
			System.out.println("������ѧ������ϵ�绰��");
			//���յ�ǰ��������ַ������ݡ�����ϵ�绰
			Scanner scanner8=new Scanner(System.in);
			String telephonenew=scanner8.nextLine();
			//����Student���еĸ���set()�����������Ը�ֵ
			Student student1=new Student();
			//������ӵ�ѧ����ID����ѧ������
			student1.setID(IDnew);
			//������ӵ�ѧ������������ѧ������
			student1.setname(namenew);
			//������ӵ�ѧ���ĳ������ڷ���ѧ������
			student1.setbirDate(birDatenew);
			//������ӵ�ѧ�����Ա����ѧ������
			student1.setgender(gendernew);
			//������ӵ�ѧ����ϵ�����ѧ������
			student1.setdepartment(departmentnew);
			//������ӵ�ѧ������ϵ�绰����ѧ������
			student1.settelephone(telephonenew);
			students.add(student1);
			System.out.println("�ѳɹ�����");
		}
		else{
			for(int i=0;i<students.size();i++){
				//ѧ�������е�ĳ��ѧ��
				Student student=students.get(i);
				//���бȽϣ���������ѧ�������е�ѧ����Ϣ��ѧ��������ĳ��ѧ����ѧ����ͬ����˵���������Ѿ����˸�ѧ���������ٽ������
				if(namenew.equals(student.getname())){
					flag3=true;
				}
				if(flag3){
					System.out.println("�Ѿ��и�ѧ��");
				}
				//���������û��Ҫ�����ѧ�����Ϳ��Խ��в���
				else{
					System.out.println("������ѧ��ѧ�ţ�");
					//���յ�ǰ��������������ݡ���ѧ��
					Scanner scanner4=new Scanner(System.in);
					int IDnew=scanner4.nextInt();
					System.out.println("������ѧ���ĳ������ڣ�");
					//���յ�ǰ��������ַ������ݡ�����������
					Scanner scanner5=new Scanner(System.in);
					String birDatenew=scanner5.nextLine();
					System.out.println("������ѧ�����Ա��Ƿ�Ϊ���С�����");
					//���յ�ǰ��������ַ������ݡ����Ա�
					Scanner scanner6=new Scanner(System.in);
					boolean gendernew=scanner6.nextBoolean();
					System.out.println("������ѧ����ϵ��");
					//���յ�ǰ��������ַ������ݡ���ϵ��
					Scanner scanner7=new Scanner(System.in);
					String departmentnew=scanner7.nextLine();
					System.out.println("������ѧ������ϵ�绰��");
					//���յ�ǰ��������ַ������ݡ�����ϵ�绰
					Scanner scanner8=new Scanner(System.in);
					String telephonenew=scanner8.nextLine();
					//����Student���еĸ���set()�����������Ը�ֵ
					Student student1=new Student();
					//������ӵ�ѧ����ID����ѧ������
					student1.setID(IDnew);
					//������ӵ�ѧ������������ѧ������
					student1.setname(namenew);
					//������ӵ�ѧ���ĳ������ڷ���ѧ������
					student1.setbirDate(birDatenew);
					//������ӵ�ѧ�����Ա����ѧ������
					student1.setgender(gendernew);
					//������ӵ�ѧ����ϵ�����ѧ������
					student1.setdepartment(departmentnew);
					//������ӵ�ѧ������ϵ�绰����ѧ������
					student1.settelephone(telephonenew);
					students.add(student1);
					System.out.println("�ѳɹ�����");
					break;
					}
			}
			//���򷽷�1������ʹ��ArrayList�ṩ��Collections.sort()����
			Collections.sort(students,new Comparator<Student>() {
				@Override
				//����ID�Ĵ�С����������
				public int compare(Student o1,Student o2) {
					// TODO Auto-generated method stub
					Integer i1=o1.getID();
					Integer i2=o2.getID();
					return i1.compareTo(i2);
				}
			});	
			/* ���򷽷�2
			 * Collections.sort(students,new Comparator<Student>() {
				@Override
				public int compare(Student o1,Student o2) {
					return o1.getID()-o2.getID();
				}
			});	*/
			/* ���򷽷�3
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
		//�ر�"ɨ����"���Ա��ϳ���İ�ȫ��
		//scanner3.close();
	}
	
	//�޸Ĺ���
	public void Revise(ArrayList<Student> students){
		//�Ӽ��̽�������
		Scanner scanner4=new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ�ѧ����������");
		//���յ�ǰ��������ַ������ݡ�������
		String name2=scanner4.nextLine();
		//����һ����־λflag4����ʼֵ��Ϊ-1
		int flag4=-1;
		//���в���
		//���ѧ�������л�û��ѧ�����ݣ�����ʾ"��δ��ѧ��"
		if(students.size()==0){
			System.out.println("��δ��ѧ��");
		}
		else{
			for(int i=0;i<students.size();i++){
				//ѧ�������е�ĳ��ѧ��
				Student student=students.get(i);
	
				//���бȽϣ���������ѧ��������ѧ��������ĳ��ѧ����������ͬ������ζ�ż�������Ҫ�޸ĵ�ѧ��������־λ��Ϊ��ѧ����ѧ�������е�λ�����
				if(name2.equals(student.getname())){
					flag4=i;
				}
				//�ҵ�Ҫ�޸ĵ�ѧ������������Ϣ
				if(flag4!=-1){
					System.out.println("�������޸ĺ��ѧ����ѧ�ţ�");
					//���յ�ǰ��������������ݡ���ѧ��
					Scanner scanner5=new Scanner(System.in);
					int IDrevise=scanner5.nextInt();
					System.out.println("�������޸ĺ��ѧ����������");
					//���յ�ǰ��������ַ������ݡ�������
					Scanner scanner6=new Scanner(System.in);
					String namerevise=scanner6.nextLine();
					System.out.println("�������޸ĺ��ѧ���ĳ������ڣ�");
					//���յ�ǰ��������ַ������ݡ�����������
					Scanner scanner7=new Scanner(System.in);
					String birDaterevise=scanner7.nextLine();
					System.out.println("�������޸ĺ��ѧ�����Ա��Ƿ�Ϊ���С�����");
					//���յ�ǰ��������ַ������ݡ����Ա�
					boolean genderrevise=scanner4.nextBoolean();
					System.out.println("�������޸ĺ��ѧ����ϵ��");
					//���յ�ǰ��������ַ������ݡ���ϵ��
					Scanner scanner8=new Scanner(System.in);
					String departmentrevise=scanner8.nextLine();
					System.out.println("�������޸ĺ��ѧ������ϵ�绰��");
					//���յ�ǰ��������ַ������ݡ�����ϵ�绰
					Scanner scanner9=new Scanner(System.in);
					String telephonerevise=scanner9.nextLine();
					//����Student���еĸ���set()�����������Ը�ֵ
					Student student2=new Student();
					//�����޸ĵ�ѧ����ID����ѧ������
					student2.setID(IDrevise);
					//�����޸ĵ�ѧ������������ѧ������
					student2.setname(namerevise);
					//�����޸ĵ�ѧ���ĳ������ڷ���ѧ������
					student2.setbirDate(birDaterevise);
					//�����޸ĵ�ѧ�����Ա����ѧ������
					student2.setgender(genderrevise);
					//�����޸ĵ�ѧ����ϵ�����ѧ������
					student2.setdepartment(departmentrevise);
					//�����޸ĵ�ѧ������ϵ�绰����ѧ������
					student2.settelephone(telephonerevise);
					System.out.println("���޸�");
					students.set(flag4,student2);
					}
				//�������û��ƥ�䣬����ʾ"û�и�ѧ��"
				else{
					System.out.println("û�и�ѧ��");
					break;
				}
			}
		}
		//�ر�"ɨ����"���Ա��ϳ���İ�ȫ��
		//scanner4.close();
	}
	
	public void actionApp(ArrayList<Student> students){
		//�Ӽ��̽�������
		Scanner scanner=new Scanner(System.in);
		//����һ����־λflag����ʼֵΪ��
		boolean flag=true;
		//��ʾһ���˵�
		while(flag){
			System.out.println("��ѡ�����");
			System.out.println("*****************************");
			System.out.println("*           1  ����                            *");
			System.out.println("*           2  ����                            *");
			System.out.println("*           3  ɾ��                            *");
			System.out.println("*           4  �޸�                            *");
			System.out.println("*           5  ���                            *");
			System.out.println("*           6  �˳�                            *");
			System.out.println("*****************************");
			//���յ�ǰ��������������ݡ�������ѡ��
			int operate=scanner.nextInt();
			//���ݲ�ͬ������ѡ�ѡ��ͬ�Ĺ��ܷ���
			switch(operate)
			{
				//����"1"��ѡ����빦��
				case 1:Add(students);;break;
				//����"2"��ѡ����ҹ���
				case 2:Search(students);;break;
				//����"3"��ѡ��ɾ������
				case 3:Delete(students);;break;
				//����"4"��ѡ���޸Ĺ���
				case 4:Revise(students);break;
				//����"5"��ѡ���������
				case 5:Show(students);break;
				//����"6"���˳�
				case 6:System.out.println("��л����ʹ��");System.exit(0);break;
				//�������Ĳ��ǿ��õ�ѡ��ͻᱨ����ʾ"����������������"
				default:System.out.println("����������������������");System.exit(0);break;
			}
		}
		//�ر�"ɨ����"���Ա��ϳ���İ�ȫ��
		//scanner.close();
	}
}
