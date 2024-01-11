import Common.*;
import Errors.NameError;
import Errors.UnnamedCallError;
import People.*;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Baby mal;
        try{
            mal = new Baby("Малыш", Sex.MALE);
        } catch (NameError e){
            System.out.println(e.getMessage());
            mal = new Baby("Незнакомый мальчик", Sex.MALE);
        }
        Carlson carlson = new Carlson("Карлсон", Sex.MALE);
        FrBok frek = new FrBok("Фрекен Бок", Sex.FEMALE);
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(mal);
        people.add(carlson);
        people.add(frek);
        Group group = new Group(people);
        group.sit.done();
        group.chew.done();
        group.swallow.done();
        group.setCosiness(0.5F);
        group.cosy();
        System.out.println(' ');
        frek.shut();
        Teftelka teftelka = new Teftelka();
        carlson.chew();
        teftelka.display_taste();
        carlson.jump("пол");
        System.out.println(' ');
        carlson.on();
        Motor m = new Motor();
        m.success();
        carlson.fly("окно");
        Food food = new Food("обед");
        food.setTaste(0.5F);
        mal.setJoy(0.5F);
        mal.setClever(0.5F);
        mal.setSleepy(0.5F);
        mal.setImmunity(0.4F);
        mal.taste(food);
        System.out.println(' ');

        mal.sleep(Duration.LONG,Time.NEXTMORNING);
        mal.wake("Телефонный звонок");
        mal.run("в переднюю");
        Mom mama = new Mom("Мама",Sex.FEMALE);

        try {
            mama.call(mal);
        }
        catch (UnnamedCallError e){
            System.out.println(e.getMessage());
        }

        System.out.println(' ');
        if (mal.getLive() == true) {
            mal.joyness();
            mama.named("'бедный мой мальчик'", mal);
            mal.understood();
            mal.lay();
            Father papa = new Father("Папа", Sex.MALE);
            papa.setLocation("Лондон");
            try {
                papa.call(mal);
            } catch (UnnamedCallError e) {
                System.out.println(e.getMessage());
            }
            System.out.println(' ');
            mal.say("'Не думаю, но точно не знаю, потому что они лежат в эпидемии'");
        } else {
            System.out.printf("Мама не дозвонилась до " + mal.getName() + ". ");
        }
    }
}