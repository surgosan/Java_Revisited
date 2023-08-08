public class person extends picasso implements interMain {
    private String name;
    private final int age;

    public void people() {  //from abstract class
        introName = name;
    }

    public String introAge() { //from abstract class
        return String.format("I am %d years old.", age);
    }

    public person(String name, int age) { //constructor
        this.name = name;
        this.age = age;
    }

    public void rename(String name) {   //set
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String details() { //get method
        return "Name: " + name + " age: " + age + ".";
    }


    protected String getName() {
        return name;
    }


    //interface methods


    public String isHappy() {
        return String.format("%b", happy);
    }

    public String amIThirsty() {
        return String.format("%b", thirsty);
    }

    public String amIHungry() {
        return String.format("%b", hungry);
    }

}
