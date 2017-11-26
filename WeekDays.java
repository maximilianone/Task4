public class WeekDays extends CustomEnum<WeekDays> {
    public static final WeekDays MONDAY= new WeekDays("MONDAY", 0);
    public static final WeekDays TUESDAY=new WeekDays("TUESDAY", 1);
    public static final WeekDays WEDNESDAY=new WeekDays("WEDNESDAY", 2);
    public static final WeekDays THURSDAY = new WeekDays("THURSDAY", 3);
    public static final WeekDays FRIDAY = new WeekDays("FRIDAY", 4);
    public static final WeekDays SATURDAY = new WeekDays("SATURDAY", 5);
    public static final WeekDays SUNDAY= new WeekDays("SUNDAY", 6);
    public static final String MONDAY_SWITCH = "MONDAY";
    public static final String TUESDAY_SWITCH = "TUESDAY";
    public static final String WEDNESDAY_SWITCH = "WEDNESDAY";
    public static final String THURSDAY_SWITCH = "THURSDAY";
    public static final String FRIDAY_SWITCH = "FRIDAY";
    public static final String SATURDAY_SWITCH = "SATURDAY";
    public static final String SUNDAY_SWITCH = "SUNDAY";



    private WeekDays(String name, int ordinal) {
        super(name, ordinal);
    }
}
