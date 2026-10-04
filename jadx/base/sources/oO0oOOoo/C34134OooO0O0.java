package oO0oOOoo;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.AbstractC34040OooOooo;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oO0oO0Oo.OooOo00;

/* JADX INFO: renamed from: oO0oOOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34134OooO0O0 extends OooOo00 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public AbstractC34040OooOooo f122668OooOo0o;

    public final C34133OooO00o[] OooO() {
        AbstractC34040OooOooo abstractC34040OooOooo = this.f122668OooOo0o;
        int length = abstractC34040OooOooo.f122376OooOo0o.length;
        C34133OooO00o[] c34133OooO00oArr = new C34133OooO00o[length];
        for (int i = 0; i != length; i++) {
            c34133OooO00oArr[i] = C34133OooO00o.OooO0oo(abstractC34040OooOooo.f122376OooOo0o[i]);
        }
        return c34133OooO00oArr;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return this.f122668OooOo0o;
    }

    public final C34133OooO00o OooO0oo() {
        InterfaceC34019OooO0oO[] interfaceC34019OooO0oOArr = this.f122668OooOo0o.f122376OooOo0o;
        if (interfaceC34019OooO0oOArr.length == 0) {
            return null;
        }
        return C34133OooO00o.OooO0oo(interfaceC34019OooO0oOArr[0]);
    }
}
