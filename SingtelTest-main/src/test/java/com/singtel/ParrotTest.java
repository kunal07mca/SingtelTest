package com.singtel;

import com.singtel.model.Cat;
import com.singtel.model.Dog;
import com.singtel.model.Parrot;
import com.singtel.model.Rooster;
import com.singtel.util.SoundEnum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParrotTest extends BaseTestUtil {

    @Test
    void test_Parrot_LiveWith_Dog_Successful() {
        new Parrot(new Dog()).sing();
        Assertions.assertEquals(SoundEnum.DOG.getSound(), byteArrayOutputStream.toString()
                .trim());
    }

    @Test
    void test_Parrot_LiveWith_Cat_Successful() {
        new Parrot(new Cat()).sing();
        Assertions.assertEquals(SoundEnum.CAT.getSound(), byteArrayOutputStream.toString()
                .trim());
    }
    @Test
    void test_Parrot_LiveWith_Rooster_Successful() {
        new Parrot(new Rooster()).sing();
        Assertions.assertEquals(SoundEnum.ROOSTER.getSound(), byteArrayOutputStream.toString()
                .trim());
    }
}
