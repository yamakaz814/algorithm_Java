public class SelectionSort {
  public static void main(String[] args) {
    int[] a = new int[]{50,40,30,20,60,90,80,70,10};

    sort(a);
      for (int array:a){
        System.out.println(array);
      }
  
}
public static void sort(int[] a){
  for (int s = 0; s < a.length - 1;s++){
    int minNum = s;
    for (int i = s + 1; i < a.length; i++){
      if(a[i] < a[minNum]){
        minNum = i;
      }
      int t = a[s];
      a[s] = a[minNum];
      a[minNum] = t;
    }

  }
  }
}