package domain;

public class RepostsInfo {
    private int count;
    private int userReposted;

    public RepostsInfo(int count, int userReposted) {
        this.count = count;
        this.userReposted = userReposted;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
