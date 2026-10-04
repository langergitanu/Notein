package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.c5 */
/* JADX INFO: loaded from: classes4.dex */
public class C10384c5 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private byte f36881k4;

    /* JADX INFO: renamed from: x1 */
    private AbstractC10669uo f36882x1;

    public C10384c5() {
        m51409um().m51917k4(2041);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return this.f36882x1.mo50440k4() + 10;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC10669uo m50539x1() {
        return this.f36882x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50537k4(int i) {
        this.f36881k4 = (byte) i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36881k4 = c3134k4.m13387yj();
        c3134k4.m13387yj();
        C3134k4 c3134k42 = new C3134k4(new C3152yj(c3134k4.m13372dy(m51409um().m51914du() - 2), false));
        this.f36882x1 = (AbstractC10657tu) C10576og.m51431k4(c3134k42, null);
        c3134k42.m13373fa();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13446k4(C3085sv.m13071k4(C7019kk.m27469x1(this.f36882x1, AbstractC10657tu.class) ? C3085sv.m13071k4(((AbstractC10657tu) this.f36882x1).m51775c5() * 257) : 0));
        this.f36882x1.m51412x1(c3149x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50538k4(AbstractC10669uo abstractC10669uo) {
        this.f36882x1 = abstractC10669uo;
    }
}
