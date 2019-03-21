/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motocicletas;

/**
 *
 * @author marcos
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    HondaPrototype prototypoHonda = new HondaPrototype();
                   
    MotoPrototype moto1 = prototypoHonda.getClone();     
   
    moto1.setModelo("Biz 125");
    moto1.setCor("Azul");
    moto1.setAno("2014");
    
     
    MotoPrototype moto2 = prototypoHonda.getClone();
    
    moto2.setModelo("Fan 150");
    moto2.setCor("preta");
    moto2.setAno("2015");
 
    System.out.println(moto1.showInformation());
    System.out.println("########################");
    System.out.println(moto2.showInformation());
    }
    
}
