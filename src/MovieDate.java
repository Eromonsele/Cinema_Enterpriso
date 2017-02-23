package testTheory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> movies = new ArrayList<Movie>();
		String[] word;
		String line = null;
		String mN, aR, mD, mT, theatre;
		int aT;
		double mP;
		Movie movie;

		try {
			/*
			 * InputStream file = new FileInputStream("fileMovie.txt");
			 * InputStreamReader isr = new InputStreamReader(file,
			 * Charset.forName("UTF-8")); BufferedReader br = new
			 * BufferedReader(isr);
			 */

			Scanner input = new Scanner(new File("fileMovie.txt"));
			// while((line = br.readLine()) != null){
			while (input.hasNextLine()) {
				if ((line = input.nextLine()) != null) {
					word = line.split(";");
					mN = word[0];
					mP = Double.parseDouble(word[1]);
					aR = word[2];
					mD = word[3];
					mT = word[4];
					theatre = word[5];
					aT = Integer.parseInt(word[6]);

					movie = new Movie(mN, mP, aR, mD, mT, theatre, aT);
					movies.add(movie);
				}
				else{
					//do nothing
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i).getMovieName());
		}

	}

}
