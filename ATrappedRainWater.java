public class ATrappedRainWater {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int width =1;
        System.out.println(trappedWater(height,width));
    }
    private static int trappedWater(int height[],int width){//Time complexity--O(n)
        //calculate left auxillary array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<leftMax.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        //Calculate right auxillary array
        int rightMax[] = new int[height.length];
        rightMax[rightMax.length-1] = height[height.length-1];
        for(int i=rightMax.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        //Calculating trapped water

        int trappedWater =0;
        for(int i=0;i<height.length;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater+=(waterLevel - height[i])*width;
        }
        return trappedWater;
    }
}
