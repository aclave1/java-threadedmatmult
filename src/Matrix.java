import java.util.Random;

public class Matrix {
    public float[][] elements;


    public Matrix(int m, int n){
        elements=new float[m][n];
    }
    public Matrix(){
        elements = new float[0][0];
    }
    public Matrix(float[][] els){
        setElements(els);
    }

    public void setElements(float[][] els){
        if(checkDimensions(els)){
            elements = els;
        }else{
            System.out.println("Invalid array dimensions");
            System.exit(1);
        }
    }

    public boolean checkDimensions(float[][] els){
        int rows = els.length;
        int cols = els[0].length;
        for(int i=1;i<rows;i++){
            if(els[i].length != cols){
                return false;
            }
        }
        return true;
    }

    public void fill(int rows,int cols){
        Random rand = new Random();
        elements = new float[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                elements[i][j] = rand.nextFloat() * 100;
            }
        }
    }


    public void fillSingleNum(int rows, int cols, int val){
        elements = new float[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                elements[i][j] = val;
            }
        }
    }

    public void print(){
        System.out.printf("{\n");
        for (int i = 0; i < elements.length; i++) {
            System.out.printf("  [");
            for (int j = 0; j < elements[i].length; j++) {
                System.out.printf("%5.5f",elements[i][j]);
                if(j<elements[i].length-1)System.out.printf(",");
            }
            System.out.printf("]\n");
        }
        System.out.printf("}\n");
    }
}
