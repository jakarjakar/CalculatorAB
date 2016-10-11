package calculator;
 //@date Sep 26, 2016
 //@author Artsiom_Berazavik

public class CalculatorRunner {
    public static void main(String[] args) {
       Concationation c = new Concationation();
       System.out.println(c.add(20, 21));
       }
}
//Пользователь должен увидеть приглашение в командной строке с выбором 1 2 или 3
//обработчик ошибок позаботится о правильности ввода или об ошике показывающейся пользователю
//после выбора операции будет предложено ввести 2 занчения, обработать ошибки тут тоже
//в остальных методах также
//отдельно обработать деление на о
