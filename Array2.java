public class Array2{
  public static void main(String[] args) {
    int []a={1,2,3,4,5};
    a[2]=45;
    for (int i : a) {
      System.out.println(i);
    }
    for(int i=0;i<=a.length-1;i++){
      a[2]=45;
      System.out.println(a[i]);
    }
  }
  // Prepare an Array with values of 1,2,3,4,5 and replace the value at 3rd index with 45
}
