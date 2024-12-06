enum OperationType {
    ADDITION("Adição"),
    SUBTRACTION("Subtração"),
    MULTIPLICATION("Multiplicação"),
    DIVISION("Divisão"),
    EXPONENTIATION("Exponenciação");

    private final String description;

    OperationType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}