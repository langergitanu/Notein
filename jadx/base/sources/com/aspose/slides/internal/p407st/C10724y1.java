package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.y1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10724y1 extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private long f37530k4;

    /* JADX INFO: renamed from: x1 */
    private int f37531x1;

    public C10724y1() {
        super(61450, (byte) 2);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m52025c5() {
        return m51409um().m51922kk();
    }

    /* JADX INFO: renamed from: ck */
    public final void m52027ck(boolean z) {
        int i = this.f37531x1 | 1024;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 1024;
    }

    /* JADX INFO: renamed from: du */
    public final void m52028du(boolean z) {
        int i = this.f37531x1 | 16;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 16;
    }

    /* JADX INFO: renamed from: dy */
    public final void m52030dy(boolean z) {
        int i = this.f37531x1 | 128;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 128;
    }

    /* JADX INFO: renamed from: fa */
    public final void m52032fa(boolean z) {
        int i = this.f37531x1 | 2048;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 2048;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m52033h4(boolean z) {
        int i = this.f37531x1 | 32;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 32;
    }

    /* JADX INFO: renamed from: jd */
    public final void m52035jd(boolean z) {
        int i = this.f37531x1 | 512;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 512;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final void m52039kk(boolean z) {
        int i = this.f37531x1 | 4;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 4;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m52041m9(boolean z) {
        int i = this.f37531x1 | 64;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 64;
    }

    /* JADX INFO: renamed from: to */
    public final void m52043to(boolean z) {
        int i = this.f37531x1 | 8;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 8;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m52045x1() {
        return this.f37530k4;
    }

    /* JADX INFO: renamed from: c5 */
    public final void m52026c5(boolean z) {
        int i = this.f37531x1 | 256;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 256;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m52029du() {
        return (this.f37531x1 & 64) != 0;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m52031dy() {
        return (this.f37531x1 & 2048) != 0;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m52034h4() {
        return (this.f37531x1 & 128) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52036k4(int i) {
        m51409um().m51920k4((short) i);
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m52040kk() {
        return (this.f37531x1 & 2) != 0;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m52042m9() {
        return (this.f37531x1 & 1024) != 0;
    }

    /* JADX INFO: renamed from: to */
    public final boolean m52044to() {
        return (this.f37531x1 & 32) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52046x1(boolean z) {
        int i = this.f37531x1 | 2;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52037k4(long j) {
        this.f37530k4 = j;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37530k4 = c3134k4.m13384uz();
        this.f37531x1 = c3134k4.m13386x6();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37530k4 & 4294967295L);
        c3149x1.m13455x1(this.f37531x1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52038k4(boolean z) {
        int i = this.f37531x1 | 1;
        this.f37531x1 = i;
        if (z) {
            return;
        }
        this.f37531x1 = i ^ 1;
    }
}
