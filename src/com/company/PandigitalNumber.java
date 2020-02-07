package com.company;

import java.io.IOException;
import java.util.*;

public class PandigitalNumber {
    private inputFile fileInput;
    public void setFileInput(inputFile fileInput) {
        this.fileInput = fileInput;
    }

    public boolean checkPandigital() throws IOException {
        //System.out.println();
        // Checking length is less than base
        PandigitalNumber isPN = new PandigitalNumber();
        String[] s = fileInput.input();
        int b = Integer.parseInt(s[0]);
        String n = s[1];
        isPN.setFileInput(new inputFile());

        if (n.length() < b)
            return false;

        boolean hash[] = new boolean[b];
        Arrays.fill(hash, false);

        // Traversing each digit of the number.
        for (int i = 0; i < n.length(); i++) {

            // If digit is integer
            if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
                if(n.charAt(i) - '0' >= b) return false;
                hash[n.charAt(i) - '0'] = true;
            }

                // If digit is alphabet
            else if (n.charAt(i) - 'A' <= b - 11) {
                if(n.charAt(i) - 'A' + 10 >= b) return false;
                hash[n.charAt(i) - 'A' + 10] = true;
            }
        }

        // Checking hash array, if any
        // index is unmarked.
        for (int i = 0; i < b; i++)
            if (hash[i] == false)
                return false;

        return true;
    }

}
