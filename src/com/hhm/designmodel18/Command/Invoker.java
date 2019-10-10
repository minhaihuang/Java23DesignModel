package com.hhm.designmodel18.Command;
/**
 * 长官
 * @author huanghaimin
 *
 */
public class Invoker {
	private Command command;

	//长官下达命令
	public void action(){
		command.exe();
	}
	
	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	
}
