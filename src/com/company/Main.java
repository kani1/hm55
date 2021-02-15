package com.company;

public class Main {

    public static void main(String[] args) {


        Boss boss= new Boss();
        boss.setHealth(400);
        boss.setDamage(40);
        boss.setDefenceType("magic");
        System.out.println("Boss health: "+boss.getHealth()+" "+ "Boss damage: " +
                boss.getDamage()+ " "+" Boss defence type: "+ boss.getDefenceType());

        for (Hero i:createHeroes()) {
            System.out.println(i);
        }
    }


    public static Hero[] createHeroes(){
        Hero warrior= new Hero(300,20, "Physical");
        Hero kinetic= new Hero(200,30, "magic");
        Hero golem= new Hero(100,40,"mental");
      return new Hero[]{warrior,kinetic,golem};
    }
}
