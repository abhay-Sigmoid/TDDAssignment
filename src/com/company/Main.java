package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	    PandigitalNumber isPN = new PandigitalNumber();

	    boolean result = isPN.checkPandigital();

	    if(result) System.out.println("YES");
	    else System.out.println("NO");
    }
}
