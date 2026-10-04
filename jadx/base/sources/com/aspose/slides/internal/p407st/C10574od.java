package com.aspose.slides.internal.p407st;

import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.od */
/* JADX INFO: loaded from: classes4.dex */
public class C10574od extends AbstractC10402dj {

    /* JADX INFO: renamed from: k4 */
    private C14093tq<Boolean> f37265k4 = new C14093tq<>();

    public C10574od() {
        m50673k4(0);
    }

    /* JADX INFO: renamed from: du */
    public final boolean m51427du() {
        if (!this.f37265k4.m67302x1()) {
            mo50573to();
        }
        return this.f37265k4.m67297k4().booleanValue();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10402dj
    /* JADX INFO: renamed from: to */
    public void mo50573to() {
        this.f37265k4 = new C14093tq<>(Boolean.valueOf((m50675kk()[0] & 255) != 0));
    }

    public C10574od(boolean z) {
        m50673k4(0);
        m50674k4(new byte[1]);
        m50675kk()[0] = z ? (byte) 1 : (byte) 0;
    }
}
