package com.company;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Spy;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TestPandigitalNumber {

    PandigitalNumber pn;
    @Mock
    inputFile file;
    @Spy
    inputFile file1;

    public String [] s = {
            "2", "01"
    };


    @Before
    public void setup(){
        pn = new PandigitalNumber();
        file = mock(inputFile.class);
        file1 = spy(new inputFile());
    }

    @Test
    public void inputMockTest() throws IOException {
        pn.setFileInput(file);
        when(file.input()).thenReturn(s);
        //boolean result = true;
        boolean result = pn.checkPandigital();
        //verify(file).input();
        assertTrue(result);
    }

    @Test
    public void inputSpyTest() throws IOException {
        pn.setFileInput(file1);
        doReturn(s).when(file1).input();
        boolean result = pn.checkPandigital();
        assertTrue(result);
    }

//    @Test
//    public void checkValidNumber() throws IOException {
//        boolean result = pn.checkPandigital();
//        assertFalse(result);
//    }

//    @Test
//    public void checkValidPandigitalNumber() throws IOException {
//        boolean result = pn.checkPandigital();
//        assertTrue(result);
//    }

//    @Test
//    public void checkInvalidPandigitalNumber() throws IOException {
//        boolean result = pn.checkPandigital();
//        assertFalse(result);
//    }
}
