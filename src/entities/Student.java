package entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double final_Grade() {
        return grade1 + grade2 + grade3;
    }

    public double missing_Points() {
        return 60 - final_Grade();
    }

}

