import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 2\\Documents\\PBO\\new_student.csv";
         
        Scanner sc = new Scanner(System.in);
        boolean addData = true;            
                
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))){
            while (addData){
                System.out.print("Masukkan data [NIM,NAMA,UMUR,PRODI] : ");
                String data = sc.nextLine();
                
                bw.write(data);
                bw.newLine();
                
                System.out.print("Apakah Ingin Menambahkan lagi? (y/n): ");
                String response = sc.nextLine();
                if(!response.equalsIgnoreCase("y")) {
                    addData = false;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}