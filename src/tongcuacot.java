import java.util.Scanner;
public class tongcuacot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so hang :");
        int line = input.nextInt();
        System.out.println("Nhap vao so cot :");
        int colum = input.nextInt();
        int[][] array = new int[line][colum];
        int x;
        System.out.println("Nhap vao cot muon tinh tong :");
        x = input.nextInt();

        for(int i = 0; i < line; i ++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Nhap vao gia tri cua ma tran tai hang " + i + " cot " +j);
                array[i][j] = input.nextInt();
            }
        }
        int sum = 0;

        for(int i = 0; i < line; i ++) {
            for (int j = 0; j < colum; j++) {
                if(j == x) {
                    sum += array[i][j];
                }
            }
        }

        System.out.println("Tong cua cot " + x + " la " + sum);
    }
}
