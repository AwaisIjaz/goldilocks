
public class Goldilocks {
	
    public static void main(String[] args) {
    	
	int goldiWeight = 100;
	int goldiTemperature = 120;
	
	int[][] listOfWeightandTemperature = {
			{100, 120},
			{297, 90},
			{66, 110},
			{257, 113},
			{276, 191},
			{280, 129},
			{219, 163},
			{254, 193},
			{86, 153},
			{206, 147},
			{71, 137},
			{104, 40},
			{238, 127},
			{52, 146},
			{129, 197},
			{144, 59},
			{157, 124},
			{210, 59},
			{11, 54},
			{268, 119},
			{261, 121},
			{12, 189},
			{186, 108},
			{174, 21},
			{77, 18 },
			{54, 90},
			{174, 52},
			{16, 129},
			{59, 181},
			{290, 123},
			{248, 132}
			};
	
	    int i = 1;
        for (int[] weightAndTemperature : listOfWeightandTemperature) {
        int chairWeight = weightAndTemperature[0];
        int porridgeTemperature = weightAndTemperature[1];
        	if (chairWeight >= goldiWeight && porridgeTemperature < goldiTemperature) {
        		System.out.println(i);
        	}
        	i++;
	      }
			
		}
}
