package jdbc;

import jdbc.conexion.ConexionDB;

import java.sql.*;

public class Application {
    public static void main(String[] args) throws SQLException {
        Connection conexion = ConexionDB.getConnection();

        //QueriesDB.getData(conexion);
        //QueriesDB.buscarClientePorCodigo(conexion,4);
        //QueriesDB.buscarClientesPorEmpleado(conexion,11);
        //QueriesDB.getProductosParaReponer(conexion,30);
        QueriesDB.getProductosGama(conexion,"Herramientas");

        ConexionDB.cerrarConexion(conexion);

    }


}

