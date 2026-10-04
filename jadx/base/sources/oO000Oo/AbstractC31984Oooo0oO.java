package oO000Oo;

import com.google.common.base.MoreObjects;
import oO000Oo.o000000;
import oO0OOo0o.C33058OooO00o;
import oO0OOo0o.C33082Oooo00O;

/* JADX INFO: renamed from: oO000Oo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31984Oooo0oO implements InterfaceC31954OooOo0o {
    public abstract InterfaceC31954OooOo0o OooO00o();

    @Override // oO000Oo.o000000
    public void OooO0O0(oO0OOo0o.o00Oo0 o00oo02) {
        OooO00o().OooO0O0(o00oo02);
    }

    @Override // oO0OOo0o.Oooo000
    public final C33082Oooo00O OooO0OO() {
        return OooO00o().OooO0OO();
    }

    @Override // oO000Oo.o000000
    public void OooO0o(oO0OOo0o.o00Oo0 o00oo02) {
        OooO00o().OooO0o(o00oo02);
    }

    @Override // oO000Oo.o000000
    public final Runnable OooO0o0(o000000.OooO00o oooO00o) {
        return OooO00o().OooO0o0(oooO00o);
    }

    @Override // oO000Oo.InterfaceC31954OooOo0o
    public final C33058OooO00o getAttributes() {
        return OooO00o().getAttributes();
    }

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", OooO00o()).toString();
    }
}
