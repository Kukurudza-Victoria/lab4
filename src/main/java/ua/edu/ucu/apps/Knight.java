package ua.edu.ucu.apps;

public class Knight extends Noble{

    public Knight () {
        super(2, 12, 2, 12);
    }

    @Override
    public String toString() {
        return "Knight{hp=" + getHp() + ", power=" + getPower() + "}";
    }

}

