package o0o0OOoo;

import OooO0Oo.RunnableC20408OooOOOo;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.C22162OooO0oo;
import com.orion.notein.p607ui.pay.Event;

/* JADX INFO: renamed from: o0o0OOoo.OooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30591OooOo implements com.android.billingclient.api.OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C30584OooOOOo f109471OooO00o;

    public C30591OooOo(C30584OooOOOo c30584OooOOOo) {
        this.f109471OooO00o = c30584OooOOOo;
    }

    @Override // com.android.billingclient.api.OooO0o
    public final void OooO00o(C22162OooO0oo billingResult) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
        if (billingResult.f66936OooO00o == 0) {
            this.f109471OooO00o.OooO0oo(Event.C23765OooO0oO.f78709OooO00o, null);
        }
    }

    @Override // com.android.billingclient.api.OooO0o
    public final void OooO0O0() {
        C30584OooOOOo c30584OooOOOo = this.f109471OooO00o;
        c30584OooOOOo.getClass();
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC20408OooOOOo(c30584OooOOOo, 3), 1000L);
    }
}
