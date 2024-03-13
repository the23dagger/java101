
public class controlCheckmate{
    public static boolean control(int x, int y , char hamlesirasi){

        boolean isLowerCase = mainForChees.tahta[x][y].toLowerCase().equals(mainForChees.tahta[x][y]);
        boolean isUpperCase = mainForChees.tahta[x][y].toUpperCase().equals(mainForChees.tahta[x][y]);
        
        if(hamlesirasi == 'S'){
            if("  ".equals(mainForChees.tahta[x][y]) || isLowerCase){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            

            if("  ".equals(mainForChees.tahta[x][y]) || isUpperCase){
                return true;
            }
            else{
                return false;
            }
        }   
        
    
        
            
    }
}