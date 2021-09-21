package com.company;

public class Knight extends Character{

    public Knight(){
        super(new KnifeBehavior());
    }


    @Override
    public void display() {
            System.out.println("I am Knight");
    }

}
