package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6E {
    public static boolean zzK(zzZG zzzg) {
        if (zzzg.zzZ1() == null || zzzg.zzZ1().zzPH() != 4) {
            return (zzzg.zzZ2() == null || zzzg.zzZ2().zzZ1() == null || zzzg.zzZ2().zzZ1().zzPH() != 4) ? false : true;
        }
        return true;
    }

    public static zzP8 zzZ(long[] jArr, byte[] bArr) {
        if (jArr.length == 0 || jArr.length != bArr.length) {
            return new zzP8();
        }
        long j = jArr[0];
        zzP8 zzp8 = new zzP8();
        zzP5 zzp5 = new zzP5();
        zzZQG.zzZ(zzp8.zzO7(), zzp5);
        int i = 0;
        long j2 = j;
        for (int i2 = 1; i2 < jArr.length; i2++) {
            byte b = (byte) (bArr[i2] & 15);
            int i3 = i2 - 1;
            byte b2 = (byte) (bArr[i3] & 240);
            int i4 = b & 255;
            if (i4 == 0) {
                if ((b2 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    zzp5.zze(true);
                }
                zzP5 zzp52 = new zzP5();
                zzZQG.zzZ(zzp8.zzO7(), zzp52);
                zzp5 = zzp52;
            } else if (i4 == 1) {
                zzp5.zzR(j, jArr[i2]);
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException();
                }
                long j3 = i == 0 ? j : j2;
                i++;
                if (i == 3) {
                    zzZQG.zzZ((ArrayList<zzPZ>) zzp5.zzNY(), new zzPZ(j3, jArr[i2 - 2], jArr[i3], jArr[i2]));
                    i = 0;
                }
                j2 = j3;
            }
            j = jArr[i2];
        }
        if ((((byte) (bArr[bArr.length - 1] & 240)) & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
            zzp5.zze(true);
        }
        return zzp8;
    }
}
