package nandreyn;

public class CustomInt extends Number implements Comparable<CustomInt> {

    private int value;

    public CustomInt(int value)
    {
        super();
        this.value = value;
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return (long)value;
    }

    @Override
    public float floatValue() {
        return (float)value;
    }

    @Override
    public double doubleValue() {
        return (double)value;
    }

    @Override
    public int compareTo(CustomInt o) {
        if (value == o.doubleValue())
            return 0;
        return (value < o.doubleValue()) ? -1: 1;
    }

    public String toString()
    {
        return String.valueOf(value);
    }
}
