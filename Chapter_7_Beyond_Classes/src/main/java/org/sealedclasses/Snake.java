package org.sealedclasses;

public sealed class Snake permits Cobra{ //permits Cobra is optional if the subclass is in the same java file
}

final class Cobra extends Snake {

}
