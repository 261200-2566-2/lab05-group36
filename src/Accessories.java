public interface Accessories {
    String getName();
    String getDescription();
}

interface Ring extends Accessories {
    void increaseATK(RPGCharacter character);
}

interface Cloak extends Accessories {
    void increaseDEF(RPGCharacter character);
    void increaseSpeed(RPGCharacter character);
}

interface FireRing extends Ring {
    void increaseATKSpeed(RPGCharacter character);
}

interface BunnyShoes extends Ring, Cloak {
    void increaseSpeed(RPGCharacter character);
}

interface DiamondCloak extends Cloak {
    void increaseHP(RPGCharacter character);
    void decreaseSpeed(RPGCharacter character);
}

class FireRingImpl implements FireRing {
    @Override
    public void increaseATK(RPGCharacter character) {
        System.out.println("Fire Ring equipped: Increased Attack!");
        character.attackPower += 5; // Sample increase in attack power
    }

    @Override
    public void increaseATKSpeed(RPGCharacter character) {
        System.out.println("Fire Ring equipped: Increased Attack Speed!");
        character.ATKSpeed += 3; // Sample increase in ATKSpeed
    }

    @Override
    public String getName() {
        return "Fire Ring";
    }

    @Override
    public String getDescription() {
        return "A ring imbued with the power of fire.";
    }
}

class BunnyShoesImpl implements BunnyShoes {
    @Override
    public void increaseSpeed(RPGCharacter character) {
        System.out.println("Bunny Shoes equipped: Increased Speed!");
        character.Speed += 5;  // Sample increase in Speed
    }

    @Override
    public void increaseATK(RPGCharacter character) {
        System.out.println("Bunny Shoes equipped: Increased Attack!");
        character.attackPower += 3;
    }

    @Override
    public void increaseDEF(RPGCharacter character) {
        System.out.println("Bunny Shoes equipped: Increased Defense!");
        character.defense += 2; // Sample increase in defense
    }

    @Override
    public String getName() {
        return "Bunny Shoes";
    }

    @Override
    public String getDescription() {
        return "Magical shoes that enhance speed and defense.";
    }
}

class DiamondCloakImpl implements DiamondCloak {
    @Override
    public void increaseHP(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Increased HP!");
        character.hp += 30; // Sample increase in HP
    }

    @Override
    public void decreaseSpeed(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Decreased Speed!");
        character.Speed -= 3;  // Sample decrease in Speed
    }

    @Override
    public void increaseDEF(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Increased Defense!");
        character.defense += 5; // Sample increase in defense
    }

    @Override
    public void increaseSpeed(RPGCharacter character) {
        System.out.println("Diamond Cloak equipped: Increased Speed!");
        character.Speed += 2;  // Sample increase in Speed
    }

    @Override
    public String getName() {
        return "Diamond Cloak";
    }

    @Override
    public String getDescription() {
        return "A cloak made of enchanted diamonds.";
    }
}