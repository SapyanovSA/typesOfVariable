import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        byte a = 12;
        System.out.println("byte a = " + a);
        short b = 129;
        System.out.println("short b = " + b);
        int c = 1000;
        System.out.println("int c = " + c);
        long d = 10_000L;
        System.out.println("long d = " + d);
        //Task 2
        System.out.println("Task 2");
        float e = 27.12f;
        long f = 987_678_965_549L;
        float g = 2.786f;
        short h = 569;
        short j = -159;
        int k = 27897;
        byte l = 67;
        //Task 3
        System.out.println("Task 3");
        byte firstClass = 23;
        byte secondClass = 27;
        byte thirdClass = 30;
        short papers = 480;
        short students = (short) (firstClass + secondClass + thirdClass);
        short sheetsPerStudent = (short) (papers / students);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги.");
        //Task 4
        System.out.println("Task 4");
        int bottleCapacityInTwoMinutes = 16;
        int bottleCapacityInOneMinutes = bottleCapacityInTwoMinutes / 2;
        //Interval
        int timeInterval_20Minutes = 20;
        int timeInterval_1Hour = timeInterval_20Minutes * 3;
        int timeInterval_Day = timeInterval_1Hour * 24;
        int timeInterval_3Day = timeInterval_Day * 3;
        int dayInMonth = 30;
        int timeInterval_Month =  timeInterval_Day * dayInMonth;
        //Capacity
        int bottleCapacityIn_20Minutes = timeInterval_20Minutes * bottleCapacityInOneMinutes;
        int bottleCapacityIn_Day = timeInterval_Day * bottleCapacityInOneMinutes;
        int bottleCapacityIn_3Day = timeInterval_3Day * bottleCapacityInOneMinutes;
        int bottleCapacityIn_Month = timeInterval_Month * bottleCapacityInOneMinutes;
        //conclusion
        System.out.println("За " + timeInterval_20Minutes + " минут машина произвела " + bottleCapacityIn_20Minutes + " штук бутылок.");
        System.out.println("За " + timeInterval_Day + " минут (1 День) машина произвела " + bottleCapacityIn_Day + " штук бутылок.");
        System.out.println("За " + timeInterval_3Day + " минут (3 День) машина произвела " + bottleCapacityIn_3Day + " штук бутылок.");
        System.out.println("За " + dayInMonth + " минут (месяц) машина произвела " + bottleCapacityIn_Month + " штук бутылок.");
        //Task 5
        System.out.println("Task 5");
        short allCansOfPaint = 120;
        short cansWhitePaintOfOneClass = 2;
        short cansBrownPaintOfOneClass = 4;
        short usedCansOfOneClass = (short) (cansBrownPaintOfOneClass + cansWhitePaintOfOneClass);
        short allClass = (short) (allCansOfPaint / usedCansOfOneClass);
        short allCansWhitePaint = (short) (allClass * cansWhitePaintOfOneClass);
        short allCansBrownPaint = (short) (allClass * cansBrownPaintOfOneClass);
        System.out.println("В школе, где " + allClass + " классов, нужно " + allCansWhitePaint + " банок белой краски и " + allCansBrownPaint + " банок коричневой краски.");
        //Task 6
        System.out.println("Task 6");
        short bananaGram = 80;
        short milkGram = 105;
        short icecreamGram = 100;
        short eggGram = 70;

        short fifesBananasGram = (short) (bananaGram * 5);
        short twoMilkGram = (short) (milkGram * 2);
        short twoIcecreamGram = (short) (icecreamGram * 2);
        short fourEggsGram = (short) (eggGram * 4);
        int gramsOfTotalSportsBreakfast = fifesBananasGram + twoMilkGram + twoIcecreamGram + fourEggsGram;
        System.out.println("Вес такого спорт завтрака составляет " + gramsOfTotalSportsBreakfast + " грамм.");
        float kilogramsOfTotalSportsBreakfast = (float) gramsOfTotalSportsBreakfast / 1000f;
        System.out.println("Вес такого спорт завтрака составляет " +  kilogramsOfTotalSportsBreakfast + " килограмма.");

        //Task 7
        System.out.println("Task 7");
        float excessWeight = 7;
        float resetMinWeight = excessWeight / (250 / 1000f);
        System.out.println("Кол-во дней на похудение, если спортсмен будет сбрасывать 250 грамм - " + resetMinWeight + " дней.");
        float resetMaxWeight = excessWeight / (500 / 1000f);
        System.out.println("Кол-во дней на похудение, если спортсмен будет сбрасывать 500 грамм - " + resetMaxWeight + " дней.");
        float middleWeight = (float) ((250 + 500) / 2);
        float resetMiddleWeight = excessWeight / (middleWeight / 1000f);
        System.out.println("Кол-во дней на похудение, если спортсмен будет сбрасывать 375 грамм - " + String.format("%.2f", resetMiddleWeight) + " дней.");
        //Task 8
        System.out.println("Task 8");
        int employee1 = 67_760;
        int employee2 = 83_690;
        int employee3 = 76_230;

        int salaryIncreaseEmployee1 = employee1 +(employee1 / 100 * 10);
        int salaryIncreaseEmployee2 = employee2 +(employee2 / 100 * 10);
        int salaryIncreaseEmployee3 = employee3 + (employee3 / 100 * 10);

        int annualSalaryDifferenceEmployee1 = (salaryIncreaseEmployee1 * 12) - (employee1 * 12);
        int annualSalaryDifferenceEmployee2 = (salaryIncreaseEmployee2 * 12) - (employee2 * 12);
        int annualSalaryDifferenceEmployee3 = (salaryIncreaseEmployee3 * 12) - (employee3 * 12);

        System.out.println("Маша теперь получает " + salaryIncreaseEmployee1 + " рублей. Годовой доход вырос на " + annualSalaryDifferenceEmployee1 + " рублей.");
        System.out.println("Денис теперь получает " + salaryIncreaseEmployee2 + " рублей. Годовой доход вырос на " + annualSalaryDifferenceEmployee2 + " рублей.");
        System.out.println("Кристина теперь получает " + salaryIncreaseEmployee3 + " рублей. Годовой доход вырос на " + annualSalaryDifferenceEmployee3 + " рублей.");
    }
}