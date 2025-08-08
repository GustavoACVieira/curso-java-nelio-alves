package src.Section8;

public class StudentEx55 {
    public String name;
    public boolean approval;
    public double note1;
    public double note2;
    public double note3;

    public double gradeNote() {
        return note1 + note2 + note3;
    }

    public void isApproval() {
        this.approval = true;
    }

    public void noApproval() {
        this.approval = false;
    }

    @Override
    public String toString() {
        return "FINAL GRADE = " + String.format("%.2f", gradeNote());
    }
}
