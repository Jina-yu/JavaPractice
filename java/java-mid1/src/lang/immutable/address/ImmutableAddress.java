package lang.immutable.address;

public class ImmutableAddress {
    private final String value; //주소 보관

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
