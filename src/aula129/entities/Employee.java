package aula129.entities;

public class Employee {
    
    private String name;
    private Integer hours;
    private Double valurPerHouse;

    public Employee(){

    }

    public Employee(String name, Integer hours, Double valurPerHouse) {
        this.name = name;
        this.hours = hours;
        this.valurPerHouse = valurPerHouse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValurPerHouse() {
        return valurPerHouse;
    }

    public void setValurPerHouse(Double valurPerHouse) {
        this.valurPerHouse = valurPerHouse;
    }

    public double payment(){
        return hours * valurPerHouse;
    }
}
