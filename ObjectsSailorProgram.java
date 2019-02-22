import java.util.ArrayList;
public class ObjectsSailorProgram {
    public static void main(String[] args) {

        Sailor firstSailor = new Sailor("Frank", "frank@mail.com");
        Sailor secondSailor = new Sailor("Susan", "susan@mail.com");
        Sailor thirdSailor = new Sailor("John", "john@sailors.com");
        Sailor fourthSailor = new Sailor("Ann", "ann@sailors.com");
        
        Crew firstCrew = new Crew();
        Crew secondCrew = new Crew();
                
        firstCrew.addCrewMember(firstSailor);
        firstCrew.addCrewMember(secondSailor);
        firstCrew.addCrewMember(fourthSailor);
        
        secondCrew.addCrewMember(thirdSailor);
        secondCrew.addCrewMember(secondSailor);
        
        System.out.println("=== First crew ===\n" + firstCrew);
        System.out.println("=== Second crew ===\n" + secondCrew);
        
        secondSailor.setEmail("Susan@sailors.com");
        System.out.println("=== Second crew ===\n" + secondCrew);
    }
}



 class Crew {
	private ArrayList<Sailor> sailorList = new ArrayList<Sailor>();

	public Crew() {
		super();
	}

	public void addCrewMember(Sailor sailor) {
		sailorList.add(sailor);
	}

	public String toString() {
		String crewList = "";
		for (int i = 0; i < sailorList.size(); i++) {
			crewList += sailorList.get(i).getName() + " (" + sailorList.get(i).getEmail() + ")\n";
		}

		crewList = crewList + "\n";
		return crewList;
	}
}


 class Sailor {
private String name;
private String email;

public Sailor(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
this.email  = email;
}
}

