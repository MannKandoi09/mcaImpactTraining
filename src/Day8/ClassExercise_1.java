package Day8;
import java.util.*;

import java.util.ArrayList;

class ClassExercise_1 {
    public static void manageGuestList(int n, Scanner sc) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i < n; i++){
            list.add(sc.nextLine());
        }

        for(String name : list){
            System.out.println(name);
        }
    }
}
