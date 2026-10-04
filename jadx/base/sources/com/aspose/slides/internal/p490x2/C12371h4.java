package com.aspose.slides.internal.p490x2;

import com.aspose.slides.internal.p066cl.InterfaceC2628x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.h4 */
/* JADX INFO: loaded from: classes5.dex */
class C12371h4 implements InterfaceC2628x1 {
    @Override // com.aspose.slides.internal.p066cl.InterfaceC2628x1
    /* JADX INFO: renamed from: k4 */
    public Object mo11999k4(int i, Object obj) {
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            bArr = new byte[4];
        } else if (bArr.length < 4) {
            throw new ArrayIndexOutOfBoundsException("outData is too small to hold the output");
        }
        bArr[0] = (byte) ((i >> 16) & 255);
        bArr[1] = (byte) ((i >> 8) & 255);
        bArr[2] = (byte) (i & 255);
        bArr[3] = (byte) ((i >> 24) & 255);
        return bArr;
    }
}
