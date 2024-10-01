package assignment3009;

public class Triangle {
	private double s,s1,s2,s3;
	private double perimeter;
	public Triangle(double s1, double s2, double s3) {
		super();
		
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		
	}
	public void calArea()
	{
		s=(s1+s2+s3)/2;
		System.out.println("Area is "+Math.sqrt(s*(s-s1)*(s-s2)*(s-s3)));
	
	}
	public void calperi()
	{
		perimeter=s1+s2+s3;
		System.out.println("Perimeter is "+perimeter);
	}
	
	
	
	
	
}
