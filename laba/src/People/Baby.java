package People;

import Common.Duration;
import Common.Food;
import Common.Time;
import Errors.NameError;
import Interfaces.Sleepable;
import Interfaces.Takeable;
import Interfaces.Tasteable;
import Interfaces.Wakeable;



public class Baby extends Person implements Takeable, Sleepable, Wakeable, Tasteable {

    private boolean sleeping;

    public Baby(String name, Sex sex) throws NameError {
        super(name, sex);
        if(!name.isEmpty())
        {
        }
        else{
            throw new NameError("Объект не может быть создан без имени");
        }
    }

    @Override
    public String take(String object){
        System.out.printf(this.getName() + " взял" + pronunciation() + " " + object + ". ");
        return (this.getName() + " взял" + pronunciation() + " " + object + ". ");
    }

    @Override
    public String wake(String call){
        setJoy(getJoy()/1.5F);
        System.out.printf(call + " разбудил " + this.getName()+ ". ");
        return (call + " разбудил " + this.getName()+ ". ");
    }

    public String joyness(){
        if (getJoy()>Math.random()){
            System.out.printf(getName() + " обрадовался и приободрился. ");
            return (getName() + " обрадовался и приободрился. ");
        }
        else {
            System.out.printf(getName() + " расстроился. ");
            return (getName() + " расстроился. ");
        }
    }

    public String wound(){
        System.out.printf(getName() + " поранился. ");
        return this.handle();
    }

    public String dead(){
        if (Math.random()>getImmunity()*1.2F){
            System.out.printf(getName() + " умер. ");
            setLive(false);
            return null;
        }
        else {
            System.out.printf(getName() + " вылечился. ");
            setImmunity(getImmunity() / 1.5F);
            return this.take("трубку");
        }
    }

    public String handle(){
        if (Math.random()>getClever()){
            System.out.printf(getName() + " не стал" + pronunciation() + " обрабатывать рану. ");
            if (Math.random()>getImmunity()){
                System.out.printf(getName() + " получил" + pronunciation() + " заражение крови. ");
                return this.dead();
            }
            else {
                System.out.printf(getName() + " не получил" + pronunciation() + " заражение крови. ");
                setImmunity(getImmunity()/1.5F);
                return this.take("трубку");
            }
        }
        else {
            System.out.printf(getName() + " обработал" + pronunciation() + " рану. ");
            return this.take("трубку");
        }
    }

    public String run(String place){
        double random = Math.random();
        if (random>getJoy()){
            System.out.printf(getName() + " упал, побежав" + pronunciation() + " " + place + ". ");
            setJoy(getJoy()/1.5F);
            return this.wound();
        }
        else {
            System.out.printf(getName() + " побежал" + pronunciation() + " " + place + ". ");
            setJoy(getJoy()*1.5F);
            return this.take("трубку");
        }
    }

    public String understood(){
        double random = Math.random();
        if (random>getClever()){
            System.out.printf(getName() + " не понял" + pronunciation() + " почему. ");
            return (getName() + " не понял" + pronunciation() + " почему. ");
        }
        else {
            System.out.printf(getName() + " понял" + pronunciation() + " почему. ");
            return (getName() + " понял" + pronunciation() + " почему. ");
        }
    }

    public String lay(){
        double random = Math.random();
        if (random>getSleepy()){
            System.out.printf(getName() + " не успел" + pronunciation() + " лечь и задремать. ");
            return (getName() + " не успел" + pronunciation() + " лечь и задремать. ");
        }
        else {
            setEar(0.5F);
            System.out.printf(getName() + " успел" + pronunciation() + " лечь и задремать. ");
            return (getName() + " успел" + pronunciation() + " лечь и задремать. ");
        }
    }



    public String sleep(Duration duration, Time time){
        String word = switch (duration){
            case LONG -> " долго ";
            case SHORT -> " мало ";
        };
        String word2 = switch (time){
            case MORNING -> "утром";
            case DAY -> "днём";
            case EVENING -> "вечером";
            case NEXTMORNING -> "следующим утром";
        };
        System.out.printf(getName() + word + "спал" + pronunciation() + " " + word2 + ". ");
        return (getName() + word + "спал" + pronunciation() + " " + word2 + ". ");
    }


    @Override
    public String taste(Food food) {
        if (food.getTaste()>Math.random()){
            System.out.printf("Никогда еще " + getName() + " не было так вкусно. ");
            return "Никогда еще " + getName() + " не было так вкусно. ";
        } else {
            System.out.printf(getName() + " было не очень вкусно. ");
            return getName() + " было не очень вкусно. ";
        }
    }

    public void say(String frase) {
        System.out.printf(getName() + " сказал" + pronunciation() + ": " + frase + ". " );
    }
}
