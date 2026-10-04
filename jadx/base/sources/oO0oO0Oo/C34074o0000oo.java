package oO0oO0Oo;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import oO0oO0Oo.AbstractC34039OooOooO;

/* JADX INFO: renamed from: oO0oO0Oo.o0000oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34074o0000oo extends AbstractC34039OooOooO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public byte[] f122440OooOoO0;

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final void OooO(C34035OooOoO0 c34035OooOoO0, boolean z) throws IOException {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f122440OooOoO0;
        }
        if (bArr != null) {
            c34035OooOoO0.OooOO0(48, bArr, z);
        } else {
            super.OooOOOo().OooO(c34035OooOoO0, z);
        }
    }

    @Override // oO0oO0Oo.AbstractC34036OooOoOO
    public final int OooOO0O(boolean z) throws IOException {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f122440OooOoO0;
        }
        return bArr != null ? C34035OooOoO0.OooO0Oo(bArr.length, z) : super.OooOOOo().OooOO0O(z);
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOO() {
        OooOoOO();
        return super.OooOOOO();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO, oO0oO0Oo.AbstractC34036OooOoOO
    public final AbstractC34036OooOoOO OooOOOo() {
        OooOoOO();
        return super.OooOOOo();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34022OooOO0O OooOo() {
        return ((AbstractC34039OooOooO) OooOOOo()).OooOo();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final InterfaceC34019OooO0oO OooOo0(int i) {
        OooOoOO();
        return this.f122371OooOo0o[i];
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final Enumeration OooOo0O() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f122440OooOoO0;
        }
        if (bArr == null) {
            return new AbstractC34039OooOooO.OooO0O0();
        }
        o0000O00 o0000o00 = new o0000O00();
        o0000o00.f122435OooO00o = new C34027OooOOOo(bArr, 0);
        o0000o00.f122436OooO0O0 = o0000o00.OooO00o();
        return o0000o00;
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34015OooO0OO OooOo0o() {
        return ((AbstractC34039OooOooO) OooOOOo()).OooOo0o();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34040OooOooo OooOoO() {
        return ((AbstractC34039OooOooO) OooOOOo()).OooOoO();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final AbstractC34033OooOo0o OooOoO0() {
        return ((AbstractC34039OooOooO) OooOOOo()).OooOoO0();
    }

    public final synchronized void OooOoOO() {
        C34020OooO0oo c34020OooO0oo;
        if (this.f122440OooOoO0 != null) {
            C34027OooOOOo c34027OooOOOo = new C34027OooOOOo(this.f122440OooOoO0, 0);
            try {
                AbstractC34036OooOoOO abstractC34036OooOoOOOooOOoo = c34027OooOOOo.OooOOoo();
                if (abstractC34036OooOoOOOooOOoo == null) {
                    c34020OooO0oo = new C34020OooO0oo(0);
                } else {
                    C34020OooO0oo c34020OooO0oo2 = new C34020OooO0oo();
                    do {
                        c34020OooO0oo2.OooO00o(abstractC34036OooOoOOOooOOoo);
                        abstractC34036OooOoOOOooOOoo = c34027OooOOOo.OooOOoo();
                    } while (abstractC34036OooOoOOOooOOoo != null);
                    c34020OooO0oo = c34020OooO0oo2;
                }
                c34027OooOOOo.close();
                this.f122371OooOo0o = c34020OooO0oo.OooO0OO();
                this.f122440OooOoO0 = null;
            } catch (IOException e) {
                throw new C34034OooOoO("malformed ASN.1: " + e, e);
            }
        }
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO, oO0oO0Oo.AbstractC34036OooOoOO, oO0oO0Oo.OooOo00
    public final int hashCode() {
        OooOoOO();
        return super.hashCode();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO, java.lang.Iterable
    public final Iterator<InterfaceC34019OooO0oO> iterator() {
        OooOoOO();
        return super.iterator();
    }

    @Override // oO0oO0Oo.AbstractC34039OooOooO
    public final int size() {
        OooOoOO();
        return this.f122371OooOo0o.length;
    }
}
