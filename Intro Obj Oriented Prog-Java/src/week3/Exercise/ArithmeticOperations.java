package week3.Exercise;

enum ArithmeticOperations {
    ADD('+'),
    SUB('-'),
    DIV('/'),
    MUT('*');

    public final char character;

    private ArithmeticOperations(char character) {
        this.character = character;
    }
}
