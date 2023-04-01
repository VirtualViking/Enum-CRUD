package TallerMecanicaEj3;

import TallerMecanicaEj3.modelo.Vehiculo;
import TallerMecanicaEj3.repositorio.VehiculoRepositorio;
import TallerMecanicaEj3.repositorio.VehiculoRepositorioImpl;

import java.util.List;
import java.util.Scanner;

public class VehiculoMain {
    public static void main(String[] args) {
        String opc = "1";
        VehiculoRepositorio repVeh = new VehiculoRepositorioImpl();
        do {
            Scanner x = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = x.next();
            switch (opc) {
                case "1": {
                    System.out.println("Id de ingreso: ");
                    Integer id = x.nextInt();
                    System.out.println("Tipo de vehiculo: ");
                    String carType = x.next();
                    System.out.println("Placa: ");
                    String plate = x.next();
                    System.out.println("Problema/falla/anomalia: ");
                    String fail = x.next();
                    repVeh.create(new Vehiculo(id,carType,plate,fail ));
                    break;
                }
                case "2": {
                    List<Vehiculo> productos = repVeh.findAll();
                    productos.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("id  producto: ");
                    Integer id = x.nextInt();
                    System.out.print("Ingrese el tipo de vehiculo: ");
                    String type = x.next();
                    System.out.print("Ingrese la placa: ");
                    String plate = x.next();
                    System.out.print("Fallo/problema/anomalia: ");
                    String fail = x.next();
                    Vehiculo update = new Vehiculo(id,type,plate,fail);
                    repVeh.update(update);
                    break;
                }
                case "4" : {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = x.nextInt();
                    repVeh.delete(repVeh.findById(id));
                    repVeh.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
        }
    }while(opc != "5");
}}
