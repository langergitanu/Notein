package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzWY {
    private byte[] zzTZ;
    private zzZYV<Integer> zzU0;

    private zzWY() {
    }

    private static int zzY(zzWK zzwk, int i, zzWY zzwy) throws Exception {
        for (int i2 = 1; i2 < i; i2++) {
            zzwy.zzU0.add(i2, Integer.valueOf(zzwk.zzUS() & 65535));
        }
        return androidx.core.graphics.OooO0OO.OooO00o(i, 1, 2, 1);
    }

    public static zzWY zzZ(zzWK zzwk, int i) throws Exception {
        zzWY zzwy = new zzWY();
        zzZYV<Integer> zzzyv = new zzZYV<>(i);
        zzwy.zzU0 = zzzyv;
        zzzyv.add(0, 0);
        long position = zzwk.zzq().getPosition();
        int iZzZ = zzZ(zzwk, i, zzwy);
        zzwk.zzq().zzH(position);
        zzwy.zzTZ = zzwk.zzn(iZzZ);
        return zzwy;
    }

    public final int getSize() {
        return this.zzTZ.length;
    }

    public final zzZYV<Integer> zzVg() {
        return this.zzU0;
    }

    private static int zzZ(zzWK zzwk, int i, zzWY zzwy) throws Exception {
        short sZzUU = zzwk.zzUU();
        if (sZzUU == 0) {
            return zzY(zzwk, i, zzwy);
        }
        if (sZzUU == 1) {
            return zzZ(zzwk, i, true, zzwy);
        }
        if (sZzUU == 2) {
            return zzZ(zzwk, i, false, zzwy);
        }
        throw new IllegalStateException("Unknown CFF charset format.");
    }

    private static int zzZ(zzWK zzwk, int i, boolean z, zzWY zzwy) throws Exception {
        int i2 = 1;
        int i3 = 1;
        while (i2 < i) {
            int iZzUS = zzwk.zzUS() & 65535;
            int iZzUU = z ? zzwk.zzUU() : 65535 & zzwk.zzUT();
            int i4 = 0;
            while (i4 <= iZzUU) {
                zzwy.zzU0.add(i2, Integer.valueOf(iZzUS + i4));
                i4++;
                i2++;
            }
            i3 += (z ? 1 : 2) + 2;
        }
        return i3;
    }

    public final void zzZ(zzWJ zzwj) throws Exception {
        zzwj.writeBytes(this.zzTZ);
    }
}
