package dao;

import dao.entity.Cliente;
import dao.entity.Producto;
import dao.repository.ext.ClienteDAO;
import dao.repository.ext.ProductoDAO;
import dao.service.ClienteServicio;

import java.sql.SQLException;
import java.util.List;

public class ApplicationDAO {
    public static void main(String[] args) throws SQLException {

        ClienteDAO clienteDAO = new ClienteDAO();
        //ProductoDAO productoDAO = new ProductoDAO();

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

            /*Producto ProducdoARegistrar = new Producto();
            ProducdoARegistrar.setIdProducto(101);
            ProducdoARegistrar.setCodigoProducto("FR-100");
            ProducdoARegistrar.setNombre("Mac 14 pro MAX");
            ProducdoARegistrar.setIdGama(4);
            ProducdoARegistrar.setCantidadEnStock(500);
            ProducdoARegistrar.setPrecioVenta(2000.00);

            Producto productoRegistrado=productoDAO.registrarProducto(ProducdoARegistrar);
            System.out.println("productoRegistrado = " + productoRegistrado);*/
            //05/25
            ClienteDAO clienteDAO1 = new ClienteDAO();
            ClienteServicio clienteServicio = new ClienteServicio();

            clienteServicio.crearNuevoCliente(20,"globant","casse","layza","5555555"
            ,"515555555","Lima","Lima","Peru","51",20,50000.00);

            List<Cliente> clientes= clienteServicio.listarClientes();
            //List<Cliente> clientes= clienteDAO1.listarTodosLosClientes();

            System.out.println("!!!!!!!!!!!!!!!!!!!lista clientes !!!!!!!!!!!!!!!");
            for (Cliente cliente: clientes) {
                System.out.println(cliente);
            }
            System.out.println("!!!!!!!!!!!!!!!!!!!buscar cliente !!!!!!!!!!!!!!!");

            System.out.println(clienteServicio.buscarCliente(1));


        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            clienteDAO.cerrarRecursos();
            //productoDAO.desconectarDataBase();
        }


    }
}
