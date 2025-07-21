public class Player {
    protected String name;
    protected int health;
    protected int mana;

    public Player(String name) {
        this.name = name;
        this.health = GameSettings.MAX_HEALTH;
        this.mana = GameSettings.MAX_MANA;
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
    }
}
