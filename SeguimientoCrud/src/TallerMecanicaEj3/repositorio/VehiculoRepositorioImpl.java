package TallerMecanicaEj3.repositorio;

import TallerMecanicaEj3.modelo.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class VehiculoRepositorioImpl implements VehiculoRepositorio {

    private final List<Vehiculo> vehiculos;

    public VehiculoRepositorioImpl(){
        vehiculos = new ArrayList<>();
    }


    @Override
    public void update(Vehiculo vehiculo) {
        Vehiculo oldVehicle = findById(vehiculo.getId());
        if(oldVehicle != null){
            vehiculos.remove(oldVehicle);
            vehiculos.add(vehiculo);
        }
    }

    @Override
    public Vehiculo findById(Integer id) {
        return vehiculos.stream()
                .filter(vehiculo -> vehiculo.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Vehiculo> findAll() {
        return vehiculos;
    }

    @Override
    public void create(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }


    @Override
    public void delete(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }
}
