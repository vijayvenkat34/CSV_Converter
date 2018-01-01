import java.io.*;

public class Converter {

	static public void main(String arg[]) throws java.io.IOException {
		PrintWriter pw = new PrintWriter(new FileOutputStream("D:/Project/Hospital Datasets/sample.csv"));
		File file = new File("D:/Project/Hospital Datasets/State wise health data/2014/Maharashtra/Pune");
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {

			System.out.println("Processing " + files[i].getPath() + "... ");
			BufferedReader br = new BufferedReader(new FileReader(files[i]
					.getPath()));
			
			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
			br.close();
		}
		pw.close();
		System.out.println("All files have been concatenated into concat.txt");
	}
}