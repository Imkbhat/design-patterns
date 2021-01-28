package com.luv2codeinjava.builder;

public enum Crust {
	
	THIN {
		public float getCost() {
			return 70;
		}
	}, STUFFED {
		public float getCost() {
			return 90;
		}
	};
	
	public abstract float getCost(); 
}
