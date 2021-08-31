package com.singtel;

import com.singtel.model.ClownFish;
import com.singtel.util.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClownFishTest extends BaseTestUtil{
    @Test
    void test_ClownFish_canJoke_Successful() {
        new ClownFish().joke();
        Assertions.assertEquals(Constant.CLOWNFISH_CAN_JOKE, byteArrayOutputStream.toString()
                .trim());
    }

    @Test
    void test_ClownFish_size_color_Successful() {
        ClownFish clownFish = new ClownFish();
        Assertions.assertEquals(Constant.Size.SMALL, clownFish.size );
        Assertions.assertEquals(Constant.Color.ORANGE, clownFish.color );
    }
}
