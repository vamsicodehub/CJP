package com.vamsi.interview;

import java.util.Arrays;

public class MatrixMulDemo
{

    public static void main(String[] args)
    {
	// TODO Auto-generated method stub
	
	System.out.println(Arrays.toString(matrixMul(1,4,2)));

    }

    
    private static int[][] matrixMul(int initialVlaue,int rows,int columns)
    {
	int val = initialVlaue;
	int[][] matrix = new int[rows][columns];
	int[][] tMatrix = new int[columns][rows];
	for(int i =0;i<rows;i++)
	{
	    for(int j=0;j<columns;j++)
	    {
		matrix[i][j]=initialVlaue;
		//tMatrix[j][i]=initialVlaue;
		 System.out.print(matrix[i][j]+" ");
		 //System.out.print(tMatrix[j][i]+" ");
		 initialVlaue++;
	    }
	    System.out.println();
	 }
	initialVlaue=val;
	for(int i =0;i<columns;i++)
	{
	    for(int j=0;j<rows;j++)
	    {
		tMatrix[i][j]=initialVlaue;
		 System.out.print(tMatrix[i][j]+" ");
		 initialVlaue++;
	    }
	    System.out.println();
	 }
	return multiple(matrix,tMatrix);
	
    }


    private static int[][] multiple(int[][] matrix, int[][] tMatrix)
    {
	int mulMatRows = matrix.length;
	int mulMatCols = tMatrix.length;
	System.out.println(" Matrix dimensions : ");
	System.out.println(mulMatCols);
	System.out.println(mulMatRows);
	
	int[][] mulMatrix = new int[mulMatRows][mulMatCols];
	System.out.println(mulMatrix[0].length);
	for(int i=0;i<mulMatRows;i++)
	{
	    for(int j=0;j<mulMatCols;j++)
	    {
		for(int k=0;k<mulMatrix[0].length;k++)
		{
		    mulMatrix[i][j] = mulMatrix[i][j] + matrix[i][k] * tMatrix[k][j];
		}
		//System.out.print(mulMatrix[i][j]);b
	    }
	    System.out.println();
	}
	return mulMatrix;
    }
}
