package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.rr */
/* JADX INFO: loaded from: classes4.dex */
public class C10623rr extends AbstractC10571o4 {

    /* JADX INFO: renamed from: du */
    private int f37352du;

    /* JADX INFO: renamed from: k4 */
    private long f37353k4;

    /* JADX INFO: renamed from: kk */
    private long f37354kk;

    /* JADX INFO: renamed from: to */
    private long f37355to;

    /* JADX INFO: renamed from: x1 */
    private long f37356x1;

    public C10623rr() {
        m51409um().m51917k4(61760);
    }

    /* JADX INFO: renamed from: du */
    public final long m51633du() {
        return this.f37355to;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 20;
    }

    /* JADX INFO: renamed from: kk */
    public final long m51636kk() {
        return this.f37356x1;
    }

    /* JADX INFO: renamed from: to */
    public final long m51639to() {
        return this.f37354kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m51642x1() {
        return this.f37353k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51634k4(long j) {
        this.f37353k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51637kk(long j) {
        this.f37354kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m51640to(long j) {
        this.f37355to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51643x1(long j) {
        this.f37356x1 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37353k4 = c3134k4.m13384uz();
        this.f37356x1 = c3134k4.m13384uz();
        this.f37354kk = c3134k4.m13384uz();
        this.f37355to = c3134k4.m13384uz();
        this.f37352du = c3134k4.m13386x6();
    }

    /* JADX INFO: renamed from: kk */
    public final void m51638kk(boolean z) {
        this.f37352du = z ? this.f37352du | 4 : this.f37352du & (-5);
    }

    /* JADX INFO: renamed from: to */
    public final void m51641to(boolean z) {
        this.f37352du = z ? this.f37352du | 8 : this.f37352du & (-9);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51644x1(boolean z) {
        this.f37352du = z ? this.f37352du | 2 : this.f37352du & (-3);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37353k4 & 4294967295L);
        c3149x1.m13447k4(this.f37356x1 & 4294967295L);
        c3149x1.m13447k4(this.f37354kk & 4294967295L);
        c3149x1.m13447k4(this.f37355to & 4294967295L);
        c3149x1.m13455x1(this.f37352du);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51635k4(boolean z) {
        this.f37352du = z ? this.f37352du | 1 : this.f37352du & (-2);
    }
}
