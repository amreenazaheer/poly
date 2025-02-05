public class UndergraduateStudent extends Student {
    private int year;

    public UndergraduateStudent(String name){
        super(name, 18);
        this.year = 0;

    }

    public void setAge(int age){
        super.setAge(age);
        this.year++;
    }

    public void speak(){
        System.out.println("I am a an undergraduate student");
        System.out.println("My name is " + super.getName() + " and I am " + super.getAge() + " years old." );
    }
}
