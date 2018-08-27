package files.output;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OutToFiles {
	
	//����� ������ �� ����� � ������� �������� ��������� � ����

	public static void main(String[] args) throws IOException {
		int[] myArray;
		int number;
		FileReader fileReader=new FileReader("src/data.txt");
		Scanner input=new Scanner(fileReader);
		number=input.nextInt();
		myArray=new int[number];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		PrintWriter printWriter=new PrintWriter(new FileWriter("src/outArray.txt")); // ����������, ����������� �� ����, � ������� ����� ���������� ���. �� ���������
		for (int i = 0; i < myArray.length; i++) {
			printWriter.println(myArray[i]*myArray[i]); //�����  ������ � ����
		}
		System.out.println("file with data have been created");
		printWriter.close();
		input.close();
	}

}
