package pl.jbaranska.comparing.comparing2;

public class Animal implements Comparable<Animal>{
    private String type ;
    private String name ;
    private Object r;

    public Animal(String type, String name, Object r) {
        this.type = type;
        this.name = name;
        this.r = r;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Object getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", r=" + r +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        int result = o.compareTo(this);
        return result;
    }
}
