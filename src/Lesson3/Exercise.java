package Lesson3;

import java.util.Scanner;

public class Exercise {
    public static int answer = -1;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean endGame = false;
        game();
        while(!endGame){
            System.out.println("Сыграем ещё раз? (Да - 1, нет - 0)");
            checkAnswerForInt();
            switch (answer){
                case 1:
                    game();
                    break;
                case 0:
                    endGame = true;
                    break;
                default:
                    System.out.println("Сыграем ещё раз? (Да - 1, нет - 0)");
                    answer = sc.nextInt();
            }
        }
    }

    public static void game(){
        int number;
        final int EFFORTS = 3;
        int count = 1;

        System.out.println("Угадайте число от 0 до 9:");
        number = (int)(Math.random()*10);
        while (count <= EFFORTS) {
            checkAnswerForInt();
            checkAnswerForRange(0,9);
            if(answer == number){
                System.out.println("Угадали!");
                break;
            }
            else if(answer > number){
                System.out.println("Загаданное число меньше");
            }
            else{
                System.out.println("Загаданное число больше");
            }
            count++;
        }
        System.out.println("Загаданное число " + number);
    }

    public static void checkAnswerForRange(int min, int max){
        while ((answer < min || answer > max)){
            System.out.println("Число должно быть в пределах от " + min + " до " + max + ". Попробуйте снова!");
            answer = sc.nextInt();
        }
    }

    public static void checkAnswerForInt(){
        while (!sc.hasNextInt()){
            System.out.println("Извините, но это явно не целое число. Попробуйте снова!");
            sc.next();
        }
        answer = sc.nextInt();
    }
}
