package com.singtel;

import com.singtel.model.Dolphin;
import com.singtel.util.Constant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DolphinTest extends BaseTestUtil{
    @Test
    void test_Dolphin_canSwim_Successful() {
        new Dolphin().swim();
        Assertions.assertEquals(Constant.DOLPHIN_IS_SWIMMING, byteArrayOutputStream.toString()
                .trim());
    }

}
