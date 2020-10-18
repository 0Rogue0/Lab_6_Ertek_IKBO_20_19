package DZ;
import java.util.Arrays;
public class first_task {
    public static void main(String[] args) {

        Student[] group = new Student[3];
        int[] score = {5,5};
        group[0] = new Student("Maksim", 11, score);
        score = new int[]{2,2};
        group[1] = new Student("Maris", 9, score);
        score = new int[]{4,3};
        group[2] = new Student("Andrei", 10, score);

        for (int beer = 0; beer < group.length; beer++) {
            Student x = group[beer];
            int i = beer - 1;
            for (; i >= 0; i--) {
                if (group[beer].id < group[i].id) {
                    group[i + 1] = group[i];
                } else {
                    break;
                }
            }
            group[i + 1] = x;
        }
        System.out.println(group[0]);
    }
}

class Student {
    String name;
    int id;
    int[] data = new int [2];

    Student(String name, int id, int[] data){

        this.name = name;
        this.id = id;
        this.data = data.clone();
    }

}