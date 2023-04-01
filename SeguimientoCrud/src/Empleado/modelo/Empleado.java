package Empleado.modelo;

public class Empleado {
    private Integer accessId;
    private String name;
    private String id;
    private int salary;
    private String post;
    private static int lastId;

    public Empleado() {
        this.accessId = ++lastId;
    }

    public Empleado(String name, String id, int salary, String post) {
        this();
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.post = post;
    }

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String toString() {
        return " Id: " + id +
                "\nNombre : " + name +
                "\nCedula: " + id +
                "\nSalario fijo:  " + salary + "$ " +
                "\nCargo: " + post + ".";
    }
}
