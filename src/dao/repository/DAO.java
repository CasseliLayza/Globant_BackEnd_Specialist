package dao.repository;

import dao.repository.conexion.ConexionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {
    protected Connection conexion = null;
    protected ResultSet resultSet = null;
    protected Statement statement = null;

    protected void connectarDataBase() {
        try {
            conexion = ConexionDB.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    protected void desconectarDataBase() throws SQLException {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conexion != null) {
                conexion.close();
            }

            System.out.println("Recursos Cerrados");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }

    protected void insertarModificarEliminarDataBase(String sql) throws Exception {
        try {
            connectarDataBase();
            statement = conexion.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());
            throw ex;
        } finally {
            desconectarDataBase();
        }
    }

    protected void consultarDataBase(String sql) throws Exception {
        try {
            connectarDataBase();
            statement = conexion.createStatement();
            resultSet = statement.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

}
