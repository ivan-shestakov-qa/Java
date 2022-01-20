//импортируем пакет Distance
import ru.stqa.pft.distance.Distance;

public class Point {
    public static void main(String[] arg) {
        //Задаем значения координат
        Distance d = new Distance(7, 3);
        System.out.println("Путь равен " + d.area());
    }
}
