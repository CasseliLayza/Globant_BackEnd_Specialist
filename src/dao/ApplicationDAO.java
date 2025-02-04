package dao;

import dao.repository.ClienteDAO;

import java.sql.SQLException;

public class ApplicationDAO {
    public static void main(String[] args) throws SQLException {

        ClienteDAO clienteDAO = new ClienteDAO();
        try {
            System.out.println(clienteDAO.listarTodosLosClientes());

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            clienteDAO.cerrarRecursos();
        }


    }
}
