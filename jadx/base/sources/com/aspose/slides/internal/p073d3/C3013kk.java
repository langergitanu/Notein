package com.aspose.slides.internal.p073d3;

import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p123f5.C3859m9;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p218k5.AbstractC5609du;
import com.aspose.slides.internal.p218k5.AbstractC5612k4;
import com.aspose.slides.internal.p218k5.AbstractC5615to;
import com.aspose.slides.internal.p349q3.C9659j2;
import com.aspose.slides.internal.p472w8.C11893c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.d3.kk */
/* JADX INFO: loaded from: classes3.dex */
public class C3013kk extends AbstractC5615to {
    public C3013kk(AbstractC5612k4 abstractC5612k4) {
        super(abstractC5612k4);
    }

    @Override // com.aspose.slides.internal.p218k5.AbstractC5615to
    /* JADX INFO: renamed from: k4 */
    public void mo12688k4(C9659j2 c9659j2, C3585h4 c3585h4) {
        AbstractC12008jd abstractC12008jd = (AbstractC12008jd) c3585h4.m14502k4();
        C12014ne c12014neClone = c9659j2.m47308k4().m57842dy().Clone();
        C12018u4 c12018u4M56768x1 = c3585h4.m14544s7().m56768x1();
        c12018u4M56768x1.m56773x1(c12014neClone.Clone());
        if (c12018u4M56768x1.m56775x1(abstractC12008jd)) {
            return;
        }
        C12014ne c12014ne = new C12014ne(c9659j2.m47299dy(), c9659j2.m47294c5(), c9659j2.m47327to(), c9659j2.m47303h4());
        C12014ne c12014ne2 = new C12014ne(c9659j2.m47335x1(), c9659j2.m47317kk(), c9659j2.m47327to(), c9659j2.m47303h4());
        C12009k4 c12009k4M22995k4 = AbstractC5609du.m22995k4(c9659j2.m47293ar().m57639x1(c3585h4.m14482ck()), c9659j2.m47331um().m57639x1(c3585h4.m14482ck()), new C12016rv(c9659j2.m47339x6(), c9659j2.m47324ne()));
        c9659j2.m47321m9();
        C11913yj c11913yjM25637dy = c9659j2.m47307jd().m25637dy();
        c9659j2.m47296ck().m57666h4().Clone();
        C12018u4 c12018u4 = new C12018u4(c12014ne.Clone());
        c12018u4.m56771x1(c11913yjM25637dy);
        C12014ne.m56661x1(c12018u4.m56749k4(abstractC12008jd).Clone()).CloneTo(c12014ne);
        C11893c5 c11893c5Mo17583x1 = abstractC12008jd.mo17583x1();
        abstractC12008jd.mo17500k4(c3585h4.m14561vj(), 0);
        abstractC12008jd.mo17523k4(c3585h4.m14544s7(), 0);
        C3859m9.m15552k4(c12014ne.Clone(), new C12014ne(0, 0, c12009k4M22995k4.mo15760yj(), c12009k4M22995k4.mo15757m9())).CloneTo(c12014ne);
        C3976c5 c3976c5 = new C3976c5();
        try {
            c3976c5.m15673x1(3);
            abstractC12008jd.mo17476du(2);
            abstractC12008jd.mo17560kk(7);
            abstractC12008jd.mo17511k4((AbstractC12002ck) c12009k4M22995k4, c12014ne2.Clone(), c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1(), 2, c3976c5);
            c3976c5.dispose();
            abstractC12008jd.mo17496k4(c11893c5Mo17583x1);
        } catch (Throwable th) {
            c3976c5.dispose();
            throw th;
        }
    }
}
