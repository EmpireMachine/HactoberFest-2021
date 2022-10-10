package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Get_Stairs_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> path = getStairsPaths(t);
        System.out.println(path);
	}

	private static ArrayList<String> getStairsPaths(int t) {
		// TODO Auto-generated method stub
		if( t== 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		else if(t<0) { 
			ArrayList<String> res = new ArrayList<>();
			return res;
		} 
		ArrayList<String> path1 = getStairsPaths(t-1);
		ArrayList<String> path2 = getStairsPaths(t-2);
		ArrayList<String> path3 = getStairsPaths(t-3);
		
		ArrayList<String> paths = new ArrayList<>();
		for(String path: path1) {
			paths.add(1+path);
		}
		for(String path: path2) {
			paths.add(2+path);
		}
		for(String path: path3) {
			paths.add(3+path);
		}
		return paths;
	}

}
