public class Student {
    // Private variables
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Rahul");
        s1.setAge(21);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
