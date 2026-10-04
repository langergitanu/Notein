package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.cu */
/* JADX INFO: loaded from: classes4.dex */
public class C10391cu extends AbstractC10402dj {

    /* JADX INFO: renamed from: k4 */
    private C14093tq<Integer> f36910k4 = new C14093tq<>();

    public C10391cu() {
        m50673k4(1);
    }

    /* JADX INFO: renamed from: du */
    public final int m50572du() {
        if (!this.f36910k4.m67302x1()) {
            mo50573to();
        }
        return this.f36910k4.m67297k4().intValue();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10402dj
    /* JADX INFO: renamed from: to */
    public void mo50573to() {
        this.f36910k4 = new C14093tq<>(Integer.valueOf(C3110yd.m13256x1(m50675kk())));
    }

    public C10391cu(int i) {
        m50673k4(1);
        m50674k4(new byte[4]);
        m50675kk()[0] = (byte) i;
        long j = ((long) i) & 4294967295L;
        m50675kk()[1] = (byte) ((j >> 8) & 255);
        m50675kk()[2] = (byte) ((j >> 16) & 255);
        m50675kk()[3] = (byte) ((j >> 24) & 255);
    }
}
