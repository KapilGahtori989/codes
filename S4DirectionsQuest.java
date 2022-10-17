public class S4DirectionsQuest {
    public static void main(String[] args) {
        String str="WNEENESENNN";
        shortestPath(str);
    }
    private static void shortestPath(String str){
        double x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
            }else if(str.charAt(i)=='E'){
                x++;
            }else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }

        }
        double path = Math.pow(x,2) + Math.pow(y, 2);
        double finalPath =Math.sqrt(path);
        System.out.println(finalPath);
    }
    
}
