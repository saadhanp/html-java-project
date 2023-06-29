package content;

public class Image {
    private String filename;
    private String width;


    public Image(String filename) {
        this.filename = filename;
    }


    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String generateContent() {

            return "<img src=\"" + filename + "\n";

    }
}
