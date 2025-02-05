package dao.service;

import dao.entity.Cliente;
import dao.repository.ext.ClienteDAO;

import java.util.List;

public class ClienteServicio {
    private ClienteDAO cd;
    public  ClienteServicio(){
        this.cd =  new ClienteDAO();
    }
    public Cliente crearNuevoCliente(int codigoC, String nombre, String nombreContacto, String apellidoContacto,
                                     String telefono, String fax, String ciudad, String region, String pais, String codigoPostal,
                                     int idEmpleado, double limiteCredito) throws Exception {
        // Validaciones - Pueden estar metodo independiente.
        validacionesNyA(nombreContacto, apellidoContacto);
        Cliente cliente = new Cliente(codigoC, nombre, nombreContacto, apellidoContacto, telefono, fax, ciudad, region,
                pais, codigoPostal, idEmpleado, limiteCredito);
        cd.guardarCliente(cliente);
        return cliente;
    }

    public List<Cliente> listarClientes() throws Exception {
        return cd.listarTodosLosClientes();
    }

    public Cliente buscarCliente(int idCliente) throws Exception {
        return  cd.buscarCliente(1);
    }

    public void validacionesNyA(String nombreContacto, String apellidoContacto) throws Exception{
        if (nombreContacto == null) {
            throw new Exception("El nombre del contacto no puede ser nulo.");
        }
        if (apellidoContacto == null) {
            throw new Exception("El apellido del contacto no puede ser nulo.");
        }
    }
}
