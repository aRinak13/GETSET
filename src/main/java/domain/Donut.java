package domain;

public class Donut {
    private boolean isDonut;
    private int paidDuration;
    private Placeholder placeholder;
    private boolean canPublishFreeCopy;
    private String editMode;

    public Donut (boolean isDonut, int paidDuration, boolean canPublishFreeCopy, String editMode) {
        this.isDonut = isDonut;
        this.paidDuration = paidDuration;
        this.canPublishFreeCopy = canPublishFreeCopy;
        this.editMode = editMode;
    }

    public boolean getIsDonut() {

        return isDonut;
    }

    public void setIsDonut(boolean isDonut) {

        this.isDonut = isDonut;
    }

    public int getPaidDuration() {

        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {

        this.paidDuration = paidDuration;
    }

    public boolean getCanPublishFreeCopy() {

        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {

        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {

        return editMode;
    }

    public void setEditMode(String editMode) {

        this.editMode = editMode;
    }
}
