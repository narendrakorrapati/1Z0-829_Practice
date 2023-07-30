package org.interfaceexample;

public interface InterfaceExample {

    int max_length = 100;

    /*
    1. Final modifier is not allowed in any of the interface method declarations
    2. If no method body, it is considered as public abstract implicitly hence conflicting modifiers should not be used (It is an Instance method)
    3. default method should contain method body. It is public implicitly hence conflicting modifiers should not be used (It is an Instance method)
    4. default method can call any Interface Instance/static methods within the body.
    5. static method/variables can be called from any method inside Interface.
    6. A static method can call a static variable/methods only within the body.
     */

    int getAbstractHeight();

    default int getExampleDefaultHeight() {
        return max_length;
    }
    default int getDefaultHeight() {
        //Following calls are legal.
        //return getAbstractHeight();
        //return getStaticHeight();
        //return getPrivateHeight();
        //return getPrivateStaticHeight();
        return max_length;
    }

    static int getStaticHeight() {
        //Following are legal calls
        //return getPrivateStaticHeight();

        return max_length;

        //Following are illegal calls
        //return getPrivateHeight();
        //return getDefaultHeight();
    }

    private int getPrivateHeight() {
        //Following calls are legal.
        //return getAbstractHeight();
        //return getStaticHeight();
        //return getPrivateHeight();
        //return getPrivateStaticHeight();
        return max_length;
    }

    private static int getPrivateStaticHeight() {
        //Following are legal calls
        //return getPrivateStaticHeight();

        return max_length;

        //Following are illegal calls
        //return getPrivateHeight();
        //return getDefaultHeight();
    }
}
