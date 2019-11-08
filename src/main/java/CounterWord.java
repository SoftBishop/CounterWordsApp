import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CounterWord {
    public void CountWords(String filePath) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File(filePath));
        String[] sequenceString = null;
        String line;

        if(scanner.hasNext())
        {
            line = scanner.nextLine();
            sequenceString = line.split(" ");
        }
        else
            {
                System.out.println("В файле нету данных");
                return;
            }

        scanner.close();

        int counter = 0;
        for (String word : sequenceString)
        {
            System.out.println(word);
            if(word.length()>1)
            {
                counter++;
            }
        }


        System.out.println("Кол-во слов = " + counter);
    }
}
