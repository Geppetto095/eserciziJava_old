//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Triangolo t1 = new Triangolo (2 , 5);
    Quadrato q1 = new Quadrato (2);
    Rettangolo r1 = new Rettangolo (2, 6);
    System.out.println(t1.calcoloArea());
    System.out.println(q1.calcoloArea());
    System.out.println(r1.calcoloArea());
    }
}