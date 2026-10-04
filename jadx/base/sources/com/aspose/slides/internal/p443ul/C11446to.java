package com.aspose.slides.internal.p443ul;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p169hl.C4596k4;
import com.aspose.slides.internal.p456v5.C11605dy;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.ul.to */
/* JADX INFO: loaded from: classes4.dex */
public class C11446to extends C4596k4 {

    /* JADX INFO: renamed from: kk */
    private final byte[] f39001kk;

    /* JADX INFO: renamed from: x1 */
    private final C11605dy f39002x1;

    public C11446to(AbstractC3150x6 abstractC3150x6, byte[] bArr, int i, int i2) {
        super(abstractC3150x6);
        this.f39001kk = new byte[1];
        C11605dy c11605dy = new C11605dy();
        this.f39002x1 = c11605dy;
        c11605dy.m54658x1(bArr, i, i2);
    }

    @Override // com.aspose.slides.internal.p169hl.C4596k4, com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void write(byte[] bArr, int i, int i2) {
        int iM67507x1 = C14116yg.m67507x1(i2, 4192);
        byte[] bArr2 = new byte[iM67507x1];
        int i3 = i;
        while (i2 > 0) {
            int iM67507x12 = C14116yg.m67507x1(i2, iM67507x1);
            byte[] bArr3 = bArr;
            this.f39002x1.m54655k4(bArr3, i3, iM67507x12, bArr2, 0);
            this.f12849k4.write(bArr2, 0, iM67507x12);
            i2 -= iM67507x12;
            i3 += iM67507x12;
            bArr = bArr3;
        }
    }

    @Override // com.aspose.slides.internal.p169hl.C4596k4, com.aspose.slides.internal.p080dd.AbstractC3150x6
    public void writeByte(byte b) {
        byte[] bArr = this.f39001kk;
        bArr[0] = b;
        write(bArr, 0, 1);
    }
}
