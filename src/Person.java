public class Person {

    private String name;//field called name

    //constructor
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("You are hereby now known as: " + name);
    }

    public String sayHello(){

        System.out.println("Hello " + name);
        return "Hello " + name;
        //TODO: print a message to the console using the person's name
    }

    public String hajimemashite(String greeting) {//attempting to call a method into new method
        return sayHello() + greeting;
    }
    public static void main(String[] args) {
        Person classmate = new Person("Quetzalcoatl");//Object basics
        classmate.sayHello();
        classmate.setName("cheeky fellow");
        System.out.println(classmate.hajimemashite(" for the first time"));


        Person person1 = new Person("John");//Understanding references
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));//do this
        System.out.println(person1 == person2);//not this



    }

}
