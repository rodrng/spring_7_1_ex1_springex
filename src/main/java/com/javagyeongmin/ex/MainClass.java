package com.javagyeongmin.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // ctx 컨테이너 생성
		
		ctx.load("classpath:applicationCTX.xml"); // 컨테이네 설정
		ctx.refresh(); // 컨테이너 설정
		
		Student student = ctx.getBean("student", Student.class); // 컨테이너 사용
		
		System.out.println(student.getName()); // 컨테이너 사용 -> 홍길동
		
		ctx.close(); // 컨테이너 종료
		
	}

}
