package files.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutToFiles2 {
	
	//дано два массива из разных файлов, в третий файл записать объединенный массив

	public static void main(String[] args) throws IOException {
		int[] fileArray1;
		int[] fileArray2;
		int[] newArray;
		int number1, number2;
		FileReader fileReader1=new FileReader("src/inputArray1.txt");
		Scanner input1=new Scanner(fileReader1);
		number1=input1.nextInt();
		FileReader fileReader2=new FileReader("src/inputArray2.txt");
		Scanner input2=new Scanner(fileReader2);
		number2=input2.nextInt();
		fileArray1=new int[number1];
		fileArray2=new int[number2];
		for (int i = 0; i < fileArray1.length; i++) {
			fileArray1[i]=input1.nextInt();
		}
		for (int i = 0; i < fileArray2.length; i++) {
			fileArray2[i]=input2.nextInt();
		}
		newArray=new int[fileArray1.length+fileArray2.length];
		System.arraycopy(fileArray1, 0, newArray, 0, fileArray1.length);
		System.arraycopy(fileArray2, 0, newArray, fileArray1.length, fileArray2.length);
		PrintWriter printwriter=new PrintWriter(new FileWriter("src/newArray.txt"));
		for (int i = 0; i < newArray.length; i++) {
			printwriter.println(newArray[i]);
		}
		System.out.println("New array in file have been created");
		printwriter.close();
		input1.close();
		input2.close();
	}

}
