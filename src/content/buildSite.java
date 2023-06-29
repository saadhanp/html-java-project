package content;

public class buildSite {
    public static void main(String[] args) {
        Site s = new Site();
        Page page1 = new Page("page 1");
        Image image1 = new Image("Image1", "300x300");
        Paragraph par1 = new Paragraph("Paragraph 1", "Paragraph text", null);
        par1.addImage(image1);
        page1.addParagraph(par1);
        s.addPage(page1);

    }
}
