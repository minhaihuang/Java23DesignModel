package com.hhm.designmodel09.facade;

public class Computer {
	private CPU cpu;
	private Memory memory;
	private Disk disk;
	
	public Computer(){
		this.cpu = new CPU();
		this.memory = new Memory();
		this.disk = new Disk();
	}
	
	public void startup(){
		System.out.println("begin startup computer");
		cpu.startup();
		memory.startup();
		disk.startup();
		
		System.out.println("end startup computer");
	}
	
	public void shutdown(){
		System.out.println("begin shutdown computer");
		disk.shutdown();
		memory.shutdown();
		cpu.shutdown();
		System.out.println("end shutdown computer");
	}
	
	

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public Memory getMemory() {
		return memory;
	}

	public void setMemory(Memory memory) {
		this.memory = memory;
	}

	public Disk getDisk() {
		return disk;
	}

	public void setDisk(Disk disk) {
		this.disk = disk;
	}

}
