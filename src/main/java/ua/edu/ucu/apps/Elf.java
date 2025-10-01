package ua.edu.ucu.apps;

public class Elf extends Character {

    public Elf() {
        super(10, 10, new ElfKickStrategy());
    }

    @Override
    public String toString() {
        return "Elf{hp=" + getHp() + ", power=" + getPower() + "}";
    }
    

}