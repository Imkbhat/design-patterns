package com.luv2codeinjava.builder;

public enum Size {
	
	SMALL {
		public float getCost() {
			return 100;
		}
		
	},MEDIUM {
		public float getCost() {
			return 150;
		}
		
	}, LARGE {
		public float getCost() {
			return 200;
		}
	};
	
	public abstract float getCost();

}
