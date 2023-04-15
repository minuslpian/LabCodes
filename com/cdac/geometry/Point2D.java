package com.cdac.geometry;
//import java.lang.Math;
public class Point2D {
	private int x,y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "x = "+x+ " y = "+y;
	}
	//isEquals method implementation
//	public boolean isEqual(Point2D obj) {
//		if(obj != null)
//			return this.x==obj.x && this.y==obj.y;
//		else
//			return false;
//	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null)
			return this.x==((Point2D)obj).x && this.y==((Point2D)obj).y;
		else
			return false;
	}
	
	public int calculateDistance(Point2D point) {
		int xCo = (int)Math.pow((point.x-this.x), 2);
		int yCo = (int)Math.pow((point.y-this.y), 2);
		int distance = (int)Math.sqrt(xCo+yCo);
		return distance;
	}
}
