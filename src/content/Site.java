package content;

import java.util.LinkedList;
import java.util.List;

import static content.Image.printImage;
import static content.Page.printPage;
import static content.Paragraph.printParagraph;


public class Site {

    private String siteName;
    private final List<Page> pages = new LinkedList<>();
    private Style style;

    public Site(String mySite) {
        this.siteName = mySite;
    }


    public List<Page> getPages() {
        return pages;
    }

    public void addPage(Page page) {
        this.pages.add(page);
    }


    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getSiteName() {
        return siteName;

    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public static void printSite(Site s) {
        System.out.println(s.getSiteName());
        System.out.println(s.getStyle());
        Page[] pages = s.getPages().toArray(new Page[0]);
        for (Page page : pages) {
            Paragraph[] paragraphs = page.getParagraphs().toArray(new Paragraph[0]);
            printPage(page);
        }
    }

    public static void siteHTML(Site s) {
        Page[] pages = s.getPages().toArray(new Page[0]);
        for (Page page : pages) {
            printSite(s);


        }
    }
}

