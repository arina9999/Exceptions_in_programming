package Except.HW2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            
            int a = 90;
            int b = 3;
            System.out.println(a / b); // ArithmeticException

            printSum(23, 234);    //вывод на печать метода

            int[] abc = { 1, 2 };      //IndexOutOfBoundsException
            abc[2] = 9;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!"); // Exception - ввод пустой строки
            }
        } catch (ArithmeticException ex) {
            System.out.println("Делить на 0 нельзя!");
        } catch (NullPointerException ex) {
            System.out.println("Указание на не существующий обьект");
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } catch (Throwable ex) {                                 //Блок Throwable должен быть последним, так как он является наиболее общим исключением.
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b); 
    }
}
