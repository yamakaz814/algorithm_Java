public class BubbleSort {
  public static void main(String[] args){
    int array[] = new int[]{2,9,6,7,5,10,3,4,8,1};
    for(int i = 0;i < array.length - 1;i++){
      for(int j = array.length - 1; j > i; j--){
        if(array[j] < array[j - 1]){
          int n = array[j];
          array[j] = array[j - 1];
          array[j - 1] = n;
        }
      }
          }
    
    for(int x:array){
      System.out.print(x);
    }
  }
}