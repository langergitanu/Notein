package oO0oO0Oo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import oOO000oO.InterfaceC34334OooO0OO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOo00 implements InterfaceC34019OooO0oO, InterfaceC34334OooO0OO {
    @Override // oO0oO0Oo.InterfaceC34019OooO0oO
    public abstract AbstractC34036OooOoOO OooO0o();

    public final byte[] OooO0oO() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = OooO0o();
        abstractC34036OooOoOOOooO0o.getClass();
        new oo000o(byteArrayOutputStream).OooOOOO(abstractC34036OooOoOOOooO0o);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC34019OooO0oO) {
            return OooO0o().OooOO0o(((InterfaceC34019OooO0oO) obj).OooO0o());
        }
        return false;
    }

    @Override // oOO000oO.InterfaceC34334OooO0OO
    public final byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        AbstractC34036OooOoOO abstractC34036OooOoOOOooO0o = OooO0o();
        abstractC34036OooOoOOOooO0o.getClass();
        abstractC34036OooOoOOOooO0o.OooO(new C34035OooOoO0(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public int hashCode() {
        return OooO0o().hashCode();
    }
}
