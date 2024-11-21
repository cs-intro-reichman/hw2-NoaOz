public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int TotalMinutes = minutesToAdd + minutes + (hours * 60);
        int TotalHours = TotalMinutes / 60;
        int Newhours = TotalHours % 24;
        int Newminutes = TotalMinutes - (TotalHours * 60); 
        System.out.println(((Newhours < 10) ? "0" + Newhours : Newhours) + ":" + ((Newminutes < 10) ? "0" + Newminutes : Newminutes));
    }
}
