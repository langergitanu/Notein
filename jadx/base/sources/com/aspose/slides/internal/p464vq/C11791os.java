package com.aspose.slides.internal.p464vq;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p482wr.C12262lr;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.os */
/* JADX INFO: loaded from: classes4.dex */
public class C11791os extends AbstractC11830up {

    /* JADX INFO: renamed from: k4 */
    private AbstractC11812sq f39826k4;

    /* JADX INFO: renamed from: x1 */
    private C11723d3 f39827x1;

    public C11791os(AbstractC11819tq abstractC11819tq, C12262lr c12262lr) {
        super(abstractC11819tq, c12262lr);
        this.f39826k4 = null;
    }

    /* JADX INFO: renamed from: fa */
    public AbstractC11812sq m55372fa() {
        return this.f39826k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m55373k4(C11723d3 c11723d3) {
        this.f39827x1 = c11723d3;
    }

    /* JADX INFO: renamed from: ks */
    public C11791os m55376ks() {
        if (m55377up() != null) {
            throw new Exception("Relationships is already exists.");
        }
        C11791os c11791os = new C11791os(m55379yj(), AbstractC11819tq.m55386du(m55427x1()), new C11738ew(), null);
        c11791os.m55373k4(new C11723d3(m55379yj()));
        m55379yj().m55408x1(c11791os);
        m55373k4(c11791os.m55377up());
        return c11791os;
    }

    /* JADX INFO: renamed from: up */
    public C11723d3 m55377up() {
        return this.f39827x1;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55378x1(AbstractC11812sq abstractC11812sq) {
        this.f39826k4 = abstractC11812sq;
    }

    /* JADX INFO: renamed from: yj */
    public AbstractC11819tq m55379yj() {
        return (AbstractC11819tq) m55418jd();
    }

    public C11791os(AbstractC11819tq abstractC11819tq, String str, AbstractC11812sq abstractC11812sq, byte[] bArr) {
        super(abstractC11819tq, str, bArr);
        this.f39826k4 = null;
        m55378x1(abstractC11812sq);
    }

    /* JADX INFO: renamed from: k4 */
    public C11791os[] m55374k4(C11801r5 c11801r5) {
        C11791os c11791osM55392h4;
        List list = new List();
        for (C11709bg c11709bg : m55377up().m55309k4(c11801r5)) {
            if (c11709bg.m55294m9() != 1 && (c11791osM55392h4 = m55379yj().m55392h4(c11709bg.m55292k4())) != null) {
                list.addItem(c11791osM55392h4);
            }
        }
        return (C11791os[]) list.toArray(new C11791os[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public C11791os[] m55375k4(AbstractC11812sq abstractC11812sq) {
        return m55374k4(abstractC11812sq.mo55275x1());
    }
}
