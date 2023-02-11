public class Student extends Person {
    protected String program;
    protected int year;
    protected double fee;
    Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }
    String getProgram() {
        return program;
    }
    void setProgram(String program) {
        this.program = program;
    }
    int getYear() {
        return year;
    }
    void setYear(int year) {
        this.year = year;
    }
    double getFee() {
        return fee;
    }
    void setFee(double fee) {
        this.fee = fee;
    }
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}
