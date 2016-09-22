package com.cheaphook.builder;

import java.util.List;

public abstract class CarBuilder {
	abstract CarModel getCarModel();
	
	abstract void setSequence(List<String> sequence);
}
