package Empleado;

import Empleado.modelo.Empleado;
import Empleado.repositorio.EmpleadoListRepositorio;
import Empleado.repositorio.EmpleadoRepositorio;
import LocalesComerciales.modelo.Almacen;

import java.util.List;
import java.util.Scanner;

public class MainViewEmpleado {
    public static void main(String[] args) {
        String opc = "1";
        EmpleadoRepositorio empRep = new EmpleadoListRepositorio();

        do{
            Scanner x= new Scanner(System.in);
            System.out.println("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar \n 5. Contar \n 6. Salir \n =>");
            opc = x.next();
            switch(opc){
                case "1":{
                    System.out.println("Ingrese su nombre: ");
                    String nom = x.next();
                    System.out.println("Ingrese su identificacion: ");
                    String cc = x.next();
                    System.out.println("Ingrese su salario fijo: ");
                    Integer salary = x.nextInt();
                    System.out.println("Ingrese el cargo actual: ");
                    String post = x.next();
                    empRep.crear(new Empleado(nom,cc,salary,post));
                    break;
                }
                case "2":{
                    List<Empleado> empleadoList = empRep.listar();
                    empleadoList.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("Ingrese el id para inicio de sesion: ");
                    int i = x.nextInt();
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nam = x.next();
                    System.out.print("Ingrese su nueva identificacion: ");
                    String cc = x.next();
                    System.out.println("Ingrese su salario fijo: ");
                    int salary = x.nextInt();
                    System.out.println("Ingrese su cargo actual:");
                    String post = x.next();
                    Empleado Actualizar = new Empleado(nam,cc,salary,post);
                    Actualizar.setAccessId(i);
                    empRep.editar(Actualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id de inicio de sesion: ");
                    Integer id = x.nextInt();
                    empRep.eliminar(id);
                    empRep.listar().forEach(System.out::println);
                    break;
                }
                case "5":{
                    System.out.println("===== total ===== ");
                    System.out.print("Total registros: " + empRep.total());
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        }while (opc != "6");
    }
}
