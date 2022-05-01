import java.awt.*;

public class wig {
    private static int sizeOfCube;
    private static final int defaultSize = 3;
    private Color[][] wigColors;

    public wig(Color[][] wigColors) {
        this.sizeOfCube = defaultSize;
        this.wigColors = wigColors;
    }

    public wig(Color c, int size) {
        this.sizeOfCube = size;
        this.wigColors = new Color[this.sizeOfCube][this.sizeOfCube];

        for (int i = 0; i < this.sizeOfCube; i++) {
            for (int j = 0; j < this.sizeOfCube; j++) {
                this.wigColors[i][j] = c;
            }
        }
    }

    public static int getSizeOfCube() {
        return sizeOfCube;
    }

    public Color[][] getWigColors() {
        return wigColors;
    }

    public static void setSizeOfCube(int sizeOfCube) {
        wig.sizeOfCube = sizeOfCube;
    }

    public void setWigColors(boolean isRow, int numOfRowOrColumn, Color[] rowOrColumnColor) {
        if (isRow) {
            for (int i = 0; i < this.sizeOfCube; i++) {
                this.wigColors[numOfRowOrColumn][i] = rowOrColumnColor[i];
            }
        }
        else {
            for (int i = 0; i < this.sizeOfCube; i++) {
                this.wigColors[i][numOfRowOrColumn] = rowOrColumnColor[i];
            }
        }
    }

    public void rotateWig(boolean dirFlag) {
        Color[][] new_wigColors = new Color[this.sizeOfCube][this.sizeOfCube];

        for (int i = 0; i < this.sizeOfCube; i++) {
            for (int j = 0; j < this.sizeOfCube; j++) {
                new_wigColors[this.sizeOfCube - 1 - j][this.sizeOfCube - 1 - i] = this.wigColors[i][j];
            }
        }
    }

    public void printWig() {
        for (int i = 0; i < this.sizeOfCube; i++) {
            for (int j = 0; j < this.sizeOfCube; j++) {
                System.out.print(this.wigColors[i][j]. + " ");
            }
            System.out.println();
        }
    }


}
