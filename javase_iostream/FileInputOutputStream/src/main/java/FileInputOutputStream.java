import java.io.*;

public class FileInputOutputStream {
    
    public static void main(String[] args) throws IOException {
        
        File inputFile = new File("farrago.txt");
        File outputFile = new File("outagain.txt");
        
        FileInputStream in = new FileInputStream(inputFile);
        FileOutputStream out = new FileOutputStream(outputFile);
        int b;
        
        while ((b = in.read()) != -1){
            System.out.println(b);
            //System.out.printf("%x\n", b);
            out.write(b);
        }
        
        System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");
        
        in.close();
        out.close();
    }
}
