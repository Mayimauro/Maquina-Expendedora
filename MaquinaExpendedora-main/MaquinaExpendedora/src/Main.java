import Model.Boleto;
import Model.MES;

import java.util.Scanner;

public class Main {
    static Scanner teclado;
    public static void main(String[] args) {
        teclado = new Scanner(System.in);

        //MAQUINA 1
        MES maquina1 = new MES(130.0,true,1,0.0,13000.0);
        System.out.println("MAQUINA EXPENDEDORA");
        System.out.println("Bienvenido!");
        System.out.println("Solo se aceptan billetes de 10, 20, 50, 100.");

        //BOLETO 1
        int montoIngresado = 0;
        int billete = 0;

        do {
            System.out.println("Ingrese un billete: ");
            billete = teclado.nextInt();
            billete = maquina1.verificarMonto(billete);
            if(billete != -1)
            {
                montoIngresado += billete;
            }
            else {
                System.out.println("Ingrese un billete valido.");
            }
        }while(montoIngresado < maquina1.getPrecioActual());

        Boleto boleto = new Boleto(maquina1.getPrecioActual(),montoIngresado,1,"29/03/2023");
        maquina1.registrarBoleto(maquina1,boleto);

        if(boleto.getMontoIngresado() > maquina1.getPrecioActual()) //si el usuario ingresa dinero de mas
        {
            System.out.println("Lo sentimos, la maquina se quedó con su vuelto.");
        }

        System.out.println("queda un total de : " + maquina1.boletosRestantes() + " boletos");

        System.out.println(boleto);

        teclado.close();
    }

}