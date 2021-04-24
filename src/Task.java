import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    private void compareValue(float value){
        if (value>7)
            System.out.println("Привет");
    };

    private void compareName(String name){
        if (name.equals("Вячеслав"))
            System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    };

    private void getMultipleValue(ArrayList<Float> array){
        String result="";
        for (int i=0; i<array.size(); i++){
            if (array.get(i)%3==0)
                result +=array.get(i)+" ";
        }
        System.out.println(result);
    };


    public static void main(String[] args) {
        try{
            boolean check = true;
            Scanner scanner = new Scanner(System.in);
            Task info = new Task();
            while (check) {
                System.out.println("Выберите задачу:\n 1. Больше 7\n 2. Совпадает с \"Вячеслав\"\n 3. Кратные 3\n 0. Завершить программу");
                switch (scanner.nextInt()) {
                    case 0:
                        check = false;
                        break;
                    case 1:
                        System.out.println("Введите числовое значение");
                        scanner.nextLine();
                        info.compareValue(Float.parseFloat(scanner.nextLine().replace(",",".")));
                        break;
                    case 2:
                        System.out.println("Введите имя");
                        scanner.nextLine();
                        info.compareName(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Введите массив через пробел");
                        scanner.nextLine();
                        String [] list = scanner.nextLine().replace(",",".").split(" ");
                        ArrayList<Float> array = new ArrayList<>();
                        for (int i = 0; i<list.length; i++){
                            if (list[i].equals("")) continue;
                            array.add(Float.parseFloat(list[i]));
                        }
                        info.getMultipleValue(array);
                        break;
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        };
    }
}
