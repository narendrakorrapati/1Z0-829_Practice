package org.sealedclasses;

public sealed class Bear permits Kodiak, Panda{

    private int count = 0;
    public static void main(String[] args) {
        Bear bear = new Bear();
        System.out.println(bear.count);
    }
}
