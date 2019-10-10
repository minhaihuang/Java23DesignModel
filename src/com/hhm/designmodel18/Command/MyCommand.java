package com.hhm.designmodel18.Command;

public class MyCommand implements Command {
	private Soldier soldier;

	@Override
	public void exe() {
		soldier.action();
	}
	
	

	public MyCommand(Soldier soldier) {
		super();
		this.soldier = soldier;
	}

}
