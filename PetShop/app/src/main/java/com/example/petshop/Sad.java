package com.example.petshop;
import java.util.Date;
public class Sad extends Mood{

    public Sad() {
        super();
    }

    public Sad(Date moodDate) {
        super(moodDate);
    }
    public String speak() {
        return "frown";
    }
}
