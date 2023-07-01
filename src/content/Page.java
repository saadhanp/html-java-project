package content;

import java.util.LinkedList;
import java.util.List;

import static content.Image.printImage;
import static content.Paragraph.printParagraph;


class Page {
    private String filename;
    private String title;

    private String styleFileName;

    private List<Paragraph> paragraphs = new LinkedList<>();

    public Page(String myPage) {
        this.title = myPage;
    }


    public String generateContent() {
        String tillHead = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 TRANSITIONAL//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + "\n" +
                "<html>" + "\n" +
                "<head>" + "\n" +
                "<title>" + title + "</title>" + "\n" +
                "<style src= \"" + styleFileName + "\" >" +
                "</head>" + "\n";
        String body = "<body>";
        for (Paragraph p : paragraphs){
            body = body + "\n" + p.generateContent() + "\n";
        }
        body = body + "</body>\n</html>\n";
        return tillHead + body;
    }



    public void addParagraph(Paragraph p) {
       paragraphs.add(p);
    }
    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
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

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public void SetStyleFileName(String styleFileName) {
        this.styleFileName = styleFileName;
    }
}

