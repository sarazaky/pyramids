package pyramids;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PyramidDeoImp implements PyramidDao{
	private static final Pattern DOUBLE_PATTERN = Pattern.compile(
		    "[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)" +
		    "([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|" +
		    "(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))" +
		    "[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");
	
	List<Pyramid> pyramidsList ;
	
	public PyramidDeoImp() {
		pyramidsList = new ArrayList<Pyramid>();
	}
	
	@Override
	public List<Pyramid> readPyramidsFromCSV(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			br.readLine();
			String record;
			String[] recordLst;
			double length;
			do {
				record = br.readLine();
				if(record != null) {
					recordLst = record.split(",");
					length = DOUBLE_PATTERN.matcher(recordLst[7]).matches() ? Double.parseDouble(recordLst[7]): 0 ;
					Pyramid p = new Pyramid(recordLst[0], recordLst[2], recordLst[4],length);
					pyramidsList.add(p);
				}			
			}while(record != null);
			br.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		return pyramidsList;
	}

	@Override
	public List<Pyramid> getAllPyramids() {
		return pyramidsList;
	}

	@Override
	public void deletePyramid(Pyramid p) {
		pyramidsList.remove(p);
		
	}

}
