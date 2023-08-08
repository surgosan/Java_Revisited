public abstract class picasso {
    protected String introName;

    public abstract String introAge();

    public String toString() {
        return String.format("%s. %s", introName, introAge());
    }
}
