package ujiantengahsemester;
import java.util.Scanner;
public class nomor3_matriks {
    public static void main(String[] args) {
        int i, j, m, n;
        int matriks[][] = new int[10][10];
        int tranpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        System.out.print("masukkan jumlah baris matriks A: ");
        System.out.println();
        n = scan.nextInt();
        System.out.println("masukkan jumlah kolom matriks A: ");
        System.out.println();
        System.out.println("masukkan elemen matriks A: ");
        for(i = 0; i< m; i++){
            for(j = 0; j< n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks A: ");
        for(i = 0; i< m; i++){
            for(j = 0;  j< n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                tranpose[j][i] = matriks[i][j];
            }
        }
        
        System.out.println("Hasil tranpose matriks A: ");
        for(i = 0; i < n ; i++){
            for(j = 0; j < m ; j++){
                System.out.print(tranpose[i][j] + "\t");
            }
            System.out.println();            
        }
        System.out.print("masukkan jumlah baris matriks B: ");
        System.out.println();
        n = scan.nextInt();
        System.out.println("masukkan jumlah kolom matriks B: ");
        System.out.println();
        System.out.println("masukkan elemen matriks B: ");
        for(i = 0; i< m; i++){
            for(j = 0; j< n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks B: ");
        for(i = 0; i< m; i++){
            for(j = 0;  j< n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                tranpose[j][i] = matriks[i][j];
            }
        }
        
        System.out.println("Hasil tranpose matriks B: ");
        for(i = 0; i < n ; i++){
            for(j = 0; j < m ; j++){
                System.out.print(tranpose[i][j] + "\t");
            }
            System.out.println();            
        }
        System.out.print("Masukkan jumlah baris matriks B: ");
        System.out.println();
        n = scan.nextInt();
        System.out.println("masukkan jumlah kolom matriks B: ");
        System.out.println();
        System.out.println("masukkan elemen matriks B: ");
        for(i = 0; i< m; i++){
            for(j = 0; j< n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks B: ");
        for(i = 0; i< m; i++){
            for(j = 0;  j< n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                tranpose[j][i] = matriks[i][j];
            }
        }
        
        System.out.println("Hasil tranpose matriks B: ");
        for(i = 0; i < n ; i++){
            for(j = 0; j < m ; j++){
                System.out.print(tranpose[i][j] + "\t");
            }
        System.out.println();
        }
        System.out.println();
        System.out.println("Maziyyati Mayyadah - 20090082");
        System.out.println("2D DIV TEKNIK INFORMATIKA");
    }
}