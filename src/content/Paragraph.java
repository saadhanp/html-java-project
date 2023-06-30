package content;


import java.util.ArrayList;
import java.util.List;

import static content.Image.printImage;

public class Paragraph {
    private String title;
    private String text;

    private List<Image> images;

    public Paragraph(String title, String text, List<Image> images) {
        this.title = title;
        this.text = text;
        this.images = images;
    }

    public Paragraph(String title) {
        this.title = title;
    }


    public void addText(String text) {
        this.text = text;
    }

    public void addImage(Image image) {

        this.images.add(image);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String generateContent() {
        String tillImages = this.text;
        String images =  "<p>\n";
        for (Image i : this.images){
            images = images + "\n" + i.generateContent();
        }
        String paragraphEnd = "</p>";


        return tillImages;
    }
    public static void printParagraph(Paragraph p) {
        System.out.println(p.getTitle());
        System.out.println(p.getText());
        Image[] images = p.getImages().toArray(new Image[0]);
        for (Image image: images){
            printImage(image);}

    }

}
