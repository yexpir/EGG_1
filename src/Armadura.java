import java.awt.*;

public class Armadura {
    private Color colorPrimario;
    private Color colorSecundario;
    private String material;
    private int vidaMaxima; //Resistencia determinada por el material
    private int vidaActual; //Salud

    private Bateria bateria;

    private Casco casco;
    private Guante guanteL;
    private Guante guanteR;
    private Bota botaL;
    private Bota botaR;

    public Armadura() {
        casco = new Casco(this);
        bateria =  new Bateria();
        guanteL = new Guante("Guante Izq.", bateria);
        guanteR = new Guante("Guante Der.", bateria);
        botaL =  new Bota("Bota Izq.", bateria);
        botaR =  new Bota("Bota Der.", bateria);
    }

    public void iniciar(){
        casco.menu();
    }

    public void caminar(){
        botaL.usar(5);
        botaR.usar(5);
        System.out.println("Caminando!");
    }

    public void correr(){
        botaL.usar(10);
        botaR.usar(10);
        System.out.println("Corriendo!");
    }

    public void propulsar(){
        botaL.usar(10);
        botaR.usar(10);
        System.out.println("Propulsando!");
    }

    public void volar(){
        botaL.usar(10);
        botaR.usar(10);
        guanteL.usar(10);
        guanteR.usar(10);
        System.out.println("Volando!");
    }

    public void revisar(){

    }
    public void estadoArmadura(){
        System.out.println("ARMADURA\n" +
                "ad.,sfAtD2yAS");
    }
    public void estadoBateria(){

    }
}
