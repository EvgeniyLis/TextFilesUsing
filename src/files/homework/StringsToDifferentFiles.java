package files.homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StringsToDifferentFiles {
	
	//дан массив строк. Строки, длина которых больше опр. числа - вывести в один файл, строки, длина которых меньше - в другой
	

	public static void main(String[] args) throws IOException {
		String[] sourceText;
		String text="";
		FileReader fileReader=new FileReader("src/sourseText.txt");
		Scanner input=new Scanner(fileReader);
		while (input.hasNext()) {
			text+=input.nextLine()+"\t";
		}
		sourceText=text.split("\t");
		PrintWriter printWriter1=new PrintWriter(new FileWriter("src/newText1.txt"));
		PrintWriter printWriter2=new PrintWriter(new FileWriter("src/newText2.txt"));
		for (int i = 0; i < sourceText.length; i++) {
			if (sourceText[i].length()>15) {
				printWriter1.println(sourceText[i]);
			}else {
				printWriter2.println(sourceText[i]);
			}
		}
		printWriter1.close();
		printWriter2.close();
		input.close();
		System.out.println("Files have been crested");
	}

}
