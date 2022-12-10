package com.nissan.bean;

import java.util.Random;

import org.springframework.stereotype.Component;

import com.nissan.service.IFortune;
@Component
public class B_FortuneMaker implements IFortune {
	
	@Override
	public String getFortune() {
		
		String arrFortune[]= new String[] {"Smart Watch","IPhone14","Luxury Car"};
		Random rand = new Random();
		int upperbond = 3;
		int randomnumber = rand.nextInt(upperbond);
		return "Congratulations... You have received \n***************"
				+arrFortune[randomnumber]+"***************";
	}

}
