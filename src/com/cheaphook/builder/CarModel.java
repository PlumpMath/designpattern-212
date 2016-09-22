package com.cheaphook.builder;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {
	private List<String> sequence = new ArrayList<String>();
	abstract void start();
	abstract void stop();
	abstract void alarm();
	abstract void engineBoom();
	void run(){
		for(int i=0;i<this.sequence.size();i++){
			String actionName = this.sequence.get(i);
			if(actionName.equalsIgnoreCase("start")){
			this.start(); //��������
			}else if(actionName.equalsIgnoreCase("stop")){
			this.stop(); //ֹͣ����
			}else if(actionName.equalsIgnoreCase("alarm")){
			this.alarm(); //���ȿ�ʼ����
			}else if(actionName.equalsIgnoreCase("engine boom")){
			//�����engine boom�ؼ�this.engineBoom(); //���濪ʼ����
			}
			}
	}
	void setSequence(List<String> sequence){
		this.sequence = sequence;
	}
}
