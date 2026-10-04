package o000000O;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f81157OooO00o = new int[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Object[] f81158OooO0O0 = new Object[0];

    public static final int OooO00o(int[] iArr, int i, int i2) {
        OooOOO0.OooO0oO(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
