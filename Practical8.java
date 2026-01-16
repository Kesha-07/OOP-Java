class Practical8 {
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        // Convert command-line arguments to integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform calculation (sum)
        int sum = num1 + num2;

        // Print the result
        System.out.println("Sum of the two numbers: " + sum);
    }
}
