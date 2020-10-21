public class SudokuSolver {
	
	private static int a = 0, b = 0, c = 0, d = 0;
	static int i = 0;
	static int g = 0;
	
	static int [][] numbs = {{0,9,0,0,4,0,8,0,0},{0,4,0,0,0,9,0,6,0},{0,0,0,0,0,1,7,9,0},
			{0,6,0,0,0,0,3,1,0},{0,0,0,0,0,0,0,7,0},{8,0,5,0,2,0,0,0,0},
			{9,7,0,0,0,0,1,0,0},{0,1,6,3,0,0,9,2,0},{5,0,0,0,0,0,0,0,0}};
	static int[] group = new int[9];
	
	static int[] group1 = new int[9], group2 = new int[9], group3 = new int[9], group4 = new int[9], group5 = new int[9], group6 = new int[9], group7 = new int[9], group8 = new int[9], group9 = new int[9];
	
	public static void main (String [] args) {
		System.out.print(isUnique(0,1,8));
	}
	
	static int [] block(int x, int y) {
		a = (x/3)*3;
		b = (y/3)*3;
		
		g = a + b;
		
		c = a + 3;
		d = b + 3;
		
		if(a == -1) a = 0;
		if(b == -1) b = 0;
		i = 0;
		while(a < c) {
			while(b < d) {
				group[i] = numbs[a][b];
				i++;
				b++;
			}
			a++;
			b -= 3;
		}
		
		if(g == 1) group1 = group; //broken. not working
		else if(g == 2) group2 = group;
		else if(g == 3) group3 = group;
		else if(g == 4) group4 = group;
		else if(g == 5) group5 = group;
		else if(g == 6) group6 = group;
		else if(g == 7) group7 = group;
		else if(g == 8) group8 = group;
		else if(g == 9) group9 = group;
		
		
		return group;
		
	}
	
	
	//the function below checks whether the number
	//is unique in it's row,column and block.
	//returns a boolean 
	static boolean isUnique(int x, int y, int n) {
		
		group = block(x, y);
		boolean special = true;
		
		i = 0;
		
			while(i < 9) {
				if(group[i] == n){
					special = false;
					break;
				}
				if(n == numbs[i][y]) {
					special = false;
					break;
				}
				if(n == numbs[x][i]) {
					special = false;
					break;
				}
			}
				
		return  special;
	}
}
