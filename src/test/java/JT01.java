import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JT01 {

    @Test

    public void JT01(){

        // String arr[]={1,2,3,5,6}; the big from 0 not in the array

        Integer arr[]={67,2,3,99,4};

        List<Integer> list = Arrays.asList(arr);

        int result =99;
        for(int i=1;i<arr.length+1;i++){

           if(!list.contains(i)) {

               result =i;
               break;

           }else{

               result = list.size()+1;


            }
        }
        System.out.println(result);
    }
}
