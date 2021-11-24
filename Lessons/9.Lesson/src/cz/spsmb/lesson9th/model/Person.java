package cz.spsmb.lesson9th.model;

public class Person {
    private String name;
    private PersonType personType;

    public Person(String name, PersonType personType) {
        this.name = name;
        this.personType = personType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personType=" + personType +
                '}';
    }
}
