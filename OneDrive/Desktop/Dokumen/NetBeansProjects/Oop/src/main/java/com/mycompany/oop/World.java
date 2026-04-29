/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Carl Dave
 */
public abstract class World {
    
    // Unified MonsterInfo class for all worlds
    public static class MonsterInfo {
        public String name;
        public String description;
        public int hp;
        public boolean isBoss;
        
        public MonsterInfo(String name, String description, int hp, boolean isBoss) {
            this.name = name;
            this.description = description;
            this.hp = hp;
            this.isBoss = isBoss;
        }
    }
    
    // Abstract methods that all worlds must implement
    public abstract MonsterInfo getMonster(int index);
    public abstract int getTotalMonsters();
    public abstract String getExplorationText();
    public abstract String getClearedIntro();
}