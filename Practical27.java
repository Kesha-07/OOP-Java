interface Classify {
    String getDivision(double average);
}

class Result implements Classify {
	@Override
    public String getDivision(double average) {

        if (average >= 60) {
            return "First Division";
        } 
        else {
            return "No First Division";
        }
    }
}

public class Practical27 {
    public static void main(String[] args) {
        Result r = new Result();
        
        double avg = 55.5; 
	System.out.println("250393107008");
        System.out.println("Average: " + avg);
        System.out.println("Division: " + r.getDivision(avg));
    }
}