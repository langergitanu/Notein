package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.e8 */
/* JADX INFO: loaded from: classes4.dex */
public class C10417e8 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private long f36957du;

    /* JADX INFO: renamed from: k4 */
    private int f36958k4;

    /* JADX INFO: renamed from: kk */
    private long f36959kk;

    /* JADX INFO: renamed from: to */
    private int f36960to;

    /* JADX INFO: renamed from: x1 */
    private int f36961x1;

    public C10417e8() {
        m51409um().m51917k4(4035);
        m51409um().m51916k4((byte) 1);
        this.f36958k4 = 1;
        this.f36961x1 = 0;
        this.f36959kk = 0L;
        this.f36960to = 4;
        this.f36957du = 0L;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 24;
    }

    /* JADX INFO: renamed from: kk */
    public final long m50732kk() {
        return this.f36959kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m50734to() {
        return this.f36957du;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m50735x1() {
        return this.f36958k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50730k4(int i) {
        this.f36958k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m50733kk(int i) {
        this.f36960to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50736x1(int i) {
        this.f36961x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50731k4(long j) {
        this.f36959kk = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50737x1(long j) {
        this.f36957du = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f36958k4 = c3134k4.m13386x6();
        this.f36961x1 = c3134k4.m13386x6();
        this.f36959kk = c3134k4.m13384uz();
        this.f36960to = c3134k4.m13386x6();
        this.f36957du = c3134k4.m13384uz();
        c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f36958k4);
        c3149x1.m13455x1(this.f36961x1);
        c3149x1.m13447k4(this.f36959kk & 4294967295L);
        c3149x1.m13455x1(this.f36960to);
        c3149x1.m13447k4(this.f36957du & 4294967295L);
        c3149x1.m13455x1(8015616);
    }
}
