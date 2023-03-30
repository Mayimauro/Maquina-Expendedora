package Model;

public class Boleto {
    private double precioEmitido;
    private int montoIngresado; //monto que ingresa el usuario
    private int id;
    private String fecha;

    public Boleto() {
        precioEmitido = 0.0;
        montoIngresado = 0;
        id = 0;
        fecha = "";
    }

    public Boleto(double precioEmitido, int montoIngresado, int id, String fecha) {
        this.precioEmitido = precioEmitido;
        this.montoIngresado = montoIngresado;
        this.id = id;
        this.fecha = fecha;
    }

    public double getPrecioEmitido() {
        return precioEmitido;
    }

    public void setPrecioEmitido(double precioEmitido) {
        this.precioEmitido = precioEmitido;
    }

    public int getMontoIngresado() {
        return montoIngresado;
    }

    public void setMontoIngresado(int montoIngresado) {
        this.montoIngresado = montoIngresado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Datos de su boleto: " +
                "Precio emitido = " + precioEmitido +
                ", monto ingresado = " + montoIngresado +
                ", id = " + id +
                ", fecha = '" + fecha + "'.";
    }

    //METODOS
    public void verBoleto(Boleto boleto) //arreglar
    {
        System.out.println("Datos del boleto:");
        System.out.println(boleto);
    }


}
