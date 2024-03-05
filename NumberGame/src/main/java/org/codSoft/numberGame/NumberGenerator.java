package org.codSoft.numberGame;

import java.util.Random;

public class NumberGenerator {
    private final Random random;
    public NumberGenerator() {
        this.random = new Random();
    }
    public String numGenerator(){
        String number;
        number = String.valueOf(random.nextInt(100)+1);
        return number;
    }
}
