package content;

public class Link {
    private String filename;
    private String title;

    public Link(String filename, String title) {
        this.filename = filename;
        this.title = title;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
