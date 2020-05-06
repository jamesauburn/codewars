// This is the second member of a series of three katas about matrices.

// In the previous kata, we have familiarized ourselves with the basic 
// concept of the matrix and wrote some methods for accessing and manipulating 
// the elements of the matrix. Now we are going to focus on the operations we 
// can perform on matrices. For now, we will stick onto matrices containing numbers 
// though.

// Task

// Your task now is to implement the class Matrix, featuring several operations 
// on matrices like adding and multiplying. The class should represent an immutable 
// matrix object, meaning that neither its length nor its elements are subject to change.

// The Matrix() constructor takes a two-dimensional array of numbers, which 
// represents the structure of the matrix: the i-th element of the input array stores 
// the elements in the i-th row of the matrix. Invalid array inputs (such as empty arrays, or arrays with sub-arrays of different lengths) should be properly handled, in the form of throwing an IllegalArgumentException when necessary.

// You should also be able to create another constructor, taking two integers, the 
// number of rows and columns in the matrix, and an only one-dimensional array (varargs) 
// of double values representing the elements in the matrix, from left to right and 
// top to bottom. (So if the matrix is of type m x n, then the first set of n values 
// in the array are the elements in the first row of the matrix, the second set 
// of n values represent the next row etc., up until the m-th set.) Also, don't forget 
// to check for input validity.

// The methods are the following:

// The transpose method returns a new Matrix object representing a matrix with the rows
// and columns of this matrix swapped.
//
// The add method takes another Matrix and returns a new one that is the sum of is this 
// matrix and the one provided as the argument. The rules of matrix addition are the 
// following: the sum of matrix A and matrix B is the matrix A + B, where every element 
// of A + B is obtained by adding the corresponding values in the addends. The definition 
// implies that matrix addition is only possible if the matrices A and B are of the same 
// types (have the same number of rows and columns). If this not the case, throw an 
// IllegalArgumentException.
//
// The multiply method has two overloads: one taking a number, the other taking a Matrix
// as an argument.
//
// The first method is for scalar multiplication, which simply multiplies every element 
// of the matrix with the given number.
//
// The second one is more exciting. It is for matrix multiplication, which is defined as 
// follows: the product of an m x n matrix A and an n x k matrix B is the m x k matrix AB, 
// in which the element at a given (i, j) position is the scalar product of the i-th row of 
// A and the j-th column of B. The scalar product of two vectors (matrices with one row or 
// column) is the sum of the products of the corresponding elements (being at positions 
// (i, k) and (k, j)).
//
// I also added a toArray method which you need to fill in, which returns the elements in 
// the matrix in the form of a two-dimensional array of double values.

import java.util.Arrays;

public class Matrix {

    private final int rows;
    private final int cols;
    private final double[][] mtx;

    public Matrix(double[][] elements) {
        // TODO: Write constructor
        if(elements.length == 0){throw new IllegalArgumentException();}
        //if lengths are not the same
        this.rows = elements.length;
        this.cols = elements[0].length;
        mtx = elements;
    }
    
    public Matrix(int rows, int cols, double... elements) {
        // TODO: Write constructor
        this.rows = rows;
        this.cols = cols;
        int count = 0;
        mtx = new double[rows][cols];
        for (int i = 0; i < rows; i++){
          for (int j = 0; j < cols; j++){
            try{
                mtx[i][j] = elements[count];//elements.indexOf(count); 
                count++;
            }
            catch(IndexOutOfBoundsException e){System.out.println("insufficnet number of elements");
            }
          }
        }
        if(count != elements.length){throw new IllegalArgumentException();}
    }

    private Matrix(Matrix m){
        this.mtx = m.mtx;
    }
    
    public double[][] toArray() {
        return mtx;
    }
    
    // TODO: Add transpose[DONE], add[DONE], mutliply(double), multiply(Matrix)

    public Matrix transpose(){
        double[][] n = new double[mtx.;
        for (int i = 0; i < n.mtx.length; i++){
           for (int j = 0; j < n.mtx[0].length; j++){
                n.mtx[j][i] = this.mtx[i][j];
            }
        }
        return n;
    }

    public Matrix add(Matrix m){
        Matrix o = new Matrix(m);
        if(n.mtx.length != m.mtx.length || n.mtx[0].length != m.mtx[0].length){throw new IllegalAccessException();}
        for (int i = 0; i < m.mtx.length; i++){
            for (int j = 0; j < m.mtx[0].length; j++){
                o.mtx[i][j] = n.mtx[i][j] + m.mtx[i][j];
            }
        }
        return o;
    }

    public Matrix multiple(double[][] m){
        Matrix n = this;
        Matrix o = new Matrix(m);
        //o.transpose();
        if(n.mtx.length != m.length || n.mtx[0].length != m[0].length){throw new IllegalAccessException();}
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                o.mtx[i][j] = n.mtx[i][j] * this.mtx[i][j];
            }
        }
        return o;
    }

    public Matrix multiple(Matrix m){
        Matrix n = this;
        Matrix o = new Matrix(m);
        //o.transpose();
        if(n.mtx.length != m.mtx.length || n.mtx[0].length != m.mtx[0].length){throw new IllegalAccessException();}
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[0].length; j++){
                o.mtx[i][j] = n.mtx[i][j] * this.mtx[i][j];
            }
        }
        return o;
    }
}


