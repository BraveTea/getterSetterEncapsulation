public class Programme {

    // I am going to try and write getters and setters with private variables
    // and see if getters and setters can help with that
    //The goal is to write a setter and a getter that will assign the vars
    //but to make it impossible to assign them without those methods (get set)

    public static void main(String[] args){
        System.out.println("Blah");
        Student student1 = new Student();
        student1.setName("Beastmaster");
        System.out.println(student1.getName());
    }

}

class Student{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

