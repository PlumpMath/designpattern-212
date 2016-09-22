package com.cheaphook.builder;

import java.util.ArrayList;
import java.util.List;

public class Director {

	private List<String> sequence = new ArrayList<String>();
	private BenzBuilder benzBuilder = new BenzBuilder();
	
	public BenzModel getBenzModel()
	{
		sequence.clear();
		sequence.add("start");
		sequence.add("stop");
		this.benzBuilder.setSequence(sequence);
		return (BenzModel) this.benzBuilder.getCarModel();
	}
}
