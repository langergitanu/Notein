package o0o0OOoO;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.C22162OooO0oo;
import com.google.firebase.firestore.util.RunnableC22710OooO0Oo;
import com.orion.notein.p607ui.pay.Event;

/* JADX INFO: renamed from: o0o0OOoO.OooOOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30567OooOOOO implements com.android.billingclient.api.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C30558OooO0oo f109369OooO00o;

    public C30567OooOOOO(C30558OooO0oo c30558OooO0oo) {
        this.f109369OooO00o = c30558OooO0oo;
    }

    @Override // com.android.billingclient.api.OooO0o
    public final void OooO00o(C22162OooO0oo billingResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
        if (billingResult.f66936OooO00o == 0) {
            this.f109369OooO00o.OooO0oO(Event.C23765OooO0oO.f78709OooO00o, null);
        }
    }

    @Override // com.android.billingclient.api.OooO0o
    public final void OooO0O0() {
        C30558OooO0oo c30558OooO0oo = this.f109369OooO00o;
        c30558OooO0oo.getClass();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC22710OooO0Oo(c30558OooO0oo, 3), 1000L);
    }
}
