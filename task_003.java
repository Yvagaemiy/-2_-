public class task_003 {
    public static void main(String[] args) {
        // Заданный массив
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Чётные числа из массива:");
        
        // Перебор всех элементов массива
        for (int i = 0; i < numbers.length; i++) {
            // Проверка на чётность
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}
