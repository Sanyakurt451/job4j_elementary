package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String rsl = "��� ������ ���� � �����. ������� ������ ������.";
        if ("������, ���.".equals(question)) {
            rsl  = "������, �����.";
        } else if ("����.".equals(question)) {
            rsl = "�� ������ �������.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("������, ���.");
        System.out.println(rsl);
        rsl = DummyBot.answer("����.");
        System.out.println(rsl);
    }
}
