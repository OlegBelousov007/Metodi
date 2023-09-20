import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int mas[] = new int[10];
        for (int i=0; i<mas.length; i++) {
            mas[i] = (int) (Math.random() * 10);
        }
        System.out.println("Неотсортированный массив: " + Arrays.toString(mas));
        int tmp;
        boolean statusSort = false;

        int tmpFor =0;

        while (!statusSort){

            statusSort = true;
            for (int i=0; i<(mas.length-1) - tmpFor; i++) {

                if (mas[i]>mas[i+1]) {
                    statusSort = false;
                    tmp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = tmp;
                }
            }
            tmpFor++;
            System.out.println(tmpFor + " - " + Arrays.toString(mas) +" "+statusSort);

        }
        System.out.println("Отсортированный массив: " + Arrays.toString(mas));
    }

}
