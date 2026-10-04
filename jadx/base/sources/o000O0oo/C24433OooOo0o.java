package o000O0oo;

import android.view.ViewGroup;
import kotlin.jvm.internal.C24019OooOO0o;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000O0oo.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24433OooOo0o extends C24019OooOO0o implements InterfaceC32507OooOO0o<Runnable, C32460OooOooO> {
    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final C32460OooOooO invoke(Runnable runnable) {
        ((ViewGroup) this.receiver).postOnAnimation(runnable);
        return C32460OooOooO.f116667OooO00o;
    }
}
