/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lino4000
 */
public class GameControl implements Runnable {
    private final List<List<Integer>> pillars;
    private final List<Integer> peaces;
    private Integer to;
    
    public GameControl(Integer pillars, Integer peaces){
        this.pillars = new ArrayList<>();
        this.peaces = new ArrayList<>();
        for(Integer i = pillars; i>0; i--){
            this.pillars.add(new ArrayList<>());
        }
        for(Integer i = peaces; i>0; i--){
            this.peaces.add(i);
        }

    }
    
    public void start(Integer from, Integer to){
        this.to = to - 1;
        peaces.forEach((Integer p) -> {
            GameControl.this.pillars.get(from - 1).add(p);
        });
        this.getPillars();
    }
    
    public void move(Integer from, Integer to){
        this.pillars.get(to).add(
                this.pillars.get(from).get(this.pillars.get(from).size() -1 )
        );
        this.pillars.get(from).remove(this.pillars.get(from).size() -1 );
        this.getPillars();
    }
    
    public List<List<Integer>> getPillars(){
        return this.pillars;
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
