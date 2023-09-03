package daniilkonef;

public class Program {
    public static void main(String[] args) {
        //Задача "Если необходимо, исправьте данный код." отсюда  https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit
        // от себя хочу добавить, что задачу нужно формулировать не тяп-ляп и готово что-то написали, а описывать надо конкретно что нужно сделать и почему,
        // тк формулировка "если необходимо..." никуда не годится, тк порождает вопрос "кому необходимо?" и "для какой цели?". Например, если было необходимо
        // генерировать исключения то код написан верно и НЕТ НЕОБХОДИМОСТИ его исправлять. Так что я тут ничего исправлять не буду, код идеально "падает".

        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }



    }
}