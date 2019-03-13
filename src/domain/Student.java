package domain;

import java.util.Objects;

/**
 * @author 汪永晖
 */
public class Student implements Comparable<Student> {

    private String name;

    private int number;

    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getNumber() == student.getNumber() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getNumber());
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        int result;

        result = getNumber() - anotherStudent.getNumber();

        if (result == 0) {
            result = getName().compareTo(anotherStudent.getName());
        }

        return result;
    }
}
