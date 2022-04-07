package com.javagyeongmin.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // ctx �����̳� ����
		
		ctx.load("classpath:applicationCTX.xml"); // �����̳� ����
		ctx.refresh(); // �����̳� ����
		
		Student student = ctx.getBean("student", Student.class); // �����̳� ���
		
		System.out.println(student.getName()); // �����̳� ��� -> ȫ�浿
		
		ctx.close(); // �����̳� ����
		
	}

}
