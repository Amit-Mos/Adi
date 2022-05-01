import java.awt.*;

public class test {
    public static void main(String[] args) {
        Color[][] colors = {{Color.WHITE,Color.RED,Color.WHITE},{Color.YELLOW,Color.GREEN,Color.YELLOW},{Color.BLUE,Color.BLUE,Color.BLUE}};
        wig w = new wig(colors);
        w.printWig();
    }
}
