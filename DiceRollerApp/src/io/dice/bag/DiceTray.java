package io.dice.bag;

import java.util.Arrays;

public class DiceTray {
	
	private int[] resultingDice;
	
	
	
	
	public void rollingDice(int sides, int numb) {
		int result = 0;
		int dice[] = new int[numb];
		boolean single = false;
		
		if(numb <=0 || sides < 2) {
			System.out.println("Invalid number of dice or sides");
		} 
		
		else if(numb == 1) {
			result = (int)(Math.random()*sides)+1;
			single = true;
			
		}else {
			for(int i = 0; i<dice.length; i++) {
				int number = (int)(Math.random()*sides)+1;
				dice[i]= number;
				
				result+=number;				
				
				setResultingDice(dice);
			}
			
			if(single == true) {
				System.out.println(Arrays.toString(this.resultingDice));
			}
			
			System.out.println("The result of your dice was " + result);
			
		}
		
		
		

	}




	public int[] getResultingDice() {
		return resultingDice;
	}




	public void setResultingDice(int[] resultingDice) {
		this.resultingDice = resultingDice;
	}


}
