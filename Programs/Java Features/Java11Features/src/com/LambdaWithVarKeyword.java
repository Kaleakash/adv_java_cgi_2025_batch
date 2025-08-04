package com;

import java.util.Arrays;

public class LambdaWithVarKeyword {

	public static void main(String[] args) {
		Arrays.asList(1,2,3,4,5,6,7,8,9,10).stream().forEach((var n)->System.out.println(n));	

	}

}
