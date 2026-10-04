package oO0oO0Oo;

import java.io.IOException;
import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O00 implements Enumeration {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public C34027OooOOOo f122435OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public AbstractC34036OooOoOO f122436OooO0O0;

    public final AbstractC34036OooOoOO OooO00o() {
        try {
            return this.f122435OooO00o.OooOOoo();
        } catch (IOException e) {
            throw new C34034OooOoO("malformed ASN.1: " + e, e);
        }
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f122436OooO0O0 != null;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        AbstractC34036OooOoOO abstractC34036OooOoOO = this.f122436OooO0O0;
        if (abstractC34036OooOoOO == null) {
            throw new NoSuchElementException();
        }
        this.f122436OooO0O0 = OooO00o();
        return abstractC34036OooOoOO;
    }
}
