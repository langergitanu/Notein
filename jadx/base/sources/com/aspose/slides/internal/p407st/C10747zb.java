package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14047bz;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.zb */
/* JADX INFO: loaded from: classes4.dex */
public final class C10747zb extends AbstractC10716xo {

    /* JADX INFO: renamed from: k4 */
    private long f37562k4;

    /* JADX INFO: renamed from: x1 */
    private String f37565x1;

    /* JADX INFO: renamed from: kk */
    private C14093tq<C14047bz> f37563kk = new C14093tq<>();

    /* JADX INFO: renamed from: to */
    private C14093tq<Long> f37564to = new C14093tq<>();

    /* JADX INFO: renamed from: du */
    private C14093tq<Long> f37561du = new C14093tq<>();

    /* JADX INFO: renamed from: du */
    public final String m52127du() {
        return this.f37565x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public C14047bz mo50989k4() {
        return C10517kw.f37160k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: kk */
    public long mo50992kk() {
        return m52129x1();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: to */
    public String mo50993to() {
        return m52127du();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m52129x1() {
        long length = AbstractC6747ar.m26643rv().mo26677to(m52127du()).length + 1;
        return (this.f37563kk.m67302x1() && this.f37564to.m67302x1() && this.f37561du.m67302x1()) ? ((length & 4294967295L) + 24) & 4294967295L : length & 4294967295L;
    }

    /* JADX INFO: renamed from: x1 */
    private String m52126x1(C3134k4 c3134k4) {
        C6765kp c6765kp = new C6765kp();
        char cM13378ks = c3134k4.m13378ks();
        while (true) {
            if (cM13378ks != 0) {
                c6765kp.m26780k4(cM13378ks);
            }
            char cM13378ks2 = c3134k4.m13378ks();
            if (cM13378ks == 0 && cM13378ks2 == 0) {
                return c6765kp.toString();
            }
            cM13378ks = cM13378ks2;
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50990k4(C3134k4 c3134k4) {
        this.f37562k4 = c3134k4.m13384uz();
        m52128k4(m52126x1(c3134k4));
        int length = AbstractC6747ar.m26643rv().mo26677to(m52127du()).length + 1;
        long j = this.f37562k4;
        if ((j & 4294967295L) == r0 + 25) {
            this.f37563kk = new C14093tq<>(new C14047bz(c3134k4.m13372dy(16)));
            this.f37564to = new C14093tq<>(Long.valueOf(c3134k4.m13384uz()));
            this.f37561du = new C14093tq<>(Long.valueOf(c3134k4.m13384uz()));
        } else if ((4294967295L & j) > length) {
            c3134k4.m13372dy(((int) j) - length);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50991k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m52129x1());
        c3149x1.m13450k4(AbstractC6747ar.m26643rv().mo26677to(m52127du()));
        c3149x1.m13443k4((byte) 0);
        if (this.f37563kk.m67302x1() && this.f37564to.m67302x1() && this.f37561du.m67302x1()) {
            c3149x1.m13450k4(this.f37563kk.m67297k4().m66539k4());
            c3149x1.m13447k4(this.f37564to.m67297k4().longValue());
            c3149x1.m13447k4(this.f37561du.m67297k4().longValue());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52128k4(String str) {
        this.f37565x1 = str;
    }
}
