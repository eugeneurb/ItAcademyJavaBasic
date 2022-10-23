public class HomeWork_3 {
    public static void main(String[] args) {
        detRemDiv(7556547);
        rectangle(3, 5, 2);
        moneyCase(1127);
        dateChange(8, 9, 2022);
        plotHouses(2, 2, 3, 3, 3, 4);
        timeTable(2);
    }
/*Создайте метод с одним целочисленным параметром.
Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.*/
    public static void detRemDiv(int q) {
        if (q % 10 == 7) {
            System.out.println("Число " + q + " заканчивается на 7");
        } else {
            System.out.println("Число " + q + " не заканчивается на 7");
        }
    }

/*Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).*/
    public static void rectangle(int a, int b, int r) {
        if (Math.sqrt(a * a + b * b) / 2.0 <= (double) r) {
            System.out.println("Круг радиусом " + r + " закроет собой прямоугольник размером " + a + "x" + b);
        } else {
            System.out.println("Круг радиусом " + r + " не закроет собой прямоугольник размером " + a + "x" + b);
        }
    }

/*Задать целое число в виде переменной, это число – сумма денег в рублях.
Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже.*/
    public static void moneyCase(int m) {
        if (m % 100 != 0 && m % 10 != 0) {
            if (m % 100 != 1 && m % 10 != 1) {
                if ((5 <= m % 100 || m % 100 <= 1) && (m % 10 <= 1 || m % 10 >= 5)) {
                    if (m % 100 > 10 && m % 100 < 20 || m % 10 >= 5 && m % 10 < 10) {
                        System.out.println("Сумма:" + m + " рублей");
                    }
                } else {
                    System.out.println("Сумма:" + m + " рубля");
                }
            } else {
                System.out.println("Сумма:" + m + " рубль");
            }
        } else {
            System.out.println("Сумма:" + m + " рублей");
        }

    }

/* Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.*/
    public static void dateChange(int d, int m, int y) {

        if (m != 1 && m != 3 && m != 5 && m != 7 && m != 8 && m != 10) {
            if (m == 2) {
                if (0 <= y && y <= 3000) {
                    if (y % 400 == 0) {
                        if (1 <= d && d <= 28) {
                            ++d;
                            System.out.println("Следующий день:" + d + "." + m + "." + y);
                        } else if (d == 29) {
                            d = 1;
                            ++m;
                            System.out.println("Следующий день:" + d + "." + m + "." + y);
                        }
                    } else if (y % 4 == 0 && y % 100 != 0) {
                        if (1 <= d && d <= 28) {
                            ++d;
                            System.out.println("Следующий день:" + d + "." + m + "." + y);
                        } else if (d == 29) {
                            d = 1;
                            ++m;
                            System.out.println("Следующий день:" + d + "." + m + "." + y);
                        }
                    } else if (1 <= d && d <= 27) {
                        ++d;
                        System.out.println("Следующий день:" + d + "." + m + "." + y);
                    } else if (d == 28) {
                        d = 1;
                        d = d + 1;
                        System.out.println("Следующий день:" + d + "." + m + "." + y);
                    }
                }
            } else if (m != 4 && m != 6 && m != 9 && m != 11) {
                if (m == 12) {
                    if (1 <= d && d <= 30) {
                        ++d;
                        System.out.println("Следующий день:" + d + "." + m + "." + y);
                    } else if (d == 31) {
                        d = 1;
                        d = d + 1;
                        m = 1;
                        System.out.println("Следующий день:" + d + "." + m + "." + y);
                    }
                }
            } else if (1 <= d && d <= 29) {
                ++d;
                System.out.println("Следующий день:" + d + "." + m + "." + y);
            } else if (d == 30) {
                d = 1;
                ++m;
                System.out.println("Следующий день:" + d + "." + m + "." + y);
            }
        } else if (1 <= d && d <= 30) {
            ++d;
            System.out.println("Следующий день:" + d + "." + m + "." + y);
        } else if (d == 31) {
            d = 1;
            d = d + 1;
            System.out.println("Следующий день:" + d + "." + m + "." + y);
        }
    }

/*Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f.
Проверить, помещаются ли эти дома на данном участке. Стороны домов – параллельны сторонам участка,
в остальном размещение может быть любым.
P.S. Просчитаны все возможные варианты с возможность поворота каждого из домов.*/
    public static void plotHouses(int a1, int b1, int c1, int d1, int e, int f) {
        if (e * f >= a1 * b1 + c1 * d1 && b1 + d1 <= f && a1 <= e && c1 <= e || e * f >= a1 * b1 + c1 * d1 && a1 + c1 <= e && b1 <= f && d1 <= f) {
            System.out.println("Дома размерами " + a1 + "х" + b1 + " и " + c1 + "x" + d1 + " поместятcя на участок размером " + e + "x" + f);
        } else if ((e * f < a1 * b1 + c1 * d1 || a1 + d1 > e || b1 > f || c1 > f) && (e * f < a1 * b1 + c1 * d1 || a1 + c1 > f || b1 > e || d1 > e)) {
            if (e * f >= a1 * b1 + c1 * d1 && a1 + d1 <= f && b1 <= f && c1 <= f || e * f >= a1 * b1 + c1 * d1 && b1 + c1 <= e && a1 <= f && d1 <= f) {
                System.out.println("Дома размерами " + a1 + "х" + b1 + " и " + c1 + "x" + d1 + " поместятcя на участок размером " + e + "x" + f);
            } else if ((e * f < a1 * b1 + c1 * d1 || b1 + d1 > e || a1 > f || c1 > f) && (e * f < a1 * b1 + c1 * d1 || b1 + c1 > f || a1 > e || d1 > e)) {
                System.out.println("Дома размерами " + a1 + "х" + b1 + " и " + c1 + "x" + d1 + " не поместятcя на участок размером " + e + "x" + f);
            } else {
                System.out.println("Дома размерами " + a1 + "х" + b1 + " и " + c1 + "x" + d1 + " поместятcя на участок размером " + e + "x" + f);
            }
        } else {
            System.out.println("Дома размерами " + a1 + "х" + b1 + " и " + c1 + "x" + d1 + " поместятcя на участок размером " + e + "x" + f);
        }

    }

/*Написать метод, который выводит расписание на неделю. Задать на вход в метод порядковый номер
дня недели и отобразить на экране то, что запланировано на этот день.*/
    public static void timeTable(int n) {
        switch (n) {
            case 1:
                System.out.println("День недели:Понедельник");
                System.out.println("9:00 Украл");
                System.out.println("12:00 Выпил");
                System.out.println("18:00 В Тюрьму");
                System.out.println("21:00 Романтика");
                break;
            case 2:
                System.out.println("День недели:Вторник");
                System.out.println("9:00 Подьем");
                System.out.println("12:00 Обед");
                System.out.println("18:00 Прогулка");
                System.out.println("21:00 Делаем заточку из ложки и копаем тоннель");
                break;
            case 3:
                System.out.println("День недели:Среда");
                System.out.println("9:00 Подьем");
                System.out.println("12:00 Обед");
                System.out.println("18:00 Копаем тоннель");
                System.out.println("21:00 Копаем тоннель");
                break;
            case 4:
                System.out.println("День недели:Четверг");
                System.out.println("9:00 Подьем");
                System.out.println("12:00 Обед");
                System.out.println("18:00 Копаем тоннель");
                System.out.println("21:00 Готовим побег");
                break;
            case 5:
                System.out.println("День недели:Пятница");
                System.out.println("9:00 Подьем");
                System.out.println("12:00 Обед");
                System.out.println("18:00 Пьем чефир");
                System.out.println("21:00 Готовим побег");
                break;
            case 6:
                System.out.println("День недели:Суббота");
                System.out.println("9:00 Подьем");
                System.out.println("12:00 Обед");
                System.out.println("18:00 Прощаемся с бродягами");
                System.out.println("21:00 Бежим");
                break;
            case 7:
                System.out.println("День недели:Воскресенье");
                System.out.println("9:00 Прячемся от копов");
                System.out.println("12:00 Ищем где выпить");
                System.out.println("18:00 Пьем");
                System.out.println("21:00 Спим");
                break;
            default:
                System.out.println("Такого дня недели не существует");
        }

    }
}
