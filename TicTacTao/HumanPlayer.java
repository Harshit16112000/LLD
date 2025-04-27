

public class HumanPlayer implements PlayersStrategy {
    public Symbols symbol; // Assuming you have a Symbols enum or class

    public HumanPlayer( Symbols symbol) {    
        this.symbol = symbol;
    }

    public Symbols getSymbol() {
        return symbol;
    }
}
