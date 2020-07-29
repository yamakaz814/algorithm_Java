public class Sort {
  public static void main(String[] args) {
    int[] a = {50,60,70,80,90,40,30,20,10};
    for (int i = 0; i < a.length; i++){
      for (int j = i-1;j > 0;j--){
        if(a[i] < a[j]){
          int n = a[i];
          a[i] = a[j];
          a[j] = n;
        }
      }
    }
    for (int array:a){
      System.out.println(array);
    }
  }
  
}