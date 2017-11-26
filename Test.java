public class Test {
    public static void runTest(){
        WeekDays week = WeekDays.FRIDAY;
        System.out.println(WeekDays.valueOf("FRIDAY"));
        System.out.println(WeekDays.valueOf("FRIDAY").ordinal());
        System.out.println(WeekDays.values());
        System.out.println(week.compareTo(WeekDays.THURSDAY));
        System.out.println(week.equals(WeekDays.FRIDAY));
        try {
            System.out.println(week.clone());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        switch (week.toString()){
            case WeekDays.MONDAY_SWITCH:
                System.out.println("Monday");
                break;
            case WeekDays.FRIDAY_SWITCH:
                System.out.println("Friday");
        }
    }
}
