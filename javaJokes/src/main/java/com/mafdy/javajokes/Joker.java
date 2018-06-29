package com.mafdy.javajokes;

import java.util.Random;

public class Joker {

    String[] jokes = new String[] {"Joke 1"," More Jokes " , "Joke 3" , "That moment when you discover that the Joke app you downloaded is not telling jokes"};
    public String getJoke() {

        Random r = new Random(4);
        return jokes[r.nextInt()];

    }

}
