import java.util.*;

public class pitchers {

	static Scanner scn = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		int fastball = fastball();
		int curveball = curveball();
		int changeup = changeup();
		int p;
		int b = 0;
		int s = 0;
		int outs = 0;
		
		int i = 1;
		
		while(i <= 100) {
			System.out.println(pitch(fastball, curveball, changeup));
			i++;
			
			
			if(b < 4 || s < 3	) {
				System.out.println("Ball(1) or strike(2) or hit(3) or out(4): ");
				p =scn.nextInt();
				System.out.println("\n");
				
				if(p == 1) b++;
				else if(p == 2) s++;
				else if(p == 3){
					b = 0;
					s = 0;
				}
				else outs++;
			}
			if(b == 4) {
				System.out.println("Walk");
				System.out.println("\n");
			}
			if(s == 3) {
				System.out.println("Strike Out");
				System.out.println("\n");
				outs++;
				
			} 
			if(b >= 4 || s >= 3) {
				b = 0;
				s = 0;
			}
			System.out.println(b + " - " + s);
			System.out.println("Outs: " + outs);
			System.out.println("\n");
			
			if(outs >= 3) {
				outs = 0;
			}
		}
		
	}

	public static String pitch(int f, int c, int ch) {
		int r;
		
		r = (int) (Math.random() * 100);
		
		
		
		if(r <= f) return "Fastball";
		else if(r > f && r <= f + c) return "Curveball";
		else return "Changeup";
		
	}

	public static int fastball() {
		int f;
		System.out.println("Percent of fastballs wanted: ");
		f = scn.nextInt();
		
		return f;
	}
	
	public static int curveball() {
		int c;
		System.out.println("Percent of curveballs wanted: ");
		c = scn.nextInt();
		
		return c;
	}
	
	public static int changeup() {
		int ch;
		System.out.println("Percent of changeups wanted: ");
		ch = scn.nextInt();
		
		return ch;
	}
	
//	public static void pitchCount(int b, int s) {
//		int p;
//		if(b < 4 || s < 3	) {
//			System.out.println("Ball(1) or strike(2): ");
//			p =scn.nextInt();
//			
//			if(p == 1) b++;
//			else s++;
//		}
//	}
	
}










