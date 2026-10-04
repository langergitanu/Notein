package oO0oOoO;

import java.util.Arrays;
import oO0oOo.C34140OooO0o0;
import oOO000oO.C34332OooO00o;

/* JADX INFO: renamed from: oO0oOoO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34173OooO extends AbstractC34191OooOOoo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte[] f122794OooOo0o;

    public C34173OooO(byte[] bArr) {
        this.f122794OooOo0o = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oOO000oO.InterfaceC34337OooO0o0
    public final boolean Oooo0(C34140OooO0o0 c34140OooO0o0) {
        if (!(c34140OooO0o0 instanceof byte[])) {
            return false;
        }
        return Arrays.equals(this.f122794OooOo0o, (byte[]) c34140OooO0o0);
    }

    public final Object clone() {
        return new C34173OooO(this.f122794OooOo0o);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C34173OooO)) {
            return false;
        }
        return Arrays.equals(this.f122794OooOo0o, ((C34173OooO) obj).f122794OooOo0o);
    }

    public final int hashCode() {
        return C34332OooO00o.OooO0o0(this.f122794OooOo0o);
    }
}
