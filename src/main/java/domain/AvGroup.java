package domain;

public class AvGroup {
    private int idGroup;
    private String imageUrl;
    private String urlHistory;

    public AvGroup(int idGroup, String imageUrl, String urlHistory) {
        this.idGroup = idGroup;
        this.imageUrl = imageUrl;
        this.urlHistory = urlHistory;
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getImageUrl() {
    return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUrlHistory() {
        return urlHistory;
    }

    public void setUrlHistory(String urlHistory) {
        this.urlHistory = urlHistory;
    }
}
