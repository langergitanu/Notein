package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.ji */
/* JADX INFO: loaded from: classes4.dex */
public class C10495ji extends AbstractC10620rm {

    /* JADX INFO: renamed from: du */
    private int f37098du;

    /* JADX INFO: renamed from: k4 */
    private long f37099k4;

    /* JADX INFO: renamed from: kk */
    private int f37100kk;

    /* JADX INFO: renamed from: to */
    private long f37101to;

    /* JADX INFO: renamed from: x1 */
    private int f37102x1;

    public C10495ji(C10395d2 c10395d2) {
        super(c10395d2);
        this.f37099k4 = 0L;
        this.f37102x1 = 0;
        this.f37100kk = 0;
        this.f37101to = 0L;
        m51409um().m51917k4(1011);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 20;
    }

    /* JADX INFO: renamed from: kk */
    public final int m51010kk() {
        return this.f37100kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m51011to() {
        return this.f37101to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51012x1() {
        return this.f37099k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51007k4(int i) {
        this.f37100kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51013x1(long j) {
        this.f37101to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51008k4(long j) {
        this.f37099k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51014x1(boolean z) {
        this.f37102x1 = z ? this.f37102x1 | 4 : this.f37102x1 & (-5);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37099k4 = c3134k4.m13384uz();
        this.f37102x1 = c3134k4.m13386x6();
        this.f37100kk = c3134k4.m13386x6();
        this.f37101to = c3134k4.m13384uz();
        this.f37098du = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37099k4 & 4294967295L);
        c3149x1.m13455x1(this.f37102x1);
        c3149x1.m13455x1(this.f37100kk);
        c3149x1.m13447k4(this.f37101to & 4294967295L);
        c3149x1.m13455x1(this.f37098du);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51009k4(boolean z) {
        this.f37102x1 = z ? this.f37102x1 | 2 : this.f37102x1 & (-3);
    }
}
