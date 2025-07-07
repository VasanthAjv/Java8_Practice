package java8_Concepts.MapInStreams;

public class Family {
private String Fname;
private String Ftype;
private double FTurnover;
private int Fmembers;
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getFtype() {
	return Ftype;
}
public void setFtype(String ftype) {
	Ftype = ftype;
}
public double getFTurnover() {
	return FTurnover;
}
public void setFTurnover(double fTurnover) {
	FTurnover = fTurnover;
}
public int getFmembers() {
	return Fmembers;
}
public void setFmembers(int fmembers) {
	Fmembers = fmembers;
}
public Family(String fname, String ftype, double fTurnover, int fmembers) {
	Fname = fname;
	Ftype = ftype;
	FTurnover = fTurnover;
	Fmembers = fmembers;
}
@Override
public String toString() {
	return "Family [Fname=" + Fname + ", Ftype=" + Ftype + ", FTurnover=" + FTurnover + ", Fmembers=" + Fmembers + "]";
}


}
