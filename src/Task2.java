public class Task2 {
    public static void main(String[] args) {
        System.out.println("Welcome on task 2!");

        short time = 10;
        short day = 12;
        short month = 4;
        short year = 2021;

        if (time > 0 && time < 13){
            System.out.println("Good Morning Sunshine!");
        }
        if (time >= 13 && time < 20){
            System.out.println("Good Afternoon. Work Hard!");
        }
        if (time >= 20 && time < 25){
            System.out.println("Good Evening. Get some rest!");
        }
        // time = 8. Prints out first IF statement.;
        // time = 20. Prints out third IF statement.

        if (time <= 0 || time >= 25){
            System.out.println("Invalid time value.");
        }
        // time = -2. Prints out "Invalid time value."
        // time = 100. Prints out "Invalid time value."

        if (year > 0){
            if (month > 0 && month <= 12){
                if (day > 0 && day <= 31){
                    System.out.println("Date is " + year + "/" + month + "/" + day);
                }else{
                    System.out.println("Invalid day value!");
                }
            }else {
                System.out.println("Invalid month value!");
            }
        }else {
            System.out.println("Invalid year value!");
        }

    }
}
