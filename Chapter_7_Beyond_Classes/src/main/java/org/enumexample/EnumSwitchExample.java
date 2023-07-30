package org.enumexample;

public class EnumSwitchExample {

    public static void main(String[] args) {

        Season1 summer = Season1.SUMMER;

        switch (summer) {
            case WINTER: //We should not prefix the Enum type as compiler already know it in line 9 switch(summer)
                System.out.print("Get out the sled!");
                break;
            case SUMMER:
                System.out.print("Time for the pool!");
                break;
            default:
                System.out.print("Is it summer yet?");
        }

        switch (summer) {
            //case Season.WINTER: //does not compile
                //System.out.print("Get out the sled!");
                //break;
            //case 0: //Does not compile, we can't use Ordinal to compare Enum
                //System.out.print("Time for the pool!");
                //break;
            default:
                System.out.print("Is it summer yet?");
        }

    }
}
