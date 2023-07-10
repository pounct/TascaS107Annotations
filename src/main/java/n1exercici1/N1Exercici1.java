package n1exercici1;

public class N1Exercici1 {

	public static void main(String[] args) {

		TreballadorPresencial.benzina = 70;

		Treballador treballador = new Treballador("nomt", "cognomt", 20);
		Treballador treballadorPresencial = new TreballadorPresencial("nomtp", "cognomtp", 20);
		Treballador treballadorOnline = new TreballadorOnline("nomto", "cognomto", 20, 60);

		//ex: nombreHores=160 para todos 
		System.out.println(treballador.calcularSou(160));
		System.out.println(treballadorPresencial.calcularSou(160));
		System.out.println(treballadorOnline.calcularSou(160));
	}

}
