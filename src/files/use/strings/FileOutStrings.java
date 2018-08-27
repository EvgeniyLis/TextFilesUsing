package files.use.strings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOutStrings {

	//��� ���� � �������, ������� ������������ ���-�� �����, ����� ������� �� ��������� ��������� �����
	
	public static void main(String[] args) throws IOException {
		String[] sourceText;
		String text=""; // � ��� ���������� �� ������ ������ ����� � �������� �� ������
		FileReader fileReader=new FileReader("src/sourseText.txt");
		Scanner input=new Scanner(fileReader);
		while (input.hasNext()) { //���� ����� ��������, ���� � ����� �� ��������� ������ ��� �����
			text+=input.nextLine()+"\t";// ������ ������ ���������� ���� �� ����� �������� ���������			
		}
		sourceText=text.split("\t");
		PrintWriter printWriter=new PrintWriter(new FileWriter("src/newText.txt"));
		for (int i = 0; i < sourceText.length; i++) {
			if (sourceText[i].length()<15) {
				printWriter.println(sourceText[i]);
			}
		}
		printWriter.close();
		input.close();
	}

}
