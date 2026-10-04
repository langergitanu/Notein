package o00000;

import OooO0Oo.C20398OooO0O0;
import Oooo0.C20856OooooOo;

/* JADX INFO: renamed from: o00000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24046OooO0o0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f81036OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f81037OooO0O0;

    public C24046OooO0o0(int i, int i2) {
        this.f81036OooO00o = i;
        this.f81037OooO0O0 = i2;
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", " respectively.", i2).toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    @Override // o00000.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(OooO buffer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(buffer, "buffer");
        int i = 0;
        for (int i2 = 0; i2 < this.f81036OooO00o; i2++) {
            int i3 = i + 1;
            int i4 = buffer.f81025OooO0O0;
            if (i4 > i3) {
                i = (Character.isHighSurrogate(buffer.OooO0O0((i4 - i3) + (-1))) && Character.isLowSurrogate(buffer.OooO0O0(buffer.f81025OooO0O0 - i3))) ? i + 2 : i3;
                if (i == buffer.f81025OooO0O0) {
                    break;
                }
            }
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f81037OooO0O0; i6++) {
            int i7 = i5 + 1;
            int i8 = buffer.f81026OooO0OO + i7;
            C24055OooOo0O c24055OooOo0O = buffer.f81024OooO00o;
            if (i8 < c24055OooOo0O.OooO00o()) {
                i5 = (Character.isHighSurrogate(buffer.OooO0O0((buffer.f81026OooO0OO + i7) + (-1))) && Character.isLowSurrogate(buffer.OooO0O0(buffer.f81026OooO0OO + i7))) ? i5 + 2 : i7;
                if (buffer.f81026OooO0OO + i5 == c24055OooOo0O.OooO00o()) {
                    break;
                }
            }
        }
        int i9 = buffer.f81026OooO0OO;
        buffer.OooO00o(i9, i5 + i9);
        int i10 = buffer.f81025OooO0O0;
        buffer.OooO00o(i10 - i, i10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24046OooO0o0)) {
            return false;
        }
        C24046OooO0o0 c24046OooO0o0 = (C24046OooO0o0) obj;
        return this.f81036OooO00o == c24046OooO0o0.f81036OooO00o && this.f81037OooO0O0 == c24046OooO0o0.f81037OooO0O0;
    }

    public final int hashCode() {
        return (this.f81036OooO00o * 31) + this.f81037OooO0O0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f81036OooO00o);
        sb.append(", lengthAfterCursor=");
        return C20398OooO0O0.OooO00o(')', sb, this.f81037OooO0O0);
    }
}
