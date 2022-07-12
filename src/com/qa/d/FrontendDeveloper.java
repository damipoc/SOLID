package com.qa.d;

public class FrontendDeveloper implements Developer{

    public void writeJavaScript(){

        System.out.println("JavaScript is used everywhere anyway.");
        
    }

    @Override
    public void develop() {
        writeJavaScript();
        
    }
}
