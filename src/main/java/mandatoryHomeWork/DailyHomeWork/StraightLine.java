package mandatoryHomeWork.DailyHomeWork;

public class StraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2)  return true;
    
        int xDifference = (coordinates[1][0]) - (coordinates[0][0]);
        int yDifference = (coordinates[1][1]) - (coordinates[0][1]);

        for(int i =2; i < coordinates.length;++i){// missed here in pre decrement 
            int xNew = coordinates[i][0] -coordinates[0][0] ;
            int yNew = coordinates[i][1] - coordinates[0][1];

            if(yDifference*(xNew) != xDifference*(yNew) ){
                return false;
            }
            
        }
        return true;
    }
    
}
