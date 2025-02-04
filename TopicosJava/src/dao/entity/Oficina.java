package dao.entity;

public class Oficina {
    private int idOficna;
    private String codigoOficna;
    private String ciudad;
    private String pais;
    private String region;
    private String codigoPostal;
    private String telefono;


    public Oficina() {
    }

    public Oficina(String codigoOficna, String ciudad, String pais, String region, String codigoPostal, String telefono) {
        this.codigoOficna = codigoOficna;
        this.ciudad = ciudad;
        this.pais = pais;
        this.region = region;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }

    public Oficina(int idOficna, String codigoOficna, String ciudad, String pais, String region, String codigoPostal, String telefono) {
        this.idOficna = idOficna;
        this.codigoOficna = codigoOficna;
        this.ciudad = ciudad;
        this.pais = pais;
        this.region = region;
        this.codigoPostal = codigoPostal;
        this.telefono = telefono;
    }

    public int getIdOficna() {
        return idOficna;
    }

    public void setIdOficna(int idOficna) {
        this.idOficna = idOficna;
    }

    public String getCodigoOficna() {
        return codigoOficna;
    }

    public void setCodigoOficna(String codigoOficna) {
        this.codigoOficna = codigoOficna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Oficina{" +
                "idOficna=" + idOficna +
                ", codigoOficna='" + codigoOficna + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                ", region='" + region + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
