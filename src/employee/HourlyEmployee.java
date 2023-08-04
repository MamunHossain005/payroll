package employee;

public class HourlyEmployee extends Employee{
    private double wage; //wage per hour
    private double hours; //hours worked for week

    //constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        if(wage < 0.0){
            throw new IllegalArgumentException("wage must be >= 0.0");
        }
        if(hours < 0.0 || hours > 168){
            throw new IllegalArgumentException("hours must be >= 0.0 and <= 168");
        }
        this.wage = wage;
        this.hours = hours;
    }

    //set wage
    public void setWage(double wage){
        if(wage < 0.0){
            throw new IllegalArgumentException("wage must be >= 0.0");
        }
        this.wage = wage;
    }

    //return wage
    public double getWage(){
        return wage;
    }

    //set hours
    public void setHours(double hours){
        if(hours < 0.0 || hours > 168){
            throw new IllegalArgumentException("hours must be >= 0.0 and <= 168");
        }
        this.hours = hours;
    }

    //return hours
    public double getHours(){
        return hours;
    }

    //calculate earnings

    @Override
    public double earnings() {
        if(getHours() <= 40) return wage * hours;
        else return 40 * wage + (hours - 40) * wage * 1.5;
    }

    //return string representation of HourlyEmployee object
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %,.2f%n%s: %,.2f", "Hourly employee", super.toString(),
                "hourly wage", getWage(), "hours worked", getHours());
    }
}
