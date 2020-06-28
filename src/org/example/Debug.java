package org.example;

import java.util.ArrayList;

public class Debug {

//            Быстрый хинт по настройке панели Project:
//            - быстрый доступ из кода, быстрый доступ к коду
//            - плоские пакеты
//            - настройки идеи
//            - настройки проекта
//
//            Добавляем интеграцию гита в идею к существующему проекту через основное меню идеи
//            - устанавливаем плагин gitignore
//            - устанавливаем плагин KeyPromoter
//
//            Коротко об интерфейсе идеи: где что касательно гита::
//            - вызов панели гита, скрытие всех панелей
//            - кнопки пуша и пула

    // добавляем к проекту поддержку VCS

    // создаём .gitignore

//        Создаём проект на гитхабе
//        - добавляем в проект ремоут
//        - пушим изменения
//        - несколько слов о нескольких ремоутах

    // Help -> Keymap Reference
    public static void main(String[] args) {
        System.out.println("hello");
        System.err.println("world");
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(getRandom());
            }
            int billionare = 0;
            int defaults = 0;
            int regular = 0;
            for (Integer person : myList) {
                person += getRandom();
                if (person > 1_000_000_000 || person < 0) {
                    billionare++;
                } else if (person > 0)
                    regular++;
                else defaults++;

            }
            System.err.println("defaults = " + defaults);
            System.err.println("regular = " + regular);
            System.err.println("billionare = " + billionare);
            System.err.println("all = " + (regular + billionare + defaults));
        }

            private static int getRandom() {
            return (int) (Math.random() * Integer.MAX_VALUE);
    }
}



    // TODO create integer ArrayList -- Ctrl-Alt-V

    // TODO fori -- fill with random number

    // TODO iter -- serr -- add random number

    // todo Shift-F6 -- rename var

    // todo iter -- count billionare if > 1_000_000_000    regular if 0 > x < 1_000_000_000     default == 0

    // todo soutv summ

    // CTRL+ALT+L

    // Square selection

    // Ctrl+Shift Up/Down

    // Shift-Shift

    // F2

    // Ctrl + Q

    // Ctrl + B

    // Ctrl + E

    // Ctrl-Alt-O


// создаём коммит и пушим

    // fixme всё работает плохо -- почини меня используя презинтацию

//        - добавляем ветку в репозиторий с новой фичей с несколькими коммитами
//        - мёржим её в основную ветку, убеждаемся что проблем не возникло
//        - пушим в репозиторий, убеждаемся, что в репозитории новой ветки нет
//        - переключаемся на новую ветку, пушим. убеждаемся, что ветка появилась.
//        - делаем изменения в основной ветке.
//        - примерно в тех же местах делаем изменения в новой ветке.
//            - сливаем. решаем конфликты при слиянии.
//            - различные виды просмотра различий в идее
//        - разрешаем конфликты, мёржим.
//            - новая ветка с добавлением фичи
//        - делаем слияние ребейзом
//        - пушим всё на ремоут.
//
//            - убеждаемся, что можем откатываться в истории:
//            - софт ресеты
//        - хардесеты (только в ветках с ремоутом)
//
//        - черипик
//
//        Просмотр истории:
//            - посмотреть кто совершил коммит на полях
//        - посмотреть в каком коммите
//        - сравнить с удалённой веткой при наличии закоммиченных, но не запушенных изменениях
//
//        Возможности идеи в плане истории.


