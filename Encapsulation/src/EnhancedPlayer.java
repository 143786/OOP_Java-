public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
        /*
        by this constructor, I can create a new enhanced player
        by just passing the name of the player.
         */
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
    this.weapon = weapon;
        /*
        I want to use this constructor to make sure the health
        field stays in the range of 1 to 100, with an if else
        statement.
        If a user passes a value that's less than 1, I'll just
        make the health 1. And if the constructor is passed a
        value greater than 100,


        This constructor that I added if else statement gives
        me a little more control about how a new player is
        created. Now, I could put more validation in there to
        check the length of the name or to make sure the name
        I get isn't null, for example, and likewise do some
        validation for the weapon. I won't do that right now.

        Line 7 : Let's create an overloaded constructor that doesn't
        have health or weapon because I'll set these to some
        default values. I'll edit the generated code, and
        instead chain constructor, by calling the three parameter
        passing the name value, and default values for health
        and weapon. This will make creating a new player easy,
        with only a name needed. I will make the default value
        for health to be 100.
        And I'll make the starting weapon a sword:

         */
    }

    public void losHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0 ) {
            System.out.println("Player knocked out of game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }


}
