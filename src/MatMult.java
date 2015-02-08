public class MatMult implements Runnable{

    private Matrix _a;
    private Matrix _b;
    private Matrix _result;
    private int _row;
    private int _col;


    public MatMult(int row, int col, Matrix a, Matrix b, Matrix result){
        _row = row;
        _col = col;
        _a = a;
        _b = b;
        _result = result;
    }


    public void run() {
        int sum = 0;
        //we can just assume they're all the same length, and that the rows and columns match up since we check in the matrix constructor
        for(int i=0;i<_a.elements[0].length;i++){
            sum += _a.elements[_row][i] * _b.elements[_col][i];
        }
        _result.elements[_row][_col] = sum;
    }

}
