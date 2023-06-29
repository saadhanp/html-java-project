package content;

public class Main {
    public static void main(String[] args) {
        PageImpl page1 = new PageImpl();
        page1.setTitle(GetContent.GetWebTitle());
        GetContent.GetTitleColor();
        GetContent.GetBackgroundColor();
        GetContent.GetFontColor();
        GetContent.GetFontNumber();

    }
}