package ru.stqa.pft.distance;

public class Distance {
    //Задем координаты без значений
    public double p1;
    public double p2;

    public Distance(double p1, double p2) {
        //Присваеваем указател для координат
        this.p1 = p1;
        this.p2 = p2;
    }
    //Создаем функцию area для расчета дистанции
    public double area() {
        //Высчитываем квадратный корень
        return Math.sqrt((this.p1*this.p1) - (this.p2*this.p2));
    }
}
