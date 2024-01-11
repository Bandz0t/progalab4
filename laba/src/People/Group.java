package People;

import Interfaces.Dogroup;

import java.util.List;

public class Group <M extends Person> {
    private List<M> members;
    private float cosiness;

    public Group(List<M> members) {
        this.members = members;
    }

    public String getMembers() {
        String s = new String();
        for (Person b: members)
        {
           s = s + b.getName() + ", ";
        }
        return s;
    }


    public Dogroup sit = new Dogroup() {
        @Override
        public void done() {
            System.out.printf(getMembers() + "сидели на кровати. " );
        }
    };

    public Dogroup chew = new Dogroup() {
        @Override
        public void done() {
            System.out.printf(getMembers() + "жевали. ");
        }
    };

    public Dogroup swallow = new Dogroup() {
        @Override
        public void done() {
            System.out.printf(getMembers() + "глотали. ");
        }
    };

    public String cosy(){
        if (getCosiness()>Math.random()){
            System.out.printf(getMembers() + "было уютно вместе. ");
            return (getMembers() + "было уютно вместе. ");
        }
        else {
            System.out.printf(getMembers() + "было не очень уютно вместе. ");
            return (getMembers() + "было не очень уютно вместе. ");
        }
    }

    public float getCosiness() {
        return cosiness;
    }

    public void setCosiness(float cosy) {
        this.cosiness = cosy;
    }
}
