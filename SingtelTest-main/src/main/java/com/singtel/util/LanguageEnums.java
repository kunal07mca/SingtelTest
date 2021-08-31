package com.singtel.util;

public enum LanguageEnums {
    DANISH("kykyliky"),
    DUTCH("kukeleku"),
    FINNISH("kukko kiekuu"),
    FRENCH("cocorico"),
    GERMAN("kikeriki"),
    GREEK("kikiriki"),
    HEBREW("coo-koo-ri-koo"),
    HUNGARIAN("kukuriku"),
    ITALIAN("chicchirichi"),
    JAPANESE("ko-ke-kok-ko-o"),
    PORTUGUESE("cucurucu"),
    RUSSIAN("kukareku"),
    SWEDISH("kuckeliku"),
    TURKISH("kuk-kurri-kuuu"),
    URDU("kuklooku"),
    English("Cock-a-doodle-doo");

    private final String translation;

    LanguageEnums(String language) {
        this.translation = language;
    }

    public String getTranslation() {
        return translation;
    }
}