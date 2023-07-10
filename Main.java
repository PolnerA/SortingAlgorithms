public class Main
{
    public static void main(String[] args) {
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
        OutputList(list);
        int[] BubbleSortList = BubbleSort(list);
        OutputList(BubbleSortList);
        //int[] InsertionSortList = InsertionSort(list);
        //OutputList(InsertionSortList);
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
}
   