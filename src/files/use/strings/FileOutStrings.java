package files.use.strings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileOutStrings {

	//дан файл с текстом, вывести определенное кол-во строк, длина которых не превышает указанную длину
	
	public static void main(String[] args) throws IOException {
		String[] sourceText;
		String text=""; // в эту переменную мы введем нужный текст и разобьем на строки
		FileReader fileReader=new FileReader("src/sourseText.txt");
		Scanner input=new Scanner(fileReader);
		while (input.hasNext()) { //цикл будет работать, пока в файле не останетс€ данных дл€ ввода
			text+=input.nextLine()+"\t";// кажда€ строка отдел€етс€ друг от друга символом табул€ции			
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
