package POO;

public class Revista extends ItemBiblioteca implements Catalogable {

    private String nombreRevista;
    private int nroEdicion;
    private int cantidadEjemplares;

    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
        }
   }

   public void devolver(){
        cantidadEjemplares ++;
   }

   public void obtenerInformacion(){
       System.out.printf("Nombre el libro %"+nombreRevista);
   }


    @Override
    public void catalogable() {

    }
}
