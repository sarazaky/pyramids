package pyramids;

import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
public class Test {
	

	public static void main(String[] args) {
		PyramidDeoImp pDAO = new PyramidDeoImp();
		List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("C:\\Users\\saraz\\Desktop\\pyramids.csv");
		
		int i = 0;
		for(Pyramid p: pyramids) {
			System.out.println("#" + (i++) + p);
		}
		
		System.out.println("\n/////////////////////////////////////////////////////////\n");
		//Sort The Pyramids List Using Height
		pyramids.sort(Comparator.comparingDouble(Pyramid::getHeight));
		
		i = 0;
		for(Pyramid p: pyramids) {
			System.out.println("#" + (i++) + p);
		}
		System.out.println("\n/////////////////////////////////////////////////////////\n");
		//Create Map Contains Sites With The Num Of Pyramids In That Site
		Map <String , Integer> siteCount = new HashMap<>();
		for (Pyramid p: pyramids) {
			String site = p.getSite();
			Integer count = siteCount.get(site);
			
			if (count == null) {
				count =1;
			}
			else {
				count++;
			}
			siteCount.put(site, count);
		}
		System.out.println(siteCount);
		
		

	}

}