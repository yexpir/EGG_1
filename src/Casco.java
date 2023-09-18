import java.util.Scanner;

public class Casco {
    Armadura armadura;
    private Scanner scan = new Scanner(System.in);

    public Casco(Armadura armadura) {
        this.armadura = armadura;
    }

    public void menu(){
        System.out.println("---MENU---");
        System.out.println("Que deseas Tony?");
        int seleccion = selector();

        switch (seleccion){
            case 1 : armadura.caminar();
                break;
            case 2 : armadura.correr();
                break;
            case 3 : armadura.propulsar();
                break;
            case 4 : armadura.volar();
                break;
            case 5 : armadura.revisar();
                break;
            case 6 : armadura.estadoArmadura();
                break;
            case 7 : armadura.estadoBateria();
                break;
        }
        menu();
    }

    private int selector(){
        System.out.println("1. Caminar\n" +
                "2. Correr\n" +
                "3. Propulsar\n" +
                "4. Volar\n" +
                "5. Revisar dispositivos\n" +
                "6. Estado armadura\n" +
                "7. Estado reactor");
        return scan.nextInt();
    }
}
