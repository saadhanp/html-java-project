package content;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PageTest {

    @Test
    void TestContent() {
        Page p = new Page("Page 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        p1.addText("First Paragraph");
        p1.addImage(new Image("image1"));
        Paragraph p2 = new Paragraph("Paragraph 2");
        p2.addText("Second Paragraph");

        p.addParagraph(p1);
        p.addParagraph(p2);

        assertEquals("", p.getContent());
    }}

