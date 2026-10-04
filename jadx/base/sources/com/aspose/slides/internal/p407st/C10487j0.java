package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.j0 */
/* JADX INFO: loaded from: classes4.dex */
public class C10487j0 extends C10510kk {

    /* JADX INFO: renamed from: du */
    private final int[] f37090du = new int[8];

    /* JADX INFO: renamed from: h4 */
    private long f37091h4;

    /* JADX INFO: renamed from: to */
    private int f37092to;

    public C10487j0() {
        m51409um().m51917k4(1007);
        m51409um().m51916k4((byte) 2);
        this.f37092to = 16;
        int i = 0;
        while (true) {
            int[] iArr = this.f37090du;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final long m50978c5() {
        return this.f37091h4;
    }

    /* JADX INFO: renamed from: dy */
    public final int[] m50979dy() {
        return this.f37090du;
    }

    @Override // com.aspose.slides.internal.p407st.C10510kk, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return super.mo50440k4() + 16;
    }

    /* JADX INFO: renamed from: m9 */
    public final int m50982m9() {
        return this.f37092to;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50983x1(long j) {
        ((C10510kk) this).f37152k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50980k4(int i) {
        this.f37092to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50981k4(long j) {
        this.f37091h4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.C10510kk, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37092to = c3134k4.m13386x6();
        for (int i = 0; i < 8; i++) {
            this.f37090du[i] = c3134k4.m13387yj() & 255;
        }
        this.f37091h4 = c3134k4.m13384uz();
        super.mo50441k4(c3134k4);
    }

    @Override // com.aspose.slides.internal.p407st.C10510kk, com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(((long) this.f37092to) & 4294967295L);
        for (int i = 0; i < 8; i++) {
            c3149x1.m13443k4((byte) this.f37090du[i]);
        }
        c3149x1.m13447k4(this.f37091h4);
        super.mo50442k4(c3149x1);
    }
}
