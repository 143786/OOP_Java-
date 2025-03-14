public class Main {
    public static void main(String[] args) {

        Player player = new Player();
        player.name = "Malik";
        player.health = 20;
        player.weapon = "Sword";
        // here we initialize those fields.


        int damage = 10;
        player.losHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        player.health =200;
        player.losHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());
    }
}





/*
Here, I didn't create a constructor in the player class,
but if you recall, a default constructor with no parameters
gets created automatically, by Java, if there are no defined
constructor. In other words, I don't have a constructor to
pass player data into, when I create a new player. This means
the calling code needs to manually set the data in these fields


 */