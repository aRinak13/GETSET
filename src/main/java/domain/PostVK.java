package domain;

public class PostVK {
    private int idPost;
    private int ownerID;
    private int fromID;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponed_id;
    private String textPost;
    private int date;

    private Copyright copyright;
    private LikesInfo likes;
    private RepostsInfo reposts;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private Geo geo;
    private Donut donut;



    public PostVK(int idPost, int ownerID, String textPost, int fromID, int createdBy, int date, int replyOwnerId, int replyPostId, int friendsOnly,
                  String postType, int signerId, int canPin, int canDelete, int canEdit, int isPinned, int markedAsAds, boolean isFavorite, int postponed_id) {
        this.idPost = idPost;
        this.ownerID = ownerID;
        this.textPost = textPost;
        this.fromID = fromID;
        this.createdBy = createdBy;
        this.date = date;
        this.replyOwnerId = replyOwnerId;
        this.replyPostId = replyPostId;
        this.friendsOnly = friendsOnly;
        this.postType = postType;
        this.signerId = signerId;
        this.canPin = canPin;
        this.canDelete = canDelete;
        this.canEdit = canEdit;
        this.isPinned = isPinned;
        this.markedAsAds = markedAsAds;
        this.isFavorite = isFavorite;
        this.postponed_id = postponed_id;
    }

    public int getIdPost() {

        return idPost;
    }

    public void setIdPost(int idPost) {

        this.idPost = idPost;
    }

    public int getOwnerID() {

        return ownerID;
    }

    public void setOwnerID(int ownerID) {

        this.ownerID = ownerID;
    }

    public String getTextPost() {

        return textPost;
    }

    public void setTextPost(String textPost) {

        this.textPost = textPost;
    }

    public int getFromID() {

        return fromID;
    }

    public void setFromID(int fromID) {

        this.fromID = fromID;
    }

    public int getCreatedBy() {

        return createdBy;
    }

    public void setCreatedBy(int createdBy) {

        this.createdBy = createdBy;
    }

    public int getDate() {

        return date;
    }

    public void setDate(int date) {

        this.date = date;
    }

    public int getReplyOwnerId() {

        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {

        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {

        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {

        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {

        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {

        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {

        return postType;
    }

    public void setPostType(String postType) {

        this.postType = postType;
    }

    public int getSignerId() {

        return signerId;
    }

    public void setSignerId(int signerId) {

        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {

        this.canPin = canPin;
    }

    public int getCanDelete() {

        return canDelete;
    }

    public void setCanDelete(int canDelete) {

        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {

        this.canEdit = canEdit;
    }

    public int getIsPinned() {

        return isPinned;
    }

    public void setIsPinned(int isPinned) {

        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {

        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {

        this.markedAsAds = markedAsAds;
    }

    public boolean getIsFavorite() {

        return isFavorite;
    }

    public void setIsFavorite(boolean isFavorite) {

        this.isFavorite = isFavorite;
    }

    public int getPostponed_id() {

        return postponed_id;
    }

    public void setPostponed_id(int postponed_id) {

        this.postponed_id = postponed_id;
    }
}