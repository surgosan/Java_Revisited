public class musician extends person {

    private final String instrument;

    public musician(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
    }

    public String details() {
        return String.format("Name: %s, age: %d, instrument: %s", super.getName(), super.getAge(), instrument);
    }

    public String toString() {
        return "I am music";
    }
}
