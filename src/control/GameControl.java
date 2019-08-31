/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.GameRulles;
import view.Out;

/**
 *
 * @author lino4000
 */
public class GameControl{
    private final Out show;
    private final GameRulles game;
    private Integer state;
    
    public GameControl() {
        this.show = new Out();
        this.game = new GameRulles();
        this.state = 0;
    }
    
    public void update(String input){
        switch(this.state){
            case 0:{
//                Integer choose = Integer.parseInt(input);
                switch(input){
                    case "1":{
                        this.state = 1;
                        game.start();
                        break;
                    }
                    case "2":{

                    }
                    case "3":{

                    }
                    case "4":{

                    }
                    case "5":{

                    }
                    case "6":{
                        Hanoi.closeGame();
                        break;
                    }
                }
                break;
            }
            case 1:{
                break;
            }
            case 2:{
                break;
            }
            case 3:{
                System.out.println("State 3");
            }
            case 4:{
                break;
            }
            case 5:{
                break;
            }
            case 6:{
                break;
            }
            case 7:{
                break;
            }
            case 8:{
            
            }
        }
    }

    public void showMainMenu() {
        show.mainMenu();
    }
    
/*
    public void start(Integer pillars, Integer peaces){
        for(Integer i = pillars; i>0; i--){
            this.pillars.add(new ArrayList<>());
        }
        for(Integer i = peaces; i>0; i--){
            this.peaces.add(i);
        }

    }

    public void settings(Integer from, Integer to){
        this.to = to - 1;
        peaces.forEach((Integer p) -> {
            GameControl.this.pillars.get(from - 1).add(p);
        });
        this.getPillars();
    }
  */  
}
