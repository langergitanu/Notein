package oO0oo00o;

import java.util.Arrays;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oo00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34236OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f122980OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f122981OooO0O0;

    public C34236OooO0OO(byte[] bArr, int i) {
        this.f122980OooO00o = C34332OooO00o.OooO00o(bArr);
        this.f122981OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34236OooO0OO)) {
            return false;
        }
        C34236OooO0OO c34236OooO0OO = (C34236OooO0OO) obj;
        if (c34236OooO0OO.f122981OooO0O0 != this.f122981OooO0O0) {
            return false;
        }
        return Arrays.equals(this.f122980OooO00o, c34236OooO0OO.f122980OooO00o);
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122980OooO00o) ^ this.f122981OooO0O0;
    }
}
