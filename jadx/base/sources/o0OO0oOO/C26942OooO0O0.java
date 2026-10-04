package o0OO0oOO;

import com.google.firebase.Firebase;
import com.google.firebase.analytics.AnalyticsKt;
import o0OOo0Oo.InterfaceC27308OooOo0o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OO0oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26942OooO0O0 implements InterfaceC27308OooOo0o {
    @Override // o0OOo0Oo.InterfaceC27308OooOo0o
    public final void OooO00o() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("FirebaseEventDataSource");
        c20358OooO00o.OooO0o0("logEvent: ".concat("join_in_free_trial"), new Object[0]);
        AnalyticsKt.getAnalytics(Firebase.INSTANCE).logEvent("join_in_free_trial", null);
    }
}
