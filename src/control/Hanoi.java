/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;

/**
 *
 * @author lino4000
 */
public class Hanoi implements Runnable {
    private static final Scanner in = new Scanner(System.in);
    private static final Runnable jogo = new Hanoi();
    private static final Thread thread = new Thread(jogo);

    private final GameControl controller = new GameControl();
    
    public static void main(String[] args) {
        thread.start();
    }

    public Hanoi() {
        this.controller.showMainMenu();
    }

    @Override
    public void run() {
        String input;
        while(in.hasNext()){
            input = in.next();
            controller.update(input);
            if (input.equalsIgnoreCase("Q")){
                Hanoi.closeGame();
                break; // stop KeyPressThread
            }
        }
    }
    
    public static void closeGame(){
        Hanoi.thread.interrupt();
    }
}
