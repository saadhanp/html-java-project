package content;

import java.util.LinkedList;
import java.util.List;

import static content.Image.printImage;
import static content.Paragraph.printParagraph;


class Page {
    private String filename;
    private String title;

    private final List<Paragraph> paragraphs = new LinkedList<>();

    public Page(String myPage) {
        this.title = myPage;
    }


    public String generateContent() {
        String tillHead = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 TRANSITIONAL//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">" + "\n" + "<html>" + "\n" + "<head>" + "\n" + "<title>" + this.title + "</title>" + "\n" + "</head>" + "\n";
        String bodyStart = "<body>\n";
        for (Paragraph p : this.paragraphs){
            bodyStart = bodyStart + "\n" + p.generateContent() + "\n";
        }
        String bodyEnd = "</body>\n</html>\n";
        return tillHead;
    }



    public void addParagraph(Paragraph p) {
       this.paragraphs.add(p);
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
    public static void printPage(Page pg) {
        Paragraph[] paragraphs = pg.getParagraphs().toArray(new Paragraph[0]);
        System.out.println(pg.getFilename());
        System.out.println(pg.getTitle());

        for (Paragraph paragraph : paragraphs) {
            Image[] images = paragraph.getImages().toArray(new Image[0]);
            printParagraph(paragraph);
}}}

