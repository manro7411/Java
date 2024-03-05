public class Main {
    public static void main(String[] args) {
        // Employee() is constructor 
        // Employee e1 = new Employee();
        // e1.setId("1");;
        // e1.setName("Ratchanon Traitiprat");
        // e1.setSalary(30000.0);
        // e1.display();
        // System.out.println(e1.getName());
        // Employee e2 = new Employee();
        // e2.setId("2");
        // e2.setName("Passapol Phukhang");
        // e2.setSalary(40000.0);
        // e2.display();
        // constructor is a special method to setting the beginning variable
        Employee e1 = new Employee("Ratchanon Traitiprat","1",30000.0);
        Employee e2 = new Employee();
        e1.display();
    }
}