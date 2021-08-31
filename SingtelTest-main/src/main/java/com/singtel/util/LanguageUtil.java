package com.singtel.util;

import java.util.Objects;

public class LanguageUtil {

    public static String translate(String sound, LanguageEnums translateInto) {

        if (Objects.isNull(translateInto)
                || !Objects.equals(sound,SoundEnum.ROOSTER.getSound())) {
            return sound;
        }
        switch (translateInto) {
            case DANISH:
                return LanguageEnums.DANISH.getTranslation();
            case DUTCH:
                return LanguageEnums.DUTCH.getTranslation();
            case FINNISH:
                return LanguageEnums.FINNISH.getTranslation();
            case FRENCH:
                return LanguageEnums.FRENCH.getTranslation();
            case GERMAN:
                return LanguageEnums.GERMAN.getTranslation();
            case GREEK:
                return LanguageEnums.GREEK.getTranslation();
            case HEBREW:
                return LanguageEnums.HEBREW.getTranslation();
            case HUNGARIAN:
                return LanguageEnums.HUNGARIAN.getTranslation();
            case ITALIAN:
                return LanguageEnums.ITALIAN.getTranslation();
            case JAPANESE:
                return LanguageEnums.JAPANESE.getTranslation();
            case PORTUGUESE:
                return LanguageEnums.PORTUGUESE.getTranslation();
            case RUSSIAN:
                return LanguageEnums.RUSSIAN.getTranslation();
            case SWEDISH:
                return LanguageEnums.SWEDISH.getTranslation();
            case TURKISH:
                return LanguageEnums.TURKISH.getTranslation();
            case URDU:
                return LanguageEnums.URDU.getTranslation();
            default:
                System.out.println("Unable to translate into: " + translateInto);
                return sound;
        }

    }
}