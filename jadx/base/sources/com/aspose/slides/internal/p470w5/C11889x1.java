package com.aspose.slides.internal.p470w5;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p245la.AbstractC6016k4;
import com.aspose.slides.internal.p245la.C6013du;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;

/* JADX INFO: renamed from: com.aspose.slides.internal.w5.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C11889x1 extends AbstractC6016k4 {

    /* JADX INFO: renamed from: k4 */
    private String f40047k4;

    public C11889x1() {
        this.f40047k4 = " ";
    }

    @Override // com.aspose.slides.internal.p245la.InterfaceC6018m9
    /* JADX INFO: renamed from: k4 */
    public void mo24316k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("stream");
        }
        abstractC3150x6.writeByte((byte) 33);
        abstractC3150x6.writeByte((byte) -2);
        C6013du.m24296k4(AbstractC6747ar.m26650yj().mo26677to(this.f40047k4), abstractC3150x6);
    }

    public C11889x1(String str) {
        this.f40047k4 = str;
    }
}
