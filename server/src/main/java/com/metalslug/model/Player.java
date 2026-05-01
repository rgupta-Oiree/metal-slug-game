package com.metalslug.model;

public class Player {
    public int id;
    public float x;
    public float y;
    public int health;
    public int ammo;
    public float velocityX;
    public float velocityY;
    public boolean jumping;
    public String name;

    public Player(int id, String name, float x, float y) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = 100;
        this.ammo = 30;
        this.velocityX = 0;
        this.velocityY = 0;
        this.jumping = false;
    }

}