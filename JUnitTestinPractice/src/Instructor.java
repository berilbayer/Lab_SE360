
public class Instructor extends Person{
public void ComputeAvg(Student s){
	if(s.getMidterm()< 35){
		s.setCase("failed");
	}
	else if(s.getFinal()<35){
		s.setCase("failed");
	}
	else if((s.getMidterm())*0.4+((s.getFinal())*0.6) < 50){
		s.setCase("failed");
	}
	else{
		s.setCase("passed");
	}
}
}
