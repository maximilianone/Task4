import java.io.*;
import java.util.ArrayList;
import java.util.List;


abstract public class CustomEnum<T extends CustomEnum<T>> implements Comparable<T>, Serializable {
    private final String name;
    private final int ordinal;
    public static List<CustomEnum> values = new ArrayList<>();

    protected CustomEnum(String name, int ordianal) {
        this.name = name;
        this.ordinal = ordianal;
        values.add(this);
    }

    public final String name() {
        return this.name;
    }

    public final int ordinal() {
        return this.ordinal;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

    @Override
    public final int compareTo(T comparableObj) {
        if (this.getClass() != comparableObj.getClass()) {
            throw new ClassCastException();
        } else {
            return this.ordinal - comparableObj.ordinal();
        }
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override
    protected final void finalize() {
    }

    public static CustomEnum valueOf(String name) {
        if (name != null) {
            for (CustomEnum enumField : values) {
                if (enumField.name().equals(name)) {
                    return enumField;
                }
            }
            throw new IllegalArgumentException("No such name in enum: " + name);
        }
        throw new NullPointerException("No name to search");
    }

    public static List<CustomEnum> values() {
        return values;
    }

    private void readObject(ObjectInputStream readObj) throws IOException, ClassNotFoundException {
        throw new InvalidObjectException("can't deserialize enum");
    }

}