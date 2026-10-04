package com.orion.notein.data.service.dto.transactions;

import OooOO0.OooO0OO;
import OooOooo.C20785Oooo00o;
import OoooooO.C21445Oooo;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jw\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0006HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/transactions/TransactionsOrderDto;", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "tradeNo", "payChannel", "", "payMethod", "productCode", "couponId", "prepayInfo", "tradeDate", "tradeStatus", "tradeAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getTradeNo", "getPayChannel", "()I", "getPayMethod", "getProductCode", "getCouponId", "getPrepayInfo", "getTradeDate", "getTradeStatus", "getTradeAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TransactionsOrderDto {

    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_APPID)
    private final String appId;

    @SerializedName("coupon_id")
    private final String couponId;

    @SerializedName("pay_channel")
    private final int payChannel;

    @SerializedName("pay_method")
    private final int payMethod;

    @SerializedName("prepay_info")
    private final String prepayInfo;

    @SerializedName("product_code")
    private final String productCode;

    @SerializedName("total_amount")
    private final String tradeAmount;

    @SerializedName("trade_date")
    private final String tradeDate;

    @SerializedName("trade_no")
    private final String tradeNo;

    @SerializedName("trade_status")
    private final String tradeStatus;

    public TransactionsOrderDto() {
        this(null, null, 0, 0, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ TransactionsOrderDto copy$default(TransactionsOrderDto transactionsOrderDto, String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = transactionsOrderDto.appId;
        }
        if ((i3 & 2) != 0) {
            str2 = transactionsOrderDto.tradeNo;
        }
        if ((i3 & 4) != 0) {
            i = transactionsOrderDto.payChannel;
        }
        if ((i3 & 8) != 0) {
            i2 = transactionsOrderDto.payMethod;
        }
        if ((i3 & 16) != 0) {
            str3 = transactionsOrderDto.productCode;
        }
        if ((i3 & 32) != 0) {
            str4 = transactionsOrderDto.couponId;
        }
        if ((i3 & 64) != 0) {
            str5 = transactionsOrderDto.prepayInfo;
        }
        if ((i3 & 128) != 0) {
            str6 = transactionsOrderDto.tradeDate;
        }
        if ((i3 & 256) != 0) {
            str7 = transactionsOrderDto.tradeStatus;
        }
        if ((i3 & 512) != 0) {
            str8 = transactionsOrderDto.tradeAmount;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str3;
        String str14 = str4;
        return transactionsOrderDto.copy(str, str2, i, i2, str13, str14, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTradeAmount() {
        return this.tradeAmount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradeNo() {
        return this.tradeNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPayChannel() {
        return this.payChannel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPayMethod() {
        return this.payMethod;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCouponId() {
        return this.couponId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPrepayInfo() {
        return this.prepayInfo;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTradeDate() {
        return this.tradeDate;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTradeStatus() {
        return this.tradeStatus;
    }

    public final TransactionsOrderDto copy(String appId, String tradeNo, int payChannel, int payMethod, String productCode, String couponId, String prepayInfo, String tradeDate, String tradeStatus, String tradeAmount) {
        OooOOO0.OooO0oO(appId, "appId");
        OooOOO0.OooO0oO(tradeNo, "tradeNo");
        OooOOO0.OooO0oO(productCode, "productCode");
        return new TransactionsOrderDto(appId, tradeNo, payChannel, payMethod, productCode, couponId, prepayInfo, tradeDate, tradeStatus, tradeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsOrderDto)) {
            return false;
        }
        TransactionsOrderDto transactionsOrderDto = (TransactionsOrderDto) other;
        return OooOOO0.OooO0O0(this.appId, transactionsOrderDto.appId) && OooOOO0.OooO0O0(this.tradeNo, transactionsOrderDto.tradeNo) && this.payChannel == transactionsOrderDto.payChannel && this.payMethod == transactionsOrderDto.payMethod && OooOOO0.OooO0O0(this.productCode, transactionsOrderDto.productCode) && OooOOO0.OooO0O0(this.couponId, transactionsOrderDto.couponId) && OooOOO0.OooO0O0(this.prepayInfo, transactionsOrderDto.prepayInfo) && OooOOO0.OooO0O0(this.tradeDate, transactionsOrderDto.tradeDate) && OooOOO0.OooO0O0(this.tradeStatus, transactionsOrderDto.tradeStatus) && OooOOO0.OooO0O0(this.tradeAmount, transactionsOrderDto.tradeAmount);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getCouponId() {
        return this.couponId;
    }

    public final int getPayChannel() {
        return this.payChannel;
    }

    public final int getPayMethod() {
        return this.payMethod;
    }

    public final String getPrepayInfo() {
        return this.prepayInfo;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getTradeAmount() {
        return this.tradeAmount;
    }

    public final String getTradeDate() {
        return this.tradeDate;
    }

    public final String getTradeNo() {
        return this.tradeNo;
    }

    public final String getTradeStatus() {
        return this.tradeStatus;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(C20785Oooo00o.OooO00o(this.payMethod, C20785Oooo00o.OooO00o(this.payChannel, OooO00o.OooO0O0(this.appId.hashCode() * 31, 31, this.tradeNo), 31), 31), 31, this.productCode);
        String str = this.couponId;
        int iHashCode = (iOooO0O0 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prepayInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tradeDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tradeStatus;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tradeAmount;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.appId;
        String str2 = this.tradeNo;
        int i = this.payChannel;
        int i2 = this.payMethod;
        String str3 = this.productCode;
        String str4 = this.couponId;
        String str5 = this.prepayInfo;
        String str6 = this.tradeDate;
        String str7 = this.tradeStatus;
        String str8 = this.tradeAmount;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("TransactionsOrderDto(appId=", str, ", tradeNo=", str2, ", payChannel=");
        C24472OooOoo.OooO0O0(sbOooO0O0, ", payMethod=", ", productCode=", i, i2);
        OooO0OO.OooO0o0(sbOooO0O0, str3, ", couponId=", str4, ", prepayInfo=");
        OooO0OO.OooO0o0(sbOooO0O0, str5, ", tradeDate=", str6, ", tradeStatus=");
        return C21445Oooo.OooO0O0(sbOooO0O0, str7, ", tradeAmount=", str8, ")");
    }

    public TransactionsOrderDto(String appId, String tradeNo, int i, int i2, String productCode, String str, String str2, String str3, String str4, String str5) {
        OooOOO0.OooO0oO(appId, "appId");
        OooOOO0.OooO0oO(tradeNo, "tradeNo");
        OooOOO0.OooO0oO(productCode, "productCode");
        this.appId = appId;
        this.tradeNo = tradeNo;
        this.payChannel = i;
        this.payMethod = i2;
        this.productCode = productCode;
        this.couponId = str;
        this.prepayInfo = str2;
        this.tradeDate = str3;
        this.tradeStatus = str4;
        this.tradeAmount = str5;
    }

    public /* synthetic */ TransactionsOrderDto(String str, String str2, int i, int i2, String str3, String str4, String str5, String str6, String str7, String str8, int i3, C24018OooO0oo c24018OooO0oo) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? -1 : i2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? null : str4, (i3 & 64) != 0 ? null : str5, (i3 & 128) != 0 ? null : str6, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8);
    }
}
