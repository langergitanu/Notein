package o000o0O0;

import android.os.Bundle;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o000o0O0.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24599Oooo0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<OooOO0, OooOO0> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C24587OooOoo f83362OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo0<C24583OooOo0o> f83363OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24599Oooo0O0(Oooo0 oooo0, C24587OooOoo c24587OooOoo) {
        super(1);
        this.f83363OooOo0o = oooo0;
        this.f83362OooOo = c24587OooOoo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final OooOO0 invoke(OooOO0 oooOO02) {
        OooOO0 backStackEntry = oooOO02;
        kotlin.jvm.internal.OooOOO0.OooO0oO(backStackEntry, "backStackEntry");
        C24583OooOo0o c24583OooOo0o = backStackEntry.f83189OooOo;
        if (c24583OooOo0o == null) {
            c24583OooOo0o = null;
        }
        if (c24583OooOo0o != null) {
            C24587OooOoo c24587OooOoo = this.f83362OooOo;
            Oooo0<C24583OooOo0o> oooo0 = this.f83363OooOo0o;
            Bundle bundle = backStackEntry.f83192OooOoO0;
            C24583OooOo0o c24583OooOo0oOooO0OO = oooo0.OooO0OO(c24583OooOo0o, bundle, c24587OooOoo);
            if (c24583OooOo0oOooO0OO != null) {
                return c24583OooOo0oOooO0OO.equals(c24583OooOo0o) ? backStackEntry : oooo0.OooO0O0().OooO0OO(c24583OooOo0oOooO0OO, c24583OooOo0oOooO0OO.OooO0Oo(bundle));
            }
        }
        return null;
    }
}
