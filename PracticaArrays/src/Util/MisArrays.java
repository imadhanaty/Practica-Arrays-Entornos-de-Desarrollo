package Util;

import java.util.Arrays;

public abstract class MisArrays {
	
	 public static float mediaNotas(int[] notas) {
	        validarNotas(notas);
	        int sum = 0;
	        for (int nota : notas) {
	            sum += nota;
	        }
	        return (float) sum / notas.length;
	    }

	    public static float medianaNotas(int[] notas) {
	        validarNotas(notas);
	        Arrays.sort(notas);
	        int n = notas.length;
	        if (n % 2 != 0) {
	            return notas[n / 2];
	        } else {
	            int middle1 = notas[(n - 1) / 2];
	            int middle2 = notas[n / 2];
	            return (float) (middle1 + middle2) / 2;
	        }
	    }

	    public static int maximaNota(int[] notas) {
	        validarNotas(notas);
	        int max = notas[0];
	        for (int nota : notas) {
	            if (nota > max) {
	                max = nota;
	            }
	        }
	        return max;
	    }

	    public static int minimaNota(int[] notas) {
	        validarNotas(notas);
	        int min = notas[0];
	        for (int nota : notas) {
	            if (nota < min) {
	                min = nota;
	            }
	        }
	        return min;
	    }

	    private static void validarNotas(int[] notas) {
	        for (int nota : notas) {
	            if (nota < 0 || nota > 10) {
	                throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
	            }
	        }
	    }
}