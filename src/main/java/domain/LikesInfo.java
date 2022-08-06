package domain;

public class LikesInfo {
    private int count;
    private int userLikes;
    private int canLike;
    private int canPublish;

    public LikesInfo(int count, int userLikes, int canLike, int canPublish) {
        this.count = count;
        this.userLikes = userLikes;
        this.canLike = canLike;
        this.canPublish = canPublish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getСanLike() {
        return canLike;
    }

    public void setСanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getСanPublish() {
        return canPublish;
    }

    public void setСanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
