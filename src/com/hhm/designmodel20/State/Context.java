package com.hhm.designmodel20.State;

public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	public void method(){
		if(1 == state.getValue()){
			state.method1();
		}else if(2 == state.getValue()){
			state.method2();
		}
	}
	
}
