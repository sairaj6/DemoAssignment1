package com.interface1.app;

import com.interface1.bean.Cat;
import com.interface1.bean.Dog;
import com.interface1.bean.MyAnimals;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();
		c.saySomething();
		
		Dog d=new Dog();
		d.saySomething();
		
		MyAnimals m=new MyAnimals();
		int temp=m.getBodyTemp();
		System.out.println(temp);

	}

}