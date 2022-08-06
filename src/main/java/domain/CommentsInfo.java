package domain;

public class CommentsInfo {
    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;

    public CommentsInfo(int count, int canPost, int groupsCanPost, boolean canClose, boolean canOpen) {
        this.count = count;
        this.canPost = canPost;
        this.groupsCanPost = groupsCanPost;
        this.canClose = canClose;
        this.canOpen = canOpen;
}
    public int getCount() {

        return count;
    }

    public void setCount(int count) {

        this.count = count;
    }

    public int getCanPost() {

        return canPost;
    }

    public void setCanPost(int canPost) {

        this.canPost = canPost;
    }

    public int getGroupsCanPost() {

        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {

        this.groupsCanPost = groupsCanPost;
    }

    public boolean getCanClose() {

        return canClose;
    }

    public void setCanClose(boolean canClose) {

        this.canClose = canClose;
    }

    public boolean getCanOpen() {

        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {

        this.canOpen = canOpen;
    }
}
