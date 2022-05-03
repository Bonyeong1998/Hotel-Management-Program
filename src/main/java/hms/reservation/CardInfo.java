
package hms.reservation;

public class CardInfo {

    private String cardtype;
    private String cardNum;
    private String expriymonth;
    private String expriyyear;

    public CardInfo(String cardtype, String cardNum, String expriymonth, String expriyyear) {
        this.cardtype = cardtype;
        this.cardNum = cardNum;
        this.expriymonth = expriymonth;
        this.expriyyear = expriyyear;
    }
  
    public String getCardtype() {
        return cardtype;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getExpriymonth() {
        return expriymonth;
    }

    public String getExpriyyear() {
        return expriyyear;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public void setExpriymonth(String expriymonth) {
        this.expriymonth = expriymonth;
    }

    public void setExpriyyear(String expriyyear) {
        this.expriyyear = expriyyear;
    }
}
