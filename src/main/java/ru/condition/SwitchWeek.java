package ru.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String str;
        switch (day) {
            case 1:
                str = "Понедельник";
                break;
            case 2:
                str = "Вторник";
                break;
            case 3:
                str = "Среда";
                break;
            case 4:
                str = "Четверг";
                break;
            case 5:
                str = "Пятница";
                break;
            case 6:
                str = "Суббота";
                break;
            case 7:
                str = "Воскресенье";
                break;
            default:
                str = "Ошибка";
        }
        return str;
    }
}
