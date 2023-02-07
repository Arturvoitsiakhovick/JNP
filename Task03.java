package lt.lhu.unit02.main;

public class Task03 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double res;
		double L;
		double w;
		double f;
		a=4;
		b=6;
		c=4;
		L= b-c;
		res= Math.pow(a, 2)- Math.pow(L, 2);
		w= Math.log(a)*(Math.pow(b, 2)+1);
		f = res+ w;
		
		System.out.println("f=" + f);
		

	}

}
