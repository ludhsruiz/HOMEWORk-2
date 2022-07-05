package com.ironhack.homework2.main;

import com.ironhack.homework2.menu.Menu;
import com.ironhack.homework2.menu.Output;


public class Main {

    private static boolean isRunning = true;

    public static void main(String[] args) throws InterruptedException {
        Menu menu = new Menu();
        Output printer = new Output();
        printer.welcomeMessage();
        menu.controlLoop();

    }

}
