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
public class HondaPrototype extends MotoPrototype{
    
    public HondaPrototype(){
        setModelo("PCX 150");
        setCor("Branca");
        setAno("2016");
    }
    
    protected HondaPrototype(HondaPrototype hondaPrototype) {
        
        this.setModelo(hondaPrototype.getModelo());
        this.setCor(hondaPrototype.getCor());
        this.setAno(hondaPrototype.getAno());
                
    }
    
    @Override
    public MotoPrototype getClone() {
        return new HondaPrototype(this);
    }
    
}
