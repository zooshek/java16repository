package pl.jbaranska.generics;

public class MyGenericSecrets <T , P>
{
    private T object1;
    private P object2;

    public MyGenericSecrets(T object1, P object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    @Override
    public String toString() {
        return "MyGenericSecrets{" +
                "object1=" + object1 +
                ", object2=" + object2 +
                '}';
    }

    public void setObject1(T object1) {
        this.object1 = object1;
    }

    public void setObject2(P object2) {
        this.object2 = object2;
    }
}
