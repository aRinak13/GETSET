package domain;

public class CommentsInfo {
    private int idComment;
    private int amountComments;
    private String amountCommentsAbbreviation;

    public CommentsInfo(int idComment, int amountComments, String amountCommentsAbbreviation) {
        this.idComment = idComment;
        this.amountComments = amountComments;
        this.amountCommentsAbbreviation = amountCommentsAbbreviation;
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getAmountComments() {
        return amountComments;
    }

    public void setAmountComments(int amountComments) {
        this.amountComments = amountComments;
    }

    public String getAmountCommentsAbbreviation() {
        return amountCommentsAbbreviation;
    }

    public void setAmountCommentsAbbreviation(String amountCommentsAbbreviation) {
        this.amountCommentsAbbreviation = amountCommentsAbbreviation;
    }
}
