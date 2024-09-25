public class Shop {
    public static void main(String[] args) {
        Employee employee = new Employee("Joao", "123.456.789-00", "Rua dos Bobos, 0", 2000.00, "1");

        Employee employee2 = new Employee();
        employee2.setName("Maria");
        employee2.setId("987.654.321-00");
        employee2.setAddress("Rua dos Bobos, 0");
        employee2.setWage(5000.00);
        employee2.setIdEmployee("0");

        System.out.println(employee);
        System.out.println(employee2);

        Customer customer = new Customer("Oliver", "876.321.678-00", "Travessa dos Sonhos Perdidos, 666", 555.66);

        Customer customer2 = new Customer();
        customer2.setName("Ceci");
        customer2.setId("213.896.546-00");
        customer2.setAddress("Travessa dos Sonhos Perdidos, 666");
        customer2.setTotalSpent(777.00);

        System.out.println(customer);
        System.out.println(customer2);
    }

}
