package club.codeengine;

public class Branching {

    public static void main(String[] args) {

        //любой алгоритм подразумевает некий набор действий
        // в зависимости от внешних обстоятельств

        int a = 1;

        boolean isTrue = a == 123;
        boolean isTrue2 = a > 123;
        boolean isTrue3 = a < 123;
        boolean isTrue4 = a >= 123;
        boolean isTrue5 = a <= 123;
        boolean isTrue6 = a != 123;
        boolean isTrue7 = a % 3 == 0;

        boolean isTrue8 = a > 123 || a <= 300;

        if(a == 1){
            System.out.println("Один");
        } else if(a > 100 && a < 200){
            System.out.println("больше ста и меньше 300");
        } else {
            System.out.println("фиг знает");
        }

        //новый синтаксис switch  в java 12
        String value = switch (a){
            case 1 -> "Один";
            case 545 -> "WTF???";
            case 123, 321 -> "123";
            default -> "unknown";
        };

        System.out.println(value);

        //старый синтаксис switch
        String value2 = "unknown";

        switch (a){
            case 1:
                value2 = "Один";
                break;
            case 545:
                value2 = "WTF???";
                break;
            case 123:
                value2 = "123";
                break;
        }

        System.out.println(value2);
    }

}
