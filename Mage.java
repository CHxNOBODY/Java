public class Mage extends Player {
    public Mage(String name) {
        super(name);
    }
    
    public void castSpell() {
        if (mana >= 10) {
            mana -= 10;
            System.out.println(name + " casted a spell. Remaining mana: " + mana);
        } else {
            System.out.println(name + " doesn't have enough mana to cast a spell.");
        }
    }
}
