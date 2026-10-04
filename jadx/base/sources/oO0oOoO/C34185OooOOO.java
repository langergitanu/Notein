package oO0oOoO;

import java.math.BigInteger;
import oO0oOOoo.C34135OooO0OO;
import oO0oOo.C34140OooO0o0;
import oO0oOoO0.C34196OooO0O0;

/* JADX INFO: renamed from: oO0oOoO.OooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34185OooOOO extends AbstractC34191OooOOoo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C34196OooO0O0 f122817OooOo0o;

    public C34185OooOOO(C34135OooO0OO c34135OooO0OO, BigInteger bigInteger, byte[] bArr) {
        this(new C34196OooO0O0(c34135OooO0OO, bigInteger, bArr));
    }

    @Override // oOO000oO.InterfaceC34337OooO0o0
    public final boolean Oooo0(C34140OooO0o0 c34140OooO0o0) {
        return this.f122817OooOo0o.Oooo0(c34140OooO0o0);
    }

    public final Object clone() {
        return new C34185OooOOO(this.f122817OooOo0o);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34185OooOOO) {
            return this.f122817OooOo0o.equals(((C34185OooOOO) obj).f122817OooOo0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f122817OooOo0o.hashCode();
    }

    public C34185OooOOO(C34196OooO0O0 c34196OooO0O0) {
        this.f122817OooOo0o = c34196OooO0O0;
    }
}
