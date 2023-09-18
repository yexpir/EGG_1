public class Guante extends Pieza {


    public Guante(String nombre, Bateria bateria) {
        super(nombre, bateria);
    }

    public void atacar(float danio, Enemigo enemigo){
        enemigo.daniar(danio);
    }
}
