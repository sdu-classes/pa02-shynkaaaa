public class Staff extends Person {
    protected String school;
    protected double pay;
    Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    String getSchool() {
        return school;
    }
    void setSchool(String school) {
        this.school = school;
    }
    double getPay() {
        return pay;
    }
    void setPay(double pay) {
        this.pay = pay;
    }
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
