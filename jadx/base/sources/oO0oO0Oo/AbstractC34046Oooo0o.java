package oO0oO0Oo;

import java.io.IOException;

/* JADX INFO: renamed from: oO0oO0Oo.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34046Oooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Class f122390OooO00o;

    public AbstractC34046Oooo0o(Class cls) {
        this.f122390OooO00o = cls;
    }

    public final void OooO00o(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!this.f122390OooO00o.isInstance(abstractC34036OooOoOO)) {
            throw new IllegalStateException("unexpected object: ".concat(abstractC34036OooOoOO.getClass().getName()));
        }
    }

    public final AbstractC34036OooOoOO OooO0O0(byte[] bArr) throws IOException {
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOO = AbstractC34036OooOoOO.OooOOO(bArr);
        OooO00o(abstractC34036OooOoOOOooOOO);
        return abstractC34036OooOoOOOooOOO;
    }

    public AbstractC34036OooOoOO OooO0OO(AbstractC34039OooOooO abstractC34039OooOooO) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    public AbstractC34036OooOoOO OooO0Oo(C34075o00o0O c34075o00o0O) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public final AbstractC34036OooOoOO OooO0o0(Oooo0 oooo0, boolean z) {
        if (128 != oooo0.f122377OooOo) {
            throw new IllegalStateException("this method only valid for CONTEXT_SPECIFIC tags");
        }
        AbstractC34036OooOoOO abstractC34036OooOoOOOooOOo = oooo0.OooOOo(z, this);
        OooO00o(abstractC34036OooOoOOOooOOo);
        return abstractC34036OooOoOOOooOOo;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }
}
