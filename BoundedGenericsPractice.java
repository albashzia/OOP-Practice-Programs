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
}
