import java.util.Random;

public abstract class Pieza {

    protected Random rand = new Random();

    protected float resitencia;
    protected float consumoEnergia;
    protected boolean daniado;
    protected boolean destruido;

    private Bateria bateria;

    private String nombre;

    public Pieza(String nombre, Bateria bateria) {
        this.bateria = bateria;
        this.nombre = nombre;
    }

    public void usar(float consumo){
        //restar consumo a bateria
        bateria.consumirEnergia(consumo);
        //se puede romper 30% daniar()
        //int posibilidadDaniar = (int)Math.random()*100;
        int posibilidadDaniar = rand.nextInt(100 - 1 + 1) + 1;
        if(posibilidadDaniar <= 30) daniar();
    }

    public void intentoReparo(){
        //40% posibilidad de reparar()
        //30% probablidad de destruir()
        int posibilidadReparar = rand.nextInt(100 - 1 + 1) + 1;
        int posibilidadDestruir = rand.nextInt(100 - 1 + 1) + 1;

        if(posibilidadReparar <= 40) reparar();
        else if(posibilidadDestruir <= 30) destruir();
    }

    public void daniar(){
        daniado = true;
    }
    public void reparar(){
        daniado = false;
    }
    public void destruir(){
        destruido = true;
    }

    public boolean isDaniado(){
        return daniado;
    }
    public boolean isDestruido(){
        return destruido;
    }

    public String getNombre(){
        return nombre;
    }
    public String estado() {
        return destruido ? "Destruido" : daniado ? "Dañado" : "Bien";
    }
}

