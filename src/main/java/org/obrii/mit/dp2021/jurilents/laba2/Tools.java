package org.obrii.mit.dp2021.jurilents.laba2;

import java.util.List;
import java.util.Random;

public class Tools {
    public static <T> T getRandomItemFrom(T[] array) {
        if (array == null || array.length == 0) return null;
        if (array.length == 1) return array[0];
        return array[randomInt(0, array.length - 1)];
    }

    public static <T> T getRandomItemFrom(List<T> array) {
        if (array == null || array.size() == 0) return null;
        if (array.size() == 1) return array.get(0);
        return array.get(randomInt(0, array.size() - 1));
    }

    public static int randomInt(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }
}
