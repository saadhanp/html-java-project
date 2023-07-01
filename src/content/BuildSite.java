package content;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//import static content.Site.printSite;

public class BuildSite {
    public static void main(String[] args) {
        Site site = new Site("Site 1");
        Style style  = new Style();
        style.font = "Times";
        style.bgColor = "green";
        style.textColor = "red";
        style.titleColor = "blue";
        site.setStyle(style);

        Page page1 = new Page("page 1");
        page1.setFilename("p1filename");

        Paragraph par1 = new Paragraph("Paragraph 1");
        par1.addText("Paragraph 1 text");
        Paragraph par2 = new Paragraph("Paragraph 2");
        par2.addText("Paragraph 2 text");
        Paragraph[] paragraphs = new Paragraph[]{par1, par2};


        Image image1 = new Image("Image1");
        image1.setWidth("300x300");
        Image image2 = new Image("Image 2");
        image2.setWidth("150x150");
        List<Image> images = new ArrayList<>();
        images.add(image1);
        images.add(image2);
        par1.setImages(images);
        page1.setParagraphs(List.of(paragraphs));
        site.addPage(page1);

        for (String pg: site.getPagesContent()){
            System.out.println(pg);
        }
    }


}