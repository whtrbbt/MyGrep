/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygrep;

/**
 * Организация ввода-вывода текста
 * 
 * @author alekseyp
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputOutput {
    
  
      
    public String readConsole() {
        
        java.io.Console cons = java.lang.System.console();
        

        //пробуем инициализировать консоль
        //TODO сделать проверку при помощи исключений
        if (cons==null) { 
            System.err.println("Не могу инициализировать консоль");
            return null;
        }
        String rl = cons.readLine();
        return rl;
        
    }
    
    /**readFile(String filename) читает текст из файла*/
    /**@param String filename имя (путь) файла*/
    public void readFile(String filename) {
        try {
            BufferedReader buf = new BufferedReader(new FileReader(filename));
 
            String str = buf.readLine();
 
            System.out.println("The first line is:");
            System.out.println(str);
 
            str = buf.readLine();
 
            System.out.println("The second line is:");
            System.out.println(str);
 
            buf.close();
        }
 
        catch(FileNotFoundException e) {
            System.out.println("Файл \""+filename+"\" не найден "+
            "или отсутсвует доступ.");
        }
 
        catch(IOException e) {
            System.out.println("Ошибка чтения файла "+filename);
        }
    }
    
    public void writeConsole(String s) {
        
    }
    
    public void writeFile(String filename) {
        
    }
}
