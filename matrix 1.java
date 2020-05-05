// This is the first member of a series of three katas about matrices.

// A matrix is a type of mathematical object that represents an array of elements 
//(usually numbers) in a two-dimensional form. They are used in many fields of 
// mathematics and computer science, for example to simplify the solution of linear 
// equation systems or to represent transformations.

// In this kata we will leave off the usage of matrices and just concentrate on 
// the storage aspect of them.

// Task

// Your task is to implement a generic Matrix class that can hold a fixed amount 
//of objects of any type. The class should contain a constructor that sets the 
// dimensions of the matrix and methods to retrieve and manipulate the elements in 
// the matrix.

// The constructor accepts two parameters: one holds the number of rows, the other 
// the number of columns in the matrix. The matrix should initially hold null values 
// in every position.

// The methods are the following:

// The get method retrieves the element in the matrix at position (i, j), where i 
// and j are whole numbers that satisfy 1 <= i <= #rows and 1 <= j <= #columns.
// The set method replaces the element in the matrix at position (i, j) with a new 
// value. The above criteria for i and j hold here as well.
// You should also provide a setRow method to enable the user to set the content of 
// the i-th row in one statement. The parameters are i, the row's number and an array 
// of elements of the appropriate size specified in the form of varargs (... in Java).
// The swap method swaps two elements in the matrix at specified positions (i1, j1) and 
// (i2, j2) (so the method takes 4 arguments).
// Finally, the toArray method converts the elements in the matrix into a two-dimensional 
// array of String-s, where each element in the array is the string representation of 
// the element in the matrix at that position. toArray()[i][j] should return the element 
// in the matrix at the intersection of the i + 1-th row and j + 1-th column.
// In Java, the type Matrix should be a generic type with one type parameter describing 
// the contained element. The methods set, get and setRow should all work with that type 
// parameter.

// You don't need to worry about the validity of method inputs: i and j will always be 
// valid indices, and the array in setRow will always be as long as the number of columns 
// in the matrix.

// See the examples in the test cases.



public class Matrix<E> {

	private final int rows;
	private final int cols;
	private E[][] matrixx;

    public Matrix(int rows, int cols) {
        // TODO: Write constructor
        this.rows = rows;
        this.cols = cols;
        matrixx = (E[][]) new Object[rows][cols];
    }
    
    // TODO: Add get, set, setRow, swap and toArray
    public E get(int r, int c){
      return matrixx[r-1][c-1];
    }

    public void set(int r, int c, E v){
    	matrixx[r-1][c-1] = v;
    }

    public void setRow(int r, E[] v){
    	int count = 0;
    	for(E i : v){
    		matrixx[r-1][count] = i;
    		count++;
    	}
    }

    public void swap(int rF, int cF, int rT, int cT){
    	E temp = matrixx[rF-1][cF-1];
    	matrixx[rF-1][cF-1] = matrixx[rT-1][cT-1];
    	matrixx[rT-1][cT-1] = temp;
    }

    public String[][] toArray(){
      String[][] a = new String[rows][cols]; 
        for (int i = 0; i < rows; i++){
          for (int j = 0; j < cols; j++){
            a[i][j] = matrixx[i][j].toString(); 
          }
        }
    	return a;
    }
}








































