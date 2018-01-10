package com.javaex.problem02;

public class Depart extends Employee {

    //코드작성
	String department;

	public Depart(String name, int salary, String department) {
		super(name,salary); //자식에서 입력받은 값으로, 부모의 메소드를 이용하겠다.
		this.department = department;
	}
	
	public void getInformation() {
        System.out.println("이름:" + getName() + "연봉:" + getSalary()+"부서:"+ department);
    }
	
	
}
