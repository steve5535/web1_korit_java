package _20_Enum;

import lombok.Getter;

/*
    여러개의 결제수단들을 enum으로 구현해 보세요
    필드: String korName, int feeRate
    CASH - 현금 0
    CARD - 카드 2
    MOBILE - 핸드폰결제 5
 */
@Getter
public enum Payment {
    CASH("현금", 0),
    CARD("카드", 2),
    MOBILE("핸드폰결제", 5)
    ;

    private String korName;
    private int feeRate;

    Payment(String korName, int feeRate) {
        this.korName = korName;
        this.feeRate = feeRate;
    }

    public double getCalcFee(double price) {
        double fee = price * feeRate / 100.0;
        return fee;
    }

}
