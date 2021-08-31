package com.singtel;

import com.singtel.model.Butterfly;
import com.singtel.model.CaterPillar;
import com.singtel.util.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ButterFlyTest extends BaseTestUtil{

    @Test
    void test_ButterFly_canFly_Successful() {
        new Butterfly().fly();
        Assertions.assertEquals(Constant.BUTTERFLY_IS_FLYING, byteArrayOutputStream.toString()
                .trim());
    }
    @Test
    void test_CaterPillar_canCrawl_Successful() {
        new CaterPillar().walk();
        Assertions.assertEquals(Constant.CATERPILLAR_IS_CRAWLING, byteArrayOutputStream.toString()
                .trim());
    }
    @Test
    void test_CaterPillar_grow_to_ButterFly_Successful() {
        Butterfly grow = new CaterPillar().grow();
        grow.fly();
        Assertions.assertEquals(Constant.BUTTERFLY_IS_FLYING, byteArrayOutputStream.toString()
                .trim());
    }
}
