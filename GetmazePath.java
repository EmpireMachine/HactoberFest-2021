package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> paths = getMazePath(1,1,n,m);
        System.out.println(paths);
	}
//sr = source row and sc = source coloum 
//dr = destination row and vice versa;
	
	private static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc) {
		// TODO Auto-generated method stub
		if(sr == dr &&  sc == dc) {
			ArrayList<String> r = new ArrayList<>();
			r.add("");
			return r;
		}
		ArrayList<String> horPaths = new ArrayList<>();
		ArrayList<String> verPaths = new ArrayList<>();
		if(sc<dc) {
			horPaths = getMazePath(sr,sc+1,dr,dc);
		}
		if(sr<dr) {
			verPaths = getMazePath(sr+1,sc,dr,dc);
		}
		ArrayList<String> paths = new ArrayList<>();
		for(String path : horPaths) {
			paths.add("h"+path);
		}
		for(String path: verPaths) {
			paths.add("v"+path);
		}
		return paths;
	}

}
