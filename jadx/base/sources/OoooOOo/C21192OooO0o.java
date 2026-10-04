package OoooOOo;

import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.Purchase;
import com.orion.notein.p607ui.pay.Event;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0o0OOoO.C30558OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: OoooOOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21192OooO0o implements com.android.billingclient.api.OooOOO0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Object f61470OooOo0o;

    @Override // com.android.billingclient.api.OooOOO0
    public void OooO00o(C22162OooO0oo billingResult, List list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
        if (list == null) {
            list = C34434OooOoO.f123453OooOo0o;
        }
        C30558OooO0oo c30558OooO0oo = (C30558OooO0oo) this.f61470OooOo0o;
        c30558OooO0oo.getClass();
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
        c20358OooO00o.OooO0o0("handleClientPayResponse: " + billingResult + ", " + list, new Object[0]);
        int i = billingResult.f66936OooO00o;
        if (i != 0) {
            if (i != 1) {
                c30558OooO0oo.OooO0oO(Event.OooO0O0.f78704OooO00o, list);
                return;
            } else {
                c30558OooO0oo.OooO0oO(Event.OooO00o.f78703OooO00o, list);
                return;
            }
        }
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((Purchase) it.next()).OooO0O0() == 2) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooOOO0("AiQuotaPayViewModel");
                    c20358OooO00o2.OooO0o0("handleClientPayResponse: hasPendingPurchases", new Object[0]);
                    return;
                }
            }
        }
        c30558OooO0oo.OooO0oO(Event.OooO0OO.f78705OooO00o, list);
    }

    public void OooO0O0() {
        kotlin.jvm.internal.OooOOOO oooOOOO = (kotlin.jvm.internal.OooOOOO) this.f61470OooOo0o;
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            C21200OooOOO0.f61501OooO0oo = oOo000Oo.OooOo.OoooOoo((Iterable) C21200OooOOO0.f61501OooO0oo, oooOOOO);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C21192OooO0o(InterfaceC32508OooOOOo interfaceC32508OooOOOo) {
        this.f61470OooOo0o = (kotlin.jvm.internal.OooOOOO) interfaceC32508OooOOOo;
    }
}
