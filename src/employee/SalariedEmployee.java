package employee;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    //constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber,
                            double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    //set salary
    public void setWeeklySalary(double weeklySalary){
        if(weeklySalary < 0.0){
            throw new IllegalArgumentException("weekly salary must be >= 0.0");
        }
        this.weeklySalary = weeklySalary;
    }

    //return salary
    public double getWeeklySalary(){
        return weeklySalary;
    }

    //return string representation of SalariedEmployee object
   @Override
    public String toString(){
        return String.format("%s: %s%n%s: $%,.2f", "Salaried employee", super.toString(), "weekly salary",
                getWeeklySalary());
    }

    //calculate earnings
    @Override
    public double earnings() {
        return getWeeklySalary();
    }
}
