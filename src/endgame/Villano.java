/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package endgame;

/**
 *
 * @author Admin
 */
public class Villano extends Personaje {
    protected String ejercito;

    public Villano(String nombre, String poder,String ejercito) {
        super(nombre, poder);
        this.ejercito = ejercito;
    }
    
    @Override
    public void atacar(){
      System.out.println(nombre + " comanda a su ejercito para atacar");  
    }
}
