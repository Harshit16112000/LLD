public class MainFile {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        Board board = new Board();
        try {
            board.play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
