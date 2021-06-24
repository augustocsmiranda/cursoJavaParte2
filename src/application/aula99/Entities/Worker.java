package application.aula99.Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import application.aula99.Entities.enums.WorkerLevel;

public class Worker {
    
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    //Não inserir no constructor e adicionar lista.
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    //Não necessário
    /*public void setContracts(List<HourContract> contracts) {
        this.contracts = contracts;
    }*/

    //Implementar métodos

    //Adicionar Contrato associado ao trabalhador
    public void addContract(HourContract contract){
        contracts.add(contract);
    }

    //Remover Contrato informado associado ao trabalhador
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    //Calcular baseado em ano e Mês dos contratos
    public Double income(int year, int month){
        double sum = baseSalary;

        //percorrer contratos do Mês e ano e entrar na soma (sum)
        Calendar cal = Calendar.getInstance();
        for(HourContract c: contracts){
            //PEgar data do contrato, e definiu como data do calendario
            cal.setTime(c.getDate());
            //Verificar Mês e ano para valor do contrato entrar na folha de pagamento
            int c_year = cal.get(Calendar.YEAR);
            //Adicionar +1 por que janeiro começa com 0
            int c_month = 1 + cal.get(Calendar.MONTH);

            //Verificar se o contrato é o mesmo mês e do mesmo ano
            if(year == c_year && month == c_month){
                sum += c.totalValue();
            }
        }
        return sum;

    }

}
