package LocalesComerciales.repositorio;

import LocalesComerciales.modelo.Almacen;

import java.util.ArrayList;
import java.util.List;

public class AlmacenListRepositorio implements AlmacenRepositorio{
    private List<Almacen> dataSource;

    public AlmacenListRepositorio() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Almacen> listar() {
        return dataSource;
    }

    @Override
    public Almacen porId(int id) {
        Almacen result = null;
        for(Almacen alm: dataSource){
            if(alm.getId() != null && alm.getId().equals(id)){
                result = alm;
                break;
            }
        }
        return result;
    }

    @Override
    public void crear(Almacen almacen) {
        this.dataSource.add(almacen);
    }

    @Override
    public void editar(Almacen almacen) {
        Almacen a = this.porId(almacen.getId());
        a.setName(almacen.getName());
        a.setAdress(almacen.getAdress());
        a.setLocalNumber(almacen.getLocalNumber());
        a.setProductsType(almacen.getProductsType());
    }

    @Override
    public void eliminar(int id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}

