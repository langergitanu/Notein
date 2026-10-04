package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.xl */
/* JADX INFO: loaded from: classes4.dex */
public class C10715xl extends AbstractC10571o4 implements InterfaceC10525li {

    /* JADX INFO: renamed from: k4 */
    private C12014ne f37506k4;

    public C10715xl() {
        super(61455, (byte) 0);
        this.f37506k4 = new C12014ne(0, 0, 0, 0);
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: du */
    public final int mo50543du() {
        return this.f37506k4.m56683x1();
    }

    /* JADX INFO: renamed from: h4 */
    public final C12014ne m51979h4() {
        return this.f37506k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 16;
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: kk */
    public final int mo50547kk() {
        return this.f37506k4.m56664ck();
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: to */
    public final int mo50549to() {
        return this.f37506k4.m56663c5();
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: x1 */
    public final int mo50551x1() {
        return this.f37506k4.m56669jd();
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int iM13386x6 = c3134k4.m13386x6();
        int iM13386x62 = c3134k4.m13386x6();
        int iM13386x63 = c3134k4.m13386x6();
        int iM13386x64 = c3134k4.m13386x6();
        this.f37506k4 = new C12014ne(C14116yg.m67507x1(iM13386x6, iM13386x63), C14116yg.m67507x1(iM13386x62, iM13386x64), C14116yg.m67482k4(iM13386x63 - iM13386x6), C14116yg.m67482k4(iM13386x64 - iM13386x62));
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(this.f37506k4.m56669jd());
        c3149x1.m13455x1(this.f37506k4.m56664ck());
        c3149x1.m13455x1(this.f37506k4.m56663c5() + this.f37506k4.m56669jd());
        c3149x1.m13455x1(this.f37506k4.m56683x1() + this.f37506k4.m56664ck());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51980k4(C12014ne c12014ne) {
        this.f37506k4 = new C12014ne(c12014ne.m56665du().Clone(), c12014ne.m56680m9().Clone());
    }
}
