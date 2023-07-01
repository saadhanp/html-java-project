package content;

public class Style {
    String bgColor;
    String title;
    String titleColor;
    String font;
    String textColor;


    public String getStyle() {
       String style = """
                <style>
                body {background-image: linear-gradient(180deg, @BACKCOLOR, white);}
                                
                .center {
                  display: block;
                  margin-left: auto;
                  margin-right: auto;
                }
                h1   {color: "@HEADCOLOR";
                      font-family: @FONTSTYLE;
                      text-align:center;
                      }
                                
                h2   {color: @HEADCOLOR;
                      font-family: @FONTSTYLE;
                      text-align: justify;
                      }
                                
                p    {color: @FONTCOLOR;
                      font-family: @FONTSTYLE;
                      padding: 30px;
                      text-align: justify;
                      background-color: white;
                      box-shadow: 4px 0 2px -2px rgba(0,0,0,0.4);
                      font-size: 14px;
                      }
                                
                </style>
                """;

        style = style.replaceAll("@HEADCOLOR", titleColor);
        style = style.replaceAll("@FONTSTYLE", font);
        style = style.replaceAll("@FONTCOLOR", textColor);
        return style.replaceAll("@BACKCOLOR", bgColor);

    }

}