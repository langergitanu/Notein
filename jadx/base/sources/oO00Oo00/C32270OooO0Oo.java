package oO00Oo00;

import Oooo0.C20856OooooOo;
import io.ktor.utils.p616io.Oooo000;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00Oo00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32270OooO0Oo {
    public static final long OooO00o(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final IndexOutOfBoundsException OooO0O0(int i, int i2) {
        return new IndexOutOfBoundsException(C20856OooooOo.OooO0O0("0 (offset) + ", i, " (length) > ", " (array.length)", i2));
    }

    public static final void OooO0OO(int i) {
        throw new IllegalArgumentException("Malformed code-point " + Integer.toHexString(i) + " found");
    }

    public static final void OooO0Oo(byte b) {
        StringBuilder sb = new StringBuilder("Unsupported byte code, first byte is 0x");
        Oooo000.OooO0O0(16);
        String string = Integer.toString(b & 255, 16);
        OooOOO0.OooO0o(string, "toString(this, checkRadix(radix))");
        sb.append(C33599OooOo0O.Oooo(2, string));
        throw new IllegalStateException(sb.toString().toString());
    }
}
