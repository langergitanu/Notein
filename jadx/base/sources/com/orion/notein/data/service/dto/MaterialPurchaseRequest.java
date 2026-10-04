package com.orion.notein.data.service.dto;

import OooOo.C20485OooOoO;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, m80612d2 = {"Lcom/orion/notein/data/service/dto/MaterialPurchaseRequest;", "", "materialId", "", "payChannel", "", "payMethod", "<init>", "(Ljava/lang/String;II)V", "getMaterialId", "()Ljava/lang/String;", "getPayChannel", "()I", "getPayMethod", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class MaterialPurchaseRequest {

    @SerializedName("material_id")
    private final String materialId;

    @SerializedName("pay_channel")
    private final int payChannel;

    @SerializedName("pay_method")
    private final int payMethod;

    public MaterialPurchaseRequest(String materialId, int i, int i2) {
        OooOOO0.OooO0oO(materialId, "materialId");
        this.materialId = materialId;
        this.payChannel = i;
        this.payMethod = i2;
    }

    public static /* synthetic */ MaterialPurchaseRequest copy$default(MaterialPurchaseRequest materialPurchaseRequest, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = materialPurchaseRequest.materialId;
        }
        if ((i3 & 2) != 0) {
            i = materialPurchaseRequest.payChannel;
        }
        if ((i3 & 4) != 0) {
            i2 = materialPurchaseRequest.payMethod;
        }
        return materialPurchaseRequest.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMaterialId() {
        return this.materialId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPayChannel() {
        return this.payChannel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPayMethod() {
        return this.payMethod;
    }

    public final MaterialPurchaseRequest copy(String materialId, int payChannel, int payMethod) {
        OooOOO0.OooO0oO(materialId, "materialId");
        return new MaterialPurchaseRequest(materialId, payChannel, payMethod);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaterialPurchaseRequest)) {
            return false;
        }
        MaterialPurchaseRequest materialPurchaseRequest = (MaterialPurchaseRequest) other;
        return OooOOO0.OooO0O0(this.materialId, materialPurchaseRequest.materialId) && this.payChannel == materialPurchaseRequest.payChannel && this.payMethod == materialPurchaseRequest.payMethod;
    }

    public final String getMaterialId() {
        return this.materialId;
    }

    public final int getPayChannel() {
        return this.payChannel;
    }

    public final int getPayMethod() {
        return this.payMethod;
    }

    public int hashCode() {
        return Integer.hashCode(this.payMethod) + C20785Oooo00o.OooO00o(this.payChannel, this.materialId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.materialId;
        return C21023OooO0Oo.OooO0OO(")", this.payMethod, C20485OooOoO.OooO0OO(this.payChannel, "MaterialPurchaseRequest(materialId=", str, ", payChannel=", ", payMethod="));
    }
}
