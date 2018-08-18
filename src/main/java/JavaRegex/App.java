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
        rh.regex("^(( |/)*?(?=\\*)|(.*?//.*?))");           //Regex to  extract JavaDocs and Comments
        rh.regex("^import.*;");                            //Regex to extract all import statements
        rh.regex("^.* \\bclass\\b.*?\\{");                 //Regex to  extract all classes
        rh.regex("^.* \\bInterface\\b .*?\\{");            //Regex to  extract all Interfaces
        rh.regex(" *@\\w*");                               //Regex to extract all annotations
        rh.regex(".*?\\bclass\\b.*?\\bextends\\b.*?\\{");  // Regex to extract all child classes  (which extends other classes)
        rh.regex(".*?\\bclass\\b.*?\\bimplements\\b.*\\{"); //Regex to extract all classes which implements interfaces.
        rh.regex(".*?\\babstract\\b.*?\\bclass\\b.*?\\{");  //Regex to extract all abstract classes





    }
}
