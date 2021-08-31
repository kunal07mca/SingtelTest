package com.singtel;

import com.singtel.model.Rooster;
import com.singtel.util.SoundEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.singtel.util.LanguageEnums.GERMAN;

public class RoosterTest extends BaseTestUtil{
    @Test
    void test_Rooster_Successful() {
        new Rooster().sing();
        Assertions.assertEquals(SoundEnum.ROOSTER.getSound(), byteArrayOutputStream.toString()
                .trim());
    }
    @Test
    void test_Rooster_sing_in_Germany_Successful() {
        new Rooster(GERMAN).sing();
        Assertions.assertEquals(GERMAN.getTranslation(), byteArrayOutputStream.toString()
                .trim());
    }
}
