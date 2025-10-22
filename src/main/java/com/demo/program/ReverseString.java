package com.demo.program;

public class ReverseString {
	
	private void psvm() {
		// TODO Auto-generated method stub

		String str = "SagarJ";
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		System.out.println("Reversed String : "+rev);
		
	}

}
