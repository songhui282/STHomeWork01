package net.sh.studentmanagement.test;

import net.sh.studentmanagement.bean.Student;
import net.sh.studentmanagement.bean.StudentManager;

import java.util.ArrayList;

// 问题序号：14
public class SMTest {
	public static void main(String[] args) {
		//定义学生集合，用ArrayList集合管理所有学生
		ArrayList<Student> students = new ArrayList<Student>();
		//调用StudentManager类中的actionApp方法，实现各种操作
		StudentManager sm = new StudentManager();
		sm.actionApp(students);
	}
}
