package se.composite;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager Pep = new Manager("Pep", 1, 1000);
		Developer Kun = new Developer("Kun", 2, 500);
		Developer Kevin = new Developer("Kevin", 3, 500);

		Pep.add(Kun);
		Pep.add(Kevin);

		ProgressReport prKun = new ProgressReport();
		prKun.addProgress(Kun, 2, "passed Probation");
		
		Pep.reportProgress(prKun);

		System.out.println(prKun);
	}

}
