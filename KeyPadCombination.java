package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> words = getKPCombinations(str);
        System.out.println(words);
	}

	static String[] codes = {
			".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
	};
	private static ArrayList<String> getKPCombinations(String str) {
		// TODO Auto-generated method stub
		if(str.length()== 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> res = getKPCombinations(ros);
		ArrayList<String> mres = new ArrayList<>();
		
		
//		for(char chcode: codes[ch-48].toCharArray()) {
//			for(String s : res) {
//				mres.add(chcode+s);
//			}
//		}
		
		String codeforch = codes[ch-'0'];
		for(int i = 0;i<codeforch.length();i++) {
			char chcode = codeforch.charAt(i);
			for(String s : res) {
				mres.add(codeforch+s);
			}
		}
		return mres;
	}

}
