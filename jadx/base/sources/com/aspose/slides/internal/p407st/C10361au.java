package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.words.EditingLanguage;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.au */
/* JADX INFO: loaded from: classes4.dex */
public class C10361au extends C10647td {

    /* JADX INFO: renamed from: kk */
    private long f36852kk;

    /* JADX INFO: renamed from: to */
    private int f36853to = 0;

    /* JADX INFO: renamed from: x1 */
    private long f36854x1;

    public C10361au() {
        m51409um().m51917k4(EditingLanguage.LATVIAN);
    }

    @Override // com.aspose.slides.internal.p407st.C10647td, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f36853to + 8;
    }

    /* JADX INFO: renamed from: kk */
    public final long m50445kk() {
        return this.f36852kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m50446x1() {
        return this.f36854x1;
    }

    @Override // com.aspose.slides.internal.p407st.C10647td, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36854x1 = c3134k4.m13384uz();
        this.f36852kk = c3134k4.m13384uz();
        int iM51914du = m51409um().m51914du() - 8;
        this.f36853to = iM51914du;
        if (iM51914du > 0) {
            c3134k4.m13372dy(iM51914du);
        }
    }

    @Override // com.aspose.slides.internal.p407st.C10647td, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f36854x1);
        c3149x1.m13447k4(this.f36852kk);
        int i = this.f36853to;
        if (i > 0) {
            c3149x1.m13450k4(new byte[i]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m50444k4(C10361au c10361au) {
        return c10361au != null && this.f36854x1 == c10361au.m50446x1() && this.f36852kk == c10361au.m50445kk();
    }
}
