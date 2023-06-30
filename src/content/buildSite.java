package content;

import java.util.List;

import static content.Site.printSite;

public class buildSite {
    public static void main(String[] args) {
        Site site = new Site("Site 1");
        Style style  = new Style(site);
        site.setStyle(style);

        Page page1 = new Page("page 1");
        page1.setFilename("p1filename");

        Paragraph par1 = new Paragraph("Paragraph 1");
        par1.addText("Paragraph text");

        Image image1 = new Image("Image1");
        image1.setWidth("300x300");
        Image image2 = new Image("Image 2");
        image2.setWidth("150x150");
        Image[] images = new Image[2];
        images[0] = image1;
        images[1] = image2;

        par1.setImages(List.of(images));
        page1.addParagraph(par1);
        site.addPage(page1);

        printSite(site);



    }
    public static void printPageFull(Page pg) {
        Paragraph[] paragraphs = pg.getParagraphs().toArray(new Paragraph[0]);
        System.out.println(pg.getFilename());
        System.out.println(pg.getTitle());

        for (Paragraph paragraph : paragraphs) {
            Image[] images = paragraph.getImages().toArray(new Image[0]);
                System.out.println(paragraph.getTitle());
                System.out.println(paragraph.getText());

            for (Image image: images){
                System.out.println(image.getFilename());
                System.out.println(image.getWidth());


            }

    }

}
    public static void siteHTML(Site site) {
        System.out.println(site);

        }
    }

