package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.hc */
/* JADX INFO: loaded from: classes4.dex */
public class C10463hc extends AbstractC10538m8 {

    /* JADX INFO: renamed from: du */
    private long f37042du;

    /* JADX INFO: renamed from: h4 */
    private long f37043h4;

    /* JADX INFO: renamed from: k4 */
    private long f37044k4;

    /* JADX INFO: renamed from: kk */
    private long f37045kk;

    /* JADX INFO: renamed from: to */
    private long f37046to;

    /* JADX INFO: renamed from: x1 */
    private long f37047x1;

    public C10463hc() {
        super(61458, (byte) 1);
        m51409um().m51920k4((short) 0);
    }

    /* JADX INFO: renamed from: du */
    public final int m50883du() {
        return (int) this.f37042du;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m50884h4() {
        return (int) this.f37043h4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 24;
    }

    /* JADX INFO: renamed from: kk */
    public final long m50887kk() {
        return this.f37045kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m50889to() {
        return this.f37046to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m50891x1() {
        return this.f37047x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50885k4(int i) {
        this.f37042du = ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50888kk(long j) {
        this.f37045kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m50890to(long j) {
        this.f37046to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50892x1(int i) {
        this.f37043h4 = ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50886k4(long j) {
        this.f37044k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50893x1(long j) {
        this.f37047x1 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37044k4 = c3134k4.m13384uz();
        this.f37047x1 = c3134k4.m13384uz();
        this.f37045kk = c3134k4.m13384uz();
        this.f37046to = c3134k4.m13384uz();
        this.f37042du = c3134k4.m13384uz();
        this.f37043h4 = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37044k4 & 4294967295L);
        c3149x1.m13447k4(this.f37047x1 & 4294967295L);
        c3149x1.m13447k4(this.f37045kk & 4294967295L);
        c3149x1.m13447k4(this.f37046to & 4294967295L);
        c3149x1.m13447k4(this.f37042du & 4294967295L);
        c3149x1.m13447k4(this.f37043h4 & 4294967295L);
    }
}
