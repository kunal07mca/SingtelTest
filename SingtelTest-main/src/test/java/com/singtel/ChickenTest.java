package com.singtel;

import com.singtel.model.Chicken;
import com.singtel.util.Constant;
import com.singtel.util.SoundEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChickenTest extends BaseTestUtil {
    @Test
    void test_Chicken_CanTalk_Successful() {
        new Chicken().sing();
        Assertions.assertEquals(SoundEnum.CHICKEN.getSound(), byteArrayOutputStream.toString()
                .trim());
    }

    @Test
    void test_Chicken_CanSing_Successful() {
        new Chicken().sing();
        Assertions.assertEquals(SoundEnum.CHICKEN.getSound(), byteArrayOutputStream.toString()
                .trim());
    }
    @Test
    void test_Chicken_CanWalk_Successful() {
        new Chicken().walk();
        Assertions.assertEquals(Constant.I_AM_WALKING, byteArrayOutputStream.toString()
                .trim());
    }
}
