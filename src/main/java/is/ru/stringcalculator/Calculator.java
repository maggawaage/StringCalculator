package is.ru.stringcalculator;

public class Calculator{

    public static int add(String text){
        String delimiters[] = {",","\n"}; 
        if(text.equals(""))
            return 0;
        else {
            if(hasDelimiter(text, delimiters) == 1) {
                String numbers[] = text.split(",|\n");
                return sum(numbers);
            }
            return 1;
        }
     }

     private static int toInt(String number){
        return Integer.parseInt(number);
     }

     private static int sum(String [] numbers) {
        int total = 0;
        int newNumber;
        for(String number : numbers) {
            newNumber = toInt(number);
            if(newNumber > 1000)
                newNumber = 0;
            total += newNumber;
        }
        return total;
    }

    private static int hasDelimiter(String text, String [] delimiters){
        for(String delimeter : delimiters) {
            if(text.contains(delimeter)){
                return 1;
            }
        }
        return 0;
    }
}
