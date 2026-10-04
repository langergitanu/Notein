package o00000;

import OooO0Oo.C20398OooO0O0;
import Oooo0.C20856OooooOo;

/* JADX INFO: renamed from: o00000.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24045OooO0Oo implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81034OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81035OooO0O0;

    public C24045OooO0Oo(int i, int i2) {
        this.f81034OooO00o = i;
        this.f81035OooO0O0 = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", " respectively.", i2).toString());
        }
    }

    @Override // o00000.OooO0o
    public final void OooO00o(OooO buffer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        int i = buffer.f81026OooO0OO;
        buffer.OooO00o(i, Math.min(this.f81035OooO0O0 + i, buffer.f81024OooO00o.OooO00o()));
        buffer.OooO00o(Math.max(0, buffer.f81025OooO0O0 - this.f81034OooO00o), buffer.f81025OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24045OooO0Oo)) {
            return false;
        }
        C24045OooO0Oo c24045OooO0Oo = (C24045OooO0Oo) obj;
        return this.f81034OooO00o == c24045OooO0Oo.f81034OooO00o && this.f81035OooO0O0 == c24045OooO0Oo.f81035OooO0O0;
    }

    public final int hashCode() {
        return (this.f81034OooO00o * 31) + this.f81035OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f81034OooO00o);
        sb.append(", lengthAfterCursor=");
        return C20398OooO0O0.OooO00o(')', sb, this.f81035OooO0O0);
    }
}
