package Parser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class GenerateHTMLParserTest {

    @Test
    void test1() throws ParseException {
        String str = """
                ADD IMAGE WITH SOURCE "https://www.w3schools.com/html/pic_trulli.jpg"
                ADD HEADING WITH TEXT "Hello World"
                ADD PARAGRAPH WITH TEXT "Welcome" AND WITH FONT "Arial" AND WITH COLOR "Red"
                ADD LINK WITH TEXT "Search" AND WITH LINK "https://google.com/"
                ADD LINK WITH TEXT "Email" AND WITH LINK "https://gmail.com/" AND WITH COLOR "Green"
                ADD PARAGRAPH WITH FONT "Arial" AND WITH TEXT "Good bye"=""";

        String expected = """
                <img src="https://www.w3schools.com/html/pic_trulli.jpg"/>
                <h1>Hello World</h1>
                <p style="color:Red;font-family:Arial;">Welcome</p>
                <a href="https://google.com/">Search</a>
                <a href="https://gmail.com/" style="color:Green;">Email</a>
                <p style="font-family:Arial;">Good bye</p>
                """;


        InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        HTMLParser parser = new HTMLParser(new InputStreamReader(is));
        String ans = parser.Input();
        Assertions.assertEquals(expected, ans, "Error");
    }

    @Test
    void test2() throws ParseException {
        String str = """
                ADD HEADING WITH TEXT "Test2" AND WITH FONT "Calibri"
                ADD LINK WITH TEXT "Facebook" AND WITH LINK "https://www.facebook.com/" AND WITH COLOR "Red"
                ADD PARAGRAPH WITH FONT "Times New Roman" AND WITH TEXT "This is Our Text and we are happy to test it"=""";

        String expected = """
                <h1 style="font-family:Calibri;">Test2</h1>
                <a href="https://www.facebook.com/" style="color:Red;">Facebook</a>
                <p style="font-family:Times New Roman;">This is Our Text and we are happy to test it</p>
                """;


        InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        HTMLParser parser = new HTMLParser(new InputStreamReader(is));
        String ans = parser.Input();
        Assertions.assertEquals(expected, ans, "Error");
    }

    @Test
    void test3() throws ParseException {
        String str = """
                ADD PARAGRAPH WITH FONT "Calisto MT" AND WITH TEXT "In our third text we will add small image" AND WITH COLOR "Yellow"
                ADD IMAGE WITH SOURCE "https://www.facebook.com/smallpic"
                ADD PARAGRAPH WITH TEXT "Confirm our text here" AND WITH COLOR "Blue"
                ADD HEADING WITH TEXT "Finished" AND WITH FONT "Arial Narrow"=""";

        String expected = """
                <p style="color:Yellow;font-family:Calisto MT;">In our third text we will add small image</p>
                <img src="https://www.facebook.com/smallpic"/>
                <p style="color:Blue;">Confirm our text here</p>
                <h1 style="font-family:Arial Narrow;">Finished</h1>
                """;


        InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        HTMLParser parser = new HTMLParser(new InputStreamReader(is));
        String ans = parser.Input();
        Assertions.assertEquals(expected, ans, "Error");
    }

    @Test
    void test4() throws ParseException {
        String str = """
                ADD PARAGRAPH WITH TEXT "Programming Languages Paradigms 2022 CSED" AND WITH COLOR "Black"
                ADD PARAGRAPH WITH TEXT "Fourth Test Case is here" AND WITH FONT "Arial"
                ADD LINK WITH TEXT "Tutorial" AND WITH LINK "https://www.w3schools.com/html/html_links_colors.asp" AND WITH COLOR "Red"
                ADD LINK WITH TEXT "CheckEmail" AND WITH LINK "https://www.gmail.com"=""";

        String expected = """
                <p style="color:Black;">Programming Languages Paradigms 2022 CSED</p>
                <p style="font-family:Arial;">Fourth Test Case is here</p>
                <a href="https://www.w3schools.com/html/html_links_colors.asp" style="color:Red;">Tutorial</a>
                <a href="https://www.gmail.com">CheckEmail</a>
                """;


        InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        HTMLParser parser = new HTMLParser(new InputStreamReader(is));
        String ans = parser.Input();
        Assertions.assertEquals(expected, ans, "Error");
    }

    @Test
    void test5() throws ParseException {
        String str = """
                ADD IMAGE WITH SOURCE "https://www.arbitarylink.com/gohere/anyimage"
                ADD IMAGE WITH SOURCE "https://www.alexandriauniversity"
                ADD HEADING WITH TEXT "The Final One int here" AND WITH FONT "anyFont" AND WITH COLOR "light-green"=""";

        String expected = """
                <img src="https://www.arbitarylink.com/gohere/anyimage"/>
                <img src="https://www.alexandriauniversity"/>
                <h1 style="color:light-green;font-family:anyFont;">The Final One int here</h1>
                """;


        InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        HTMLParser parser = new HTMLParser(new InputStreamReader(is));
        String ans = parser.Input();
        Assertions.assertEquals(expected, ans, "Error");
    }
}