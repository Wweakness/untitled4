import org.omg.CosNaming.BindingTypeHolder;

import java.util.*;
public class test2 {
    public int findKth(int[] a, int n, int K) {
        int left=0;
        int right=n-1;
        int less=left-1;
        int great=right;
        int index=left;
        while(index<great){
            if(a[index]<a[right]){
                swap(a,index,less);
                index++;
                less++;
            }
            else if(a[index]==a[right]){
                index++;
            }
            else {
                swap(a,index,great-1);
                great--;
            }
        }
        swap(a,right,great);
        return








    }

}
