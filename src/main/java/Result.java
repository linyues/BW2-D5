public class Result {
    StringBuffer resultString;
    StringBuffer fomalString;
    Double totalPrice;
    Double cutPrice;

    public Result(StringBuffer resultString, StringBuffer fomalString, Double totalPrice, Double cutPrice) {
        this.resultString = resultString;
        this.fomalString = fomalString;
        this.totalPrice = totalPrice;
        this.cutPrice = cutPrice;
    }

    public StringBuffer getFomalString() {
        return fomalString;
    }

    public void setFomalString(StringBuffer fomalString) {
        this.fomalString = fomalString;
    }

    public Result() {
    }

    public StringBuffer getResultString() {
        return resultString;
    }

    public void setResultString(StringBuffer resultString) {
        this.resultString = resultString;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getCutPrice() {
        return cutPrice;
    }

    public void setCutPrice(Double cutPrice) {
        this.cutPrice = cutPrice;
    }
}
