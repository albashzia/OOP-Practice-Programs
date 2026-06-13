public class GenericsPractice {
    public static <T> void printArray(T[] array){
        for(T item : array){
            System.out.println(item);
        }
    }
}
