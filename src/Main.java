/***
 * Clavelle, Alex
 * PA-1a(Multithreading)
 * Main.java
 * cs4103-sp15
 * cs410310
 * */

public class Main {

    public static void main(String[] args){



        Matrix a = new Matrix();
        Matrix b = new Matrix();

        a.setElements(new float[][]{{1,4},{2,5},{3,6}});
        b.setElements(new float[][]{{8,7,6},{5,4,3}});
        Matrix result = new Matrix(a.elements.length,b.elements[0].length);
        a.print();
        b.print();

        //initialize M x N threads
        for (int i = 0; i < a.elements.length; i++) {
            for (int j = 0; j < b.elements[0].length; j++) {
                Thread t = new Thread(new MatMult(i,j,a,b,result));
                t.start();
            }
        }
        result.print();
    }
}
