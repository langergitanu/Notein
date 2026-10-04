package com.aspose.words.internal;

import androidx.core.view.InputDeviceCompat;
import com.google.android.material.internal.ViewUtils;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzZWE {
    private static zzZWE[] zz8k = {new zzZWE(2, 0, 8, 0, 0, 0, -1), new zzZWE(2, 0, 8, 0, 0, 0, 1), new zzZWE(2, 0, 8, 0, 256, 0, -1), new zzZWE(2, 0, 8, 0, 256, 0, 1), new zzZWE(2, 0, 8, 0, 512, 0, -1), new zzZWE(2, 0, 8, 0, 512, 0, 1), new zzZWE(2, 0, 8, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, 0, -1), new zzZWE(2, 0, 8, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, 0, 1), new zzZWE(2, 0, 8, 0, 1024, 0, -1), new zzZWE(2, 0, 8, 0, 1024, 0, 1), new zzZWE(2, 8, 0, 0, 0, -1, 0), new zzZWE(2, 8, 0, 0, 0, 1, 0), new zzZWE(2, 8, 0, 256, 0, -1, 0), new zzZWE(2, 8, 0, 256, 0, 1, 0), new zzZWE(2, 8, 0, 512, 0, -1, 0), new zzZWE(2, 8, 0, 512, 0, 1, 0), new zzZWE(2, 8, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, 0, -1, 0), new zzZWE(2, 8, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, 0, 1, 0), new zzZWE(2, 8, 0, 1024, 0, -1, 0), new zzZWE(2, 8, 0, 1024, 0, 1, 0), new zzZWE(2, 4, 4, 1, 1, -1, -1), new zzZWE(2, 4, 4, 1, 1, 1, -1), new zzZWE(2, 4, 4, 1, 1, -1, 1), new zzZWE(2, 4, 4, 1, 1, 1, 1), new zzZWE(2, 4, 4, 1, 17, -1, -1), new zzZWE(2, 4, 4, 1, 17, 1, -1), new zzZWE(2, 4, 4, 1, 17, -1, 1), new zzZWE(2, 4, 4, 1, 17, 1, 1), new zzZWE(2, 4, 4, 1, 33, -1, -1), new zzZWE(2, 4, 4, 1, 33, 1, -1), new zzZWE(2, 4, 4, 1, 33, -1, 1), new zzZWE(2, 4, 4, 1, 33, 1, 1), new zzZWE(2, 4, 4, 1, 49, -1, -1), new zzZWE(2, 4, 4, 1, 49, 1, -1), new zzZWE(2, 4, 4, 1, 49, -1, 1), new zzZWE(2, 4, 4, 1, 49, 1, 1), new zzZWE(2, 4, 4, 17, 1, -1, -1), new zzZWE(2, 4, 4, 17, 1, 1, -1), new zzZWE(2, 4, 4, 17, 1, -1, 1), new zzZWE(2, 4, 4, 17, 1, 1, 1), new zzZWE(2, 4, 4, 17, 17, -1, -1), new zzZWE(2, 4, 4, 17, 17, 1, -1), new zzZWE(2, 4, 4, 17, 17, -1, 1), new zzZWE(2, 4, 4, 17, 17, 1, 1), new zzZWE(2, 4, 4, 17, 33, -1, -1), new zzZWE(2, 4, 4, 17, 33, 1, -1), new zzZWE(2, 4, 4, 17, 33, -1, 1), new zzZWE(2, 4, 4, 17, 33, 1, 1), new zzZWE(2, 4, 4, 17, 49, -1, -1), new zzZWE(2, 4, 4, 17, 49, 1, -1), new zzZWE(2, 4, 4, 17, 49, -1, 1), new zzZWE(2, 4, 4, 17, 49, 1, 1), new zzZWE(2, 4, 4, 33, 1, -1, -1), new zzZWE(2, 4, 4, 33, 1, 1, -1), new zzZWE(2, 4, 4, 33, 1, -1, 1), new zzZWE(2, 4, 4, 33, 1, 1, 1), new zzZWE(2, 4, 4, 33, 17, -1, -1), new zzZWE(2, 4, 4, 33, 17, 1, -1), new zzZWE(2, 4, 4, 33, 17, -1, 1), new zzZWE(2, 4, 4, 33, 17, 1, 1), new zzZWE(2, 4, 4, 33, 33, -1, -1), new zzZWE(2, 4, 4, 33, 33, 1, -1), new zzZWE(2, 4, 4, 33, 33, -1, 1), new zzZWE(2, 4, 4, 33, 33, 1, 1), new zzZWE(2, 4, 4, 33, 49, -1, -1), new zzZWE(2, 4, 4, 33, 49, 1, -1), new zzZWE(2, 4, 4, 33, 49, -1, 1), new zzZWE(2, 4, 4, 33, 49, 1, 1), new zzZWE(2, 4, 4, 49, 1, -1, -1), new zzZWE(2, 4, 4, 49, 1, 1, -1), new zzZWE(2, 4, 4, 49, 1, -1, 1), new zzZWE(2, 4, 4, 49, 1, 1, 1), new zzZWE(2, 4, 4, 49, 17, -1, -1), new zzZWE(2, 4, 4, 49, 17, 1, -1), new zzZWE(2, 4, 4, 49, 17, -1, 1), new zzZWE(2, 4, 4, 49, 17, 1, 1), new zzZWE(2, 4, 4, 49, 33, -1, -1), new zzZWE(2, 4, 4, 49, 33, 1, -1), new zzZWE(2, 4, 4, 49, 33, -1, 1), new zzZWE(2, 4, 4, 49, 33, 1, 1), new zzZWE(2, 4, 4, 49, 49, -1, -1), new zzZWE(2, 4, 4, 49, 49, 1, -1), new zzZWE(2, 4, 4, 49, 49, -1, 1), new zzZWE(2, 4, 4, 49, 49, 1, 1), new zzZWE(3, 8, 8, 1, 1, -1, -1), new zzZWE(3, 8, 8, 1, 1, 1, -1), new zzZWE(3, 8, 8, 1, 1, -1, 1), new zzZWE(3, 8, 8, 1, 1, 1, 1), new zzZWE(3, 8, 8, 1, 257, -1, -1), new zzZWE(3, 8, 8, 1, 257, 1, -1), new zzZWE(3, 8, 8, 1, 257, -1, 1), new zzZWE(3, 8, 8, 1, 257, 1, 1), new zzZWE(3, 8, 8, 1, InputDeviceCompat.SOURCE_DPAD, -1, -1), new zzZWE(3, 8, 8, 1, InputDeviceCompat.SOURCE_DPAD, 1, -1), new zzZWE(3, 8, 8, 1, InputDeviceCompat.SOURCE_DPAD, -1, 1), new zzZWE(3, 8, 8, 1, InputDeviceCompat.SOURCE_DPAD, 1, 1), new zzZWE(3, 8, 8, 257, 1, -1, -1), new zzZWE(3, 8, 8, 257, 1, 1, -1), new zzZWE(3, 8, 8, 257, 1, -1, 1), new zzZWE(3, 8, 8, 257, 1, 1, 1), new zzZWE(3, 8, 8, 257, 257, -1, -1), new zzZWE(3, 8, 8, 257, 257, 1, -1), new zzZWE(3, 8, 8, 257, 257, -1, 1), new zzZWE(3, 8, 8, 257, 257, 1, 1), new zzZWE(3, 8, 8, 257, InputDeviceCompat.SOURCE_DPAD, -1, -1), new zzZWE(3, 8, 8, 257, InputDeviceCompat.SOURCE_DPAD, 1, -1), new zzZWE(3, 8, 8, 257, InputDeviceCompat.SOURCE_DPAD, -1, 1), new zzZWE(3, 8, 8, 257, InputDeviceCompat.SOURCE_DPAD, 1, 1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 1, -1, -1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 1, 1, -1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 1, -1, 1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 1, 1, 1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 257, -1, -1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 257, 1, -1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 257, -1, 1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, 257, 1, 1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, InputDeviceCompat.SOURCE_DPAD, -1, -1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, InputDeviceCompat.SOURCE_DPAD, 1, -1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, InputDeviceCompat.SOURCE_DPAD, -1, 1), new zzZWE(3, 8, 8, InputDeviceCompat.SOURCE_DPAD, InputDeviceCompat.SOURCE_DPAD, 1, 1), new zzZWE(4, 12, 12, 0, 0, -1, -1), new zzZWE(4, 12, 12, 0, 0, 1, -1), new zzZWE(4, 12, 12, 0, 0, -1, 1), new zzZWE(4, 12, 12, 0, 0, 1, 1), new zzZWE(5, 16, 16, 0, 0, -1, -1), new zzZWE(5, 16, 16, 0, 0, 1, -1), new zzZWE(5, 16, 16, 0, 0, -1, 1), new zzZWE(5, 16, 16, 0, 0, 1, 1)};
    private int zz8l;
    private int zz8m;
    private int zz8n;
    private int zz8o;
    private int zz8p;
    private int zz8q;
    private int zz8r;

    private zzZWE(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.zz8r = i;
        this.zz8q = i2;
        this.zz8p = i3;
        this.zz8o = i4;
        this.zz8n = i5;
        this.zz8m = i6;
        this.zz8l = i7;
    }

    public static void zzZ(zzY0 zzy0, byte b, zzRO zzro) throws Exception {
        zzro.zzN9 = (b & UnsignedBytes.MAX_POWER_OF_TWO) == 0;
        zzZWE zzzwe = zz8k[b & Ascii.DEL];
        zzXW zzxw = new zzXW(new zzZOR(zzy0.zzn(zzzwe.zz8r - 1)), true);
        try {
            long jZza = zzxw.zza(zzzwe.zz8q);
            long jZza2 = zzxw.zza(zzzwe.zz8p);
            zzro.zzNb = (short) ((jZza + ((long) zzzwe.zz8o)) * ((long) zzzwe.zz8m));
            zzro.zzNa = (short) ((jZza2 + ((long) zzzwe.zz8n)) * ((long) zzzwe.zz8l));
        } finally {
            zzxw.dispose();
        }
    }

    public static byte zzZs(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int iAbs = Math.abs(i);
        int iAbs2 = Math.abs(i2);
        if (iAbs == 0 && iAbs2 < 1280) {
            int i6 = ((iAbs2 & 65280) >> 8) * 2;
            i3 = i6 + 1;
            if (i2 < 0) {
                i3 = i6 + 2;
            }
        } else if (iAbs < 1280 && iAbs2 == 0) {
            i3 = (((iAbs & 65280) >> 8) * 2) + 11;
        } else if (iAbs > 4095 || iAbs2 > 4095) {
            i3 = 127;
        } else if (iAbs > 768 || iAbs2 > 768) {
            i3 = 123;
        } else {
            if (iAbs > 64 || iAbs2 > 64) {
                i4 = ((iAbs2 - 1) & 3840) >> 8;
                i5 = ((((iAbs - 1) & 3840) >> 8) * 12) + 87;
            } else {
                i4 = ((iAbs2 - 1) & 240) >> 4;
                i5 = ((((iAbs - 1) & 240) >> 4) * 16) + 23;
            }
            i3 = (i4 * 4) + i5;
        }
        if (i < 0) {
            i3--;
        }
        if (i2 < 0) {
            i3 -= 2;
        }
        return (byte) i3;
    }

    public static void zzZ(zzXV zzxv, byte b, zzZX4 zzzx4) throws Exception {
        zzZWE zzzwe = zz8k[b & Ascii.DEL];
        zzxv.zzO(Math.abs(zzzx4.zzoQ()) - zzzwe.zz8o, zzzwe.zz8q);
        zzxv.zzO(Math.abs(zzzx4.zzoP()) - zzzwe.zz8n, zzzwe.zz8p);
    }
}
