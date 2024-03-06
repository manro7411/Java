class Programmer extends Employee{
    //overloading method 
    public void skill(){
        System.out.println("Don't have any programmer skill");
    } 
    public void skill(String language){
        System.out.println("Skills : "+language);
    }
    public void skill(String num1,String num2){
        System.out.println("Skill : "+num1+""+num2);
    }
    public void skill(String...language){
        for (int i = 0; i < language.length; i++) {
            System.out.println("Skills :"+language[i]);
        }
    }
    //overridding -> inheritance methond 
    public void bonus(){
        System.out.println("Bonus = 20");
    }
    // public String skill = "Java Programming";
    // public Programmer(String name,Double salary){
    //     super(name,name, salary);
    //     System.out.println("I'm programmar.Moreover,i've used it for 10 years");
    // }
    
}
