package net.sh.studentmanagement.test;

import net.sh.studentmanagement.bean.Student;
import net.sh.studentmanagement.bean.StudentManager;

import java.util.ArrayList;

// ������ţ�14
public class SMTest {
	public static void main(String[] args) {
		//����ѧ�����ϣ���ArrayList���Ϲ�������ѧ��
		ArrayList<Student> students = new ArrayList<Student>();
		//����StudentManager���е�actionApp������ʵ�ָ��ֲ���
		StudentManager sm = new StudentManager();
		sm.actionApp(students);
	}
}
