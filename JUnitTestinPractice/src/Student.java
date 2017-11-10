
public class Student extends Person {
private int midTermExam;
private int finalExam;
private String cAse;
public void setMidterm(int x){
	this.midTermExam = x;
}
public void setFinal(int x){
	this.finalExam = x;
}
public void setCase(String _case){
	this.cAse = _case;
}
public int getMidterm(){
	return this.midTermExam;
}
public int getFinal(){
	return this.finalExam;
}
public String getCase(){
	return this.cAse;
}
Student(){
	midTermExam = 0;
	finalExam = 0;
	cAse = "not explained";
}
}
