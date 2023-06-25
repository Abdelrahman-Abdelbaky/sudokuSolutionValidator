import java.util.Scanner;

public class Main {
    public static int [][][]valid=new int[9][9][3];
    public static  int[][] sudoku = {
            {6, 2, 4, 5, 3, 9, 1, 8, 7},
            {5, 1, 9, 7, 2, 8, 6, 3, 4},
            {8, 3, 7, 6, 1, 4, 2, 9, 5},
            {1, 4, 3, 8, 6, 5, 7, 2, 9},
            {9, 5, 8, 2, 4, 7, 3, 6, 1},
            {7, 6, 2, 3, 9, 1, 4, 5, 8},
            {3, 7, 1, 9, 5, 6, 9, 4, 2},
            {4, 9, 6, 1, 8, 2, 5, 7, 3},
            {2, 8, 5, 4, 7, 3, 9, 1, 6}
    };

    public static  int[][] SoluteSudoku=new int[][]{
            {6, 0, 4, 5, 3, 0, 0, 8, 7},
            {0, 1, 0, 7, 0, 0, 6, 0, 4},
            {8, 3, 0, 6, 1, 4, 2, 0, 0},
            {0, 4, 3, 8, 6, 5, 7, 2, 9},
            {0, 5, 0, 2, 4, 7, 3, 6, 1},
            {7, 6, 2, 3, 9, 1, 4, 5, 8},
            {3, 7, 1, 9, 5, 6, 8, 4, 2},
            {4, 9, 6, 1, 8, 2, 5, 7, 3},
            {2, 8, 5, 4, 7, 3, 9, 1, 6}
    };
//            2
//            9
//            1
//            5
//            9
//            2
//            8
//            3
//            7
//            9
//            5
//            1
//            9
//            8

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i < SoluteSudoku.length; i++) {
            for (int j = 0; j < SoluteSudoku.length; j++) {
                if (SoluteSudoku[i][j]==0){
                    System.out.print("Arr["+i+"]["+j+"]: ");
                    SoluteSudoku[i][j]=scanner.nextInt();
                }

            }
        }

        System.out.println("******************Solute array******************");
        for (int i = 0; i < SoluteSudoku.length; i++) {
            for (int j = 0; j < SoluteSudoku.length; j++) {
                System.out.print(SoluteSudoku[i][j]+"\t");
            }
            System.out.println();
        }


        SolveSudoku solve=new SolveSudoku(SoluteSudoku,sudoku);
        validator v=new validator(sudoku);

        Thread T1=new Thread(v);
        Thread T2=new Thread(solve);
        T1.start();
        T1.join();
        T2.start();
        T2.join();



//        System.out.println("******************Main array******************");
//        for (int i = 0; i < sudoku.length; i++) {
//            for (int j = 0; j < sudoku.length; j++) {
//                System.out.print(sudoku[i][j]+"\t");
//            }
//            System.out.println();
//        }





//       for (int i =0;i<9;i++){
//           for (int j=0; j<9; j++){
//               System.out.print(" ");
//               for (int k=0; k<3; k++){
//                   System.out.print(valid[i][j][k]);
//               }
//           }
//           System.out.print("\n");
//           }


//           for (int i =0;i<9;i++){
//               for (int j=0; j<9; j++){
//                   for (int k=0; k<3; k++){
//                       if(valid[i][j][k]==0){
//                       System.out.print("invalid");
//                       //solve.printSolution(sudoku);
//                       return;
//                       }
//                    }
//
//               }
//           }
//           System.out.print("valid");




    }
}