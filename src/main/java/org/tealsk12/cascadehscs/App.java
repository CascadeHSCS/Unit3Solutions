package org.tealsk12.cascadehscs;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        final String testInput = "I Love Computer Science ";
        Question4.printShortWordsSplit(testInput, 4);
        Question4.printShortWordsRecursive(testInput, 4);
        Question4.printShortWordsIterative(testInput, 4);
    }
}
