import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithmChocolaProblem {
    
    public static void main(String[] args) {
        
        Integer costVer[] = {2,1,3,1,4};//m-1
        Integer costHor[] ={4,1,2};//n-1

        Arrays.sort(costVer,Comparator.reverseOrder());
        Arrays.sort(costHor,Comparator.reverseOrder());

        int h=0;int v=0;//horizontal index, vertical index
        int hp=1,vp=1;//number of horizontal and vertical pieces
        int cost =0;

        while(h<costHor.length && v<costVer.length){
            //vertical cost< hor cost
            if(costVer[v]<=costHor[h]){
                //horizontal cut
               cost+=(costHor[h]*vp ) ;
               hp++;
               h++;
            }else{
                //vertical cur
                cost+=(costVer[v]*hp);
                vp++;
                v++;
            }
        }

        //if some horizontal cuts remain
        while(h<costHor.length){
            cost+=(costHor[h]*vp ) ;
               hp++;
               h++;
        }

        //if some vertical cuts remain

        while(v<costVer.length){
            cost+=(costVer[v]*hp);
            vp++;
            v++;
        }

        System.out.println("min cost of cuts = "+cost);

    }
}
