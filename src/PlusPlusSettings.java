public class PlusPlusSettings {

    public static short shoppingCartBallCapacity = 1000;
    public static short ballsPerSecond = 1500;
    public static short millisecondsInBetweenShots = (short)(1000 / ballsPerSecond);

    public PlusPlusSettings() {

    }

    static int shoppingCartFullness(int ballsInShoppingCart) {
        if(ballsInShoppingCart >= shoppingCartBallCapacity - 5) {
            return 2;
        } else if (ballsInShoppingCart > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
