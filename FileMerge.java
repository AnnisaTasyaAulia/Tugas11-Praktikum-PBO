import java.io.*;

public class FileMerge {
    public static void main(String[] args) {
        String[] files = {"C:\\Users\\komputer 2\\Documents\\PBO\\student.csv", "C:\\Users\\komputer 2\\Documents\\PBO\\new_student.csv"};
        String mergedFile = "C:\\Users\\komputer 2\\Documents\\PBO\\merge.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFile))) {
            for (String file : files) {
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        bw.write(line);
                        bw.newLine();
                    }  
                    
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
