public class GenericsPractice {
    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] words = {"Apple","Ball","Pen","Laptop"};
        Integer[] numbers = {1,2,3,4,5,6,7,8};

        printArray(words);
        printArray(numbers);
    }
}
