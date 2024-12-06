public class Calculator {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Bem-vindo à Calculadora!");
        System.out.println("Escolha uma operação:");

        for (OperationType operation : OperationType.values()) {
            System.out.println(operation.ordinal() + 1 + " - " + operation.getDescription());
        }

        System.out.print("Digite o número da operação desejada: ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > OperationType.values().length) {
            System.out.println("Operação inválida. Encerrando o programa.");
            return;
        }

        OperationType selectedOperation = OperationType.values()[choice - 1];

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        try {
            switch (selectedOperation) {
                case ADDITION:
                    result = Operation.add(num1, num2);
                    break;
                case SUBTRACTION:
                    result = Operation.subtract(num1, num2);
                    break;
                case MULTIPLICATION:
                    result = Operation.multiply(num1, num2);
                    break;
                case DIVISION:
                    result = Operation.divide(num1, num2);
                    break;
                case EXPONENTIATION:
                    result = Operation.exponentiate(num1, num2);
                    break;
            }

            System.out.println("O resultado da " + selectedOperation.getDescription() + " é: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}