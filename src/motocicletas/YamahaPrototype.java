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
public class YamahaPrototype extends MotoPrototype{
    
    public YamahaPrototype(){
        setModelo("PCX 150");
        setCor("Branca");
        setAno("2016");
    }
    
    protected YamahaPrototype(YamahaPrototype yamahaPrototype) {
        
        this.setModelo(yamahaPrototype.getModelo());
        this.setCor(yamahaPrototype.getCor());
        this.setAno(yamahaPrototype.getAno());
                
    }
    
    @Override
    public MotoPrototype getClone() {
        return new YamahaPrototype(this);
    }
}
