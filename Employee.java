class Employee {
    private String id;
    private String name;
    private Double salary;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
    public void display(){
        // System.out.println("ID : "+this.id);
        System.out.println("NAME : "+this.name);
        System.out.println("SALARY : "+this.salary);
    }
    
    // default constructor
    public Employee(String name,String id,Double salary){
        System.out.println("create Object completed !");
        System.out.println(name);
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public Employee(){
        System.out.println("I'm employee");

    }
    public Employee(String name,Double salary){
        this.name = name;
        this.salary = salary ;
        display();
    }
    public void bonus(){
        System.out.println("Show bonus employee");
    }    //static attribute
    // static int minSalary = 12000;
}
