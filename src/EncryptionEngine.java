public class EncryptionEngine {
    String[][] input;
    String[] numericTranslationKey;
    int[][] numericTranslation;
    public EncryptionEngine(String[][] input) {
        this.input = input;
        numericTranslation = new int[input.length][input[0].length];
        numericTranslationKey = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    }

    public int[][] translateToNumbers() {
        for (int r = 0; r < input.length; r++)
        for (int c = 0; c < input[0].length; c++) {
            for (String t : numericTranslationKey) {
                
            }
        }
        return numericTranslation;
    }

    // public int[][] arrayMultiply() {
        
    // }
}
