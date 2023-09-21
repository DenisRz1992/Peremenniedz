public class Main {
    public static void main(String[] args) {
        System.out.println("Типы переменных 2");

        // Задача 1

        int semechek = 1000000;
        byte car = 60;
        short derevo = 300;
        long galaktik = 3000000;
        float people = 6.314567f;
        double rastenij = 9.456852198d;
        System.out.println("Значение переменной int semechek с типом int равно " + semechek);
        System.out.println("Значение переменной byte car с типом byte равно " + car);
        System.out.println("Значение переменной short derevo с типом short равно " + derevo);
        System.out.println("Значение переменной long galaktik с типом long равно " + galaktik);
        System.out.println("Значение переменной float people с типом float равно " + people);
        System.out.println("Значение переменной double rastenij с типом double равно " + rastenij);

        // Задача 2

        float a = 27.2f;
        long b = 987678965549l;
        double c = 2.786;
        int d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        // Задача 3

        short lu = 23;
        short an = 27;
        short ek = 30;
        short listov = 480;
        int na1 = 480 / (lu + an + ek);
        System.out.println("На каждого ученика рассчитанно " + na1 + " листов бумаги ");

        // Задача 4

        int but = 16;
        int time = 2;
        int time1 = 20;
        int sutki = 1;
        int den3 = 3;
        int mesac = 1;
        int min20 = but / time * time1;
        int sutki1 = 8 * 60 * 24;
        int sutki3 = sutki1 * 3;
        int mesac1 = sutki1 * 31;

        System.out.println("За " + time1 + " минут машина произвела " + min20 + " штук бутылок" );
        System.out.println("За " + sutki + " сутки машина произвела " + sutki1 + " штук бутылок");
        System.out.println("За " + den3 + " дня машина произвела " + sutki3 + " штук бутылок");
        System.out.println("За " + mesac + " месяц машина произвела " + mesac1 + " штук бутылок");

        // Задача 5

        byte nado = 120;
        byte beloj = 2;
        byte kor = 4;
        int klassov = nado / (beloj + kor);
        int beloj1 = klassov * beloj;
        int kor1 = klassov * kor;
        System.out.println("В школе, где " + klassov + " классов, нужно " + beloj1 + " банок белой краски и " + kor1 + " банок коричневой краски");

        // Задача 6

        int ban = 5 * 80;
        int milk = 105 * 2;
        int mor = 2 * 100;
        int ico = 4 * 70;
        int gr = ban + milk + mor + ico;
        float kg = gr / 1000;
        System.out.println(gr + " грамм");
        System.out.println(kg + " кг");

        // Задача 7

        int nado1 = 7;
        int nadogr = nado1 * 1000;
        int tranit = 250;
        int tratit1 = 500;
        int dn1 = nadogr / tranit;
        int dn2 = nadogr / tratit1;
        int sr = (dn1 + dn2) / 2;
        System.out.println("надо " + dn1 + " дней");
        System.out.println("надо " + dn2 + " дней");
        System.out.println("в среднем надо " + sr + " день");

        // Задача 8

        int m = 67760;
        int den = 83690;
        int k = 76230;
        int pr = 10;
        int povm = (int) (m * 0.1f) + m;
        int povdena = (int) (den * 0.1f) + den;
        int povk = (int) (k * 0.1f) + k;
        int mraz = (int) (povm - m) * 12;
        int denraz = (int) (povdena - den) * 12;
        int kraz = (int) (povk - k) * 12;
        System.out.println("Маша теперь получает " + povm + " рублей. Годовой доход вырос на " + mraz + " рублей");
        System.out.println("Денис теперь получает " + povdena + " рублей. Годовой доход вырос на " + denraz + " рублей");
        System.out.println("Кристина теперь получает " + povk + " рублей. Годовой доход вырос на " + kraz + " рублей");







    }
}