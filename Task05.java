package lt.lhu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double s;
		double t;
		a=6;
		b=4;
		c=3;
		s= Math.pow(b, 2) +4*a*c;
		t= (b+ Math.sqrt(s))/ (2*a);
		double e;
		e= Math.pow(a, 3) * c + b;
		double f;
		f = t - e;
			
		System.out.println("f="+f);
	}

}
