package aula125.entities;

                            //Herança
public class BussinessAccount extends Account{

    private Double loanLimit;

    public BussinessAccount(){

    }

    public BussinessAccount(Double loanLimite) {
        this.loanLimit = loanLimite;
    }

    public BussinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance);
        this.loanLimit = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimit;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimit = loanLimite;
    }

    //Creditar Emprestimo
    public void loan(double amount){
        //Validar se quantia for menos ou igual ao limite de emprestimo
        if(amount <= loanLimit){
            //deposit(amount);
            balance += amount - 10.0;

        }       
    }
}