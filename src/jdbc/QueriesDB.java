package jdbc;

import java.sql.*;

public class QueriesDB {
    public static void getData(Connection conexion) throws SQLException {

        try {
            Statement stmt = conexion.createStatement();
            ResultSet r = stmt.executeQuery("SELECT * FROM cliente");
            while (r.next()) {
                int i = r.getInt(1);
                String s = r.getString(3);
                String c = r.getString(8);

                System.out.println("Registro = " + i + " " + s + "\t\t " + c);
            }
            stmt.close();
            r.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void buscarClientePorCodigo(Connection conexion, int codicoCliente) throws SQLException {

        try {
            Statement stmt = conexion.createStatement();
            ResultSet r = stmt.executeQuery("SELECT * FROM cliente WHERE codigo_cliente=" + "'" + codicoCliente + "'");
            while (r.next()) {
                int i = r.getInt(1);
                String s = r.getString(3);
                String c = r.getString(8);

                System.out.println("Registro = " + i + " " + s + "\t\t " + c);
            }
            stmt.close();
            r.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void buscarClientesPorEmpleado(Connection conexion, int idEmpleado) {

        try {
            Statement stmt = conexion.createStatement();
            ResultSet r = stmt.executeQuery("SELECT * FROM cliente WHERE id_empleado=" + "'" + idEmpleado + "'");
            while (r.next()) {
                int i = r.getInt(1);
                String s = r.getString(3);
                String c = r.getString(8);

                System.out.println("Registro = " + i + " " + s + "\t\t " + c);
            }
            stmt.close();
            r.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static void getProductosParaReponer(Connection conexion, int numeroStock) {

        try {
            Statement stmt = conexion.createStatement();
            ResultSet r = stmt.executeQuery("SELECT * FROM producto WHERE cantidad_en_stock <" + "'" + numeroStock + "'");
            while (r.next()) {
                int i = r.getInt(1);
                String s = r.getString(3);
                String c = r.getString(8);

                System.out.println("Registro = " + i + " " + s + "\t\t " + c);
            }
            stmt.close();
            r.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void getProductosGama(Connection conexion, String nombreGama) {

        try {
            PreparedStatement pStmt = conexion.prepareStatement(
                    "SELECT" +
                            " p.codigo_producto," +
                            " p.nombre," +
                            " g.id_gama," +
                            " g.gama" +
                            " FROM producto p" +
                            " INNER JOIN gama_producto g ON g.id_gama=p.id_gama" +
                            " WHERE g.gama=?"
            );
            pStmt.setString(1, nombreGama);
            ResultSet r = pStmt.executeQuery();

            while (r.next()) {
                int a = r.getInt(1);
                String i = r.getString(2);
                int s = r.getInt(3);
                String c = r.getString(4);

                System.out.printf("Codigo producto: %d - nombre product: %s -  id_gama: %d - gama: %s ", a, i, s, c + "\n");
            }
            pStmt.close();
            r.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
