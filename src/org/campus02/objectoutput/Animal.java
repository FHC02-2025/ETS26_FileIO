package org.campus02.objectoutput;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {

    private String name;
    private String colour;
    private int countFeet;

    public Animal(String name, String colour, int countFeet) {
        this.name = name;
        this.colour = colour;
        this.countFeet = countFeet;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", countFeet=" + countFeet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return countFeet == animal.countFeet && Objects.equals(name, animal.name) && Objects.equals(colour, animal.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, colour, countFeet);
    }
}
