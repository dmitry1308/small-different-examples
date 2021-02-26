package shchepin.examples.enums;

import java.io.Serializable;

public abstract class EnumClass<E extends java.lang.Enum<E>>
        implements Comparable<E>, Serializable {

    private final String name;

    public final String name() {
        return name;
    }

    private final int ordinal;

    public final int ordinal() {
        return ordinal;
    }

    protected EnumClass(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }
}