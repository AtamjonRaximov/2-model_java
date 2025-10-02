public class ClassRoom {
    private int roomNumber;
    private String teacherName;
    private int teacherPhoneNumber;
    private String studentName;

    public ClassRoom(int roomNumber, String teacherName, int teacherPhoneNumber, String studentName) {
        this.roomNumber = roomNumber;
        this.teacherName = teacherName;
        this.teacherPhoneNumber = teacherPhoneNumber;
        this.studentName = studentName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public int getTeacherPhoneNumber() {
        return teacherPhoneNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public void setTeacherPhoneNumber(int teacherPhoneNumber) {
        this.teacherPhoneNumber = teacherPhoneNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void display() {
        System.out.println("roomnumber "+getRoomNumber() + " teacherNmae " + teacherName + " studentlarini " + studentName);
    }

}
