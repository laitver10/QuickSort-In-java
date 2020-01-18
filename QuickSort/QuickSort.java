public class QuickSort {

	public static void main(String[] args) {
		int[] a={8,3,6,4,5,3,7,13,2};
        int p=0;
		int r=a.length-1;
		QuickSort(a,p,r);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	private static void QuickSort(int[] a, int p, int r) {
		if(p<r){
		int q=Partition(a,p,r);
		QuickSort(a,p,q-1);
		QuickSort(a,q+1,r);
		}
	}

	private static int Partition(int[] a, int p, int r) {
		int pivot=a[r];
		int i=p-1;
		for(int j=p;j<r;j++){
			if(a[j]<=pivot){
				i++;
				swap(a,i,j);
			}
		}
		swap(a,i+1,r);
		return i+1;
	}

	private static void swap(int[] a, int i, int j) {
	  int p=a[i];
	  a[i]=a[j];
	  a[j]=p;
	}

}
