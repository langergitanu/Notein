package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.c9 */
/* JADX INFO: loaded from: classes4.dex */
public class C10386c9 extends AbstractC10571o4 implements InterfaceC10525li {

    /* JADX INFO: renamed from: k4 */
    private C12014ne f36899k4;

    public C10386c9() {
        super(61456, (byte) 0);
        this.f36899k4 = new C12014ne(0, 0, 0, 0);
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: du */
    public final int mo50543du() {
        return this.f36899k4.m56683x1();
    }

    /* JADX INFO: renamed from: h4 */
    public final C12014ne m50544h4() {
        return this.f36899k4;
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public int mo50440k4() {
        return 8;
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: kk */
    public final int mo50547kk() {
        return this.f36899k4.m56664ck();
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: to */
    public final int mo50549to() {
        return this.f36899k4.m56663c5();
    }

    @Override // com.aspose.slides.internal.p407st.InterfaceC10525li
    /* JADX INFO: renamed from: x1 */
    public final int mo50551x1() {
        return this.f36899k4.m56669jd();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50545k4(int i) {
        this.f36899k4.m56676kk(i);
    }

    /* JADX INFO: renamed from: kk */
    public final void m50548kk(int i) {
        this.f36899k4.m56684x1(i);
    }

    /* JADX INFO: renamed from: to */
    public final void m50550to(int i) {
        this.f36899k4.m56671k4(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50552x1(int i) {
        this.f36899k4.m56682to(i);
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50441k4(C3134k4 c3134k4) {
        int iM13381rv;
        int iM13381rv2;
        int iM13381rv3;
        int iM13381rv4;
        if (m51409um().m51914du() == 16) {
            iM13381rv2 = c3134k4.m13386x6();
            iM13381rv = c3134k4.m13386x6();
            iM13381rv3 = c3134k4.m13386x6();
            iM13381rv4 = c3134k4.m13386x6();
        } else {
            iM13381rv = c3134k4.m13381rv();
            iM13381rv2 = c3134k4.m13381rv();
            iM13381rv3 = c3134k4.m13381rv();
            iM13381rv4 = c3134k4.m13381rv();
        }
        this.f36899k4 = new C12014ne(C14116yg.m67507x1(iM13381rv2, iM13381rv3), C14116yg.m67507x1(iM13381rv, iM13381rv4), C14116yg.m67482k4(iM13381rv3 - iM13381rv2), C14116yg.m67482k4(iM13381rv4 - iM13381rv));
    }

    @Override // com.aspose.slides.internal.p407st.AbstractC10571o4
    /* JADX INFO: renamed from: k4 */
    public void mo50442k4(C3149x1 c3149x1) {
        c3149x1.m13448k4((short) this.f36899k4.m56664ck());
        c3149x1.m13448k4((short) this.f36899k4.m56669jd());
        c3149x1.m13448k4((short) (this.f36899k4.m56663c5() + this.f36899k4.m56669jd()));
        c3149x1.m13448k4((short) (this.f36899k4.m56683x1() + this.f36899k4.m56664ck()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50546k4(C12014ne c12014ne) {
        this.f36899k4 = new C12014ne(c12014ne.m56665du().Clone(), c12014ne.m56680m9().Clone());
    }
}
