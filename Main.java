public class Main{
	public static void main(String[] args){
		User user = new User("Spanch Bob");
		Persister pers = new Persister(user);
		Report report = new Report();
		report.report(user);
		pers.save();
	}
}