package com.hw.maxim;

public class Main {

    public static void main(String[] args) {
        Author alexanderPushkin = new Author("Александр", "Пушкин");
        Book ruslanILydmilya = new Book("Руслан и Людмила", alexanderPushkin, 1820);

        System.out.println(ruslanILydmilya);

        Book kapitanskayaDochka = new Book("Капитанская дочка", alexanderPushkin, 1823);

//        System.out.println(String.format("%s написана автором %s %s в %s году", ruslanILydmilya.getName(), ruslanILydmilya.getAuthor().getName(),ruslanILydmilya.getAuthor().getSecondName(), ruslanILydmilya.getYear()));
//        System.out.println(String.format("%s написана автором %s %s в %s году", kapitanskayaDochka.getName(), kapitanskayaDochka.getAuthor().getName(),kapitanskayaDochka.getAuthor().getSecondName(), kapitanskayaDochka.getYear()));

        Author mikhailBulgakov = new Author("Михаил", "Булгаков");
        Book sobacheSerdce = new Book("Собачье сердце", mikhailBulgakov, 1924);
        Book masterIMargarita = new Book("Мастер и Маргарита", mikhailBulgakov, 1925);
//        System.out.println(String.format("%s написана автором %s %s в %s году", sobacheSerdce.getName(), sobacheSerdce.getAuthor().getName(),sobacheSerdce.getAuthor().getSecondName(), sobacheSerdce.getYear()));

//        System.out.println(String.format("%s написана автором %s %s в %s году", sobacheSerdce.getName(), sobacheSerdce.getAuthor().getName(),sobacheSerdce.getAuthor().getSecondName(), sobacheSerdce.getYear()));

        System.out.println(sobacheSerdce);

//        System.out.println(alexanderPushkin);

        Author ivanIvanov = new Author("Иван", "Иванов");
        Author ivanIvanov2 = new Author("Иван", "Иванов");

//        System.out.println(ivanIvanov.equals(ivanIvanov2));

        Book ivanovBook = new Book("Я Иванов", ivanIvanov, 2020);
        Book ivanovBook2 = new Book("Я Иванов", ivanIvanov2, 2020);

        System.out.println(ivanovBook.equals(ivanovBook2));

        System.out.println(ivanovBook.hashCode());
        System.out.println(ivanovBook2.hashCode());
    }
}
