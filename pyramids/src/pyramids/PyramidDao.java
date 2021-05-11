package pyramids;
// what is x
import java.util.List;

public interface PyramidDao {
	
	public List<Pyramid> getAllPyramids();
	//public Pyramid getPyramid(int x);
	//public void updatePyramid(Pyramid p);
	public void deletePyramid(Pyramid p);
	//public Pyramid createPyramid(String[] metadata);
	
	public List<Pyramid> readPyramidsFromCSV(String fileName);
	
}
