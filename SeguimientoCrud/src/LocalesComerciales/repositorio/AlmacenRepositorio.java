package LocalesComerciales.repositorio;

import LocalesComerciales.modelo.Almacen;

import java.util.List;

public interface AlmacenRepositorio {
    List<Almacen> listar();
    Almacen porId(int id);
    void crear(Almacen almacen);
    void editar(Almacen almacen);
    void eliminar(int id);
    int total();
}
