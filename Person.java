public class Person {
    // Attributes
    String name;
    String city;
    String gender;
    int age;
    String unique_Id;

    public static void main(String[] args) {
        // Create an object of Person
        Person person1 = new Person();

        // Assign values to attributes
        person1.name = "John Doe";
        person1.city = "New York";
        person1.gender = "Male";
        person1.age = 30;
        person1.unique_Id = "ID12345";

        // Display the values
        System.out.println("Name: " + person1.name);
        System.out.println("City: " + person1.city);
        System.out.println("Gender: " + person1.gender);
        System.out.println("Age: " + person1.age);
        System.out.println("Unique ID: " + person1.unique_Id);
    }
}
