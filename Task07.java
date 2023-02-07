package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		if (x > 0) { x = Math.pow(x, 2);
		}
		if (y > 0) { y = Math.pow(y, 2);
		}
		if (z > 0) { z = Math.pow(z, 2);
		}
		System.out.println("x, y, z");
		if (x < 0) { x = Math.pow(x, 4);
		}
		if (y < 0) { y = Math.pow(y, 4);
		}
		if (z < 0) { z = Math.pow(z, 4);
		}
		System.out.println("x, y, z");
		
	}
}