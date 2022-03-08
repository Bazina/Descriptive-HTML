package Parser;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class HTMLParserValidatingTest {

    @Test
    void test1() {
        try {
            String str = """
                    ADD IMAGE WITH SOURCE "https://www.w3schools.com/html/pic_trulli.jpg"
                    ADD HEADING WITH TEXT "Search here : "
                    ADD LINK WITH TEXT "Google" AND WITH LINK "https://google.com" AND WITH COLOR "Green"
                    ADD LINK WITH TEXT "Bing" AND WITH LINK "https://bing.com" AND WITH COLOR "Orange"
                    ADD LINK WITH TEXT "Yahoo" AND WITH LINK "https://yahoo.com" AND WITH COLOR "Magenta"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test2() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Social Media : "
                    ADD LINK WITH TEXT "Facebook" AND WITH LINK "https://www.facebook.com/" AND WITH COLOR "Blue"
                    ADD LINK WITH TEXT "Twitter" AND WITH LINK "https://www.twitter.com/" AND WITH COLOR "Cyan"
                    ADD LINK WITH TEXT "Instagram" AND WITH LINK "https://www.instagram.com/" AND WITH COLOR "Magenta"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test3() {
        try {
            String str = """
                    ADD PARAGRAPH WITH TEXT "Programming Languages Paradigms 2022 CSED" AND WITH COLOR "Black"
                    ADD LINK WITH TEXT "Tutorial" AND WITH LINK "https://www.w3schools.com/html/html_links_colors.asp" AND WITH COLOR "Red"
                    ADD LINK WITH TEXT "CheckEmail" AND WITH LINK "https://www.gmail.com"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test4() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Hello World"
                    ADD IMAGE WITH SOURCE "https://lmichelin.fr/content/images/2019/05/5c1bb7dd5e7cc9678fcdc39f_Hello-World-Header.png"
                    ADD PARAGRAPH WITH TEXT "Welcome in CSED 2024" AND WITH COLOR "Yellow"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test5() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Online Shopping"
                    ADD PARAGRAPH WITH TEXT "The best websites to buy online are : " AND WITH COLOR "Black"
                    ADD LINK WITH TEXT "Amazon" AND WITH LINK "https://www.Amazon.com/" AND WITH COLOR "Cyan"
                    ADD LINK WITH TEXT "Noon" AND WITH LINK "https://www.Noon.com/" AND WITH COLOR "Yellow"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test6() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Live Streaming"
                    ADD PARAGRAPH WITH TEXT "The best websites to watch live streams are : " AND WITH COLOR "Black"
                    ADD LINK WITH TEXT "Twitch" AND WITH LINK "https://www.Twitch.com/" AND WITH COLOR "Magenta"
                    ADD LINK WITH TEXT "Youtube" AND WITH LINK "https://www.Youtube.com/" AND WITH COLOR "Red"
                    ADD LINK WITH TEXT "Facebook" AND WITH LINK "https://www.Facebook.com/" AND WITH COLOR "Blue"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test7() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Programmer Friend"
                    ADD PARAGRAPH WITH TEXT "The best websites to help While Programming are : " AND WITH COLOR "Black"
                    ADD LINK WITH TEXT "Stack Over Flow" AND WITH LINK "https://www.stackoverflow.com/" AND WITH COLOR "Orange"
                    ADD LINK WITH TEXT "Github" AND WITH LINK "https://www.github.com/" AND WITH COLOR "Magenta"
                    ADD LINK WITH TEXT "Google" AND WITH LINK "https://www.Facebook.com/" AND WITH COLOR "Green"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test8() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Online Courses"
                    ADD PARAGRAPH WITH TEXT "The best websites to take any course are : " AND WITH COLOR "Black"
                    ADD LINK WITH TEXT "Coursera" AND WITH LINK "https://www.coursera.org/" AND WITH COLOR "Blue"
                    ADD LINK WITH TEXT "Udemy" AND WITH LINK "https://www.udemy.com/" AND WITH COLOR "Orange"
                    ADD LINK WITH TEXT "udacity" AND WITH LINK "https://www.udacity.com/" AND WITH COLOR "Yellow"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test9() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Solar Eclipse"
                    ADD IMAGE WITH SOURCE "https://upload.wikimedia.org/wikipedia/commons/e/ea/Total_solar_eclipse_2019_at_La_Silla_Observatory.jpg"
                    ADD HEADING WITH TEXT "Lunar Eclipse"
                    ADD IMAGE WITH SOURCE "https://www.thoughtco.com/thmb/RR_pqurhGjd6-flNXer5NlXUl8s=/650x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/blood-moon-total-lunar-eclipse-april-14-15-2014-487245745-58dfe7865f9b58ef7ed85623.jpg"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }

    @Test
    void test10() {
        try {
            String str = """
                    ADD HEADING WITH TEXT "Web Browsers"
                    ADD PARAGRAPH WITH TEXT "Google Chrome " AND WITH COLOR "Green"
                    ADD IMAGE WITH SOURCE "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a5/Google_Chrome_icon_%28September_2014%29.svg/640px-Google_Chrome_icon_%28September_2014%29.svg.png"
                    ADD PARAGRAPH WITH TEXT "Opera " AND WITH COLOR "Red"
                    ADD IMAGE WITH SOURCE "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Opera_2015_icon.svg/1200px-Opera_2015_icon.svg.png"
                    ADD PARAGRAPH WITH TEXT "Microsoft Edge " AND WITH COLOR "Blue"
                    ADD IMAGE WITH SOURCE "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE4nqTh"=""";


            InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
            HTMLParser parser = new HTMLParser(new InputStreamReader(is));
            parser.Input();
        } catch (Exception e) {
            fail("Error while validating");
        }
    }
}