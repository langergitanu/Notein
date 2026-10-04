package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.qj */
/* JADX INFO: loaded from: classes4.dex */
public class C10606qj extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37318k4;

    /* JADX INFO: renamed from: kk */
    private long f37319kk;

    /* JADX INFO: renamed from: to */
    private int f37320to;

    /* JADX INFO: renamed from: x1 */
    private long f37321x1;

    public C10606qj() {
        m51409um().m51917k4(61761);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 20;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51567kk(long j) {
        this.f37319kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51569x1(long j) {
        this.f37321x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51565k4(long j) {
        this.f37318k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51568kk(boolean z) {
        this.f37320to = z ? this.f37320to | 4 : this.f37320to & (-5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51570x1(boolean z) {
        this.f37320to = z ? this.f37320to | 2 : this.f37320to & (-3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37318k4 = c3134k4.m13384uz();
        this.f37321x1 = c3134k4.m13384uz();
        this.f37319kk = c3134k4.m13384uz();
        c3134k4.m13384uz();
        this.f37320to = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37318k4 & 4294967295L);
        c3149x1.m13447k4(this.f37321x1 & 4294967295L);
        c3149x1.m13447k4(this.f37319kk & 4294967295L);
        c3149x1.m13447k4(0L);
        c3149x1.m13455x1(this.f37320to);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51566k4(boolean z) {
        this.f37320to = z ? this.f37320to | 1 : this.f37320to & (-2);
    }
}
