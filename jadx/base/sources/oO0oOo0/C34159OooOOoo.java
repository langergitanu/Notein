package oO0oOo0;

import oO0oO0Oo.AbstractC34033OooOo0o;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.Oooo0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oOo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34159OooOOoo extends oO0oO0Oo.OooOo00 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public byte[] f122739OooOo0o;

    public static C34159OooOOoo OooO0oo(Oooo0 oooo0) {
        AbstractC34033OooOo0o abstractC34033OooOo0oOooOOo = AbstractC34033OooOo0o.OooOOo(oooo0, false);
        if (abstractC34033OooOo0oOooOOo == null) {
            return null;
        }
        byte[] bArr = AbstractC34033OooOo0o.OooOOo0(abstractC34033OooOo0oOooOOo).f122362OooOo0o;
        C34159OooOOoo c34159OooOOoo = new C34159OooOOoo();
        c34159OooOOoo.f122739OooOo0o = C34332OooO00o.OooO00o(bArr);
        return c34159OooOOoo;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return new C34075o00o0O(C34332OooO00o.OooO00o(this.f122739OooOo0o));
    }
}
