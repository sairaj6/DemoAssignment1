package com.nissan.bean;

import org.springframework.stereotype.Component;

import com.nissan.service.IVehicle;


@Component
public class BMW implements IVehicle
{

	@Override
	public String getService() {
		// TODO Auto-generated method stub
		return "This is BMW";
	}

}