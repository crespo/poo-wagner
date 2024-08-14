public class Customer implements Person {
    String name;
    String id;
    String address;
    Double totalSpent;

    public Customer() {
    }

    public Customer(String name, String id, String address, Double totalSpent) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.totalSpent = totalSpent;
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

    public Double getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(Double totalSpent) {
        this.totalSpent = totalSpent;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", totalSpent=" + totalSpent +
                '}';
    }
}
