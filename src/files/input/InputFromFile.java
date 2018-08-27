package files.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputFromFile {

	// дан массив чисел, ввести его из файла и посчитать среднее арифм. четных эл-тов
	
	public static void main(String[] args) throws FileNotFoundException {
		int[] myArray;
		int number, count=0;
		double avsummOdd=0;
		FileReader fileReader=new FileReader("src/data.txt"); // это переменная (ссылочная), которая указывает на файл, из которого будет считываться информация
		Scanner input=new Scanner(fileReader);
		number=input.nextInt();
		myArray=new int[number];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]%2==0) {
				avsummOdd+=myArray[i];
				count++;
			}
		}
		System.out.println("Everage of odd elements is :"+avsummOdd/count);
		input.close();
	}

}
