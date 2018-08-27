package files.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputFromFile2 {

	//дано 2 массива из разных файлов, задача найти, какой массив содержит большее кол-во четных элементов
	
	public static void main(String[] args) throws FileNotFoundException {
		int[] fileArray1;
		int[] fileArray2;
		int number1, number2, countOdd1=0, countOdd2=0;
		FileReader fileReader1=new FileReader("src/inputArray1.txt");
		FileReader fileReader2=new FileReader("src/inputArray2.txt");
		Scanner input1=new Scanner(fileReader1);
		number1=input1.nextInt();
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
		for (int i = 0; i < fileArray1.length; i++) {
			if (fileArray1[i]%2==0) {
				countOdd1++;
			}
		}
		for (int i = 0; i < fileArray2.length; i++) {
			if (fileArray2[i]%2==0) {
				countOdd2++;
			}
		}
		if (countOdd1>countOdd2) {
			System.out.println("First array contains more odd elements");
		}else if (countOdd1==countOdd2) {
			System.out.println("Arrays contains equal numbers of odd elements");
		}else {
			System.out.println("Second array contains more odd elements");
		}
	}

}
