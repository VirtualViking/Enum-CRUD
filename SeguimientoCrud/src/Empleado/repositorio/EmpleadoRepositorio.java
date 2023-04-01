package Empleado.repositorio;

import Empleado.modelo.Empleado;

import java.util.List;

public interface EmpleadoRepositorio {
    List<Empleado> listar();
    Empleado porId(Integer accessId);
    void crear(Empleado empleado);
    void editar(Empleado empleado);
    void eliminar(Integer accessId);

    int total();


}
