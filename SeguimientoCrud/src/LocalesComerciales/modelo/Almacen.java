package LocalesComerciales.modelo;

public class Almacen {
    private String name;
    private String adress;
    private int localNumber;
    private String productsType;

    private Integer id;
    private static int lastId;

    public Almacen(){
        this.id = ++lastId;
    }

    public Almacen(String name, String adress, int localNumber, String productsType) {
        this();
        this.name = name;
        this.adress = adress;
        this.localNumber = localNumber;
        this.productsType = productsType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getLocalNumber() {
        return localNumber;
    }

    public String getProductsType() {
        return productsType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setLocalNumber(int localNumber) {
        this.localNumber = localNumber;
    }

    public void setProductsType(String productsType) {
        this.productsType = productsType;
    }

    public String toString(){
        return " Id: "+id+
                "\n Nombre almacen: "+ name+
                "\n Direccion: "+ adress +
                "\n Numero del local: "+ localNumber+
                "\n Bienes o servicios: "+ productsType+".";
    }
}
