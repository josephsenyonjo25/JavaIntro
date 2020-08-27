package parrotNoise;

public class Parrot {
		static boolean getUp(boolean sqwack, int currentHour) {
		if (currentHour < 6 && currentHour >= 0 ) {
			sqwack = true;
		}
		else if(currentHour > 22 || currentHour < 0 ) {
			sqwack= false;
		}
		return sqwack;
		 } 
		
		
		
	public static void main(String[] args) {
		
		for(int i = -5; i <= 24; i++ ) {
			System.out.println("Current Hour: " + i);
			System.out.println("Parrot Sqwacking "+ getUp(true,i));
		} 
			 
	 }
	}