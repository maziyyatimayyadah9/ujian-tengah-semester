package ujiantengahsemester;
import java.util.Scanner;
public class nomor1_sorting_searching {
        public static void selectionsort(int[] A) {
        int smallindex;
        int pass, j, n = A.length;
        int temp;
        
        for (pass = 0; pass < n - 1; pass++){
            smallindex = pass;
            for (j = pass + 1; j < n; j++){
                if (A[j] < A[smallindex]){
                    smallindex = j;
                }
            }
            
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
    }
    public static void tampil(int data[]) {
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    private static String[] pencarian;
    public static void binary(String[] pencarian){
        Scanner input = new Scanner(System.in);
        int data[] = {3,10,4,2,8,13};
        int indeksAkhir = data.length-1;
        int indeksAwal = 0;
        int found = 0;
        int tengah = 0;
        
        System.out.println(" List data angka:");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        
        System.out.println("Masukkan angka yang dicari:");
        int key = input.nextInt();
        
        while ((indeksAwal <= indeksAkhir)&&(found == 0)){
            tengah = (indeksAkhir+indeksAwal)/2;
            System.out.println(" Nilai tengah: "+tengah);
            if (key == data[tengah]){
                found = 1;
                System.out.println(" Nomer key: "+key+" indeks ke-"+tengah);
            }
            else{
                if (key < data[tengah]){
                    System.out.println(" cari di kiri ");
                    indeksAkhir = tengah-1;
                }
                else{
                    System.out.println(" cari di kanan ");
                    indeksAwal = tengah+1;
                }
            }
        }
        if (found == 1){
            System.out.println("Data ditemukan");
        }
        
        else{
            System.out.println("Data tidak ditemukan");
        }
    }
}