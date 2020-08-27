package treeLoop;

public class TreeLoop {
	public static void main(String[] args) {
		int i,j;
		for ( i=0; i <= 7; i++ ) {
			for (j =1; j<= 7-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
			
		}
}
}