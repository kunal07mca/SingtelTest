package com.singtel;

import com.singtel.model.Shark;
import com.singtel.util.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SharkTest extends BaseTestUtil{

    @Test
    void test_Shark_canEat_Successful() {
        new Shark().eat();
        Assertions.assertEquals(Constant.SHARK_CAN_EAT, byteArrayOutputStream.toString()
                .trim());
    }

    @Test
    void test_Shark_size_color_Successful() {
        Shark shark = new Shark();
        Assertions.assertEquals(Constant.Size.LARGE, shark.size );
        Assertions.assertEquals(Constant.Color.GREY, shark.color );
    }
}
