package domain;

public class RepostInfo {
    private int idRepost;
    private int amountRepost;
    private String amountRepostAbbreviation;
    private int tooltipAmountRepost;

    public RepostInfo(int idRepost, int amountRepost, String amountRepostAbbreviation, int tooltipAmountRepost) {
        this.idRepost = idRepost;
        this.amountRepost = amountRepost;
        this.amountRepostAbbreviation = amountRepostAbbreviation;
        this.tooltipAmountRepost = tooltipAmountRepost;
    }

    public int getIdRepost() {
        return idRepost;
    }

    public void setIdRepost(int idRepost) {
        this.idRepost = idRepost;
    }

    public int getAmountRepost() {
        return amountRepost;
    }

    public void setAmountRepost(int amountRepost) {
        this.amountRepost = amountRepost;
    }

    public String getAmountRepostAbbreviation() {
        return amountRepostAbbreviation;
    }

    public void setAmountRepostAbbreviation(String amountRepostAbbreviation) {
        this.amountRepostAbbreviation = amountRepostAbbreviation;
    }

    public int getTooltipAmountRepost() {
        return tooltipAmountRepost;
    }

    public void setTooltipAmountRepost(int tooltipAmountRepost) {
        this.tooltipAmountRepost = tooltipAmountRepost;
    }
}
