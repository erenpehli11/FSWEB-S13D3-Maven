package org.example;

public class Main {

    public static void main(String[] args) {
        // Person Sınıfı Testi
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen()); // false

        // Wall Sınıfı Testi
        Wall wall = new Wall(5, 4);
        System.out.println("Area: " + wall.getArea()); // 20.0
        wall.setHeight(-1.5);
        System.out.println("Width: " + wall.getWidth()); // 5.0
        System.out.println("Height: " + wall.getHeight()); // 0.0
        System.out.println("Area: " + wall.getArea()); // 0.0
    }
}

class Person {
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;
    
    // Additional instance variables
    private String email;
    private String phoneNumber;
    private String address;

    // Constructor for firstname, lastname, age
    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, "Unknown", "Unknown", "Unknown"); // Constructor chaining
    }

    // Overloaded constructor with additional parameters
    public Person(String firstName, String lastName, int age, String email, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}

class Wall {
    // Instance variables
    private double width;
    private double height;

    // Constructor for width and height
    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    // Methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }
}
