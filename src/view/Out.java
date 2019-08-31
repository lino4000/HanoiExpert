/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author lino4000
 */
public class Out{
    
    private String s;
    
    public Out(){
        this.clr();
    }
    
    public void mainMenu(){
        s += "Bem vindo ao Hanoi Expert\n\n";
        s += "Este é uma versão do jogo hanoi para linha de comando.\n";
        s += "1- Jogar\n";
        s += "2- IA jogar\n";
        s += "3- IA treinar\n";
        s += "4- Instruções\n";
        s += "5- Créditos\n";
        s += "6- Sair\n";
       this.show();
    }

    public void instructions(){
        
    }

    public void credits(){
        
    }
    
    private void show(){
        System.out.println(s);
        this.clr();
    }

    private void clr(){
        this.s = "";
    }
}
