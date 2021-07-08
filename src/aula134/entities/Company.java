package aula134.entities;

public class Company extends TaxPayer{
    
    private Integer numberOfEmployeers;

    public Company(){

    }

    /*public Company(int numberOfEmployeers) {
        this.numberOfEmployeers = numberOfEmployeers;
    }*/

    public Company(String name, Double anualIncome, Integer numberOfEmployeers) {
        super(name, anualIncome);
        this.numberOfEmployeers = numberOfEmployeers;
    }

    public Integer getNumberOfEmployeers() {
        return numberOfEmployeers;
    }

    public void setNumberOfEmployeers(Integer numberOfEmployeers) {
        this.numberOfEmployeers = numberOfEmployeers;
    }

    @Override
    public double tax() {
        
        //double basicTax;

        if(getNumberOfEmployeers() > 10){
            return getAnualIncome() * 0.14;
        }else{
            return getAnualIncome() * 1.16;
        }

        //return 0;
    }


}
