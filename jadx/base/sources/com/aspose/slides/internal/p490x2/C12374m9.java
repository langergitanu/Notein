package com.aspose.slides.internal.p490x2;

import com.aspose.slides.internal.p066cl.InterfaceC2628x1;
import com.aspose.slides.internal.p154gr.C4373jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.x2.m9 */
/* JADX INFO: loaded from: classes5.dex */
class C12374m9 implements InterfaceC2628x1 {
    @Override // com.aspose.slides.internal.p066cl.InterfaceC2628x1
    /* JADX INFO: renamed from: k4 */
    public Object mo11999k4(int i, Object obj) {
        short[] sArr = (short[]) obj;
        if (sArr == null) {
            sArr = new short[1];
        } else if (sArr.length < 1) {
            throw new ArrayIndexOutOfBoundsException("outData is too small to hold the output");
        }
        sArr[0] = (short) C4373jd.m17608du(i);
        return sArr;
    }
}
