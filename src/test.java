import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class test {

    public static void printWig(wig w, Map<Color, String> dictionary) {
        for (int i = 0; i < w.getSizeOfCube(); i++) {
            for (int j = 0; j < w.getSizeOfCube(); j++) {
                System.out.print(dictionary.get(w.getWigColors()[i][j]) + " | ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Map<Color, String> dictionary = new HashMap<Color, String>();
        dictionary.put(Color.BLUE, "BLUE  ");
        dictionary.put(Color.RED, "RED   ");
        dictionary.put(Color.WHITE, "WHITE ");
        dictionary.put(Color.GREEN, "GREEN ");
        dictionary.put(Color.ORANGE, "ORANGE");
        dictionary.put(Color.YELLOW, "YELLOW");

        Color[][] colors = {{Color.WHITE, Color.RED, Color.WHITE},{Color.YELLOW,Color.GREEN,Color.YELLOW},{Color.BLUE,Color.BLUE,Color.BLUE}};
        wig w = new wig(colors);
        printWig(w, dictionary);
        w.rotateWig(false);
        printWig(w, dictionary);

    }
}
