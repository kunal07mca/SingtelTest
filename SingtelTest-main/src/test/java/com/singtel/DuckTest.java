package com.singtel;

import com.singtel.model.Chicken;
import com.singtel.model.Duck;
import com.singtel.util.Constant;
import com.singtel.util.SoundEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuckTest extends BaseTestUtil{
    @Test
    void test_Duck_CanTalk_Successful() {
        new Duck().sing();
        Assertions.assertEquals(SoundEnum.DUCK.getSound(), byteArrayOutputStream.toString()
                .trim());
    }

    @Test
    void test_Duck_CanSing_Successful() {
        new Duck().sing();
        Assertions.assertEquals(SoundEnum.DUCK.getSound(), byteArrayOutputStream.toString()
                .trim());
    }
    @Test
    void test_Duck_CanWalk_Successful() {
        new Duck().walk();
        Assertions.assertEquals(Constant.I_AM_WALKING, byteArrayOutputStream.toString()
                .trim());
    }
    @Test
    void test_Duck_CanSwim_Successful() {
        new Duck().swim();
        Assertions.assertEquals(Constant.I_AM_SWIMMING, byteArrayOutputStream.toString()
                .trim());
    }
}
