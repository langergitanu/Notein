package oO0oOo0O;

import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34075o00o0O;
import oO0oO0Oo.OooOo00;
import oO0ooO0.AbstractC34264OooO0OO;

/* JADX INFO: renamed from: oO0oOo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34170OooO0Oo extends OooOo00 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC34264OooO0OO f122777OooOo0o;

    public C34170OooO0Oo(AbstractC34264OooO0OO abstractC34264OooO0OO) {
        this.f122777OooOo0o = abstractC34264OooO0OO;
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        byte[] bArr;
        AbstractC34264OooO0OO abstractC34264OooO0OO = this.f122777OooOo0o;
        int iOooO0Oo = (abstractC34264OooO0OO.OooO0Oo() + 7) / 8;
        byte[] byteArray = abstractC34264OooO0OO.OooOO0().toByteArray();
        if (iOooO0Oo >= byteArray.length) {
            if (iOooO0Oo > byteArray.length) {
                bArr = new byte[iOooO0Oo];
                System.arraycopy(byteArray, 0, bArr, iOooO0Oo - byteArray.length, byteArray.length);
            }
            return new C34075o00o0O(byteArray);
        }
        bArr = new byte[iOooO0Oo];
        System.arraycopy(byteArray, byteArray.length - iOooO0Oo, bArr, 0, iOooO0Oo);
        byteArray = bArr;
        return new C34075o00o0O(byteArray);
    }
}
