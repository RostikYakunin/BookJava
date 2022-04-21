import javax.swing.*;
public class HelloWorld {

    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Привет, как тебя зовут ?");
    String age = JOptionPane.showInputDialog("Сколько Вам лет ?");
    String category = JOptionPane.showInputDialog("Какая у вас категория прав ?");
    String conclude = "Вывод по вашим данным ! \n" + "Вас зовут: " +name+ "\n" + "Возраст: " +age+ "\n" + "Категория прав: " +category;
            JOptionPane.showMessageDialog(null, conclude );




    }




}
