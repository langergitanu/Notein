package o0oo0oo;

import java.util.Comparator;

/* JADX INFO: renamed from: o0oo0oo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31383OooOo0 {

    /* JADX INFO: renamed from: o0oo0oo.OooOo0$OooO00o */
    public static class OooO00o implements Comparator<int[]> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int[][] f112069OooOo0o;

        @Override // java.util.Comparator
        public final int compare(int[] iArr, int[] iArr2) {
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            int i = iArr3[0];
            int i2 = iArr4[0];
            if (i < i2) {
                return -1;
            }
            if (i <= i2) {
                int i3 = iArr3[1];
                int i4 = iArr4[1];
                if (i3 < i4) {
                    return -1;
                }
                if (i3 <= i4) {
                    return 0;
                }
            }
            return 1;
        }
    }
}
