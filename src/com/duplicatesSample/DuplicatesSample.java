package com.duplicatesSample;

public class DuplicatesSample {

	public static void main(String args[]) {
		 char[] array1=new char[10];
	     char[] array2=new char[10];
	         array1[0]='c';
	         array1[1]='a';
	         array1[2]='b';
	         array1[3]='c';
	     array1[4]='a';
	     array1[5]='e';
	     array1[6]='e';
	     array1[7]='a';
	     array1[8]='e';
	     array1[9]='d';
	     for(int i=0;i<10;i++)
	     {
	         for(int j=i+1;j<10;j++)
	         {
	             if(array1[i]==array1[j])
	             {
	                 array1[j]='\0';
	                 array2[i]=array1[i];
                 
	             }
	         }
	     }
	     for (Character element:array2
	          ) {
	            if(element=='\0')
	            {
	                //do nothing
	            }
	            else
	            {
	                System.out.println(element);
	            }
	     }
	     }
}
