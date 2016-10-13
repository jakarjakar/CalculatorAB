package calculatorab;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;
 //@date Sep 26, 2016
 //@author Artsiom_Berazavik

public class CalculatorRunner {
    public static void main(String[] args) {
        Concationation c = new Concationation();
        Scanner in = new Scanner(System.in);
        
        //Хелп после запуска, показыватся один раз
        out.println("Калькулятор выполняет 4 действия: умножение(1) деление (2) сложение(3) вычитание(4) " + "\n" + "необходимую опцию введя 1, 2 или 3 соответсвтенно ");
        
        double x;
        double y;
        boolean keepRunning = true;
        boolean condition;

        try {
            while (keepRunning) {
                out.println("\n" + "Введите первое число, например 3,14:");
                x = in.nextDouble();
                out.println("Введи второе число:");
                y = in.nextDouble();
                out.println("Результатом слажения " + x + " и " + y + " является " + c.add(x, y)+ "\n" + "Следующая итерация выбранного действия:" + "\n");
                out.println("Продолжить работу (true/false)?");
                condition = in.nextBoolean();
                if (!condition) {
                    keepRunning = false;
                }
            }
        } catch (InputMismatchException ex) {
            out.println("\n" + "Введите число при следующем запуске." + "\n");
            ex.printStackTrace(System.err);
        }
    }
}
//+Пользователь должен увидеть приглашение в командной строке с выбором 1 2 или 3
//+обработчик ошибок позаботится о правильности ввода или об ошике показывающейся пользователю
//после выбора операции будет предложено ввести 2 занчения, обработать ошибки тут тоже
//в остальных методах также
//отдельно обработать деление на о
//обрабаттывать сложение, показывая только 8 разрядов после запятой
