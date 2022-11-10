public class Main {
    public static void main(String[] args) {
        //Part 1
        int homeWorkPart=1;
        byte wholeNumberTypes=4;
        short twoBytes=30000;
        long peoplesIndia=1500000000L;
        float someFloatNumber=4.5f;
        double smallNumber=0.000004;
        System.out.println("HomeWork 3 Part " + homeWorkPart);
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

        //Part 5
        homeWorkPart +=1;
        System.out.println("Part " + homeWorkPart);
        int paintsCanAmount = 120;
        int requireWhiteCan = 2;
        int requireBrowhCan = 4;
        int requirePaintsCan = requireWhiteCan + requireBrowhCan;
        int classRooms = paintsCanAmount / requirePaintsCan;
        int needWhiteCanAmount = classRooms * requireWhiteCan;
        int needBrownCanAmount = classRooms * requireBrowhCan;
        System.out.println("В школе, где " + classRooms + " классов нужно " + needWhiteCanAmount + " банок белой краски и " + needBrownCanAmount + " банок коричневой краски");

        //Part 6
        homeWorkPart +=1;
        System.out.println("Part " + homeWorkPart);
        int bananaPcs = 5;
        int milkVolume = 200;
        int iceCreamPcs = 2;
        int eggPcs = 4;

        int bananaWeightEach = 80;
        float milkSpecificVolume = 1.05f;
        int iceCreamWeightEach = 100;
        int eggWeightEach = 70;

        int bananaWeightAmount = bananaPcs * bananaWeightEach;
        float milkWeightAmount = milkVolume * milkSpecificVolume;
        int iceCreamAmount = iceCreamPcs * iceCreamWeightEach;
        int eggWeightAmount = eggPcs * eggWeightEach;
        float dinnerWeightAmount = bananaWeightAmount + milkWeightAmount + iceCreamAmount + eggWeightAmount;
        float dinnerWeightAmountKg = dinnerWeightAmount / 1000;

        System.out.println("Вес спорт-завтрака составляет " + dinnerWeightAmount + "г. (" + dinnerWeightAmountKg + "кг)");

        //Part 7
        homeWorkPart +=1;
        System.out.println("Part " + homeWorkPart);
        int dropWeightAmountKg = 7;
        int dropEveryDayDietA = 250;
        int dropEveryDayDietB = 500;
        float dropG = dropWeightAmountKg * 1000;

        float daysDietA = dropG / dropEveryDayDietA;
        float daysDietB = dropG / dropEveryDayDietB;
        System.out.println("Для сброса веса " + dropWeightAmountKg + " кг спортсмену понадобится сидеть на диете А " + daysDietA + " дней или " + daysDietB + " дней на диете типа В.");

        //Part 8
        homeWorkPart +=1;
        System.out.println("Part " + homeWorkPart);
        int beforeSalaryMasha = 67760;
        int beforeSalaryDenis = 83690;
        int beforeSalaryKristina = 76230;
        float growSalaryPercent = 10;

        System.out.println("Отчет по результатам ежегодного повышения зарплаты на " + growSalaryPercent + "% сотрудникам со стажем от 3х лет:");
        float addSalaryMasha = beforeSalaryMasha * growSalaryPercent / 100;
        float afterSalaryMasha = beforeSalaryMasha + addSalaryMasha;
        float addYearSalaryMasha = addSalaryMasha * 12;
        System.out.println("Маша теперь получает " + afterSalaryMasha + " рублей в месяц, годовой доход вырос на " + addYearSalaryMasha + " рублей");

        float addSalaryDenis = beforeSalaryDenis * growSalaryPercent / 100;
        float afterSalaryDenis = beforeSalaryDenis + addSalaryDenis;
        float addYearSalaryDenis = addSalaryDenis * 12;
        System.out.println("Денис теперь получает " + afterSalaryDenis + " рублей в месяц, годовой доход вырос на " + addYearSalaryDenis + " рублей");

        float addSalaryKristina = beforeSalaryKristina * growSalaryPercent / 100;
        float afterSalaryKristina = beforeSalaryKristina + addSalaryKristina;
        float addYearSalaryKristina = addSalaryKristina * 12;
        System.out.println("Кристина теперь получает " + afterSalaryKristina + " рублей в месяц, годовой доход вырос на " + addYearSalaryKristina + " рублей");
    }
}