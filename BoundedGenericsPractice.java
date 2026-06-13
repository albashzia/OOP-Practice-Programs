class Stats<T extends Number>{
    T[] nums;

    Stats(T[] nums){
        this.nums = nums;
    }

    double sum(){
        double sumArray = 0.0;
        for(T num: nums){
            sumArray += num.doubleValue();
        }
        return sumArray;
    }
}

public class BoundedGenericsPractice {
    public static void main(String[] args) {
        Integer[] intNums = {1,4,5,6,8,2};
        Double[] doubleNums = {2.4,5.7,3.6,9.1,6.3};

        Stats<Integer> integerStats = new Stats<>(intNums);
        Stats<Double> doubleStats = new Stats<>(doubleNums);

        System.out.println(integerStats.sum());
        System.out.println(doubleStats.sum());
    }
}
