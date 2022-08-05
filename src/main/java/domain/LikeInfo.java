package domain;

public class LikeInfo {
    private int idLike;
    private int amountLike;
    private String amountLikeAbbreviation;

    public LikeInfo(int idLike, int amountLike, String amountLikeAbbreviation) {
        this.idLike = idLike;
        this.amountLike = amountLike;
        this.amountLikeAbbreviation = amountLikeAbbreviation;
    }

    public int getIdLike() {
        return idLike;
    }

    public void setIdLike(int idLike) {
        this.idLike = idLike;
    }

    public int getAmountLike() {
        return amountLike;
    }

    public void setAmountLike(int amountLike) {
        this.amountLike = amountLike;
    }

    public String getAmountLikeAbbreviation() {
        return amountLikeAbbreviation;
    }

    public void setAmountLikeAbbreviation(String amountLikeAbbreviation) {
        this.amountLikeAbbreviation = amountLikeAbbreviation;
    }
}
