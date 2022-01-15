package lab12;

import java.util.Objects;

public class Employee {
    private final String name;

    public Employee(String aName) {
        name = aName;
    }

    @Override
    public boolean equals(Object aO) {
        if (this == aO) return true;
        if (aO == null || getClass() != aO.getClass()) return false;
        Employee employee = (Employee) aO;
        return name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Employee = " + name;
    }
}
