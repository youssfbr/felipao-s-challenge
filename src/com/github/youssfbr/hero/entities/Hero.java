package com.github.youssfbr.hero.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hero {
    private String name;
    private Integer level;
    private final List<String> levels = new ArrayList<>(Arrays.asList(
            "Ferro",
            "Bronze",
            "Prata",
            "Ouro",
            "Platina Diamante",
            "Ascendente",
            "Imortal",
            "Radiante"
    ));

    public Hero(String name , Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    private String getHeroLevel(final int level) {

        String nameLevel;

        if (level < 1000)        nameLevel = levels.get(0);
        else if (level <= 2000)  nameLevel = levels.get(1);
        else if (level <= 5000)  nameLevel = levels.get(2);
        else if (level <= 7000)  nameLevel = levels.get(3);
        else if (level <= 8000)  nameLevel = levels.get(4);
        else if (level <= 9000)  nameLevel = levels.get(5);
        else if (level <= 10000) nameLevel = levels.get(6);
        else                     nameLevel = levels.get(7);

        return nameLevel;
    }

    @Override
    public String toString() {
        return "O Herói de nome **"
                + getName()
                + "** está no nível de **"
                + getHeroLevel(getLevel())
                + "**";
    }
}
