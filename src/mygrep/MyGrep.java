/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygrep;

/**
 * Аналог grep 
 * фильтрует поток текстовой информации подаваемой на вход и
 * на выходе показывает лишь те строчки, которые содержат слово
 * передаваемое программе на вход в качестве аргумента.
 * 
 * Примеры использования приложения MyGrep: 
 *             MyGrep -?    (этот текст).
 *             MyGrep искомое_выражение имя_файла
 *             MyGrep -r регулярное_выражение имя_файла
 * 
 * @author alekseyp
 */
public class MyGrep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //текст подсказки
        String help; 
        help = "Примеры использования приложения MyGrep: \n" +
               "MyGrep -?    (этот текст).\n" + 
               "MyGrep искомое_выражение имя_файла\n" +
               "MyGrep -r регулярное_выражение имя_файла\n"; 
        
        //Обработка аргументов запуска программы
        //- нет аргументов
        if (args.length == 0){
            System.out.println(" Неверное заданы передаваемые параметры!\n" +
                    help);
            return;
        
        //- аргументов больше чем нужно
        } else if (args.length > 3) {
            System.out.println("Неверное заданы передаваемые параметры!\n"+
                    help);
            return;
        
        //- помощь
        } else if (args[0].equals ("-?")) {
            System.out.println(help);
            return;
        
        //- поиск по регулярному выражению
        } else if ((args[0].equals ("-r")) & (args.length == 3)) {
            System.out.println("Поиск регулярного выражения. В данной версии " +
                    "не реализованно.");
            return;
        
        //- поиск обычного текста
        } else if (args.length == 2) {
            String filename = args[1]; //получаем имя файла
            InputOutput file = new InputOutput();
            file.readFile(filename);
//            System.out.println("Поиск по текстовому выражению. В данной версии " +
//                    "не реализованно.");
            return;
        
        //- исключение других вариантов
        } else {
            System.out.println("Неверно заданы передаваемые параметры!\n" + 
                    help);
            return;
        }
        
    }
}
