package test.model;

public class SuperHeroModel {

    private String name;
    private String intelligence;
    private String fullName;
    private String groupAffiliation;
    private String speed;
    private String power;

    public SuperHeroModel() {
        super();

        this.name = name;
        this.intelligence = intelligence;
        this.fullName = fullName;
        this.groupAffiliation = groupAffiliation;
        this.speed = speed;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(String intelligence) {
        this.intelligence = intelligence;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroupAffiliation() {
        return groupAffiliation;
    }

    public void setGroupAffiliation(String groupAffiliation) {
        this.groupAffiliation = groupAffiliation;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
