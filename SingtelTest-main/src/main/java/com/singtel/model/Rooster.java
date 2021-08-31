package com.singtel.model;

import com.singtel.util.LanguageEnums;
import com.singtel.util.LanguageUtil;
import com.singtel.util.SoundEnum;

public class Rooster extends Bird {
    LanguageEnums languageEnums;

    public Rooster(){

    }
    public Rooster(LanguageEnums languageEnums) {
        this.languageEnums =languageEnums;
    }


    @Override
    public void sing() {
        System.out.println(LanguageUtil
                .translate(SoundEnum.ROOSTER.getSound(), languageEnums));
    }
}
