public class encapsulation { // Making sure sensitive data is hidden.
    // Declare class vars as private.
    private String firstName; // cannot access a private var outside of class.

    // Use getters and setters method to update private vars.
    public String getName() { // Getter
        return firstName; // getter returns the value of the variable.
    }

    public void setName(String newName) { // Setter
        this.firstName = newName; // setter takes a parameter and assigns it to the var.
    } // "this" refers to the current object.

    public static void main(String[] args) {
        encapsulation newObj = new encapsulation(); // class above called "encapsulation"
        newObj.setName("Dale"); // using the setter to assing a value to the objects var.
        System.out.println(newObj.getName()); // using the getter to fetch the stored value.
    }
}
