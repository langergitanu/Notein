package com.orion.notein.data.service.responsebody.transactions;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m80612d2 = {"Lcom/orion/notein/data/service/responsebody/transactions/CommodityHint;", "", "commodityId", "", "hint", "Lcom/orion/notein/data/service/responsebody/transactions/LocalizedHint;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/data/service/responsebody/transactions/LocalizedHint;)V", "getCommodityId", "()Ljava/lang/String;", "getHint", "()Lcom/orion/notein/data/service/responsebody/transactions/LocalizedHint;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class CommodityHint {

    @SerializedName("commodityId")
    private final String commodityId;

    @SerializedName("hint")
    private final LocalizedHint hint;

    /* JADX WARN: Multi-variable type inference failed */
    public CommodityHint() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CommodityHint copy$default(CommodityHint commodityHint, String str, LocalizedHint localizedHint, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commodityHint.commodityId;
        }
        if ((i & 2) != 0) {
            localizedHint = commodityHint.hint;
        }
        return commodityHint.copy(str, localizedHint);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCommodityId() {
        return this.commodityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LocalizedHint getHint() {
        return this.hint;
    }

    public final CommodityHint copy(String commodityId, LocalizedHint hint) {
        OooOOO0.OooO0oO(commodityId, "commodityId");
        return new CommodityHint(commodityId, hint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommodityHint)) {
            return false;
        }
        CommodityHint commodityHint = (CommodityHint) other;
        return OooOOO0.OooO0O0(this.commodityId, commodityHint.commodityId) && OooOOO0.OooO0O0(this.hint, commodityHint.hint);
    }

    public final String getCommodityId() {
        return this.commodityId;
    }

    public final LocalizedHint getHint() {
        return this.hint;
    }

    public int hashCode() {
        int iHashCode = this.commodityId.hashCode() * 31;
        LocalizedHint localizedHint = this.hint;
        return iHashCode + (localizedHint == null ? 0 : localizedHint.hashCode());
    }

    public String toString() {
        return "CommodityHint(commodityId=" + this.commodityId + ", hint=" + this.hint + ")";
    }

    public CommodityHint(String commodityId, LocalizedHint localizedHint) {
        OooOOO0.OooO0oO(commodityId, "commodityId");
        this.commodityId = commodityId;
        this.hint = localizedHint;
    }

    public /* synthetic */ CommodityHint(String str, LocalizedHint localizedHint, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : localizedHint);
    }
}
