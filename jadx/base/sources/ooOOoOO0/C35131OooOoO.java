package ooOOoOO0;

import java.util.Arrays;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: ooOOoOO0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C35131OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public char[] f126142OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f126143OooO0O0;

    public final void OooO00o(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f126142OooO00o;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i3);
            kotlin.jvm.internal.OooOOO0.OooO0o(cArrCopyOf, "copyOf(...)");
            this.f126142OooO00o = cArrCopyOf;
        }
    }

    public final void OooO0O0() {
        C35120OooO0oO c35120OooO0oO = C35120OooO0oO.f126111OooO0OO;
        char[] array = this.f126142OooO00o;
        c35120OooO0oO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(array, "array");
        synchronized (c35120OooO0oO) {
            try {
                int i = c35120OooO0oO.f126113OooO0O0;
                if (array.length + i < C35117OooO0Oo.f126108OooO00o) {
                    c35120OooO0oO.f126113OooO0O0 = i + array.length;
                    c35120OooO0oO.f126112OooO00o.addLast(array);
                }
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(String text) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        int length = text.length();
        if (length == 0) {
            return;
        }
        OooO00o(this.f126143OooO0O0, length);
        text.getChars(0, text.length(), this.f126142OooO00o, this.f126143OooO0O0);
        this.f126143OooO0O0 += length;
    }

    public final void OooO0Oo(long j) {
        OooO0OO(String.valueOf(j));
    }

    public final String toString() {
        return new String(this.f126142OooO00o, 0, this.f126143OooO0O0);
    }
}
