package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34036OooOoOO extends OooOo00 {
    public static AbstractC34036OooOoOO OooOOO(byte[] bArr) throws IOException {
        C34027OooOOOo c34027OooOOOo = new C34027OooOOOo(bArr);
        try {
            AbstractC34036OooOoOO abstractC34036OooOoOOOooOOoo = c34027OooOOOo.OooOOoo();
            if (c34027OooOOOo.available() == 0) {
                return abstractC34036OooOoOOOooOOoo;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException;

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return this;
    }

    public abstract boolean OooO0oo(AbstractC34036OooOoOO abstractC34036OooOoOO);

    public abstract boolean OooOO0();

    public abstract int OooOO0O(boolean z) throws IOException;

    public final boolean OooOO0o(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        return this == abstractC34036OooOoOO || OooO0oo(abstractC34036OooOoOO);
    }

    public AbstractC34036OooOoOO OooOOOO() {
        return this;
    }

    public AbstractC34036OooOoOO OooOOOo() {
        return this;
    }

    @Override // oO0oO0Oo.OooOo00
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC34019OooO0oO) && OooO0oo(((InterfaceC34019OooO0oO) obj).OooO0o());
    }

    @Override // oO0oO0Oo.OooOo00
    public abstract int hashCode();
}
