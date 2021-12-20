package utils;

import java.util.Random;

public class Randoms {
    private static final Random RANDOM = new Random();

    private Randoms() {
    }

    // 범위내의 랜덤한 숫자 1개를 제공하는 메서드
    public static int nextInt(final int startInclusive, final int endInclusive) {
        // 범위에 대한 예외 처리 로직 이 있다고 가정

        return startInclusive + RANDOM.nextInt(endInclusive - startInclusive + 1);
    }
}
