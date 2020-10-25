package com.novasystem.web.gugudan;

public class GugudanMain {

    public boolean gogoGugu(int gugu) {
        return printGugudan(gugu);
    }

    private boolean printGugudan(int gugu) {
        printTitle(gugu);
        printGugu(gugu);

        return true;
    }

    private void printTitle(int gugu) {
        System.out.println(gugu + " dan");
    }

    private void printGugu(int gugu) {
        for(int i = 1; i < 9; i++) {
            printer((i + " * " + gugu + " = " + i*gugu));
        }
    }

    private void printer(String obj) {
        System.out.println(obj);
    }

}
