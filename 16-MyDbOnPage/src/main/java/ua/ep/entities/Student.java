package ua.ep.entities;

/**
 * Created by Oleksii_Sydorenko on 9/30/2016.
 */
public class Student {

    private int idStudent;
    private String firstName;
    private String lastName;
    private String dateOfStart;

    public Student() {
    }

    public Student(int idStudent, String firstName, String lastName, String dateOfStart) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfStart = dateOfStart;
    }
    
    public Student(String firstName, String lastName, String dateOfStart) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfStart = dateOfStart;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }


  

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfStart == null) ? 0 : dateOfStart.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (dateOfStart == null) {
			if (other.dateOfStart != null)
				return false;
		} else if (!dateOfStart.equals(other.dateOfStart))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	@Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfStart='" + dateOfStart + '\'' +
                '}';
    }
}
