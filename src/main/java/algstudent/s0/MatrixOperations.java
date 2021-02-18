package algstudent.s0;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class MatrixOperations {
	private int[][] matrix;
	final static int VISITED = -1;

	public MatrixOperations(int n, int min, int max) {
		matrix = new int[n][n];
		Random rn = new Random();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				matrix[i][j] = rn.nextInt(max + min) - min;
		}
	}

	public MatrixOperations(String filename) throws IOException {
		try (BufferedReader bf = new BufferedReader(new FileReader(filename))) {

			String line = bf.readLine();

			line = line.substring(3);
			Integer.parseInt(line);

			line = bf.readLine();
			ArrayList<String[]> list = new ArrayList<String[]>();

			while (line != null) {
				list.add(line.split("\t"));
				line = bf.readLine();
			}
			int n = list.get(0).length;
			matrix = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					matrix[i][j] = Integer.parseInt(list.get(i)[j]);
				}

			}
		} catch (FileNotFoundException e1) {
			System.out.println("problem opening file, calling Houston...");
		} catch (IOException e1) {
			System.out.println("problem reading file, calling Houston...");
		} catch (NumberFormatException e) {
			System.out.println("problem parsing file, calling Houston...");
		}
	}

	public int getSize() {
		return matrix.length;
	}

	public void write() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				System.out.print(matrix[i][j]);
			System.out.println();
		}
	}

	public int sumDiagonal1() {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++)
				if (i == j)
					count += matrix[i][j];
		}

		return count;
	}

	public int sumDiagonal2() {
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			count += matrix[i][i];
		}
		return count;
	}

	public void travelPath(int i, int j) {
		int moves = 0;
		int[] pos = { i, j };
		boolean keepGoing = true;
		while (keepGoing) {
			switch (matrix[pos[0]][pos[1]]) {
			case 1:
				if (pos[0] - 1 < 0) {
					matrix[pos[0]][pos[1]] = VISITED;
					pos[0] -= 1;
					moves++;
				} else {
					keepGoing = false;
				}
				break;
			case 2:
				if (pos[1] - 1 < 0) {
					matrix[pos[0]][pos[1]] = VISITED;
					pos[1] -= 1;
					moves++;
				} else {
					keepGoing = false;
				}
				break;
			case 3:
				if (pos[0] + 1 < 0) {
					matrix[pos[0]][pos[1]] = VISITED;
					pos[0] += 1;
					moves++;
				} else {
					keepGoing = false;
				}
				break;
			case 4:
				if (pos[1] + 1 < 0) {
					matrix[pos[0]][pos[1]] = VISITED;
					pos[1] += 1;
					moves++;
				} else {
					keepGoing = false;
				}
				break;
			case VISITED:
				keepGoing = false;
				break;
			}
		}
		write();
		System.out.println("Number of movements = " + moves);
	}
}
