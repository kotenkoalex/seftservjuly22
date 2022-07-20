package homeworks.lesson4.chessboard;

public class ChessboardBuilder implements ChessboardProperties {
    private int width;
    private int height;

    public ChessboardBuilder() {
    }

    public ChessboardBuilder(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void drawChessboard() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(i % 2 == 0 ? "*" + " " : " " + "*");
            }
            System.out.println();
        }
    }
}