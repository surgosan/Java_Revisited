public class A_Variables_and_Arrays {
    public static void main(String[] args) {
        int integer = 1;
        double decimal = 1.01;
        double addition = integer + decimal;

        double[] oneArray = {5.00, addition, 9.99};
        double[] twoArray = {addition, 2.00, 9.11};

        double[][] twoDimensionalArray = {oneArray, twoArray};
        System.out.printf("The first item in each sub array are %f and %f respectively.", twoDimensionalArray[0][0], twoDimensionalArray[1][0]);

        for(int i = 0; i < twoDimensionalArray.length; i++) {
            System.out.println("Found and item in the multi dimensional array");
        }
    }
}
