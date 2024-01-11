package People;

import Errors.UnnamedCallError;

public abstract class Person {
    private String name;
    private String location;
    private Sex sex;
    private float joy;
    private float clever;
    private float sleepy;
    private float ear;
    private float immunity;
    private boolean live;

    public Person(String name, Sex sex){
        this.name = name;
        this.sex = sex;
        this.live = true;
    }

    public String call(Person person) throws UnnamedCallError {
        person.setJoy(person.getJoy()*1.7F);
        if (this.getLocation() == null) {
            System.out.printf(this.getName() + " звонил" + pronunciation() + " " + person.getName() + ". ");
        } else if (!person.name.isEmpty()){
            System.out.printf(this.getName() + " звонил" + pronunciation() + " " + person.getName() + " из " + this.getLocation() + ". ");
        } else {
            throw new UnnamedCallError(getName() ," не может звонить неопознанному человеку. ");
        }

        return (this.getName() + " звонил" + pronunciation() + " " + person.getName() + ". ");
    }

    public float getClever() {
        return this.clever;
    }

    public float getEar() {
        return ear;
    }

    public void setEar(float ear) {
        this.ear = ear;
    }

    public void setClever(float clever) {
        this.clever = clever;
    }

    public float getJoy(){
        return this.joy;
    }

    public float getSleepy() {
        return this.sleepy;
    }

    public void setSleepy(float sleepy) {
        this.sleepy = sleepy;
    }

    public void setJoy(float joy){
        this.joy = joy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public boolean isMale(){
        return sex == sex.MALE;
    }

    public String pronunciation(){
        return isMale() ? "" : "а";
    }

    public String getName(){
        return this.name;
    }

    public boolean getLive(){
        return this.live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getCurrentLocation(){
        return this.location;
    }

    public void setCurrentLocation(String location){
        this.location = location;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Имя: " + getName();
    }

    public float getImmunity() {
        return immunity;
    }

    public void setImmunity(float immunity) {
        this.immunity = immunity;
    }
}
