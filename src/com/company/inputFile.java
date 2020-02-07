package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class inputFile {
    public String[] input() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input"));
        String[] S = br.readLine().split(" ");
        return S;
    }
}
