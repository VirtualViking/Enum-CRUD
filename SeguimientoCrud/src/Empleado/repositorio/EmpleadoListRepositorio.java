package Empleado.repositorio;

import Empleado.modelo.Empleado;
import LocalesComerciales.modelo.Almacen;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoListRepositorio implements  EmpleadoRepositorio {
    private List<Empleado> dataSource;

    public EmpleadoListRepositorio(){
        this.dataSource = new ArrayList<>();
    }
    @Override
    public List<Empleado> listar() {
        return dataSource;
    }

    @Override
    public Empleado porId(Integer accessId) {
        Empleado x = null;
        for(Empleado emp: dataSource){
            if(emp.getAccessId() != null && emp.getAccessId().equals(accessId)){
                x = emp;
                break;
            }
        }
        return x;
    }

    @Override
    public void crear(Empleado empleado) {
        this.dataSource.add(empleado);
    }

    @Override
    public void editar(Empleado empleado) {
        Empleado e = this.porId(empleado.getAccessId());
        e.setName(empleado.getName());
        e.setId(empleado.getId());
        e.setSalary(empleado.getSalary());
        e.setPost(empleado.getPost());
    }

    @Override
    public void eliminar(Integer accessId) {
        this.dataSource.remove(this.porId(accessId));
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }

}
