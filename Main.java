public class Main
{
    public static void main(String[] args)
    {
        int[] list = new int[10];
        list[0]=5;
        list[1]=2;
        list[2]=4;
        list[3]=9;
        list[4]=7;
        list[5]=3;
        list[6]=8;
        list[7]=1;
        list[8]=6;
        list[9]=0;
        System.out.println("Unsorted List:");
        OutputList(list);
        long starttime = System.nanoTime();
        int[] BubbleSortList = BubbleSort(list);
        long endtime = System.nanoTime();
        System.out.println("Bubble Sort (Took "+(endtime-starttime)+" Nano Seconds):");
        OutputList(BubbleSortList);
        starttime = System.nanoTime();
        int[] InsertionSortList = InsertionSort(list);
        endtime = System.nanoTime();
        System.out.println("Insertion Sort (Took "+(endtime-starttime)+" Nano Seconds):");
        OutputList(InsertionSortList);
        starttime = System.nanoTime();
        int[] SelectionSortList = SelectionSort(list);
        endtime = System.nanoTime();
        System.out.println("Selection Sort (Took "+(endtime-starttime)+" Nano Seconds):");
        OutputList(SelectionSortList);
        starttime = System.nanoTime();
        int[] BogoSortList = BogoSort(list);
        endtime = System.nanoTime();
        System.out.println("Bogo Sort (Took "+(endtime-starttime)+" Nano Seconds):");
        OutputList(BogoSortList);
    }
    public static void OutputList(int[] list)
    {
        for (int j : list)
        {
            System.out.print(j);
        }
        System.out.println();
    }
    public static int[] BubbleSort(int[] list)
    {
        int i, j;
        boolean swapped;
        for (i = 0; i < list.length - 1; i++) {
            swapped = false;
            for (j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int LargeInt = list[j];
                    int SmallInt = list[j+1];
                    list[j+1] = LargeInt;
                    list[j] = SmallInt;
                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop,
            // then break
            if (!swapped)
                break;
        }
        return list;
    }
    public static int[] InsertionSort(int[] list)
    {
        int i, key, j;
        for (i = 1; i < list.length; i++)
        {
            key = list[i];
            j = i - 1;

            // Move elements of arr[0..i-1],
            // that are greater than key,
            // to one position ahead of their
            // current position
            while (j >= 0 && list[j] > key)
            {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
        return list;
    }
    public static int[] SelectionSort(int[] list)
    {
        int unsorted_list_length = list.length;
        for(int i=0;i<list.length;i++)
        {
            int minvalue;//value to swap with
            for(int j=list.length-unsorted_list_length;j<list.length;j++)
            {
                if(list[j]<list[i])
                {
                    minvalue=list[j];
                    list[j]=list[i];
                    list[i]=minvalue;
                    break;
                }
            }
            unsorted_list_length--;
        }
        return list;
    }
    public static int[] BogoSort(int[] list)
    {
        boolean sorted = false;
        // if array is not sorted then shuffle the
        // array again
        while (!sorted)
        {
            // Math.random() returns a double positive
            // value, greater than or equal to 0.0 and
            // less than 1.0.
            for (int i = 1; i < list.length; i++)
            {
                double randomint = Math.random() * i;
                int temp = list[i];
                list[i] = list[(int)randomint];
                list[(int)randomint] = temp;
            }
            for (int i = 1; i < list.length; i++)
            {
                if (list[i] < list[i - 1])
                {
                    sorted = false;
                    break;
                }
                sorted=true;
            }

        }
        return list;
    }
}
   