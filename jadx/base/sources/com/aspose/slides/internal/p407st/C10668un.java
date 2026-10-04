package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.un */
/* JADX INFO: loaded from: classes4.dex */
public class C10668un extends AbstractC10571o4 {

    /* JADX INFO: renamed from: k4 */
    private int f37425k4;

    /* JADX INFO: renamed from: kk */
    private int f37426kk;

    /* JADX INFO: renamed from: to */
    private short f37427to;

    /* JADX INFO: renamed from: x1 */
    private int f37428x1;

    public C10668un() {
        m51409um().m51917k4(3011);
        m51409um().m51916k4((byte) 0);
        m51409um().m51920k4((short) 0);
        this.f37427to = (short) 0;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    /* JADX INFO: renamed from: kk */
    public final int m51810kk() {
        return this.f37428x1;
    }

    /* JADX INFO: renamed from: to */
    public final int m51812to() {
        return this.f37426kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m51813x1() {
        return this.f37425k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51809k4(int i) {
        this.f37425k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m51811kk(int i) {
        this.f37426kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51814x1(int i) {
        this.f37428x1 = i;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        this.f37425k4 = c3134k4.m13386x6();
        this.f37428x1 = c3134k4.m13387yj() & 255;
        this.f37426kk = c3134k4.m13387yj() & 255;
        this.f37427to = c3134k4.m13381rv();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37425k4);
        c3149x1.m13443k4((byte) this.f37428x1);
        c3149x1.m13443k4((byte) this.f37426kk);
        c3149x1.m13448k4(this.f37427to);
    }
}
