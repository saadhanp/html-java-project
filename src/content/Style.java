package content;

public class Style {
    private String bgColor;
    private String title;
    private String titleColor;
    private String font;
    private String textColor;
    private Site site;

    public Style(Site site) {
        this.site = site;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }




    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgcolor) {
        this.bgColor = bgcolor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleColor() {
        return titleColor;
    }

    public void setTitleColor(String titleColor) {
        this.titleColor = titleColor;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }
}
