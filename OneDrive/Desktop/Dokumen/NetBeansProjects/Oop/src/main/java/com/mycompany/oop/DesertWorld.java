/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop;

/**
 *
 * @author Carl Dave
 */
public class DesertWorld extends World {
    
    // Get desert monster by index (0-2: minions, 3: boss)
    @Override
    public MonsterInfo getMonster(int index) {
        String[] names = {
            "Bandit", 
            "Scorpion Beast", 
            "Fire Snake",
            "Giant Sand Worm"
        };
        String[] descriptions = {
            "A ruthless human armed with dagger and sword.",
            "Heavy melee attacker with a deadly poison sting.",
            "A serpent spitting fireballs from the desert heat.",
            "A colossal serpent that burrows underground!\nIt strikes with devastating ferocity!"
        };
        int[] hpValues = {35, 45, 40, 150};
        boolean[] isBoss = {false, false, false, true};
        
        if (index >= names.length) return null;
        return new MonsterInfo(names[index], descriptions[index], hpValues[index], isBoss[index]);
    }
    
    // Total monsters in desert (3 minions + 1 boss)
    @Override
    public int getTotalMonsters() {
        return 4;
    }
    
    // Desert exploration text
    @Override
    public String getExplorationText() {
        return "Sun-scorched sands stretch endlessly before you.\n" +
               "Ruins whisper of ancient trials and ambushes.\n\n" +
               "What will you do?";
    }
    
    // Desert cleared celebration
    @Override
    public String getClearedIntro() {
        return "════════════════════════\n" +
               "DESERT OF TRIALS CONQUERED!\n" +
               "════════════════════════\n" +
               "The Giant Sand Worm has been slain!\n" +
               "The desert grows calm, and travelers can pass safely once more.\n" +
               "But the darkest challenge still awaits...";
    }
    
    // Transition to final world cutscene
    public String getTransitionToFinalWorld() {
        return "Beyond the last dune, the desert ends abruptly.\n" +
               "━━━━━━━━━━━━━━━━━━━━━━━━━\n" +
               "Before you looms a massive fortress of black stone.\n" +
               "Shadow and lightning twist around its towers.\n" +
               "The Dark Citadel—Malakar's domain.\n" +
               "━━━━━━━━━━━━━━━━━━━━━━━━━\n";
    }
}