public class Main {
    public static void main(String[] args) {
        int n = 10; //Задаем число повторений
        int x = 0; //Задаем первое число ряда
        int y = 1; //Задаем второе число ряда
        for(int i = 0; i < n; i++) {
            x += y; //Магия ()
            y = x - y; //И Снова Магия ()
            System.out.println(y); // Показываем Магию =)
        }
        int v = 1; // вспомогательная переменная
        int c = 6; // Число от которого будет расчитан факториал
        for(int b = 1; b <= c; b++) {
           v *= b; // Вычисление факториала
        }
        System.out.println("Факториал от " + c + " = " + v);
    }
}
