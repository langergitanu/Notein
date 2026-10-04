package com.orion.notein.data.service.dto;

import OoooooO.C21445Oooo;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/MaterialPurchaseResponse;", "", "order", "Lcom/orion/notein/data/service/dto/MaterialOrderDto;", "prepayInfo", "", "errCode", "errMsg", "<init>", "(Lcom/orion/notein/data/service/dto/MaterialOrderDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getOrder", "()Lcom/orion/notein/data/service/dto/MaterialOrderDto;", "getPrepayInfo", "()Ljava/lang/String;", "getErrCode", "getErrMsg", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MaterialPurchaseResponse {

    @SerializedName("err_code")
    private final String errCode;

    @SerializedName("err_msg")
    private final String errMsg;
    private final MaterialOrderDto order;

    @SerializedName("prepay_info")
    private final String prepayInfo;

    public MaterialPurchaseResponse(MaterialOrderDto materialOrderDto, String str, String str2, String str3) {
        this.order = materialOrderDto;
        this.prepayInfo = str;
        this.errCode = str2;
        this.errMsg = str3;
    }

    public static /* synthetic */ MaterialPurchaseResponse copy$default(MaterialPurchaseResponse materialPurchaseResponse, MaterialOrderDto materialOrderDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            materialOrderDto = materialPurchaseResponse.order;
        }
        if ((i & 2) != 0) {
            str = materialPurchaseResponse.prepayInfo;
        }
        if ((i & 4) != 0) {
            str2 = materialPurchaseResponse.errCode;
        }
        if ((i & 8) != 0) {
            str3 = materialPurchaseResponse.errMsg;
        }
        return materialPurchaseResponse.copy(materialOrderDto, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MaterialOrderDto getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrepayInfo() {
        return this.prepayInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getErrCode() {
        return this.errCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrMsg() {
        return this.errMsg;
    }

    public final MaterialPurchaseResponse copy(MaterialOrderDto order, String prepayInfo, String errCode, String errMsg) {
        return new MaterialPurchaseResponse(order, prepayInfo, errCode, errMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaterialPurchaseResponse)) {
            return false;
        }
        MaterialPurchaseResponse materialPurchaseResponse = (MaterialPurchaseResponse) other;
        return OooOOO0.OooO0O0(this.order, materialPurchaseResponse.order) && OooOOO0.OooO0O0(this.prepayInfo, materialPurchaseResponse.prepayInfo) && OooOOO0.OooO0O0(this.errCode, materialPurchaseResponse.errCode) && OooOOO0.OooO0O0(this.errMsg, materialPurchaseResponse.errMsg);
    }

    public final String getErrCode() {
        return this.errCode;
    }

    public final String getErrMsg() {
        return this.errMsg;
    }

    public final MaterialOrderDto getOrder() {
        return this.order;
    }

    public final String getPrepayInfo() {
        return this.prepayInfo;
    }

    public int hashCode() {
        MaterialOrderDto materialOrderDto = this.order;
        int iHashCode = (materialOrderDto == null ? 0 : materialOrderDto.hashCode()) * 31;
        String str = this.prepayInfo;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errMsg;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        MaterialOrderDto materialOrderDto = this.order;
        String str = this.prepayInfo;
        String str2 = this.errCode;
        String str3 = this.errMsg;
        StringBuilder sb = new StringBuilder("MaterialPurchaseResponse(order=");
        sb.append(materialOrderDto);
        sb.append(", prepayInfo=");
        sb.append(str);
        sb.append(", errCode=");
        return C21445Oooo.OooO0O0(sb, str2, ", errMsg=", str3, ")");
    }

    public /* synthetic */ MaterialPurchaseResponse(MaterialOrderDto materialOrderDto, String str, String str2, String str3, int i, C24018OooO0oo c24018OooO0oo) {
        this(materialOrderDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
