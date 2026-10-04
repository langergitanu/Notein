package com.orion.notein.data.service.responsebody.transactions;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/data/service/responsebody/transactions/PurchaseHintsResponse;", "", "commodityHints", "", "Lcom/orion/notein/data/service/responsebody/transactions/CommodityHint;", "generalHints", "Lcom/orion/notein/data/service/responsebody/transactions/LocalizedHint;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getCommodityHints", "()Ljava/util/List;", "getGeneralHints", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PurchaseHintsResponse {

    @SerializedName("commodityHints")
    private final List<CommodityHint> commodityHints;

    @SerializedName("generalHints")
    private final List<LocalizedHint> generalHints;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseHintsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseHintsResponse copy$default(PurchaseHintsResponse purchaseHintsResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = purchaseHintsResponse.commodityHints;
        }
        if ((i & 2) != 0) {
            list2 = purchaseHintsResponse.generalHints;
        }
        return purchaseHintsResponse.copy(list, list2);
    }

    public final List<CommodityHint> component1() {
        return this.commodityHints;
    }

    public final List<LocalizedHint> component2() {
        return this.generalHints;
    }

    public final PurchaseHintsResponse copy(List<CommodityHint> commodityHints, List<LocalizedHint> generalHints) {
        OooOOO0.OooO0oO(commodityHints, "commodityHints");
        OooOOO0.OooO0oO(generalHints, "generalHints");
        return new PurchaseHintsResponse(commodityHints, generalHints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHintsResponse)) {
            return false;
        }
        PurchaseHintsResponse purchaseHintsResponse = (PurchaseHintsResponse) other;
        return OooOOO0.OooO0O0(this.commodityHints, purchaseHintsResponse.commodityHints) && OooOOO0.OooO0O0(this.generalHints, purchaseHintsResponse.generalHints);
    }

    public final List<CommodityHint> getCommodityHints() {
        return this.commodityHints;
    }

    public final List<LocalizedHint> getGeneralHints() {
        return this.generalHints;
    }

    public int hashCode() {
        return this.generalHints.hashCode() + (this.commodityHints.hashCode() * 31);
    }

    public String toString() {
        return "PurchaseHintsResponse(commodityHints=" + this.commodityHints + ", generalHints=" + this.generalHints + ")";
    }

    public PurchaseHintsResponse(List<CommodityHint> commodityHints, List<LocalizedHint> generalHints) {
        OooOOO0.OooO0oO(commodityHints, "commodityHints");
        OooOOO0.OooO0oO(generalHints, "generalHints");
        this.commodityHints = commodityHints;
        this.generalHints = generalHints;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PurchaseHintsResponse(List list, List list2, int i, C24018OooO0oo c24018OooO0oo) {
        int i2 = i & 1;
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        this(i2 != 0 ? c34434OooOoO : list, (i & 2) != 0 ? c34434OooOoO : list2);
    }
}
