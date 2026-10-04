package o00000;

import OooO0Oo.C20398OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo000 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81086OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81087OooO0O0;

    public Oooo000(int i, int i2) {
        this.f81086OooO00o = i;
        this.f81087OooO0O0 = i2;
    }

    @Override // o00000.OooO0o
    public final void OooO00o(OooO buffer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        if (buffer.f81027OooO0Oo != -1) {
            buffer.f81027OooO0Oo = -1;
            buffer.f81028OooO0o0 = -1;
        }
        C24055OooOo0O c24055OooOo0O = buffer.f81024OooO00o;
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(this.f81086OooO00o, 0, c24055OooOo0O.OooO00o());
        int iOooO0o2 = oO0O00oo.OooOO0.OooO0o(this.f81087OooO0O0, 0, c24055OooOo0O.OooO00o());
        if (iOooO0o != iOooO0o2) {
            if (iOooO0o < iOooO0o2) {
                buffer.OooO0o0(iOooO0o, iOooO0o2);
            } else {
                buffer.OooO0o0(iOooO0o2, iOooO0o);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        return this.f81086OooO00o == oooo000.f81086OooO00o && this.f81087OooO0O0 == oooo000.f81087OooO0O0;
    }

    public final int hashCode() {
        return (this.f81086OooO00o * 31) + this.f81087OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f81086OooO00o);
        sb.append(", end=");
        return C20398OooO0O0.OooO00o(')', sb, this.f81087OooO0O0);
    }
}
