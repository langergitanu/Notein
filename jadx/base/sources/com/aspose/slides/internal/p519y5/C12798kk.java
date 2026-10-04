package com.aspose.slides.internal.p519y5;

/* JADX INFO: renamed from: com.aspose.slides.internal.y5.kk */
/* JADX INFO: loaded from: classes5.dex */
class C12798kk implements InterfaceC12794du {
    @Override // com.aspose.slides.internal.p519y5.InterfaceC12794du
    /* JADX INFO: renamed from: k4 */
    public short[][] mo59486k4(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length][];
        for (int i = 0; i < sArr.length; i++) {
            sArr2[i] = new short[sArr[i].length / 2];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                short[] sArr3 = sArr2[i];
                if (i2 < sArr3.length) {
                    short[] sArr4 = sArr[i];
                    sArr3[i2] = (short) (((sArr4[i2] + sArr4[i2 + 1]) + i3) >> 1);
                    i3 ^= 1;
                    i2 += 2;
                }
            }
        }
        return sArr2;
    }
}
