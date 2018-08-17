package JavaRegex;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexPattern {
    public void regex(String s) throws IOException {
        int count = 0 ;

        BufferedReader br=new BufferedReader(new FileReader("/home/juno/Downloads/Telegram Desktop/RootDocProcessor.java"));
        String line;
        while((line=br.readLine())!=null){
            Pattern p=Pattern.compile(s,Pattern.MULTILINE);
            Matcher m=p.matcher(line);

            while (m.find()) {
                System.out.println(line);
                count++;
            }
        }

        System.out.println("Total values found " + count);
        System.out.println();
    }
}
