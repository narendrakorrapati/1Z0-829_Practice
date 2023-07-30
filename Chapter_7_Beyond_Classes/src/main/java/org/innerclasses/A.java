package org.innerclasses;

public class A {

    /*
    1. Inner classes are Instance members of Outer class
    2. They can access both instance and static members of outer class
    3. We need to create the object of Outer class to access inner classes
    4. Inner classes can have static members
    5. We can call the inner classes static members without creating an Object
     */

    private int x = 10;
    private static int y = -10;
    private static int z = 100;

    class B{
        private int x = 20;
        private static int y = -20;

        class C {
            private int x = 30;
            private static int y = -30;
            public void allTheX() {

                System.out.println(x); //30
                System.out.println(this.x); //30
                System.out.println(C.this.x); //30
                System.out.println(B.this.x); //20
                System.out.println(A.this.x); //10

                System.out.println(y); //-30
                System.out.println(B.y); //-20
                System.out.println(C.y); //-10

                System.out.println(z); //100

                printMessage("C"); //From C class, called by :C
                B.this.printMessage("C"); //From B class, called by :C
                A.this.printMessage("C"); //From A class, called by :C

                printMessageStatic("C"); //From C class static, called by :C
                B.printMessageStatic("C"); //From B class static, called by :C
                A.printMessageStatic("C"); //From A class static, called by :C
            }

            private void printMessage(String callingClass) {
                System.out.println("From C class, called by :" + callingClass);
            }

            private static void printMessageStatic(String callingClass) {
                System.out.println("From C class static, called by :" + callingClass);
            }
        }

        private void printMessage(String callingClass) {
            System.out.println("From B class , called by :" + callingClass);
        }

        private static void printMessageStatic(String callingClass) {
            System.out.println("From B class static, called by :" + callingClass);
        }
    }

    private void printMessage(String callingClass) {
        System.out.println("From A class, called by :" + callingClass);
    }

    private static void printMessageStatic(String callingClass) {
        System.out.println("From A class static, called by :" + callingClass);
    }

    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();

        c.allTheX();

        A.B.C.printMessageStatic("A");
        A.B.printMessageStatic("A");
        A.printMessageStatic("A");

        System.out.println(A.B.C.y);
        System.out.println(A.B.y);
        System.out.println(A.y);

        System.out.println(c.x);
        System.out.println(b.x);
        System.out.println(a.x);

    }
}
