package calculator;
import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;
 //@date Sep 26, 2016
 //@author Artsiom_Berazavik

public class CalculatorRunner {
    public static void main(String[] args) {
        Concationation c = new Concationation();
        Scanner in = new Scanner(System.in);
        
        double x;
        double y;

        try {
            out.println("Введите первое число, например 3,14:");
            x = in.nextDouble();

            out.println("Введи второе число:");
            y = in.nextDouble();

            out.println("Результатом слажения " + x + " и " + y + " является " + c.add(x, y));
            
            } catch (InputMismatchException ex) {
                out.println("Введите число при следующем запуске.");
        }
    }
}
//Пользователь должен увидеть приглашение в командной строке с выбором 1 2 или 3
//обработчик ошибок позаботится о правильности ввода или об ошике показывающейся пользователю
//после выбора операции будет предложено ввести 2 занчения, обработать ошибки тут тоже
//в остальных методах также
//отдельно обработать деление на о
