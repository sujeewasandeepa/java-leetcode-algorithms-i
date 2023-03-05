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

        MoveZeroes.Solution mz = new MoveZeroes.Solution();
        int[] valMZ = mz.moveZeroes(mz.caseOne.getNums());
        System.out.println("---- Move Zeroes ----");
        printArray(valMZ);

        TwoSum2.Solution ts2 = new TwoSum2.Solution();
        int[] valTS2 = ts2.twoSum(ts2.caseTwo.getNums(), ts2.caseTwo.getTarget());
        System.out.println("---- Two Sum 2 ----");
        printArray(valTS2);

        ReverseString.Solution rs = new ReverseString.Solution();
        char[] valRS = rs.reverseString(rs.caseTwo.getChars());
        System.out.println("---- Reverse String ----");
        printArray(valRS);

        ReverseWords.Solution rw = new ReverseWords.Solution();
        String valRW = rw.reverseWords(rw.caseOne.getS());
        System.out.println("---- Reverse Words ----");
        System.out.println(valRW);

        LongestSubstring.Solution ls = new LongestSubstring.Solution();
        int valLS = ls.lengthOfLongestSubstring(ls.caseTwo.getS());
        System.out.println("---- Longest Substring ----");
        System.out.println(valLS);

        PermutationInString.Solution pis = new PermutationInString.Solution();
        boolean valPIS = pis.checkInclusion(pis.caseOne.getS(), pis.caseOne.getS2());
        System.out.println("---- Permutation In String ----");
        System.out.println(valPIS);

        FloodFill.Solution ff = new FloodFill.Solution();
        int[][] valFF = ff.floodFill(ff.caseOne.getMatrix(), ff.caseOne.getSr(), ff.caseOne.getSc(), ff.caseOne.getTarget());
        System.out.println("---- Flood Fill ----");
        printMatrix(valFF);

        MaxAreaOfIsland.Solution ma = new MaxAreaOfIsland.Solution();
        int valMA = ma.maxAreaOfIsland(ma.caseOne.getMatrix());
        System.out.println("---- Max Area Of Island ----");
        System.out.println(valMA);


        MergeTwoBinaryTrees.Solution mtbt = new MergeTwoBinaryTrees.Solution();
        // MergeTwoBinaryTrees.TreeNode valMTBT = mtbt.mergeTrees(mtbt.root1, mtbt.root2);
        System.out.println("---- Merge Two Binary Trees ----");
        System.out.println("hard to test");

    }

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
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

    public static void printArray(char[] arr) {
        for (char element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}