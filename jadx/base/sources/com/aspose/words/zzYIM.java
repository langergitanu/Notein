package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIM {
    private int mLength;
    private byte[] zzVO;

    private zzYIM(byte[] bArr, int i) {
        this.zzVO = bArr;
        this.mLength = i;
    }

    public static void zzZ(short s, int i, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int iZzpl = zzpl(i);
        int i2 = ((short) (65535 >> iZzpl)) & 65535;
        short s2 = (short) (~i2);
        int i3 = s & 65535;
        int i4 = (i2 & i3) + 3;
        int position = ((int) zzzow.zzq().getPosition()) - (((i3 & (65535 & s2)) >> (16 - iZzpl)) + 1);
        for (int i5 = 0; i5 < i4; i5++) {
            zzzow.writeByte(((com.aspose.words.internal.zzZOR) zzzow.zzq()).zziA()[position + i5]);
        }
    }

    public static zzYIM zzZZ(int i, int i2, int i3) throws Exception {
        int iZzpl = zzpl(i);
        int iMin = Math.min(i3, ((short) ((65535 >> iZzpl) + 3)) & 65535);
        return new zzYIM(com.aspose.words.internal.zzZQK.zzL((short) (((((short) ((((short) (i - i2)) & 65535) - 1)) & 65535) << (((short) (16 - iZzpl)) & 65535)) | (((short) (iMin - 3)) & 65535))), iMin);
    }

    public static zzYIM zzk(byte b) {
        return new zzYIM(new byte[]{b}, 1);
    }

    private static int zzpl(int i) throws Exception {
        int iMax = Math.max((int) Math.ceil(com.aspose.words.internal.zzZKQ.zzE(i, 2.0d)), 4);
        if (iMax <= 12) {
            return iMax;
        }
        throw new IllegalArgumentException();
    }

    public final byte[] getBytes() {
        return this.zzVO;
    }

    public final int getLength() {
        return this.mLength;
    }

    public final boolean zzTU() {
        return this.zzVO.length == 1;
    }
}
