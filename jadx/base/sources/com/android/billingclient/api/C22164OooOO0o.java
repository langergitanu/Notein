package com.android.billingclient.api;

import java.util.AbstractCollection;
import java.util.List;

/* JADX INFO: renamed from: com.android.billingclient.api.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22164OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C22162OooO0oo f66972OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractCollection f66973OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public C22164OooOO0o(C22162OooO0oo billingResult, List<? extends Purchase> purchasesList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
        kotlin.jvm.internal.OooOOO0.OooO0oO(purchasesList, "purchasesList");
        this.f66972OooO00o = billingResult;
        this.f66973OooO0O0 = (AbstractCollection) purchasesList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22164OooOO0o)) {
            return false;
        }
        C22164OooOO0o c22164OooOO0o = (C22164OooOO0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f66972OooO00o, c22164OooOO0o.f66972OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f66973OooO0O0, c22164OooOO0o.f66973OooO0O0);
    }

    public final int hashCode() {
        return this.f66973OooO0O0.hashCode() + (this.f66972OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "PurchasesResult(billingResult=" + this.f66972OooO00o + ", purchasesList=" + this.f66973OooO0O0 + ")";
    }
}
