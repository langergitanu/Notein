package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.lq */
/* JADX INFO: loaded from: classes4.dex */
public final class C10527lq extends AbstractC10716xo {

    /* JADX INFO: renamed from: k4 */
    private long f37188k4;

    /* JADX INFO: renamed from: x1 */
    private C10598q1[] f37189x1;

    /* JADX INFO: renamed from: du */
    public final C10598q1[] m51210du() {
        return this.f37189x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public C14047bz mo50989k4() {
        return C10517kw.f37161kk;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: kk */
    public long mo50992kk() {
        long jM51546kk = 4;
        if ((this.f37188k4 & 4294967295L) == 0) {
            return 4L;
        }
        for (C10598q1 c10598q1 : this.f37189x1) {
            jM51546kk = ((jM51546kk & 4294967295L) + (c10598q1.m51546kk() & 4294967295L)) & 4294967295L;
        }
        return jM51546kk;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: to */
    public String mo50993to() {
        C10598q1[] c10598q1Arr = this.f37189x1;
        if (c10598q1Arr == null || c10598q1Arr.length == 0) {
            return "";
        }
        C6765kp c6765kp = new C6765kp();
        for (C10598q1 c10598q1 : this.f37189x1) {
            c6765kp.m26792k4(c10598q1.m51547x1().mo50993to());
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51213x1() {
        return this.f37188k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51211k4(long j) {
        this.f37188k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50990k4(C3134k4 c3134k4) {
        long jM13384uz = c3134k4.m13384uz();
        this.f37188k4 = jM13384uz;
        this.f37189x1 = new C10598q1[(int) (jM13384uz & 4294967295L)];
        for (int i = 0; i < (this.f37188k4 & 4294967295L); i++) {
            this.f37189x1[i] = new C10598q1(c3134k4);
        }
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10716xo
    /* JADX INFO: renamed from: k4 */
    public void mo50991k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(m51213x1());
        if (m51210du() != null) {
            for (C10598q1 c10598q1 : m51210du()) {
                c10598q1.m51545k4(c3149x1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51212k4(C10598q1[] c10598q1Arr) {
        this.f37189x1 = c10598q1Arr;
    }
}
