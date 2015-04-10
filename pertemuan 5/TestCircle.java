public class TestCircle{
	public static void main(String[] args) {
		circle cahya = new circle();
		circle ardi = new circle(20);
		circle akbar = new circle(20,"merah");

		System.out.println("Radius = "+ cahya.radius+"Color ="+ cahya.color +"Luas = "+ cahya.getArea());
		System.out.println("Radius = "+ ardi.radius +"Color ="+ ardi.color +"Luas = "+ ardi.getArea());
		System.out.println("Radius = "+ akbar.getRadius() +"Color ="+ akbar.getColor() +"Luas = "+ akbar.getArea());
	}
}
