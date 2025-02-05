package dao.repository.ext;

import dao.entity.Cliente;
import dao.repository.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends DAO {

    public ClienteDAO() {
    }

    public void guardarCliente(Cliente cliente) throws Exception {
        if (cliente == null) {
            throw new Exception("El cliente no puede ser nulo");
        }
        String sql = "INSERT INTO cliente (" +
                "codigo_cliente," +
                "nombre_cliente," +
                "nombre_contacto," +
                "apellido_contacto," +
                "telefono," +
                "fax," +
                "ciudad," +
                "region," +
                "pais," +
                "codigo_postal," +
                "id_empleado," +
                "limite_credito) VALUES ('"

                + cliente.getCodigoCliente() + "', '"
                + cliente.getNombrecliente() + "', '"
                + cliente.getNombreContacto() + "', '"
                + cliente.getApellidoContacto() + "', '"
                + cliente.getTelefono() + "', '"
                + cliente.getFax() + "', '"
                + cliente.getCiudad() + "', '"
                + cliente.getRegion() + "', '"
                + cliente.getPais() + "', '"
                + cliente.getCodigoPostal() + "', '"
                + cliente.getIdEmpleado() + "', '"
                + cliente.getLimitiCredito() + "')";
        insertarModificarEliminarDataBase(sql);
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        //String sql = "SELECT id_cliente, nombre_cliente, apellido_contacto FROM cliente";
        String sql = "SELECT * FROM cliente";
        consultarDataBase(sql);
        List<Cliente> clientes = new ArrayList<>();
        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setCodigoCliente(resultSet.getInt("codigo_cliente"));
            cliente.setNombrecliente(resultSet.getString("nombre_cliente"));
            cliente.setNombreContacto(resultSet.getString("nombre_contacto"));
            cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
            cliente.setTelefono(resultSet.getString("telefono"));
            cliente.setFax(resultSet.getString("fax"));
            cliente.setCiudad(resultSet.getString("ciudad"));
            cliente.setRegion(resultSet.getString("region"));
            cliente.setPais(resultSet.getString("pais"));
            cliente.setCodigoPostal(resultSet.getString("codigo_postal"));
            cliente.setIdEmpleado(resultSet.getInt("id_empleado"));
            cliente.setLimitiCredito(resultSet.getDouble("limite_credito"));
            clientes.add(cliente);
        }

        return clientes;
    }

    public Cliente buscarCliente(int idCliente) throws Exception {
        String sql = "SELECT * FROM cliente WHERE id_cliente=" +idCliente;
        consultarDataBase(sql);
        Cliente cliente = new Cliente();
        while (resultSet.next()) {
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setCodigoCliente(resultSet.getInt("codigo_cliente"));
            cliente.setNombrecliente(resultSet.getString("nombre_cliente"));
            cliente.setNombreContacto(resultSet.getString("nombre_contacto"));
            cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
            cliente.setTelefono(resultSet.getString("telefono"));
            cliente.setFax(resultSet.getString("fax"));
            cliente.setCiudad(resultSet.getString("ciudad"));
            cliente.setRegion(resultSet.getString("region"));
            cliente.setPais(resultSet.getString("pais"));
            cliente.setCodigoPostal(resultSet.getString("codigo_postal"));
            cliente.setIdEmpleado(resultSet.getInt("id_empleado"));
            cliente.setLimitiCredito(resultSet.getDouble("limite_credito"));
        }

        return cliente;
    }

    public void eliminarClientePorId(int id) throws Exception {
        String sql = "DELETE FROM clientes WHERE id = " + id;
        insertarModificarEliminarDataBase(sql);
    }

    public void cerrarRecursos() throws SQLException {
        desconectarDataBase();
    }
}
