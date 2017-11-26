public class WeekDays extends CustomEnum<WeekDays> {
    public static final WeekDays MONDAY= new WeekDays("MONDAY", 0);
    public static final WeekDays TUESDAY=new WeekDays("TUESDAY", 1);
    public static final WeekDays WEDNESDAY=new WeekDays("WEDNESDAY", 2);
    public static final WeekDays THURSDAY = new WeekDays("THURSDAY", 3);
    public static final WeekDays FRIDAY = new WeekDays("FRIDAY", 4);
    public static final WeekDays SATURDAY = new WeekDays("SATURDAY", 5);
    public static final WeekDays SUNDAY= new WeekDays("SUNDAY", 6);


    private WeekDays(String name, int ordinal) {
        super(name, ordinal);
    }
}
