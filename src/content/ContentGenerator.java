package content;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContentGenerator {



    public static void main(String[] args) {
       // String Title = new content.GetTitle().toString();

        Page p = new Page("Page 1");
        Paragraph p1 = new Paragraph("P1 Title", "P1 Text", new ArrayList<Image>());
        p1.addText("abc");
        p1.addImage(new Image("image1"));


         String expectedContent = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 TRANSITIONAL//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + "\n" +
            "<html>" +   "\n" +
            "<head>" +  "\n" +
            "<title>My Page</title>"  +  "\n" +
            "</head>"  +  "\n" +
            "<body>"  +  "\n" +
            "<p>"  +  "\n" +
             "<h2> P1 Title </h2>"  +  "\n" +
             "P1 Text"  +  "\n" +
             "<img src=\"image1\"/>"  +  "\n" +
            "</p>"  +  "\n" +
            "</body>"  +  "\n" +
            "</html>" +  "\n";

//        Paragraph p2 = new Paragraph("P2 Title", "P2 Text", null);
//        p2.addText("Second Paragraph");

        p.addParagraph(p1);
       // p.addParagraph(p2);

        String content = p.generateContent();
        assertEquals(expectedContent, content);
    }

    public String generateContent(Page p) {
        return p.generateContent();
    }
}
