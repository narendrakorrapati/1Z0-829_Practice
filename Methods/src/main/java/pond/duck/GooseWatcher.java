package pond.duck;

import pond.goose.Goose;

public class GooseWatcher {

    public static void main(String[] args) {

    }
    public void watch() {
        Goose goose = new Goose();
        //goose.floatInWater(); // DOES NOT COMPILE
    }

    /*
    This code doesn’t compile because we are not in the goose object. The floatInWater()
    method is declared in Bird. GooseWatcher is not in the same package as Bird, nor does
    it extend Bird. Goose extends Bird. That only lets Goose refer to floatInWater(), not
    callers of Goose
     */
}
