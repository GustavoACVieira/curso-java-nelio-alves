package src.Section10;

public class EmployeeEx84 {
    private Integer ID;
    private String name;
    private Double salary;

    //construtor
    public EmployeeEx84 (Integer ID, String name, Double salary) {
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }

    //getters e setters
    public Integer getID () {
        return ID;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Double getSalary () {
        return salary;
    }

    public void setSalary (Double salary) {
        this.salary = salary;
    }

    //metodo
    public void increaseSalary (double percent) {
        salary += salary * (percent / 100);
    }

    //toString
    @Override
    public String toString () {
        return ID
                + ", "
                + name
                + ", "
                + salary;
    }
}
