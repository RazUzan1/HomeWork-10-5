package com.company;;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class NewHash {
    public static ArrayList isPrime(ArrayList<Integer> a){

        Iterator<Integer> it = a.iterator();

        int sum = it.next();

        for(int i = 0 ; i < sum/2 ; i++){
            if(it.next() % i == 0){
                if(it.next() < 10){
                    it.remove();
                }
            }
        }
        return a;
    }

    public static ArrayList init(){
        int size;
        Random r = new Random();
        size = r.nextInt(10)+1;
        ArrayList<Integer> res = new ArrayList<>();
        while (size > 0){
            res.add(r.nextInt(1000));
            size--;
        }
        return res;
    }
    public static void main(){
        HashMap<Integer,ArrayList<Integer>> MyList = new HashMap<>();
        Iterator<Integer> key = MyList.keySet().iterator();
        Iterator<ArrayList<Integer>> value= MyList.values().iterator();

        MyList.put(1,init());
        MyList.put(2,init());
        MyList.put(3,init());
        MyList.put(4,init());

        while (key.hasNext()){

            ArrayList<Integer> sum = isPrime (value.next());
            Iterator<Integer> MyIterator = sum.iterator();

            if ( MyList.size() < 10) {
                    key.remove();
                }
            System.out.println(MyList);
                }
            }
}


