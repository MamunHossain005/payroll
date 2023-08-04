package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary; //base salary per week

    //constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    //set base salary amount
    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    //return base salary amount
    public double getBaseSalary(){
        return baseSalary;
    }

    //calculate earnings
    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    //return string representation of BasePlusCommissionEmployee object

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f%n", "base salaried employee", super.toString(), "base salary",
                getBaseSalary());
    }
}
