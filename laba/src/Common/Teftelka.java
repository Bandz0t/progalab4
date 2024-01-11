package Common;


public class Teftelka{
    public class Taste {
        public void tasteble(){
            System.out.printf("Тефтелька была вкусная. ");
        }
    }

    public void display_taste(){
        Taste tast = new Taste();
        tast.tasteble();
    }
    public static class compound {
        public static final int saltGram = 5;
        public static int getSalt(){
            return saltGram;
        }
    }
}
