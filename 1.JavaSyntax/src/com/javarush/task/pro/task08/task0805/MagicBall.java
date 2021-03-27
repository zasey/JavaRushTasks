package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        int random = new Random().nextInt(8);
        String ans = null;
        if (random == 0) ans = CERTAIN;
        else if (random == 1) ans = DEFINITELY;
        else if (random == 2) ans = MOST_LIKELY;
        else if (random == 3) ans = OUTLOOK_GOOD;
        else if (random == 4) ans = ASK_AGAIN_LATER;
        else if (random == 5) ans = TRY_AGAIN;
        else if (random == 6) ans = NO;
        else if (random == 7) ans = VERY_DOUBTFUL;
        else ans = null;
        return ans;
    }
}
