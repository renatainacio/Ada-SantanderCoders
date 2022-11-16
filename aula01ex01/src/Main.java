public class Main {
    public static void main(String[] args)
    {
        double[] gastos = {10000d, 17000d, 23000d};;
        System.out.printf("O total de gastos no trimestre foi R$%.2f.\n", sum(gastos));
    }

    public static double sum(double[]array)
    {
        int i;
        double sum = 0;
        for(i = 0; i < array.length; i++)
            sum += array[i];
        return(sum);
    }
}