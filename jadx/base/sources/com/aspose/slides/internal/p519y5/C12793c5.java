package com.aspose.slides.internal.p519y5;

/* JADX INFO: renamed from: com.aspose.slides.internal.y5.c5 */
/* JADX INFO: loaded from: classes5.dex */
class C12793c5 implements InterfaceC12794du {
    @Override // com.aspose.slides.internal.p519y5.InterfaceC12794du
    /* JADX INFO: renamed from: k4 */
    public short[][] mo59486k4(short[][] sArr) {
        short[][] sArr2 = new short[sArr.length / 2][];
        int i = 0;
        for (int i2 = 0; i2 < sArr.length / 2; i2++) {
            sArr2[i2] = new short[sArr.length / 2];
            int i3 = 0;
            for (int i4 = 0; i4 < sArr.length / 2; i4++) {
                short[] sArr3 = sArr2[i2];
                short[] sArr4 = sArr[i];
                int i5 = i3 + 1;
                int i6 = sArr4[i3] + sArr4[i5];
                short[] sArr5 = sArr[i + 1];
                sArr3[i4] = (short) (((i6 + sArr5[i3]) + sArr5[i5]) >> 2);
                i3 += 2;
            }
            i += 2;
        }
        return sArr2;
    }
}
