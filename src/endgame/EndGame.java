/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package endgame;

/**
 *
 * @author Admin
 */
public class EndGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Heroe blackPanter=new Heroe("Black Panter","Ser el rey de Wakanda","Garras de Vibranium");
        Villano galactus=new Villano("Galactus","Devorar mundos","Silver Surfer");
        Avenger iroMan=new Avenger("Tony Stark","Genio, Filantropo, mulimillonario, playboy","Mark 42","Prime");
        Thanos thanos=new Thanos("Thanos","El titán loco","Ejercito Chitaury","Gemas del infinito");
        
        //aplicando polimorfismo
        
        Personaje[]personajes={blackPanter,galactus,iroMan,thanos};
        for(Personaje personaje:personajes){
            personaje.atacar();
        }
        
        //método especifico de avenger
        ((Avenger)iroMan).reunirse();
        
        //ejemplo método especifico de thanos
        thanos.chasquearDedos();
        
    }
    
}
