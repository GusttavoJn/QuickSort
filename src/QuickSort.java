import java.util.Arrays;

public class QuickSort {

    public static void quicksort(int[] v) {
        quicksort(v, 0, v.length -1);
    }

    public static void quicksort(int[] v, int i, int f) {
        if (i < f) {
            int p = separacao(v, i, f);
            quicksort(v, i, p -1);
            quicksort(v, p + 1, f);
        }
    }
    public static int separacao(int[] v, int i, int f) {
        int pivo = v[i];
        int e = i;
        int d = f;

        while (e <= d) {
            while (e <= f && v[e] < pivo) e++;
            while (d >= i && v[d] > pivo) d--;
            
            if (e <= d) {
                int aux = v[e];
                v[e] = v[d];
                v[d] = aux;
                e++;
                d--;
            }
        }
        return e;
    }
    public static void main(String[] args) throws Exception {
        int[] vetor = {1, 3, 6, 2, 4, 5};

        quicksort(vetor);

        System.out.println(Arrays.toString(vetor));
    }
}
