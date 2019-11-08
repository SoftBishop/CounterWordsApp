import java.io.*;

public class Main {
    public static void main(String[] args)  {
        CounterWord counterWord = new CounterWord();
        try
        {
        counterWord.CountWords(
                System.getProperty("user.dir") + "\\src\\main\\resources\\strings.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

