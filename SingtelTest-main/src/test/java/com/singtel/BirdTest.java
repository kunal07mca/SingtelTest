package com.singtel;

import com.singtel.model.Bird;
import com.singtel.util.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirdTest extends BaseTestUtil{

    @Test
    void test_Bird_CanWalk_Successful() {
        new Bird().walk();
        Assertions.assertEquals(Constant.I_AM_WALKING, byteArrayOutputStream.toString()
                .trim());
    }

    @Test
    void test_Bird_CanSing_Successful() {
        new Bird().sing();
        Assertions.assertEquals(Constant.I_AM_SINGING, byteArrayOutputStream.toString()
                .trim());
    }
}
