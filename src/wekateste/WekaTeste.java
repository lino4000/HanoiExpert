/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekateste;

import control.GameControl;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author lino4000
 */
public class WekaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        GameControl game = new GameControl(3,7);
        game.start(1,3);

        
        
/*        DataSource ds = new DataSource("src/wekateste/vendas.arff");
        
        Instances ins = ds.getDataSet();
        
        ins.setClassIndex(3);
        
        NaiveBayes nb = new NaiveBayes();
        nb.buildClassifier(ins);
        
        Instance novo = new DenseInstance(4);
        novo.setDataset(ins);
        
        novo.setValue(0,"M");
        novo.setValue(1,"20-39");
        novo.setValue(2,"N");
        
        double probabilidade[] = nb.distributionForInstance(novo);
        
        System.out.println("Sim : " + probabilidade[1]);
        System.out.println("Não : " + probabilidade[0]);
*/    }
    
}
