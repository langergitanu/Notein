package com.aspose.slides.internal.p470w5;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p245la.AbstractC6016k4;
import com.aspose.slides.internal.p245la.C6013du;

/* JADX INFO: renamed from: com.aspose.slides.internal.w5.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11885h4 extends AbstractC6016k4 {

    /* JADX INFO: renamed from: k4 */
    private byte f40024k4;

    /* JADX INFO: renamed from: x1 */
    private byte[] f40025x1;

    public C11885h4() {
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6018m9
    /* JADX INFO: renamed from: k4 */
    public void mo24316k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        abstractC3150x6.writeByte((byte) 33);
        abstractC3150x6.writeByte(this.f40024k4);
        byte[] bArr = this.f40025x1;
        if (bArr != null) {
            C6013du.m24296k4(bArr, abstractC3150x6);
        } else {
            abstractC3150x6.writeByte((byte) 0);
        }
    }

    public C11885h4(byte b, byte[] bArr) {
        this.f40024k4 = b;
        this.f40025x1 = bArr;
    }
}
