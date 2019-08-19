package club.codeengine;

public class Main {

    public static void main(String[] args) {

        //примитивные типы
        // размещаются прямо на стеке (stack), удаляются сразу после окончания блока кода
        // (их области видимости)
        {
            // это блок видимости

            int intVariable;
            boolean variable1, variable2;
            variable1 = true;
            intVariable = 12;
            final int canYouSeeMe = 123;
            // canYouSeeMe = 333;
            int  неНазывайтеПеременныеПоРусски = 333; // это плохой тон
        } // после выхода из блока кода эти переменные уничтожаются

        // canYouSeeMe уже не существует
        byte byteExample = 12; // маленькие целочисленные от -128 до 128
        short shortExample = 4322;  // маленькие целочисленные от -32768 32767
        int intExample = 4324343;  // целочисленные от -247483648 247483647
        long someLong = 432642326l; // большие целочисленные от -247483648 247483647
        float floatExample = 54.43f;
        double doubleExample = 54.654;
        char charExample = 'f'; // символы знаки или буквы
        boolean someBool = true; // true или false



        //ссылочные типы
        // в стеке храниться лишь ссылка на участок памяти в куче (heap)
        // где и храняться переменные такого типа

        // удаляются сборщиком мусора (GC)
        // если сборщик мусора определит что к ним не ведет не одна ссылка
        String stringExample = "123";
        char[] arrayExample = new char[5];

        // box/unbox обертки над простыми типами
        // так мы превращаем примитивные переменные в ссылочные
        var boxedByte = Byte.valueOf(byteExample);
        var boxedShort = Short.valueOf(shortExample);
        var boxedInt = Integer.valueOf(intExample);
        var boxedLong = Long.valueOf(someLong);
        var boxedFloat = Float.valueOf(floatExample);
        var boxedDouble = Double.valueOf(doubleExample);
        var boxedChar = Character.valueOf(charExample);
        var boxedBoolean = Boolean.valueOf(someBool);


    }
}
