package algo;

public class SortMerge {
    private int[] arr;

    public void merge(int arr[], int left, int middle, int right){
        int size1 = middle -left +1;
        int size2 = right -middle;

        int L[] = new int [size1];
        int R[] = new int [size2];

        for (int i = 0; i <size1; i++) {
            L[i] = arr[left+i];
        }

        for (int j = 0; j < size2; j++) {
            R[j] = arr[middle+1+j];
        }
        int i=0; int j=0;
        int k=1;

        while (i<size1 && j<size2){
            if(L[i] <=R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < size1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j<size2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public int[] sort(int arr[], int left, int right) {
        if (left < right){
            int m = (left+right)/2;
            sort(arr, left, m);
            sort (arr, m+1, right);
            merge(arr, left, m, right);
        }
        return arr;
    }


}
