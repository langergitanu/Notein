package o00o00Oo;

import android.content.Context;
import android.net.ConnectivityManager;
import com.bumptech.glide.OooOOO0;
import o00o00Oo.C25272OooOOo0;

/* JADX INFO: renamed from: o00o00Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25258OooO0OO implements InterfaceC25257OooO0O0 {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooOOO0.OooO0O0 f85985OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Context f85986OooOo0o;

    public C25258OooO0OO(Context context, OooOOO0.OooO0O0 oooO0O0) {
        this.f85986OooOo0o = context.getApplicationContext();
        this.f85985OooOo = oooO0O0;
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onDestroy() {
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onStart() {
        C25272OooOOo0 c25272OooOOo0OooO00o = C25272OooOOo0.OooO00o(this.f85986OooOo0o);
        OooOOO0.OooO0O0 oooO0O0 = this.f85985OooOo;
        synchronized (c25272OooOOo0OooO00o) {
            c25272OooOOo0OooO00o.f86012OooO0O0.add(oooO0O0);
            c25272OooOOo0OooO00o.OooO0O0();
        }
    }

    @Override // o00o00Oo.InterfaceC25265OooOO0O
    public final void onStop() {
        C25272OooOOo0 c25272OooOOo0OooO00o = C25272OooOOo0.OooO00o(this.f85986OooOo0o);
        OooOOO0.OooO0O0 oooO0O0 = this.f85985OooOo;
        synchronized (c25272OooOOo0OooO00o) {
            c25272OooOOo0OooO00o.f86012OooO0O0.remove(oooO0O0);
            if (c25272OooOOo0OooO00o.f86013OooO0OO && c25272OooOOo0OooO00o.f86012OooO0O0.isEmpty()) {
                C25272OooOOo0.OooO0OO oooO0OO = c25272OooOOo0OooO00o.f86011OooO00o;
                ((ConnectivityManager) oooO0OO.f86018OooO0OO.get()).unregisterNetworkCallback(oooO0OO.f86019OooO0Oo);
                c25272OooOOo0OooO00o.f86013OooO0OO = false;
            }
        }
    }
}
