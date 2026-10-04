package com.orion.notein.data.service.dto;

import OooOO0.OooO0O0;
import OooOooo.C20785Oooo00o;
import com.aspose.slides.internal.p332p7.OooO0o;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.C24472OooOoo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/MaterialOrderDto;", "", "orderNo", "", "tradeNo", "materialId", "payChannel", "", "payMethod", "amountCents", "tradeStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V", "getOrderNo", "()Ljava/lang/String;", "getTradeNo", "getMaterialId", "getPayChannel", "()I", "getPayMethod", "getAmountCents", "getTradeStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MaterialOrderDto {

    @SerializedName("amount_cents")
    private final int amountCents;

    @SerializedName("material_id")
    private final String materialId;

    @SerializedName("order_no")
    private final String orderNo;

    @SerializedName("pay_channel")
    private final int payChannel;

    @SerializedName("pay_method")
    private final int payMethod;

    @SerializedName("trade_no")
    private final String tradeNo;

    @SerializedName("trade_status")
    private final String tradeStatus;

    public MaterialOrderDto(String orderNo, String tradeNo, String materialId, int i, int i2, int i3, String str) {
        OooOOO0.OooO0oO(orderNo, "orderNo");
        OooOOO0.OooO0oO(tradeNo, "tradeNo");
        OooOOO0.OooO0oO(materialId, "materialId");
        this.orderNo = orderNo;
        this.tradeNo = tradeNo;
        this.materialId = materialId;
        this.payChannel = i;
        this.payMethod = i2;
        this.amountCents = i3;
        this.tradeStatus = str;
    }

    public static /* synthetic */ MaterialOrderDto copy$default(MaterialOrderDto materialOrderDto, String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = materialOrderDto.orderNo;
        }
        if ((i4 & 2) != 0) {
            str2 = materialOrderDto.tradeNo;
        }
        if ((i4 & 4) != 0) {
            str3 = materialOrderDto.materialId;
        }
        if ((i4 & 8) != 0) {
            i = materialOrderDto.payChannel;
        }
        if ((i4 & 16) != 0) {
            i2 = materialOrderDto.payMethod;
        }
        if ((i4 & 32) != 0) {
            i3 = materialOrderDto.amountCents;
        }
        if ((i4 & 64) != 0) {
            str4 = materialOrderDto.tradeStatus;
        }
        int i5 = i3;
        String str5 = str4;
        int i6 = i2;
        String str6 = str3;
        return materialOrderDto.copy(str, str2, str6, i, i6, i5, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrderNo() {
        return this.orderNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTradeNo() {
        return this.tradeNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMaterialId() {
        return this.materialId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPayChannel() {
        return this.payChannel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getPayMethod() {
        return this.payMethod;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAmountCents() {
        return this.amountCents;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTradeStatus() {
        return this.tradeStatus;
    }

    public final MaterialOrderDto copy(String orderNo, String tradeNo, String materialId, int payChannel, int payMethod, int amountCents, String tradeStatus) {
        OooOOO0.OooO0oO(orderNo, "orderNo");
        OooOOO0.OooO0oO(tradeNo, "tradeNo");
        OooOOO0.OooO0oO(materialId, "materialId");
        return new MaterialOrderDto(orderNo, tradeNo, materialId, payChannel, payMethod, amountCents, tradeStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaterialOrderDto)) {
            return false;
        }
        MaterialOrderDto materialOrderDto = (MaterialOrderDto) other;
        return OooOOO0.OooO0O0(this.orderNo, materialOrderDto.orderNo) && OooOOO0.OooO0O0(this.tradeNo, materialOrderDto.tradeNo) && OooOOO0.OooO0O0(this.materialId, materialOrderDto.materialId) && this.payChannel == materialOrderDto.payChannel && this.payMethod == materialOrderDto.payMethod && this.amountCents == materialOrderDto.amountCents && OooOOO0.OooO0O0(this.tradeStatus, materialOrderDto.tradeStatus);
    }

    public final int getAmountCents() {
        return this.amountCents;
    }

    public final String getMaterialId() {
        return this.materialId;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public final int getPayChannel() {
        return this.payChannel;
    }

    public final int getPayMethod() {
        return this.payMethod;
    }

    public final String getTradeNo() {
        return this.tradeNo;
    }

    public final String getTradeStatus() {
        return this.tradeStatus;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.amountCents, C20785Oooo00o.OooO00o(this.payMethod, C20785Oooo00o.OooO00o(this.payChannel, OooO00o.OooO0O0(OooO00o.OooO0O0(this.orderNo.hashCode() * 31, 31, this.tradeNo), 31, this.materialId), 31), 31), 31);
        String str = this.tradeStatus;
        return iOooO00o + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.orderNo;
        String str2 = this.tradeNo;
        String str3 = this.materialId;
        int i = this.payChannel;
        int i2 = this.payMethod;
        int i3 = this.amountCents;
        String str4 = this.tradeStatus;
        StringBuilder sbOooO0O0 = OooO0o.OooO0O0("MaterialOrderDto(orderNo=", str, ", tradeNo=", str2, ", materialId=");
        OooO0O0.OooO0Oo(i, str3, ", payChannel=", ", payMethod=", sbOooO0O0);
        C24472OooOoo.OooO0O0(sbOooO0O0, ", amountCents=", ", tradeStatus=", i2, i3);
        return androidx.concurrent.futures.OooO00o.OooO0OO(sbOooO0O0, str4, ")");
    }

    public /* synthetic */ MaterialOrderDto(String str, String str2, String str3, int i, int i2, int i3, String str4, int i4, C24018OooO0oo c24018OooO0oo) {
        this(str, str2, str3, i, i2, i3, (i4 & 64) != 0 ? null : str4);
    }
}
