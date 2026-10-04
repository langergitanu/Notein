package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzZX1 {
    private static void zzR(zzXZ zzxz, int i) throws Exception {
        zzxz.writeByte((byte) 65);
        zzxz.writeByte((byte) i);
    }

    public static void zzZ(zzXZ zzxz, short[] sArr) throws Exception {
        int i = 0;
        while (i < sArr.length) {
            int iMin = Math.min(255, sArr.length - i);
            zzR(zzxz, iMin);
            int i2 = 0;
            while (i2 < iMin) {
                zzxz.zzi(sArr[i]);
                i2++;
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzDB zzq(zzY0 zzy0) throws Exception {
        boolean z;
        int i;
        zzDB zzdbZzCT = zzDB.zzCT();
        while (zzy0.zzq().getPosition() < zzy0.zzq().getLength()) {
            short s = (short) (zzy0.readByte() & 255);
            if (s == 64) {
                i = zzy0.readByte() & 255;
            } else {
                z = true;
                if (s == 65) {
                    i = zzy0.readByte() & 255;
                } else if (s >= 176 && s <= 183) {
                    i = s - 175;
                } else {
                    if (s < 184 || s > 191) {
                        zzy0.zzq().zzH(zzy0.zzq().getPosition() - 1);
                        break;
                    }
                    i = s - 183;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    zzdbZzCT.add(z ? zzy0.zzXa() : zzy0.readByte() & 255);
                }
            }
            z = false;
            while (i2 < i) {
            }
        }
        return zzdbZzCT;
    }
}
