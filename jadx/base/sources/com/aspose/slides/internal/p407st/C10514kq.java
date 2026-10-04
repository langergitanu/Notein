package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.kq */
/* JADX INFO: loaded from: classes4.dex */
public class C10514kq extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37156k4;

    /* JADX INFO: renamed from: kk */
    private long f37157kk;

    /* JADX INFO: renamed from: x1 */
    private int f37158x1;

    public C10514kq() {
        m51409um().m51917k4(61748);
    }

    /* JADX INFO: renamed from: du */
    public final void m51129du(boolean z) {
        this.f37158x1 = z ? this.f37158x1 | 16 : this.f37158x1 & (-17);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m51130h4(boolean z) {
        this.f37158x1 = z ? this.f37158x1 | 32 : this.f37158x1 & (-33);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 12;
    }

    /* JADX INFO: renamed from: kk */
    public final int m51134kk() {
        return (int) this.f37157kk;
    }

    /* JADX INFO: renamed from: to */
    public final void m51136to(boolean z) {
        this.f37158x1 = z ? this.f37158x1 | 8 : this.f37158x1 & (-9);
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51137x1() {
        return this.f37156k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51131k4(int i) {
        this.f37157kk = ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51135kk(boolean z) {
        this.f37158x1 = z ? this.f37158x1 | 4 : this.f37158x1 & (-5);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51138x1(boolean z) {
        this.f37158x1 = z ? this.f37158x1 | 2 : this.f37158x1 & (-3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51132k4(long j) {
        this.f37156k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37156k4 = c3134k4.m13384uz();
        this.f37158x1 = c3134k4.m13386x6();
        this.f37157kk = c3134k4.m13384uz();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37156k4 & 4294967295L);
        c3149x1.m13455x1(this.f37158x1);
        c3149x1.m13447k4(this.f37157kk & 4294967295L);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51133k4(boolean z) {
        this.f37158x1 = z ? this.f37158x1 | 1 : this.f37158x1 & (-2);
    }
}
