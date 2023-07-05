import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dictionary {


    public String[] fillingOutTheDictionary() throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("singular.txt"));
        List<String> lines = new ArrayList<>();

        String line;
        while((line = file.readLine()) != null) {
            lines.add(line);
        }
        file.close();
        return lines.toArray(new String[]{});
    }
    public String wordChoice(String[] s){
        Random rand = new Random();
        int index = 0;
        index = rand.nextInt(s.length);
        return s[index];
    }
}
