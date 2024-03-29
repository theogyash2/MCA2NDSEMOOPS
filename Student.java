public class Student {
    String name;
    int rollNumber;
    String phoneNumber;
    String address;

    public Student(String name, int rollNumber, String phoneNumber, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public static void main(String[] args) {
        Student sam = new Student("Sam", 101, "123-456-7890", "123 Main St");
        Student john = new Student("John", 102, "987-654-3210", "456 Elm St");
        
        System.out.println("Details of Sam:");
        System.out.println("Name: " + sam.name);
        System.out.println("Roll Number: " + sam.rollNumber);
        System.out.println("Phone Number: " + sam.phoneNumber);
        System.out.println("Address: " + sam.address);

        System.out.println("\nDetails of John:");
        System.out.println("Name: " + john.name);
        System.out.println("Roll Number: " + john.rollNumber);
        System.out.println("Phone Number: " + john.phoneNumber);
        System.out.println("Address: " + john.address);
    }
}
