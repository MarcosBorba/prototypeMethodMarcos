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
public abstract class MotoPrototype {
    
    private String modelo;
    private String cor;
    private String ano;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public String showInformation() {
       return "Modelo:" + this.getModelo()+ "\nCor:"+ this.getCor()+ "\nAno: " + this.getAno();
        
    } 
 
    public abstract MotoPrototype getClone();
}
