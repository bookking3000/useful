package HW;

public class Kreisumfang {
	static double ra;
	
	static void ueberschrift(){
		System.out.println("\n Kreisumfang \n");
	}
	
	static double umfang (double r){
		return r * 2.0 * 3.14159;
	}
	
	static double radiusA(double x){
		return x * x * 3.14159;
	}
	
	public static void main(String[] args){
		
		double r;
		double u;
		
		ueberschrift();
		
		System.out.println("r | Kreisumfrang");
		
		for (r=1;r<9;r++){
			
			u=umfang(r);
			ra=radiusA(r);
			
			System.out.print("U:" + r + " | " + u + "\n");
			System.out.print("RA:" + r + " | " + ra + "\n");
				
		}
		
	}

}
