/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Carl Dave
 */
import java.util.Random;

public class Darius extends Hero {
    private Random rand = new Random();

    public Darius() {
        super("Darius",
              180, //HP
              80, // MANA
              "Sword & Shield"); //WEAPON
    }

    @Override
    public String[] getSkillList() {
        return new String[]{
            "Shield Bash (10–15 dmg, -20 Mana)",
            "Power Strike (20–30 dmg, -25 Mana)",
            "Battle Cry (+20 HP, -10 Mana)"
        };
    }

    @Override
    public int useSkill(int index) {
        int dmg = 0;
        switch (index) {
            case 0:
                if (mana < 20) return -1;
                mana -= 20;
                dmg = 10 + rand.nextInt(6);
                break;
            case 1:
                if (mana < 25) return -1;
                mana -= 25;
                dmg = 20 + rand.nextInt(11);
                break;
            case 2:
                if (mana < 10) return -1;
                mana -= 10;
                hp += 20;
                break;
        }
        return dmg;
    }
}