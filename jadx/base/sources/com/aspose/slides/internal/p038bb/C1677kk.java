package com.aspose.slides.internal.p038bb;

import com.aspose.slides.internal.p135fp.AbstractC4092fa;
import com.aspose.slides.internal.p299ni.InterfaceC6899c5;
import com.aspose.slides.internal.p550zi.C13609qq;

/* JADX INFO: renamed from: com.aspose.slides.internal.bb.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C1677kk extends AbstractC4092fa {
    public C1677kk(InterfaceC6899c5 interfaceC6899c5) {
        this.f11178k4 = interfaceC6899c5;
        this.f11179x1 = C13609qq.m62780c5();
    }

    @Override // com.aspose.slides.internal.p135fp.AbstractC4092fa
    /* JADX INFO: renamed from: k4 */
    public void mo9080k4(int[] iArr, byte[] bArr) {
        int i = 0;
        for (int i2 : iArr) {
            bArr[i] = (byte) ((i2 >> 16) & 255);
            int i3 = i + 2;
            bArr[i + 1] = (byte) ((i2 >> 8) & 255);
            i += 3;
            bArr[i3] = (byte) (i2 & 255);
        }
    }
}
