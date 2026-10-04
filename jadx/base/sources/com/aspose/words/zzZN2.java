package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN2 {
    static int[] zzYwN = {1252, 1250, 1251, 1253, 1254, 1255, 1256, 1257, 1258, 0, 0, 0, 0, 0, 0, 0, 874, 932, 936, 949, 950, 1361, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 869, 866, 865, 864, 863, 862, 861, 860, 857, 855, 852, 775, 737, 708, 850, 437};
    private byte[] zzTZ;

    public zzZN2(byte[] bArr) {
        this.zzTZ = bArr == null ? new byte[24] : bArr;
    }

    private static int zzB2(int i) {
        if (i == 2) {
            return 31;
        }
        int iZzt = com.aspose.words.internal.zzT8.zzt(i, 1252);
        int[] iArr = zzYwN;
        return com.aspose.words.internal.zzZKV.zzZ(iArr, iZzt, 0, iArr.length);
    }

    private void zzB3(int i) {
        int i2 = (i / 8) + 16;
        byte[] bArr = this.zzTZ;
        bArr[i2] = (byte) com.aspose.words.internal.zzXU.zzZ(bArr[i2] & 255, ((byte) (1 << (i % 8))) & 255, true);
    }

    public final byte[] getData() {
        return this.zzTZ;
    }

    public final void zzB4(int i) {
        int iZzB2;
        if (i == -1 || i == 1 || (iZzB2 = zzB2(i)) < 0) {
            return;
        }
        zzB3(iZzB2);
    }
}
