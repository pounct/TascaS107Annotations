package n1exercici2;

public class ClasseExterna {

	Treballador treballador;

	public Treballador getTreballador() {
		return treballador;
	}

	public void setTreballador(Treballador treballador) {
		this.treballador = treballador;
	}

	public static void main(String[] args) {

		Treballador treballadorOnline = new TreballadorOnline("nomto", "cognomto", 20, 60);
		((TreballadorOnline) treballadorOnline).oldCalculoSouOnline();

		Treballador treballadorPresencial = new TreballadorPresencial("nomtp", "cognomtp", 20);
		((TreballadorPresencial) treballadorPresencial).oldCalculoSouPresencial();
	}

}
