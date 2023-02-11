public class Main {
    public static void main(String[] args) {
        Person person = new Person("Shyntemir", "Kaskelen, Abylai Khan street 1/2");
        Student student = new Student("Shyntemir", "Kaskelen, Abylai Khan street 1/2", "Computer Science", 1, 0);
        Staff staff = new Staff("Uchitel", "Kaskelen, Abylai Khan street 1/1", "SDU", 100000);

        System.out.println(person.getName());
        System.out.println(person.getAddress());
        person.setAddress("Moscow City, kakaya-to ulica");
        System.out.println(person);

        System.out.println(student.getProgram());
        student.setProgram("Information System");
        System.out.println(student.getYear());
        student.setYear(2);
        System.out.println(student.getFee());
        student.setFee(13000);
        System.out.println(student);

        System.out.println(staff.getSchool());
        staff.setSchool("KAIST");
        System.out.println(staff.getPay());
        staff.setPay(33347);
        System.out.println(staff);
    }
}
