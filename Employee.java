public class Employee implements Person {
    String name;
    String id;
    String address;
    Double wage;


    String idEmployee;

    public Employee() {
    }

    public Employee(String name, String id, String address, Double wage, String idEmployee) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.wage = wage;
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", wage=" + wage +
                ", idEmployee='" + idEmployee + '\'' +
                '}';
    }
}
