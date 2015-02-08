public class Main {

    public static void main(String[] args){

        int m = 10;
        int n = 10;
        int k = 10;

        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix result = new Matrix(m,n);

        a.fill(m,k);
        b.fill(k,n);
        a.print();
        b.print();

        //initialize M x N threads
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Thread t = new Thread(new MatMult(i,j,a,b,result));
                t.start();
            }
        }
        result.print();
    }
}
