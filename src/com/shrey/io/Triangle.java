package com.shrey.io;

public class Triangle {
	
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	public Point getPointA() {
		return PointA;
	}

	public void setPointA(Point pointA) {
		PointA = pointA;
	}

	public Point getPointB() {
		return PointB;
	}

	public void setPointB(Point pointB) {
		PointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		PointC = pointC;
	}

	public void draw(){
	System.out.println("PointA x = "+ getPointA().getX()  +" y = " + getPointA().getY() );
	System.out.println("PointB x = "+ getPointB().getX()  +" y = " + getPointB().getY() );
	System.out.println("PointC x = "+ getPointC().getX()  +" y = " + getPointC().getY() );
 	}
	
	
}
