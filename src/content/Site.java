package content;

import java.util.LinkedList;
import java.util.List;


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

}

