package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import telran.numbers.TictactoeGame;
import org.junit.jupiter.api.Test;



class TictactoeTest {

	@Test
	void testTictactoeMove() {
		char matrix[][]= {
				{'x','x','0'},
				{'0','0','x'},
				{'x','0','x'},
		};
		assertEquals(1, telran.numbers.TictactoeGame.tictactoeMove(matrix, 1, 2, 'x' ));
	}
	@Test
	void testTictactoeMove1() {
	char matrix1[][]= {
			{'0','x','0'},
			{'0','0','x'},
			{'x','0','x'},
	};
	assertEquals(1, telran.numbers.TictactoeGame.tictactoeMove(matrix1, 2, 0, 'x' ));
}
	@Test
	void testTictactoeMove2() {
	char matrix2[][]= {
		{'x','x','0'},
		{'0','0','x'},
		{'x','0','x'},
};
	assertEquals(1, telran.numbers.TictactoeGame.tictactoeMove(matrix2, 2, 2, '0'));
}

}
