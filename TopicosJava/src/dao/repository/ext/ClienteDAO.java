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
        String sql = "INSERT INTO clientes (nombre_contacto, apellido_contacto, pais) VALUES ('"

                + cliente.getNombreContacto() + "', '"
                + cliente.getApellidoContacto() + "', '"
                + cliente.getPais() + "')";
        insertarModificarEliminarDataBase(sql);
    }
    public List<Cliente> listarTodosLosClientes() throws Exception {
        String sql = "SELECT id_cliente, nombre_cliente, apellido_contacto FROM cliente";
        consultarDataBase(sql);
        List<Cliente> clientes = new ArrayList<>();
        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setIdCliente(resultSet.getInt("id_cliente"));
            cliente.setNombrecliente(resultSet.getString("nombre_cliente"));
            cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
            clientes.add(cliente);
        }

        return clientes;
    }
    public void eliminarClientePorId(int id) throws Exception {
        String sql = "DELETE FROM clientes WHERE id = " + id;
        insertarModificarEliminarDataBase(sql);
    }

    public void cerrarRecursos() throws SQLException {
        desconectarDataBase();
    }
}
