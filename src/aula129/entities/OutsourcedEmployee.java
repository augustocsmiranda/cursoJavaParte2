package aula129.entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee(Double additionalCharge) {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valurPerHouse, Double additionalCharge) {
        super(name, hours, valurPerHouse);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }
}
