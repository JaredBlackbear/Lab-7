
public class SickPerson extends Person {
	private String name="";
	private int age=0;
	private int severity=0;
	
public SickPerson(String name,int age,int severity) {
//	this.name=name;
	super(name,age);
	this.severity=severity;
//	this.age=age;
//	this.severity=severity;
}
public String toString() {
	return null;
}
@Override
protected int compareToImpl(Person p) {
	// TODO Auto-generated method stub
	return 0;
}
}
