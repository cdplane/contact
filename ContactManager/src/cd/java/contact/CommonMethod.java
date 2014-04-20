package cd.java.contact;

import java.util.*;

public class CommonMethod {
	private int count = 4;
	private int maxRan = 62;
	private char [] randoms = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
								'h', 'i', 'j', 'k', 'l', 'm', 'n',
								'o', 'p', 'q',      'r', 's', 't',
								'u', 'v', 'w',      'x', 'y', 'z',
								'A', 'B', 'C', 'D', 'E', 'F', 'G',
								'H', 'I', 'J', 'K', 'L', 'M', 'N',
								'O', 'P', 'Q',      'R', 'S', 'T',
								'U', 'V', 'W',      'L', 'M', 'N',
								'0', '1', '2', '3', '4', '5', '6',
								'7', '8', '9'
							  };
	
	public String MakeValidate(){
		Random rand = new Random();
		StringBuffer validate = new StringBuffer("");
		int index;
		
		for(int i=0; i<count; i++){
			index = Math.abs(rand.nextInt(maxRan));
			
			if(index >= 0 && index < randoms.length){
				validate.append(randoms[index]);
			}
		}
		
		return validate.toString();
	}
}
