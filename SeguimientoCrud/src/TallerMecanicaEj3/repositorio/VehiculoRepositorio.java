package TallerMecanicaEj3.repositorio;

import TallerMecanicaEj3.modelo.Vehiculo;

import java.util.List;

public interface VehiculoRepositorio {
    Vehiculo findById(Integer id);
    List<Vehiculo> findAll();
    void create(Vehiculo vehiculo);
    void update(Vehiculo vehiculo);
    void delete(Vehiculo vehiculo);
}
