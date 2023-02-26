import BinarySearch.BinarySearch;
import SearchInsertPosition.SearchInsertPosition;


public class Main {

    public static void main(String[] args) {
        
        BinarySearch binarySearch = new BinarySearch();
        int calBS = binarySearch.search(binarySearch.caseOne.getNums(), binarySearch.caseOne.getTarget());
        System.out.println("Binary Search: " + calBS);

        SearchInsertPosition sip = new SearchInsertPosition();
        int valSI = sip.searchInsert(sip.caseOne.getNums(), sip.caseOne.getTarget());
        System.out.println("Search Insert Position: " + valSI);

        SquaresOfaSortedArray.Solution soasa = new SquaresOfaSortedArray.Solution();
        int[] valSOSA = soasa.sortedSquares(soasa.caseOne.getNums());
        printArray(valSOSA);

        RotateArray.Solution ra = new RotateArray.Solution();
        int[] valRA = ra.rotate(ra.caseTwo.getNums(), ra.caseTwo.getTarget());
        printArray(valRA);
    }

    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
         System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}