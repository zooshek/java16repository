package pl.jbaranska.generics;

public class MySecretGenericV1 {
    private Object object;

    @Override
    public String toString() {
        return "MySecretGenericV1{" +
                "object=" + object +
                '}';
    }

    public Object getObject() {
        return object;
    }

    public MySecretGenericV1(Object object) {
        this.object = object;
    }
}
