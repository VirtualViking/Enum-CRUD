package TallerMecanicaEj3.modelo;

public class Vehiculo {
    public Integer id;
    private String carType;
    private String plate;
    private String failureInfo;

    public Vehiculo(Integer id, String carType, String plate, String failureInfo) {
        id = id;
        this.carType = carType;
        this.plate = plate;
        this.failureInfo = failureInfo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getFailureInfo() {
        return failureInfo;
    }

    public void setFailureInfo(String failureInfo) {
        this.failureInfo = failureInfo;
    }
    public String toString() {
        return "Vehiculo ->" +
                "\nId de ingreso: " + id +
                "\nTipo de vehiculo: " + carType +
                "\nPlaca: " + plate  +
                "\nDescripcion del fallo: "+failureInfo +
                "\n==========================================";

    }
}
