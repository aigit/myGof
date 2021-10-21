package org.pattern.responsebility;

public class MyTest {

    public static void main(String[] args) {
        LevelRequest levelRequest = new LevelRequest("小明",4,"肚子疼");

        Zuzhang zuzhang = new Zuzhang(Handler.DAY_ONE);
        BumenJIngli bumenJIngli = new BumenJIngli(Handler.DAY_ONE,Handler.DAY_THREE);
        Zongjingli zongjingli = new Zongjingli(Handler.DAY_THREE,Handler.DAY_SEVEN);

        zuzhang.setNextHandler(bumenJIngli);
        bumenJIngli.setNextHandler(zongjingli);

        zuzhang.submit(levelRequest);
    }
}
