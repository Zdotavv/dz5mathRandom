public class Main {
    public static void main(String[] args) {
        System.out.println("Рандомные числа");
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] =((int) (Math.random()*30)+1);
            System.out.println(array[i]);
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
        }
        System.out.println("Максимальные и минимальные числа: ");
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
