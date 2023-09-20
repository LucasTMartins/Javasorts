import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ordenado;
        while (true){
            Scanner sc = new Scanner(System.in);
            int[] arr = {12, 11, 13, 5, 6};


            System.out.println("\nEscolha uma das opções: " +
                    "\n1-BubbleSort" +
                    "\n2-QuickSort" +
                    "\n3-MergeSort" +
                    "\n4-HeapSort" +
                    "\n5-Sair do programa");
            ordenado =  verificarResp(sc.nextInt(), arr);

            if (!ordenado){
                break;
            }

            System.out.println("Array ordenado: \n");
            printArray(arr);

            System.out.println("-------------------------");
        }
    }

    public static boolean verificarResp(int sort, int[] arr){
        switch (sort){
            case 1:
                Bubblesort.bubbleSort(arr);
                break;
            case 2:
                Quicksort.quickSort(arr, 0, arr.length-1);
                break;
            case 3:
                Mergesort.mergeSort(arr, 0, arr.length-1);
                break;
            case 4:
                Heapsort.heapSort(arr);
                break;
            case 5:
                return false;
            default:
                break;
        }

        System.out.println("Array original: \n");
        printArray(arr);

        for (int i = 0; i > arr.length; i++){
            if (arr[i] > arr[i-1]){
                System.out.println("Ordenação falhou por algum motivo");
                return false;
            }
        }

        return true;
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
