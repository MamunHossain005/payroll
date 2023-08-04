package employee;

//Employee abstract superclass
public abstract class Employee {
    private final String firsName;
    private final String lastName;
    private final String socialSecurityNumber;

    //constructor
    public Employee(String firsName, String lastName, String socialSecurityNumber){
        this.firsName = firsName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    //return first name
    public String getFirsName(){
        return firsName;
    }

    //return last name
    public String getLastName(){
        return lastName;
    }

    //return social security number
    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    //return string representation of Employee object
    @Override
    public String toString(){
       return String.format("%s %s%n%s: %s", getFirsName(), getLastName(), "social security number",
               getSocialSecurityNumber());
    }

    //abstract method must be overridden by concrete subclasses
    public abstract double earnings(); //no implementation here
}
