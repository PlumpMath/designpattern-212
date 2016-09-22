package com.cheaphook.builder;

import java.util.ArrayList;
import java.util.List;

public class BenzBuilder extends CarBuilder {

	private BenzModel benz = new BenzModel();
	
	@Override
	CarModel getCarModel() {
		// TODO Auto-generated method stub
		return benz;
	}

	@Override
	void setSequence(List<String> sequence) {
		// TODO Auto-generated method stub
		this.benz.setSequence(sequence);
	}

}
