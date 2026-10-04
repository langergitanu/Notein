package com.orion.notein.domain.models.transactions;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34436OooOoOO;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0003J5\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/transactions/PurchaseHintCollection;", "", "generalHints", "", "", "commodityHints", "", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "getGeneralHints", "()Ljava/util/List;", "getCommodityHints", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class PurchaseHintCollection {
    private final Map<String, List<String>> commodityHints;
    private final List<String> generalHints;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseHintCollection() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseHintCollection copy$default(PurchaseHintCollection purchaseHintCollection, List list, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = purchaseHintCollection.generalHints;
        }
        if ((i & 2) != 0) {
            map = purchaseHintCollection.commodityHints;
        }
        return purchaseHintCollection.copy(list, map);
    }

    public final List<String> component1() {
        return this.generalHints;
    }

    public final Map<String, List<String>> component2() {
        return this.commodityHints;
    }

    public final PurchaseHintCollection copy(List<String> generalHints, Map<String, ? extends List<String>> commodityHints) {
        OooOOO0.OooO0oO(generalHints, "generalHints");
        OooOOO0.OooO0oO(commodityHints, "commodityHints");
        return new PurchaseHintCollection(generalHints, commodityHints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseHintCollection)) {
            return false;
        }
        PurchaseHintCollection purchaseHintCollection = (PurchaseHintCollection) other;
        return OooOOO0.OooO0O0(this.generalHints, purchaseHintCollection.generalHints) && OooOOO0.OooO0O0(this.commodityHints, purchaseHintCollection.commodityHints);
    }

    public final Map<String, List<String>> getCommodityHints() {
        return this.commodityHints;
    }

    public final List<String> getGeneralHints() {
        return this.generalHints;
    }

    public int hashCode() {
        return this.commodityHints.hashCode() + (this.generalHints.hashCode() * 31);
    }

    public String toString() {
        return "PurchaseHintCollection(generalHints=" + this.generalHints + ", commodityHints=" + this.commodityHints + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PurchaseHintCollection(List<String> generalHints, Map<String, ? extends List<String>> commodityHints) {
        OooOOO0.OooO0oO(generalHints, "generalHints");
        OooOOO0.OooO0oO(commodityHints, "commodityHints");
        this.generalHints = generalHints;
        this.commodityHints = commodityHints;
    }

    public /* synthetic */ PurchaseHintCollection(List list, Map map, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? C34434OooOoO.f123453OooOo0o : list, (i & 2) != 0 ? C34436OooOoOO.f123455OooOo0o : map);
    }
}
