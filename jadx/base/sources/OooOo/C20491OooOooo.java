package OooOo;

import Oooo0oO.C21034OooOOOo;

/* JADX INFO: renamed from: OooOo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20491OooOooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long[] f58536OooO00o = {-9187201950435737345L, -1};

    static {
        new OooOo(0);
    }

    public static final void OooO00o(long[] metadata, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadata, "metadata");
        int i2 = (i + 7) >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            long j = metadata[i3] & (-9187201950435737472L);
            metadata[i3] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int length = metadata.length;
        int i4 = length - 1;
        int i5 = length - 2;
        metadata[i5] = (metadata[i5] & 72057594037927935L) | (-72057594037927936L);
        metadata[i4] = metadata[0];
    }

    public static final int OooO0O0(long[] metadata, int i, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(metadata, "metadata");
        while (i < i2) {
            if (((metadata[i >> 3] >> ((i & 7) << 3)) & 255) == 128) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int OooO0OO(int i) {
        if (i == 7) {
            return 6;
        }
        return i - (i / 8);
    }

    public static final int OooO0Oo(int i) {
        if (i == 0) {
            return 6;
        }
        return (i * 2) + 1;
    }

    public static final int OooO0o(int i) {
        if (i == 7) {
            return 8;
        }
        return C21034OooOOOo.OooO00o(i, 1, 7, i);
    }

    public static final int OooO0o0(int i) {
        if (i > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i);
        }
        return 0;
    }
}
