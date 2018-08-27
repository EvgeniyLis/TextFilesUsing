package files.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputFromFileSumm {
	
	//ано два числовых массива в разных файлах, определить, в каком сумма эл-тов больше

	public static void main(String[] args) throws FileNotFoundException {
		int[] sourceArray1;
		int[] sourceArray2;
		int number1, number2, summa1=0, summa2=0;
		FileReader fileReader1=new FileReader("src/sourceArray1.txt");
		FileReader fileReader2=new FileReader("src/sourceArray2.txt");
		Scanner input1=new Scanner(fileReader1);
		number1=input1.nextInt();
		Scanner input2=new Scanner(fileReader2);
		number2=input2.nextInt();
		sourceArray1=new int[number1];
		sourceArray2=new int[number2];
		for (int i = 0; i < sourceArray1.length; i++) {
			sourceArray1[i]=input1.nextInt();
		}
		for (int i = 0; i < sourceArray2.length; i++) {
			sourceArray2[i]=input2.nextInt();
		}
		for (int i = 0; i < sourceArray1.length; i++) {
			summa1+=sourceArray1[i];
		}
		for (int i = 0; i < sourceArray2.length; i++) {
			summa2+=sourceArray2[i];
		}
		if (summa1>summa2) {
			System.out.println("Summ of elements of first array more than summ of elements of second");
		}else if (summa1<summa2) {
			System.out.println("Summ of elements of second array more than summ of elements of first array");
		}else {
			System.out.println("Suumm is equal");
		}
		input1.close();
		input2.close();
	}

}
