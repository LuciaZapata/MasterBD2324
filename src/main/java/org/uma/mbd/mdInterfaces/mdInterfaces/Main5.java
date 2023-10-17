package org.uma.mbd.mdInterfaces.mdInterfaces;

import org.uma.mbd.mdInterfaces.caso4.Amigos;
import org.uma.mbd.mdInterfaces.caso4.Persona;

import java.util.List;
import java.util.function.Predicate;

public class Main5 {
	public static void main(String [] args) {
		List<Persona> personas  = List.of(
				new Persona("juan", 25),
				new Persona("maria", 32),
				new Persona("marta", 28),
				new Persona("julio", 33),
				new Persona("manuel", 29),
				new Persona("justino",25));

		Amigos amigos = new Amigos(personas);
		System.out.println("Empiezan con ma");
		List<Persona> ps1 = amigos.getPersonas.stream().filter(p -> p.getNombre().startsWith("ma")).toList();
		for (Persona p : ps1) {
			System.out.println(p);
		}
		System.out.println("Mayores de 28");
		List<Persona> ps2 = amigos.getPersonas().stream().filter(p -> p.getEdad() > 28).toList();
		for (Persona p : ps2) {
			System.out.println(p);
		}
		System.out.println("Menores de 27");
		Predicate<Persona> pred = (Persona p) -> p.edad() < 27;
		List<Persona> ps3 = amigos.getPersonas().stream().filter(pred).toList();
		// ps2.forEach(p -> );
		for (Persona p : ps3) {
			System.out.println(p);
		}
	}
}




/*
		System.out.println("Menores de 27");
		Persona [] ps3 = amigos.filtra(p -> p.getNombre().contains("ca");
		for (Persona p : ps3) {
			System.out.println(p);
		}
*/

/*
		Arrays.canciones(ps1).forEach(System.out::println);
 */