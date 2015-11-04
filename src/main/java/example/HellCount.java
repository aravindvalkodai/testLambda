package example;


import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class HellCount {
    
    public String getHellCount(int count, Context context) {
        return String.format("The count value is" + Integer.toString(count));
    }
    
}



