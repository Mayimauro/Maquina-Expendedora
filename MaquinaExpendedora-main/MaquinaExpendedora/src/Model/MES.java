package Model;

public class MES {
    private double precioActual;
    private boolean estado;
    private int id;
    private double recaudacion; //lo que recauda en el dia
    private double saldo; //tope

    public MES() {
        precioActual = 0.0;
        estado = true;
        id = 0;
        recaudacion = 0.0;
        saldo = 0.0;
    }

    public MES(double precioActual, boolean estado, int id, double recaudacion, double saldo) {
        this.precioActual = precioActual;
        this.estado = estado;
        this.id = id;
        this.recaudacion = recaudacion;
        this.saldo = saldo;
    }

    public double getPrecioActual() {
        return precioActual;
    }


    public boolean isEstado() {
        return estado;
    }

    public int getId() {
        return id;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public double getSaldo() {
        return saldo;
    }

    private void setEstado(boolean estado) {
        this.estado = estado;
    }

    //METODOS
    public int verificarMonto(int monto)
    {
        if(monto != 10 && monto != 20 && monto != 50 && monto != 100)
        {
            return -1;
        }
        else {
            return monto;
        }
    }

    public Boleto registrarBoleto(MES maquina, Boleto boleto)
    {
        if(boleto.getMontoIngresado() > maquina.saldo) //si el monto ingresado es mayor al saldo, no se ejecuta la compra y se devuelve un boleto con monto = 0
        {
            maquina.recaudacion += boleto.getMontoIngresado();
            return boleto;
        }
        else {
            maquina.recaudacion += boleto.getMontoIngresado();
            maquina.saldo -= boleto.getMontoIngresado();

            if(maquina.saldo == 0) //si no queda mas saldo en la maquina, la inhabilita
            {
               maquina.estado = false;
            }

            return boleto;
        }
    }

    //mostrar boletos restantes listortis
    public int boletosRestantes()
    {
        int boletosRestantes = 0;

        boletosRestantes = (int) (getSaldo()/getPrecioActual());

        return boletosRestantes;
    }
    //vaciarRecaudacion
    public void vaciarRecaudacion(){
        recaudacion =0;
    }
    //mostrarRecaudacion ---->>>> esto se hace con el get en el main daaaaaa
    //limpiarPantalla
}
