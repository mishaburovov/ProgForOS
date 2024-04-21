import java.io.*;

public class Main {
    public static void main(String[] args) {
        File inputFile = new File("program.java");
        File outputFile = new File("out.txt");
        int openBrackets = 0;
        int closeBrackets = 0;
        
        try {
            FileReader fileReader = new FileReader(inputFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            
            while ((line = bufferedReader.readLine()) != null) {
                for (char character : line.toCharArray()) {
                    if (character == '{') {
                        openBrackets++;
                    } else if (character == '}') {
                        closeBrackets++;
                    }
                }
            }
            
            bufferedReader.close();
            
            FileWriter fileWriter = new FileWriter(outputFile);
            fileWriter.write("Количество открывающихся скобок: " + openBrackets + "\n");
            fileWriter.write("Количество закрывающихся скобок: " + closeBrackets + "\n");
            fileWriter.close();
            
            System.out.println("Количество открывающихся скобок: " + openBrackets);
            System.out.println("Количество закрывающихся скобок: " + closeBrackets);
        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи файла: " + e.getMessage());
        }
    }
}
