package RecursionAndBacktracking;

import java.util.Scanner;

public class PrintStairsPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintStairPaths(n,"");
        
	}

	private static void PrintStairPaths(int n, String paths) {
		// TODO Auto-generated method stub
		if(n<0)
		{
			return ;
		}
		if(n==0) {
			System.out.println(paths);
			return ;
		}
		PrintStairPaths(n-1,paths+"1");
		PrintStairPaths(n-2,paths+"2");
		PrintStairPaths(n-3,paths+"3");
		
	}
	

}
