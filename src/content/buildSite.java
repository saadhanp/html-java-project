package content;

public class buildSite {
    public static void main(String[] args) {
        Site site = new Site("Site 1");
        Style style  = new Style(site);
        Page page1 = new Page("page 1");
        Image image1 = new Image("Image1");
        Paragraph par1 = new Paragraph("Paragraph 1", "Paragraph text", null);
        par1.addImage(image1);
        page1.addParagraph(par1);
        site.addPage(page1);
        System.out.println(site);

    }
}
