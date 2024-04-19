import com.github.lalyos.jfiglet.FigletFont;

public class ArtGenerator {
    public static void main(String[] args) {
        String asciiArt = FigletFont.convertOneLine("Java RulZzzZz");
        System.out.println(asciiArt);
    }
}
