package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
final class zzTY extends zzU1 {
    @Override // com.aspose.words.internal.zzU1
    public final String getName() {
        return "UTF-8";
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    @Override // com.aspose.words.internal.zzU1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzUP zzZ(zzUU zzuu) {
        int i;
        byte[] bArrZzUf = zzuu.zzUf();
        int i2 = 0;
        boolean z = zzuu.zzUd() >= 3 && (bArrZzUf[0] & 255) == 239 && (bArrZzUf[1] & 255) == 187 && (bArrZzUf[2] & 255) == 191;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < zzuu.zzUd()) {
            byte b = bArrZzUf[i3];
            if ((b & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                if ((b & 224) == 192) {
                    i = 1;
                } else if ((b & 240) == 224) {
                    i = 2;
                } else {
                    if ((b & 248) == 240) {
                        i = 3;
                    }
                    i4++;
                }
                while (true) {
                    i3++;
                    if (i3 >= zzuu.zzUd()) {
                        break;
                    }
                    if ((bArrZzUf[i3] & 192) != 128) {
                        break;
                    }
                    i--;
                    if (i == 0) {
                        i5++;
                        break;
                    }
                }
                i4++;
            }
            i3++;
        }
        if (!z || i4 != 0) {
            if (!z || i5 <= i4 * 10) {
                if (i5 > 3 && i4 == 0) {
                    i2 = 100;
                } else if (i5 > 0 && i4 == 0) {
                    i2 = 80;
                } else if (i5 == 0 && i4 == 0) {
                    i2 = 15;
                } else if (i5 > i4 * 10) {
                    i2 = 25;
                }
            }
        }
        if (i2 == 0) {
            return null;
        }
        return new zzUP(this, i2);
    }
}
