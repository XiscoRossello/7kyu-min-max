import java.util.List;

class MinMax {
  static int[] getMinMax(List<Integer> list) {
    int min = list.get(0);
    int max = list.get(0);
    for (int i = 0; i < list.size(); i++){
      if(min > list.get(i)){min = list.get(i); }
      else if(max < list.get(i)){max = list.get(i);}   
    } int[] solucion = new int[2];
      solucion[0] = min;
      solucion[1] = max;
      return solucion;
  }
}
