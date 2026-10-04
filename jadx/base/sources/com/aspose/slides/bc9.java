package com.aspose.slides;

import com.aspose.slides.internal.p159h0.C4459os;
import com.aspose.slides.internal.p159h0.C4489zj;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class bc9 {

    /* JADX INFO: renamed from: k4 */
    private oy7 f4168k4;

    /* JADX INFO: renamed from: kk */
    private oy7 f4169kk;

    /* JADX INFO: renamed from: x1 */
    private oy7 f4170x1;

    public bc9(oy7 oy7Var, oy7 oy7Var2, oy7 oy7Var3) {
        m4132k4(oy7Var);
        m4134x1(oy7Var2);
        m4133kk(oy7Var3);
    }

    /* JADX INFO: renamed from: c5 */
    public final float m4135c5() {
        return C14116yg.m67481k4(m4144to(), C14116yg.m67481k4(m4136du(), m4138h4()));
    }

    /* JADX INFO: renamed from: du */
    public final float m4136du() {
        return m4145x1().m68907k4();
    }

    /* JADX INFO: renamed from: dy */
    public final C4489zj m4137dy() {
        C4489zj c4489zjClone = m4140k4().m68908x1().Clone();
        C4489zj c4489zjClone2 = m4145x1().m68908x1().Clone();
        C4489zj c4489zjClone3 = m4142kk().m68908x1().Clone();
        return C4489zj.m18502to(C4489zj.m18504x1(c4489zjClone3, c4489zjClone).Clone(), C4489zj.m18504x1(c4489zjClone3, c4489zjClone2).Clone()).m18510to();
    }

    /* JADX INFO: renamed from: h4 */
    public final float m4138h4() {
        return m4142kk().m68907k4();
    }

    /* JADX INFO: renamed from: jd */
    public final float m4139jd() {
        return C14116yg.m67504x1(m4144to(), C14116yg.m67504x1(m4136du(), m4138h4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final oy7 m4140k4() {
        return this.f4168k4;
    }

    /* JADX INFO: renamed from: kk */
    public final oy7 m4142kk() {
        return this.f4169kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final int[] m4143m9() {
        return new int[]{0, 1, 2};
    }

    /* JADX INFO: renamed from: to */
    public final float m4144to() {
        return m4140k4().m68907k4();
    }

    /* JADX INFO: renamed from: x1 */
    public final oy7 m4145x1() {
        return this.f4170x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m4132k4(oy7 oy7Var) {
        this.f4168k4 = oy7Var;
    }

    /* JADX INFO: renamed from: kk */
    private void m4133kk(oy7 oy7Var) {
        this.f4169kk = oy7Var;
    }

    /* JADX INFO: renamed from: x1 */
    private void m4134x1(oy7 oy7Var) {
        this.f4170x1 = oy7Var;
    }

    /* JADX INFO: renamed from: k4 */
    public final C4489zj[] m4141k4(C4459os c4459os) {
        C4489zj c4489zjClone = m4140k4().m68908x1().Clone();
        C4489zj c4489zjClone2 = m4145x1().m68908x1().Clone();
        C4489zj c4489zjClone3 = m4142kk().m68908x1().Clone();
        return new C4489zj[]{new C4489zj(c4489zjClone.m18506k4() - c4459os.m18285k4(), c4459os.m18290x1() - c4489zjClone.m18511x1(), c4489zjClone.m18508kk()), new C4489zj(c4489zjClone2.m18506k4() - c4459os.m18285k4(), c4459os.m18290x1() - c4489zjClone2.m18511x1(), c4489zjClone2.m18508kk()), new C4489zj(c4489zjClone3.m18506k4() - c4459os.m18285k4(), c4459os.m18290x1() - c4489zjClone3.m18511x1(), c4489zjClone3.m18508kk())};
    }
}
