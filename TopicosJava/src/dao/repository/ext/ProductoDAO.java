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

    public void deleteProducto(int idProducto) throws Exception {
        String sql = "DELETE FROM producto WHERE id_producto = " + idProducto;
        insertarModificarEliminarDataBase(sql);
    }

    @Override
    public void desconectarDataBase() throws SQLException {
        super.desconectarDataBase();
    }
}
