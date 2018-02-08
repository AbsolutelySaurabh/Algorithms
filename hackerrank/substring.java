package hackerrank;

import java.util.Scanner;

public class substring {
	
	public static String checkMetal(String str) {
		
		if(str.toLowerCase().contains("hydro") && str.toLowerCase().contains("ic")){
			
			if(str.toLowerCase().indexOf("hydro") == 0 && str.toLowerCase().lastIndexOf("ic") == (str.length()-2)) {
				
				return "non-metal acid";
			}
		}else
			if(str.toLowerCase().contains("ic")) {
				if(str.toLowerCase().lastIndexOf("ic") == (str.length()-2)) {
					
					return "polyatomic acid";
					}
				}
		return "not an acid";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(checkMetal(str));
	}

}
