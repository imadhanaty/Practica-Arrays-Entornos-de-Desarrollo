package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Util.MisArrays;

class mitest {

	@Test
	public void testMediaNotasValidas() {
		int[] notas = { 5, 7, 8, 6, 9 };
        assertEquals(7.0f, MisArrays.mediaNotas(notas), 0.001);
	}
	public void testMediaNotasInvalidas() {
        int[] notas = { 5, 7, 11, 6, 9 };
        MisArrays.mediaNotas(notas);
    }

}
