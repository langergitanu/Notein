package com.aspose.slides.internal.p279mr;

import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p550zi.C13609qq;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: renamed from: com.aspose.slides.internal.mr.um */
/* JADX INFO: loaded from: classes4.dex */
public class C6466um extends AbstractC6416c5 {
    public C6466um(int i, int i2, int i3, C13609qq c13609qq, C12014ne c12014ne, C13609qq c13609qq2, int i4) {
        super(i, i2, i3, c13609qq, c12014ne.Clone(), c13609qq2, i4);
    }

    @Override // com.aspose.slides.internal.p279mr.AbstractC6416c5
    /* JADX INFO: renamed from: k4 */
    public void mo26307k4(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7 = 0;
        for (byte b : bArr) {
            bArr2[i7] = b;
            int i8 = i7 + 2;
            bArr2[i7 + 1] = UnsignedBytes.MAX_POWER_OF_TWO;
            i7 += 3;
            bArr2[i8] = UnsignedBytes.MAX_POWER_OF_TWO;
        }
    }
}
