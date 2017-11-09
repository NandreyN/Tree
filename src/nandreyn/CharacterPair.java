package nandreyn;

public class CharacterPair implements Comparable<CharacterPair> {
    private String value;

    CharacterPair(String toSet)
    {
        if (toSet.length() != 2)
            throw new IllegalArgumentException("String length is not 2");

        value = toSet.substring(0,2);
    }

    public String toString()
    {
        return value;
    }
    @Override
    public int compareTo(CharacterPair o) {
        String oStr = o.toString();
        for (int i = 0; i < value.length();i++)
        {
            if (value.charAt(i) < oStr.charAt(i))
                return -1;
            else if (value.charAt(i) > oStr.charAt(i))
                return 1;
        }
        return 0;
    }
}
