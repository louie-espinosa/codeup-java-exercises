public class Person {

    private String name;//field called name

    //constructor
    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {this.name = name;}
    //two-argument constructor
    public Person(String firstName, String lastName) {
        this.name = firstName  +  " " + lastName;
    }

    public String sayHello(){

        System.out.println("Hello " + name);
        return "Hello " + name;
        //TODO: print a message to the console using the person's name
    }

    public String hajimemashite(String greeting) {//attempting to call a method into new method
        return sayHello() + greeting;
    }
    //The MAIN
    public static void main(String[] args) {
        Person classmate = new Person("Feathered", "Serpent");//Object basics

        classmate.sayHello();
        classmate.setName("cheeky fellow");
        System.out.println(classmate.hajimemashite(" for the first time"));


//        Person person1 = new Person("John");//Understanding references
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));//do this
//        System.out.println(person1 == person2);//not this

//        Person person1 = new Person("John");
//        Person person2 = person1;//setting person2 to the same object, or reference as person1
//        System.out.println(person1 == person2); //this is true

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());//john
        System.out.println(person2.getName());//john
        person2.setName("Jane");//Now the name at this shared object name value is jane
        System.out.println(person1.getName());//jane
        System.out.println(person2.getName());//jane





    }
    //used code, generate, toString() to generate method toString to use to access string values of an object
    @Override
    public String toString() {
        return name;//return name in this method so that I get the string value
    }

    //getter
    public String getName() {return name;}

}
