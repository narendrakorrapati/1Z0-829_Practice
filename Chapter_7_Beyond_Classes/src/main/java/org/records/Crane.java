package org.records;

public record Crane(int numberEggs, String name) {

    private static int type = 10;
    //public int size; // DOES NOT COMPILE
    //private boolean friendly; // DOES NOT COMPILE

    /*
     1. Records are implicitly final
     2. It provides a constructor with all the properties.
     3. Provides accessor methods with property name, in this case numberEggs() and name()
     4. Overrides Object's equals, hashCode and toString methods
     5. The compiler will not insert a constructor if you define one with the same list of parameters in the same order.
     6. All properties must be set in if constructor is provided by developer, failing to do so will fail to compile as all the fields are final
     7. You cannot add instance fields outside the record declaration, even if they are private
     8. Can override the implicit methods
     9. Records also do not support instance initializers. All initialization for the fields of a record must happen in a constructor.
     */

    /*
    public record Crane(int numberEggs, String name) {
        public Crane(int numberEggs, String name) {} // DOES NOT COMPILE, it should all fields because they are final
    }
    */
    //Like enums, that means you can’t extend or inherit a record.
    //public record BlueCrane() extends Crane {} // DOES NOT COMPILE

    /*Also like enums, a record can implement a regular or sealed interface, provided it implements
    all the abstract methods.
    public interface Bird {}
    public record Crane(int numberEggs, String name) implements Bird {}

     */

    /*
    This is compact constructor, it is called first before calling the compiler provided
    It is used to validate the parameters and transform the parameters
     */
    public Crane {
        if (name == null || name.length() < 1)
            throw new IllegalArgumentException();
        name = name.substring(0,1).toUpperCase()
                + name.substring(1).toLowerCase(); //Refers to input parameters not instance variables
        //this.numberEggs = 10; // DOES NOT COMPILE Can't set instance variables in compact constructor
    }

    /*
    Following is an overloaded constructor, it should do a call to main constructor provided by compiler
     */
    public Crane(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }

    public Crane(int numberEggs, String firstName, String lastName) {
        this(numberEggs + 1, firstName + " " + lastName);
        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
        //this.numberEggs = 20; // DOES NOT COMPILE
    }


    @Override
    public int numberEggs() {
        return 10;
    }
    @Override
    public String toString() {
        return name;
    }

}
