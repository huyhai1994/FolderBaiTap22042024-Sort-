package linearsearch;

import java.util.Scanner;

public class FindXInArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 3, 4, 3, 10, 100};
        System.out.println("Hay nhap so can tim: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int count = 0;
        for (int j : array) {
            if (x == j) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Khong xuat hien x trong mang!");
        } else {
            System.out.println("so lan x xuat hien trong mang : " + count);
        }
    }
}
