import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    store_Of_Lines();
  }

  public static ArrayList<String> store_Of_Lines() throws FileNotFoundException {
    String url = "src/CapitalOne";

    File file = new File(url);

    Scanner text = new Scanner(file);

    ArrayList<String> storage = new ArrayList<String>();

    while(text.hasNextLine()){
      String line = text.nextLine();
      storage.add(line);
    }
    System.out.println(storage.get(7));
    return storage;
  }
}
