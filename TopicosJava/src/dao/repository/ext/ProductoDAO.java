package dao.repository.ext;

import dao.entity.Producto;
import dao.repository.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends DAO {

    public List<Producto> listarProductsos() throws Exception {

        String sql = "SELECT id_producto, nombre, cantidad_en_stock FROM producto";
        consultarDataBase(sql);
        List<Producto> productos = new ArrayList<>();
        while (resultSet.next()) {
            Producto producto = new Producto();
            producto.setIdProducto(resultSet.getInt("id_producto"));
            producto.setNombre(resultSet.getString("nombre"));
            producto.setCantidadEnStock(resultSet.getInt("cantidad_en_stock"));
            productos.add(producto);
        }
        return productos;


    }

    public Producto registrarProducto(Producto producto) throws Exception {
        String sql = "INSERT INTO producto (id_producto, codigo_producto, nombre, id_gama, cantidad_en_stock, precio_venta) VALUES ('"

                + producto.getIdProducto() + "', '"
                + producto.getCodigoProducto() + "', '"
                + producto.getNombre() + "', '"
                + producto.getIdGama() + "', '"
                + producto.getCantidadEnStock() + "', '"
                + producto.getPrecioVenta() + "')";
        insertarModificarEliminarDataBase(sql);

        return buscarProducto(producto.getIdProducto());


    }

    public Producto buscarProducto(int idProducto) throws Exception {
        String sql = "SELECT id_producto, codigo_producto, nombre, id_gama, cantidad_en_stock, precio_venta FROM producto WHERE id_producto=" + idProducto;
        consultarDataBase(sql);
        Producto producto = new Producto();
        while (resultSet.next()) {
            producto.setIdProducto(resultSet.getInt("id_producto"));
            producto.setCodigoProducto(resultSet.getString("codigo_producto"));
            producto.setNombre(resultSet.getString("nombre"));
            producto.setIdGama(resultSet.getInt("id_gama"));
            producto.setCantidadEnStock(resultSet.getInt("cantidad_en_stock"));
            producto.setPrecioVenta(resultSet.getDouble("precio_venta"));
        }

        return producto;

    }

    public void deleteProducto(int idProducto) throws Exception {
        String sql = "DELETE FROM producto WHERE id_producto = " + idProducto;
        insertarModificarEliminarDataBase(sql);
    }

    @Override
    public void desconectarDataBase() throws SQLException {
        super.desconectarDataBase();
    }
}
