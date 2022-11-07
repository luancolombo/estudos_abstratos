package entities;

import entities_enums.Color;

public class Circle extends Shape {
		protected double radius;
		
		
	

		public Circle() {
				super();
		}
		
		
		public Circle(Color color, double radius) {
				super(color);
				this.radius = radius;
		}




	@Override
		public Double area() {
			return Math.PI * (this.radius * this.radius);
			
		}


		public double getRadius() {
			return radius;
		}


		public void setRadius(double radius) {
			this.radius = radius;
		}
	
		
		
}
