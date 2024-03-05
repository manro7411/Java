class Employee {
    public String id;
    public String name;
    public Double salary;

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
        System.out.println("ID : "+this.id);
        System.out.println("NAME : "+this.name);
        System.out.println("SALARY : "+this.salary);
    }

    
    
}
