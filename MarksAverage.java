class Student1 {
    private String name;
    private int[] resultArray;

    Student1(String n, int[] arr) {
        name = n;
        resultArray = arr;
    }
    float average() {
        float sum = 0;
        for (int i = 0; i < resultArray.length; i++) {
            sum += resultArray[i];
        }
        return (sum / resultArray.length);
    }
    String getName() {
        return name;
    }
    int[] getArray() {
        return resultArray;
    }
}

public class MarksAverage {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Ali", new int[]{80, 75, 90, 85, 70});
        Student1 s2 = new Student1("Zain", new int[]{85, 88, 92, 78, 80});

        float avg1 = s1.average();
        float avg2 = s2.average();

        System.out.println("Average of "+s1.getName() + " is " + avg1);
        System.out.println("Average of "+s2.getName() + " is " + avg2);

        if (avg1 > avg2) {
            System.out.println(s1.getName() + " has a higher average.");
        } else if (avg2 > avg1) {
            System.out.println(s2.getName() + " has a higher average.");
        } else {
            System.out.println("Both students have the same average.");
        }

        Student1 s3 = new Student1(s1.getName(), s2.getArray());

        System.out.println("Name: " + s3.getName());
        System.out.println("Average "+ s3.average());
    }
}