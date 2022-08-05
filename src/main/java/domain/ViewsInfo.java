package domain;

public class ViewsInfo {
    private int idViews;
    private int amountViews;
    private String amountViewsAbbreviation;
    private int tooltipAmountViews;

    public ViewsInfo(int idViews, int amountViews, String amountViewsAbbreviation, int tooltipAmountViews) {
        this.idViews = idViews;
        this.amountViews = amountViews;
        this.amountViewsAbbreviation = amountViewsAbbreviation;
        this.tooltipAmountViews = tooltipAmountViews;
    }

    public int getIdViews() {
        return idViews;
    }

    public void setIdViews(int idViews) {
        this.idViews = idViews;
    }

    public int getAmountViews() {
        return amountViews;
    }

    public void setAmountViews(int amountViews) {
        this.amountViews = amountViews;
    }

    public String getAmountViewsAbbreviation() {
        return amountViewsAbbreviation;
    }

    public void setAmountViewsAbbreviation(String amountViewsAbbreviation) {
        this.amountViewsAbbreviation = amountViewsAbbreviation;
    }

    public int getTooltipAmountViews() {
        return tooltipAmountViews;
    }

    public void setTooltipAmountViews(int tooltipAmountViews) {
        this.tooltipAmountViews = tooltipAmountViews;
    }
}
