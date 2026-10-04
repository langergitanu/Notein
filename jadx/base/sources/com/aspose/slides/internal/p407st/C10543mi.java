package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p475wh.C12014ne;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.mi */
/* JADX INFO: loaded from: classes4.dex */
public class C10543mi extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37222k4;

    /* JADX INFO: renamed from: kk */
    private int f37223kk;

    /* JADX INFO: renamed from: to */
    private int f37224to;

    /* JADX INFO: renamed from: x1 */
    private int f37225x1;

    public C10543mi() {
        super(61449, (byte) 1);
        this.f37222k4 = 0;
        this.f37225x1 = 0;
        this.f37223kk = 0;
        this.f37224to = 0;
    }

    /* JADX INFO: renamed from: du */
    public final int m51287du() {
        return this.f37224to;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 16;
    }

    /* JADX INFO: renamed from: kk */
    public final int m51290kk() {
        return this.f37225x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m51292to() {
        return this.f37223kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51294x1() {
        return this.f37222k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51288k4(int i) {
        this.f37222k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51291kk(int i) {
        this.f37223kk = i;
    }

    /* JADX INFO: renamed from: to */
    public final void m51293to(int i) {
        this.f37224to = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51295x1(int i) {
        this.f37225x1 = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37222k4 = c3134k4.m13386x6();
        this.f37225x1 = c3134k4.m13386x6();
        this.f37223kk = c3134k4.m13386x6() - this.f37222k4;
        this.f37224to = c3134k4.m13386x6() - this.f37225x1;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37222k4);
        c3149x1.m13455x1(this.f37225x1);
        c3149x1.m13455x1(this.f37222k4 + this.f37223kk);
        c3149x1.m13455x1(this.f37225x1 + this.f37224to);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51289k4(C12014ne c12014ne) {
        this.f37222k4 = c12014ne.m56669jd();
        this.f37225x1 = c12014ne.m56664ck();
        this.f37223kk = c12014ne.m56663c5();
        this.f37224to = c12014ne.m56683x1();
    }
}
