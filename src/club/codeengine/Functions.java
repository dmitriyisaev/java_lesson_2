package club.codeengine;

public class Functions {


    public static void main(String[] args) {

       //длинные портянки кода по 100 000 строк тоже можно осилить
       //....
       //....
       // но я не заню как


       // для разделения кода на логические части существуют функции
       // в java любая функция это метод
       // но про это на следущей неделе

        // итак функция эта пакет действий которые принимают (или не принимают) аргументы (то что в скобочках после имени функции)
        // так же может возвращать значения

        //вызовем функцию номер 1
        //должно распечатать в консоли "Hello world из функции!"
        printHelloWorld();


        //вызовем функцию printHelloFrom
        //передав ей параметр name
        printHelloFrom("Code Engine");

        // вызовем функцию которая и принимает и возвращает значения
        int first = 10;
        int summ = summ(first, 5);
        System.out.println("Вернули результат "+ summ);

        // вызовем рекурсивную функцию - сложный и непонятный способ писать цикл
        // грозит нам классической ошибкой stackoverflow
        int summTill = summTill(10);
        System.out.println("Рекурсивная функция Вернула результат "+ summTill);

        //чтобы получить эту ошибку раскоментируйте эту функцию
        int wontWork = summTill(10000000);

    }

    //итак наша первая функция
    // она ничего не возвращает (ключевое слово void указывает что функция не возвращает значение)
    // ключевое слово статик мы так же разберем на следующей неделе
    static void printHelloWorld(){
        System.out.println("Hello world из функции!");
    }

    // эта функция тоже ничего не возвращает
    // но принимает аргумент name
    static void printHelloFrom(String name){
        System.out.println("Hello world от "+ name);
    }

    // а эта функция возвращает результат
    // за это отвечает ключевое слово return
    // при этом оно принимает в качестве аргумента 2 целочисленных аргумента
    static int summ(int first, int second){
        first = 123;
        int result = first + second;
        return result;
        // можно было просто return first + second
    }

    // а это еще один нетипичный способ писать цикл
    // так называемая рекурсивная функция
    // то есть функция которая вызывает сама себя
    // считает сумму всех чисел до указанного в аргументе
    static int summTill(int till){
       int current = 0;
       int result = 0;
       if(till == 0) return 0;
        return _countMultipliersRecursive(current, result, till);
    }

    // current переводится как настоящее (текущее). то есть это аналог counter в цикле
    static int _countMultipliersRecursive(int current, int result, int till){
        current++;
        result = result + current;
        if(current == till) {
            return result;
        } else {
            return _countMultipliersRecursive(current, result, till);
        }
    }

}
