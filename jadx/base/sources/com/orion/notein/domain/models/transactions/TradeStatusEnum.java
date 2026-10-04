package com.orion.notein.domain.models.transactions;

import OooO.OooO00o;
import androidx.core.app.NotificationCompat;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import kotlin.Metadata;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/TradeStatusEnum;", "", NotificationCompat.CATEGORY_MESSAGE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "NOTPAY", MaterialPurchaseStatusResponse.STATUS_SUCCESS, MaterialPurchaseStatusResponse.STATUS_CLOSED, "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TradeStatusEnum {
    private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
    private static final /* synthetic */ TradeStatusEnum[] $VALUES;
    private final String msg;
    public static final TradeStatusEnum NOTPAY = new TradeStatusEnum("NOTPAY", 0, "NOTPAY");
    public static final TradeStatusEnum SUCCESS = new TradeStatusEnum(MaterialPurchaseStatusResponse.STATUS_SUCCESS, 1, MaterialPurchaseStatusResponse.STATUS_SUCCESS);
    public static final TradeStatusEnum CLOSED = new TradeStatusEnum(MaterialPurchaseStatusResponse.STATUS_CLOSED, 2, MaterialPurchaseStatusResponse.STATUS_CLOSED);

    private static final /* synthetic */ TradeStatusEnum[] $values() {
        return new TradeStatusEnum[]{NOTPAY, SUCCESS, CLOSED};
    }

    static {
        TradeStatusEnum[] tradeStatusEnumArr$values = $values();
        $VALUES = tradeStatusEnumArr$values;
        $ENTRIES = OooO00o.OooO0O0(tradeStatusEnumArr$values);
    }

    private TradeStatusEnum(String str, int i, String str2) {
        this.msg = str2;
    }

    public static InterfaceC34452OooO00o<TradeStatusEnum> getEntries() {
        return $ENTRIES;
    }

    public static TradeStatusEnum valueOf(String str) {
        return (TradeStatusEnum) Enum.valueOf(TradeStatusEnum.class, str);
    }

    public static TradeStatusEnum[] values() {
        return (TradeStatusEnum[]) $VALUES.clone();
    }

    public final String getMsg() {
        return this.msg;
    }
}
