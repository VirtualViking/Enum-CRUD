package LocalesComerciales;

import LocalesComerciales.modelo.Almacen;
import LocalesComerciales.repositorio.AlmacenListRepositorio;
import LocalesComerciales.repositorio.AlmacenRepositorio;

import java.util.List;
import java.util.Scanner;

public class MainView {
    public static void main(String[] args) {
        String opc = "1";
        AlmacenRepositorio rep = new AlmacenListRepositorio();
        do{
            Scanner s= new Scanner(System.in);
            System.out.println("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar \n 5. Contar \n 6. Salir \n =>");
            opc = s.next();
            switch(opc){
                case "1":{
                    System.out.println("Ingrese nombre del almacen: ");
                    String nam = s.next();
                    System.out.println("Ingrese direccion : ");
                    String addr = s.next();
                    System.out.println("Ingrese el numero del local");
                    int nLocal = s.nextInt();
                    System.out.println("Ingrese el tipo de productos a vender:");
                    String prod = s.nextLine();
                    rep.crear(new Almacen(nam,addr,nLocal,prod));
                    break;
                }
                case "2": {
                    List<Almacen> almac = rep.listar();
                    almac.forEach(System.out::println);
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("ingrese id del registro de almacen: ");
                    int i = s.nextInt();
                    System.out.print("ingrese nombre del almacen: ");
                    String nam = s.next();
                    System.out.print("ingrese direccion nueva: ");
                    String addr = s.next();
                    System.out.println("Ingrese el nuevo numero del local");
                    int nLocal = s.nextInt();
                    System.out.println("Ingrese el nuevo tipo de productos:");
                    String prod = s.next();
                    Almacen Actualizar = new Almacen(nam,addr,nLocal,prod);
                    Actualizar.setId(i);
                    rep.editar(Actualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro del almacen: ");
                    Integer id = s.nextInt();
                    rep.eliminar(id);
                    rep.listar().forEach(System.out::println);
                    break;
                }
                case "5" : {
                    System.out.println("===== total ===== ");
                    System.out.print("Total registros: " + rep.total());
                    break;
                }
                case "6": {
                    opc = "6";
                    break;
                }
            }
        }while(opc != "6");
    }
}
