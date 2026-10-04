package com.google.firebase.functions;

import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.OooOOO0;
import com.android.billingclient.api.Purchase;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.orion.notein.p607ui.pay.Event;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0o0OOoo.C30584OooOOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO00o implements Deferred.DeferredHandler, OooOOO0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f68433OooOo0o;

    public /* synthetic */ OooO00o(Object obj) {
        this.f68433OooOo0o = obj;
    }

    @Override // com.android.billingclient.api.OooOOO0
    public void OooO00o(C22162OooO0oo billingResult, List list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
        if (list == null) {
            list = C34434OooOoO.f123453OooOo0o;
        }
        C30584OooOOOo c30584OooOOOo = (C30584OooOOOo) this.f68433OooOo0o;
        c30584OooOOOo.getClass();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("PayViewModel");
        c20358OooO00o.OooO0o0("handleClientPayResponse: " + billingResult + ", " + list, new Object[0]);
        int i = billingResult.f66936OooO00o;
        if (i != 0) {
            if (i != 1) {
                c30584OooOOOo.OooO0oo(Event.OooO0O0.f78704OooO00o, list);
                return;
            } else {
                c30584OooOOOo.OooO0oo(Event.OooO00o.f78703OooO00o, list);
                return;
            }
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((Purchase) it.next()).OooO0O0() == 2) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("PayViewModel");
                    c20358OooO00o2.OooO0o0("handleClientPayResponse: hasPendingPurchases", new Object[0]);
                    return;
                }
            }
        }
        c30584OooOOOo.OooO0oo(Event.OooO0OO.f78705OooO00o, list);
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void handle(Provider provider) {
        FirebaseContextProvider._init_$lambda$1((FirebaseContextProvider) this.f68433OooOo0o, provider);
    }
}
