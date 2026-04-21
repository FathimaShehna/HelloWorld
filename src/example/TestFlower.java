package example;

class Flower {
	
	private String name;
	private String color;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getColor() {
		return color;
	}
	 public void setColor(String color) {
		 this.color=color;
	 }
	 
	 public void display() {
		 System.out.println("The name of the flower is " +getName()+ " and its color is "+getColor());
	 }
	
}

public class TestFlower {

	public static void main(String[] args) {
		
		Flower f1 = new Flower();
		Flower f2 = new Flower();
		Flower f3 = new Flower();
		
		f1.setName("Rose");
		f1.setColor("Red");
		
		f2.setName("Lilly");
		f2.setColor("White");
		
		f3.setName("Sunflower");
		f3.setColor("Yellow");
		
		f1.display();
		f2.display();
		f3.display();
		
	}

}
