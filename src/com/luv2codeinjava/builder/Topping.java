package com.luv2codeinjava.builder;

public enum Topping {

	PEPPERONI {
        public float getCost(){
            return 30;
        }
    }, CHICKEN{
        public float getCost(){
            return 35;
        }
    }, MUSHROOM{
        public float getCost(){
            return 20;
        }
    };

    public abstract float getCost();
}
