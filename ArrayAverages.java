import java.util.Arrays;

public class ArrayAverages{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray){
    ray = rayray;
  }

  public void rowAverages(){
    int sum = 0;
    int avg = 0;
  for(int row=0;row<ray.length;row++)
  {
    sum = 0;
    avg = 0;
    for(int col =0 ;col<ray[row].length; col++)
    {
      sum+=ray[row][col];
      avg++;
    }
    avg= sum/avg;
    System.out.println("the average of the row "+ row +" is "+ avg);
  }
  System.out.println("\n");
  }

  public void columnAverages(){
    int sum = 0;
    int avg = 0;
    
    for(int col =0 ;col<ray.length; col++)
    {
      sum = 0;
      avg = 0;
      for(int row=0;row<ray[col].length;row++)
      {
        sum+=ray[row][col];
        avg++;
      }
      avg= sum/avg;
      System.out.println("the average of the column "+ col +" is "+ avg);
    }
    System.out.println("\n");
  }

  public void arrayAverage(){
    int sum = 0;
    int avg = 0;
    
    for(int col =0 ;col<ray[0].length; col++)
    {
      for(int row=0;row<ray.length;row++)
      {
        sum+=ray[row][col];
        avg++;
      }
      
    }
    avg= sum/avg;
      System.out.println("the average of the entire Array is "+ avg);
      System.out.println("\n");
  }
  

  public String toString(){
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
