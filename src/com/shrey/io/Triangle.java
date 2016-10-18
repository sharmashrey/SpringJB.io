package com.shrey.io;

public class Triangle {
	
	private String type; 
	
	private int height;
	
	public int getHeight() {
		return height;
	}

	public Triangle(String type){
	this.type = type;	
	}
	
	//if we set only one constructor-arg. in bean ,
	//spring  might get confused if you only send a single constructor-arg
	public Triangle(int height){
		this.height = height;	
	}
	
	public Triangle(String type, int height){
		this.type = type;
		this.height= height;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void draw(){
	System.out.println("Triangle Drawn is "+ getType() +" of height "+ getHeight() );
	}
}
