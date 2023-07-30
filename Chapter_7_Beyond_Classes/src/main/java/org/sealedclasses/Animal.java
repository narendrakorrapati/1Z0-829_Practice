package org.sealedclasses;

public sealed class Animal implements SealedInterface permits Animal.Lion{ //permits Animal.Lion is optional

    final class Lion extends Animal {

    }
}
