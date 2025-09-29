//Assignment Task 01: Container with Most Water
class AssgnTask1{

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static void mostWater( Integer[] height ){
    int hmax1 =0;
    int hmax2=0;
    int sidx=0;
    int eidx=0;
        for(int i=0;i<height.length;i++){
     if(hmax1<height[i]){
hmax1=height[i];
sidx=i;

     }}
      



     for(int j=0;j<height.length;j++){
        if(hmax1 ==height[j]){
            continue;
        }
     if(hmax2<height[j]){
    hmax2=height[j];
    eidx=j;
     }


     }
     int breath = eidx-sidx;
     int area =breath*hmax2;
 System.out.println(area);
        }

    

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
