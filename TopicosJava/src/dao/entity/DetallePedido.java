package dao.entity;

public class DetallePedido {
    private int idDetallePedido;
    private int idPedido;
    private int cantidad;
    private double precioUnidad;
    private int numeroLinea;

    public DetallePedido() {
    }

    public DetallePedido(int idPedido, int cantidad, double precioUnidad, int numeroLinea) {
        this.idPedido = idPedido;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public DetallePedido(int idDetallePedido, int idPedido, int cantidad, double precioUnidad, int numeroLinea) {
        this.idDetallePedido = idDetallePedido;
        this.idPedido = idPedido;
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
        this.numeroLinea = numeroLinea;
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "idDetallePedido=" + idDetallePedido +
                ", idPedido=" + idPedido +
                ", cantidad=" + cantidad +
                ", precioUnidad=" + precioUnidad +
                ", numeroLinea=" + numeroLinea +
                '}';
    }
}


