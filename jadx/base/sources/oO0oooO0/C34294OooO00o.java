package oO0oooO0;

import java.io.IOException;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oOOOO.C34113OooO0O0;

/* JADX INFO: renamed from: oO0oooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34294OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C34113OooO0O0 f123131OooO00o;

    public C34294OooO00o(byte[] bArr) throws IOException {
        try {
            C34113OooO0O0 c34113OooO0O0OooO0oo = C34113OooO0O0.OooO0oo(AbstractC34036OooOoOO.OooOOO(bArr));
            if (c34113OooO0O0OooO0oo == null) {
                throw new C34295OooO0O0("empty data passed to constructor");
            }
            this.f123131OooO00o = c34113OooO0O0OooO0oo;
        } catch (ClassCastException e) {
            throw new C34295OooO0O0("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new C34295OooO0O0("malformed data: " + e2.getMessage(), e2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C34294OooO00o)) {
            return false;
        }
        return this.f123131OooO00o.equals(((C34294OooO00o) obj).f123131OooO00o);
    }

    public final int hashCode() {
        return this.f123131OooO00o.hashCode();
    }
}
