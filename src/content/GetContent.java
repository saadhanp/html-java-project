package content;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertNull;

public class GetContent {
    public static Scanner GetWebTitle() {
        System.out.println("What is the title of your website");
        Scanner webtitle = new Scanner(System.in);
        System.out.println(webtitle.nextLine());
        return webtitle;
    }
    public static Scanner GetTitleColor() {
        System.out.println("What color should the font be");
        Scanner titlecolor = new Scanner(System.in);
        System.out.println(titlecolor.nextLine());
        return titlecolor;
    }
    public static Scanner GetBackgroundColor(){
        System.out.println("What should the background color be");
        Scanner bgcolor = new Scanner(System.in);
        System.out.println(bgcolor.nextLine());
        return bgcolor;


    }
    public static Scanner GetFontNumber() {
        System.out.println("""
                Enter the number of the font you would like to use.\s
                0: Arial, size 14 \s
                1: Comic Sans MS, size 14 \s
                2: Lucinda Grande, size 14 \s
                3: Tahoma, size 14 \s
                4: Verdana, size 14 \s
                5: Helvetica, size 14 \s
                6: Times New Roman, size 14.""");
        Scanner fontnumber = new Scanner(System.in);
        System.out.println(fontnumber.nextLine());
        return fontnumber;
    }
    public static Scanner GetFontColor() {
        System.out.println("What color should the font be");
        Scanner fontcolor = new Scanner(System.in);
        System.out.println(fontcolor.nextLine());
        return fontcolor;
    }

    static class GetTitleTest {

        @Test
        void TestNullContent() {
            Page p = new Page("Page 1");
            assertNull(p.generateContent());
        }

        }
}
