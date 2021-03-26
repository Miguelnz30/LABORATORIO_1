package carro;

import Maquinaria.IMaquinaria;
import moto.Ducati;
import moto.Moto;
import moto.Ninja;

public class Run {

	public static void main(String[] args) {
		new Carretera(createCarFactory(CarType.SEDAN)).runMaquinaria(); 
		new Carretera(createCarFactory(CarType.PICKUP)).runMaquinaria();
		new Carretera(createMotoFactory(motoType.Ninja)).runMaquinaria();
		new Carretera(createMotoFactory(motoType.Ducati)).runMaquinaria();
	}
	
	
	private enum CarType {
		SEDAN,
		PICKUP
	}
	
	private static Carro createCarFactory(CarType type) {
	  if (type.equals(CarType.SEDAN)) {
		  return new Sedan();
	  }
	  return new Pickup(); 
	}
	
	private static Moto createMotoFactory(motoType type) {
		if(type.equals(motoType.Ninja)) {
			return new Ninja();
		}
		return new Ducati();
	}
	
	private enum motoType {
		Ninja,
		Ducati
	}
	
}
