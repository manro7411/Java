public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Employee e1 = new Employee("Ratchanon Traitiprat","1",30000.0);
        Employee e2 = new Employee();
        e1.display();
        int result = Employee.minSalary;
        System.out.println(result);
        System.out.println(Company.name+" \nFounded : "+Company.founder);
        Company.service();
        Programmer p1 = new Programmer();
        System.out.println("requirement skills : "+p1.skill);
        p1.setName("Programmer");
        p1.setSalary(40000.0);
        p1.display();

        Accounting ac = new Accounting();
        ac.setName("Wuttipong Jaihan");
        ac.setSalary(30000.0);
        ac.display();

   

    }
}