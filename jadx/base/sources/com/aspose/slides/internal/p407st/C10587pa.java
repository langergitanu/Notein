package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14087rv;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.pa */
/* JADX INFO: loaded from: classes4.dex */
public class C10587pa extends AbstractC10620rm {

    /* JADX INFO: renamed from: k4 */
    private int f37284k4;

    public C10587pa(C10395d2 c10395d2) {
        super(c10395d2);
        m51409um().m51917k4(3999);
    }

    /* JADX INFO: renamed from: kk */
    private int m51465kk() {
        AbstractC10376bv abstractC10376bv = (AbstractC10376bv) C7019kk.m27452k4((Object) m51402ak(), AbstractC10376bv.class);
        if (abstractC10376bv == null) {
            C14087rv.m67171x1("!!! No parent record!");
            return 4;
        }
        C10462h9 c10462h9 = null;
        while (abstractC10376bv != null) {
            c10462h9 = (C10462h9) C7019kk.m27452k4((Object) abstractC10376bv, C10462h9.class);
            if (c10462h9 != null) {
                break;
            }
            abstractC10376bv = (AbstractC10376bv) C7019kk.m27452k4((Object) abstractC10376bv.m51402ak(), AbstractC10376bv.class);
        }
        if (c10462h9 == null) {
            return 4;
        }
        C10668un c10668unM50424c5 = c10462h9.mo50862jd() != null ? c10462h9.mo50862jd().m50424c5() : null;
        if (c10668unM50424c5 == null) {
            return 4;
        }
        return C10666ul.m51805k4(c10668unM50424c5.m51810kk(), c10668unM50424c5.m51812to());
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51467x1() {
        return this.f37284k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51466k4(int i) {
        this.f37284k4 = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int iM13386x6 = c3134k4.m13386x6();
        if (iM13386x6 < 0 || iM13386x6 > 8 || iM13386x6 == 3) {
            iM13386x6 = m51465kk();
        }
        this.f37284k4 = iM13386x6;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37284k4);
    }
}
