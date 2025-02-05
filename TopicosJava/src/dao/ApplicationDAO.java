package dao;

import dao.entity.Producto;
import dao.repository.ext.ProductoDAO;

import java.sql.SQLException;
import java.util.List;

public class ApplicationDAO {
    public static void main(String[] args) throws SQLException {

        //ClienteDAO clienteDAO = new ClienteDAO();
        ProductoDAO productoDAO = new ProductoDAO();

        try {
            //System.out.println(clienteDAO.listarTodosLosClientes());
            /*List<Producto> productos = productoDAO.listarProductsos();
            for (Producto producto : productos) {
                System.out.println(producto);
            }
            System.out.println("|---------------ALL-------------------!");
            System.out.println("|-----------------------------------!");
            int registoAEliminar = 5;
            productoDAO.deleteProducto(registoAEliminar);

            System.out.println("|-----------------DELETED reg " + registoAEliminar + "------------------!");
            System.out.println("|-----------------------------------!");

            List<Producto> productos2 = productoDAO.listarProductsos();
            for (Producto producto : productos2) {
                System.out.println(producto);
            }*/

            Producto ProducdoARegistrar = new Producto();
            ProducdoARegistrar.setIdProducto(101);
            ProducdoARegistrar.setCodigoProducto("FR-100");
            ProducdoARegistrar.setNombre("Mac 14 pro MAX");
            ProducdoARegistrar.setIdGama(4);
            ProducdoARegistrar.setCantidadEnStock(500);
            ProducdoARegistrar.setPrecioVenta(2000.00);

            Producto productoRegistrado=productoDAO.registrarProducto(ProducdoARegistrar);
            System.out.println("productoRegistrado = " + productoRegistrado);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            //clienteDAO.cerrarRecursos();
            productoDAO.desconectarDataBase();
        }


    }
}
