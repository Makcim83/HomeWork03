public class Main {
    public static void main(String[] args) {
        //Part 1
        int homeWorkPart=1;
        byte wholeNumberTypes=4;
        short twoBytes=30000;
        long peoplesIndia=1500000000L;
        float someFloatNumber=4.5f;
        double smallNumber=0.000004;
        System.out.println("Part " + homeWorkPart);
        System.out.println("Всего целочисленных переменных " + wholeNumberTypes + " типа");
        System.out.println("В двух байтах умещается более " + twoBytes + " значений, но и этого бывает мало");
        System.out.println("Чтобы рассказать о численности населения Индии понадобится 4 байта, там проживает более " + peoplesIndia + " человек");
        System.out.println("Для рассчетов с дробой частью понадобится тип данных с плавающей точкой, например число " + someFloatNumber + "f");
        System.out.println("Для точных рассчетов с дробой частью понадобится тоже тип данных с плавающей точкой, например " + smallNumber + ", хранение такого числа займет 4 байта");


        //Part 2 :  27.12 ,  987 678 965 549 , 2,786 , false, 569 , -159 , 27897 , 67.
        homeWorkPart +=1;
        System.out.println("Part " + homeWorkPart);
        float averageAge = 27.12f;
        long phoneNumber = 987678965549L;
        float averageLessonTime = 2.786f;
        boolean needUseFlags = false;
        short costProduct = 569;
        short costReduction = -159;
        int adressIndex = 27897;
        int adressHomeNumber = 67;
        System.out.print(averageAge);
        System.out.print(" " + phoneNumber);
        System.out.print(" " + averageLessonTime);
        System.out.print(" " + needUseFlags);
        System.out.print(" " + costProduct);
        System.out.print(" " + costReduction);
        System.out.print(" " + adressIndex);
        System.out.println(" " + adressHomeNumber);

        //Part 3
        homeWorkPart +=1;
        System.out.println("Part " + homeWorkPart);
        int studentsOfLudmilaPavlovna = 23;
        int studentsOfAnnaSergeevna = 27;
        int studentsOfEkaterinaAndreevna = 30;
        int paperSheetAmount = 480;
        int studentsAmount = studentsOfLudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;
        int stackForEseryStudent = paperSheetAmount / studentsAmount;
        System.out.print("После раздачи " + paperSheetAmount + " листов бумаги");
        System.out.println(" каждый студент получит по стопке, состоящей из " + stackForEseryStudent + " листов");

        //Part 4
        homeWorkPart +=1;
        System.out.println("Part " + homeWorkPart);
        int minutesInOneHour = 60;
        int hoursInOneDay = 24;
        int daysInMonth = 30;

        int bottlesMeasuredAtTime = 16;
        int measuredMinutes = 2;

        int workingMinutes = 20;
        int workingDaysFirst = 1;
        int workingDaysSecond = 3;
        int workingMonths = 1;

        int averageBottlesPerMinute = bottlesMeasuredAtTime / measuredMinutes;
        System.out.println("Производительность завода составляет " + averageBottlesPerMinute + " бутылок в минуту");

        int BottlesSiries = averageBottlesPerMinute * workingMinutes;
        System.out.println("За время " + workingMinutes + " мин. произведется " + BottlesSiries + " бутылок");

        BottlesSiries = averageBottlesPerMinute * workingDaysFirst * minutesInOneHour * hoursInOneDay;
        System.out.println("За время " + workingDaysFirst + " дн. произведется " + BottlesSiries + " бутылок");

        BottlesSiries = averageBottlesPerMinute * workingDaysSecond * minutesInOneHour * hoursInOneDay;
        System.out.println("За время " + workingDaysSecond + " дн. произведется " + BottlesSiries + " бутылок");

        BottlesSiries = averageBottlesPerMinute * workingMonths * minutesInOneHour * hoursInOneDay * daysInMonth;
        System.out.println("За время " + workingMonths + " мес. произведется " + BottlesSiries + " бутылок");








    }
}