package pdpuz.Subject;

public class subject {
    private String SubjectName;
    public int ClassNumber;

    public subject(String subjectName, int classNumber) {
        SubjectName = subjectName;
        ClassNumber = classNumber;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }
}


