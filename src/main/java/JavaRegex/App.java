package JavaRegex;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
        regexPattern rh = new regexPattern();
        rh.regex("^import.*;");
        rh.regex("^.* \\bclass\\b");

    }
}
