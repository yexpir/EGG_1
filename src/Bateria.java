public class Bateria {
    private float energia = Float.MAX_VALUE;
    public void consumirEnergia(float consumo){
        energia -= consumo;
    }
}
