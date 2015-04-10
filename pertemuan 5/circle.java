public class  circle {

		double radius;
		String color;

		public circle(){

			radius = 3.0;
			color = "blue";
		}

		public circle(double r){
		
			radius = r;
			color = "blue";
		}
		
		public circle(double r, String c){
		
			radius = r;
			color = c;
		}
		
		public double getRadius(){
		
			return radiusc;
		}
		
		public String getColor(){
		
			return color;
		}
		
		public double getArea(){
		
			return radius*radius*Math.PI;
		}
	}