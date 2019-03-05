package pl.jbaranska.generics;

public class MyStringSecret {
    private String secret;

    @Override
    public String toString() {
        return "MyStringSecret{" +
                "secret='" + secret + '\'' +
                '}';
    }

    public String getSecret() {
        return secret;
    }

    public MyStringSecret(String secret) {
        this.secret = secret;
    }
}
