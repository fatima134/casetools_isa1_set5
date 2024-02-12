package githubrepository;

public class fruit {
	String color;
	fruit(String color)
	
	{
		this.color=color;
	}
	public static void main(String[]args) {
		//TODO Auto-generated method stub
		fruit cherry=new fruit("green");
		String color=cherry.getcolor();
		System.out.println("color of cherry is"+color);
		
	}
	String getcolor()
	{
		return color;
	}

	
	
}



