package content;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Site {

    private final String siteName;
    private final List<Page> pages = new LinkedList<>();
    private Style style;

    public Site(String mySite) {
        siteName = mySite;
    }


    public List<Page> getPages() {
        return pages;
    }

    public void addPage(Page page) {
        pages.add(page);
    }

    public List<String> getPagesContent() {
        List<String> returnVal = new ArrayList<>();
        for (Page page : getPages()) {
            returnVal.add(page.generateContent());
        }

        return returnVal;
    }

    public void generateContent() throws FileNotFoundException {
        String styleText = style.getStyle();
        String styleFileName = "/home/users/saadhan/play1/" + "style.css";
        try (PrintWriter out = new PrintWriter(styleFileName)) {
            out.println(styleText);
        }
        for (Page page: pages){
            page.SetStyleFileName(styleFileName);
        }
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}

