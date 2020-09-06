package com.manipal.spring_assignment;

import com.manipal.spring_assignment.point;

public class triangle {

	private point t1;
	private point t2;
	private point t3;
	public triangle(point t1, point t2, point t3) {
		super();
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}
	@Override
	public String toString() {
		return "Triangle [t1=" + t1 + ", t2=" + t2 + ", t3=" + t3 + "]";
	}
}
