package files.input;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputFromFile {

	// ��� ������ �����, ������ ��� �� ����� � ��������� ������� �����. ������ ��-���
	
	public static void main(String[] args) throws FileNotFoundException {
		int[] myArray;
		int number, count=0;
		double avsummOdd=0;
		FileReader fileReader=new FileReader("src/data.txt"); // ��� ���������� (���������), ������� ��������� �� ����, �� �������� ����� ����������� ����������
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
