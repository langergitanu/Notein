package o00000;

import OooO0Oo.C20398OooO0O0;

/* JADX INFO: renamed from: o00000.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24066Oooo00o implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81090OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81091OooO0O0;

    public C24066Oooo00o(int i, int i2) {
        this.f81090OooO00o = i;
        this.f81091OooO0O0 = i2;
    }

    @Override // o00000.OooO0o
    public final void OooO00o(OooO buffer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        C24055OooOo0O c24055OooOo0O = buffer.f81024OooO00o;
        int iOooO0o = oO0O00oo.OooOO0.OooO0o(this.f81090OooO00o, 0, c24055OooOo0O.OooO00o());
        int iOooO0o2 = oO0O00oo.OooOO0.OooO0o(this.f81091OooO0O0, 0, c24055OooOo0O.OooO00o());
        if (iOooO0o < iOooO0o2) {
            buffer.OooO0o(iOooO0o, iOooO0o2);
        } else {
            buffer.OooO0o(iOooO0o2, iOooO0o);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24066Oooo00o)) {
            return false;
        }
        C24066Oooo00o c24066Oooo00o = (C24066Oooo00o) obj;
        return this.f81090OooO00o == c24066Oooo00o.f81090OooO00o && this.f81091OooO0O0 == c24066Oooo00o.f81091OooO0O0;
    }

    public final int hashCode() {
        return (this.f81090OooO00o * 31) + this.f81091OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f81090OooO00o);
        sb.append(", end=");
        return C20398OooO0O0.OooO00o(')', sb, this.f81091OooO0O0);
    }
}
