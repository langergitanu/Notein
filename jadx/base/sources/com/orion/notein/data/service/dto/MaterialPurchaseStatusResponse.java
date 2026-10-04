package com.orion.notein.data.service.dto;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/MaterialPurchaseStatusResponse;", "", "order", "Lcom/orion/notein/data/service/dto/MaterialOrderDto;", "errCode", "", "<init>", "(Lcom/orion/notein/data/service/dto/MaterialOrderDto;Ljava/lang/String;)V", "getOrder", "()Lcom/orion/notein/data/service/dto/MaterialOrderDto;", "getErrCode", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MaterialPurchaseStatusResponse {
    public static final String STATUS_CLOSED = "CLOSED";
    public static final String STATUS_FAILED = "FAILED";
    public static final String STATUS_PENDING = "PENDING";
    public static final String STATUS_SUCCESS = "SUCCESS";

    @SerializedName("err_code")
    private final String errCode;
    private final MaterialOrderDto order;

    public MaterialPurchaseStatusResponse(MaterialOrderDto materialOrderDto, String str) {
        this.order = materialOrderDto;
        this.errCode = str;
    }

    public static /* synthetic */ MaterialPurchaseStatusResponse copy$default(MaterialPurchaseStatusResponse materialPurchaseStatusResponse, MaterialOrderDto materialOrderDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            materialOrderDto = materialPurchaseStatusResponse.order;
        }
        if ((i & 2) != 0) {
            str = materialPurchaseStatusResponse.errCode;
        }
        return materialPurchaseStatusResponse.copy(materialOrderDto, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MaterialOrderDto getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getErrCode() {
        return this.errCode;
    }

    public final MaterialPurchaseStatusResponse copy(MaterialOrderDto order, String errCode) {
        return new MaterialPurchaseStatusResponse(order, errCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaterialPurchaseStatusResponse)) {
            return false;
        }
        MaterialPurchaseStatusResponse materialPurchaseStatusResponse = (MaterialPurchaseStatusResponse) other;
        return OooOOO0.OooO0O0(this.order, materialPurchaseStatusResponse.order) && OooOOO0.OooO0O0(this.errCode, materialPurchaseStatusResponse.errCode);
    }

    public final String getErrCode() {
        return this.errCode;
    }

    public final MaterialOrderDto getOrder() {
        return this.order;
    }

    public int hashCode() {
        MaterialOrderDto materialOrderDto = this.order;
        int iHashCode = (materialOrderDto == null ? 0 : materialOrderDto.hashCode()) * 31;
        String str = this.errCode;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MaterialPurchaseStatusResponse(order=" + this.order + ", errCode=" + this.errCode + ")";
    }

    public /* synthetic */ MaterialPurchaseStatusResponse(MaterialOrderDto materialOrderDto, String str, int i, C24018OooO0oo c24018OooO0oo) {
        this(materialOrderDto, (i & 2) != 0 ? null : str);
    }
}
