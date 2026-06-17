package Day8;

import java.util.ArrayList;

// You are using Java
class HomeChallange_2 {
    private ArrayList<Integer> numList;
//
//    public NumberProcessor(ArrayList<Integer> numList){
//        this.numList = numList;
//    }
    public void processNumbers(){
        ArrayList<Integer> strictlyIncreasing = new ArrayList<>();

        for(int num : numList){
            if(strictlyIncreasing.isEmpty() || num > strictlyIncreasing.get(strictlyIncreasing.size() -1)){
                strictlyIncreasing.add(num);
            }
        }
        System.out.println(strictlyIncreasing);
    }
}
